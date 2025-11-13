import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Collections;

class RelativeDistance {

    private final Map<String, Set<String>> graph = new HashMap<>();

    RelativeDistance(Map<String, List<String>> familyTree) {
        if (familyTree == null) return;
        for (Map.Entry<String, List<String>> e : familyTree.entrySet()) {
            String parent = e.getKey();
            graph.computeIfAbsent(parent, k -> new HashSet<>());
            List<String> children = e.getValue();
            if (children == null) continue;
            for (String child : children) {
                graph.computeIfAbsent(child, k -> new HashSet<>());
                graph.get(parent).add(child);
                graph.get(child).add(parent);
            }
        }
    }

    int degreeOfSeparation(String personA, String personB) {
        if (personA == null || personB == null) return -1;
        if (personA.equals(personB)) return 0;
        if (!graph.containsKey(personA) || !graph.containsKey(personB)) return -1;

        Queue<String> q = new ArrayDeque<>();
        Map<String, Integer> dist = new HashMap<>();
        q.add(personA);
        dist.put(personA, 0);

        while (!q.isEmpty()) {
            String cur = q.poll();
            int d = dist.get(cur);
            for (String nei : graph.getOrDefault(cur, Collections.emptySet())) {
                if (!dist.containsKey(nei)) {
                    dist.put(nei, d + 1);
                    if (nei.equals(personB)) return d + 1;
                    q.add(nei);
                }
            }
        }
        return -1;
    }
}
