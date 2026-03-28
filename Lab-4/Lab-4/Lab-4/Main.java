import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      System.out.println("Unsorted Array ---------------------------------------------------");
      ArrayList<Integer> integerList = Lab4.getList();
      Lab4.outputList(integerList);

      System.out.println("\n\nBubble sort results ----------------------------------------------");
      long bubbleStartTime = System.nanoTime();
      ArrayList<Integer> bubbleSortedList = Lab4.bubbleSort(integerList);
      long bubbleEndTime = System.nanoTime();
      long bubbleTimeElapsed = bubbleEndTime - bubbleStartTime;
      Lab4.outputList(bubbleSortedList);
      System.out.println("\nBubble sort time: " + bubbleTimeElapsed + " nanoseconds");

      System.out.println("\n\nInsertion sort results -------------------------------------------");
      long insertionStartTime = System.nanoTime();
      ArrayList<Integer> insertionSortedList = Lab4.insertionSort(integerList);
      long insertionEndTime = System.nanoTime();
      long insertionTimeElapsed = insertionEndTime - insertionStartTime;
      Lab4.outputList(insertionSortedList);
      System.out.println("\nInsertion sort time: " + insertionTimeElapsed + " nanoseconds");
    }
}

class Lab4 {
  public static ArrayList<Integer> insertionSort(ArrayList<Integer> integerList) {
    // Step 1 - Implement insertion sort algorithm here
    for (int i = 1; i < integerList.size(); i++) {
        int currentElement = integerList.get(i);
        int k = i - 1;
        while (k >= 0 && integerList.get(k) > currentElement) {
            integerList.set(k + 1, integerList.get(k));
            k--;
        }
        integerList.set(k + 1, currentElement);
    }
    return integerList;
  }

  public static ArrayList<Integer> bubbleSort(ArrayList<Integer> integerList) {
    // Step 2 - Implement the bubble sort algorithm here
    boolean needNextPass = true;
    for (int i = 1; i < integerList.size() && needNextPass; i++) {
        needNextPass = false;
        for (int k = 0; k < integerList.size() - i; k++) {
            if (integerList.get(k) > integerList.get(k + 1)) {
                int temp = integerList.get(k);
                integerList.set(k, integerList.get(k + 1));
                integerList.set(k + 1, temp);
                needNextPass = true;
            }
        }
    }
    return integerList;
  }

  public static ArrayList<Integer> getList() {
    ArrayList<Integer> integerList = new ArrayList<>();
    String line;
    try (BufferedReader br = new BufferedReader(new FileReader("integers.txt"))) {
        while ((line = br.readLine()) != null) {
            integerList.add(Integer.parseInt(line));
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return integerList;
  }

  public static void outputList(ArrayList<Integer> integerList) {
    for (int i = 0; i < integerList.size(); i++) {
        System.out.print(integerList.get(i) + " ");
    }
  }
}