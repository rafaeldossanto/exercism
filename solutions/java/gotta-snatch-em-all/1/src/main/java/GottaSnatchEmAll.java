import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return cards == null ? new HashSet<>() : new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {

        Set<String> myUnique = new HashSet<>(myCollection);
        myUnique.removeAll(theirCollection);

        Set<String> theirUnique = new HashSet<>(theirCollection);
        theirUnique.removeAll(myCollection);

        return !myUnique.isEmpty() && !theirUnique.isEmpty();
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Iterator<Set<String>> it = collections.iterator();
        Set<String> intersection = new HashSet<>(it.next());
        while (it.hasNext()) {
            intersection.retainAll(it.next());
            if (intersection.isEmpty()) break;
        }
        return intersection;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        return collections.stream()
                .flatMap(Set::stream)
                .collect(Collectors.toSet());
    }
}
