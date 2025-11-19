import java.util.Arrays;
import java.util.List;

class KindergartenGarden {
    private static final String[] ORDERED = {
            "Alice","Bob","Charlie","David","Eve","Fred",
            "Ginny","Harriet","Ileana","Joseph","Kincaid","Larry"
    };

    private final char[][] cups = new char[2][];
    private final int alunosNoDiagrama;

    KindergartenGarden(String garden) {
        String[] lines = garden.split("\n");
        if (lines.length != 2) throw new IllegalArgumentException("Diagrama inválido");
        if (lines[0].length() != lines[1].length()) throw new IllegalArgumentException("Linhas de tamanhos diferentes");
        int len = lines[0].length();
        if (len % 2 != 0) throw new IllegalArgumentException("Quantidade de copos por linha deve ser par");
        alunosNoDiagrama = len / 2;
        if (alunosNoDiagrama > ORDERED.length)
            throw new IllegalArgumentException("Mais posições que alunos conhecidos");
        cups[0] = lines[0].toCharArray();
        cups[1] = lines[1].toCharArray();
    }

    List<Plant> getPlantsOfStudent(String student) {
        int idx = Arrays.binarySearch(ORDERED, student);
        if (idx < 0 || idx >= alunosNoDiagrama)
            throw new IllegalArgumentException("Aluno fora do diagrama: " + student);
        int start = idx * 2;
        return List.of(
                Plant.getPlant(cups[0][start]),
                Plant.getPlant(cups[0][start + 1]),
                Plant.getPlant(cups[1][start]),
                Plant.getPlant(cups[1][start + 1])
        );
    }
}
