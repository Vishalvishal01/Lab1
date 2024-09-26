import java.util.*;

public class App {

    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 100000, 1000000};

        for (int size : sizes) {
            System.out.println("Array of size: " + size);
            measureArray(size);
            System.out.println();
        }

        for (int size : sizes) {
            System.out.println("HashSet of size: " + size);
            measureHashSet(size);
            System.out.println();
        }

        for (int size : sizes) {
            System.out.println("ArrayList of size: " + size);
            measureArrayList(size);
            System.out.println();
        }

        for (int size : sizes) {
            System.out.println("LinkedList of size: " + size);
            measureLinkedList(size);
            System.out.println();
        }
    }

    private static void measureArray(int size) {
        int[] array = new int[size];

        long startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        long endTime = System.nanoTime();
        System.out.println("Insertion time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            int value = array[i];
        }
        endTime = System.nanoTime();
        System.out.println("Access time: " + (endTime - startTime) + " ns");
    }

    private static void measureHashSet(int size) {
        HashSet<Integer> hashSet = new HashSet<>();

        long startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            hashSet.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("Insertion time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            boolean contains = hashSet.contains(i);
        }
        endTime = System.nanoTime();
        System.out.println("Search time: " + (endTime - startTime) + " ns");
    }

    private static void measureArrayList(int size) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        long startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("Insertion time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            int value = arrayList.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("Access time: " + (endTime - startTime) + " ns");
    }

    private static void measureLinkedList(int size) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        long startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            linkedList.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("Insertion time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            int value = linkedList.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("Access time: " + (endTime - startTime) + " ns");
    }
}
