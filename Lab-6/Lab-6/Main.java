public class Main {
  public static void main(String[] args) {
    // Step 3: Create a map called creditHours
    MyMap<String, Integer> creditHours = new MyHashMap<>();

    // Step 4: put() the following values
    creditHours.put("IT-1025", 3);
    creditHours.put("IT-1050", 3);
    creditHours.put("IT-1150", 3);
    creditHours.put("IT-2310", 3);
    creditHours.put("IT-2320", 4);
    creditHours.put("IT-2351", 4);
    creditHours.put("IT-2650", 4);
    creditHours.put("IT-2660", 4);
    creditHours.put("IT-2030", 4);

    // Step 5: Check for the following values
    System.out.println("IT-1025 is in the map: " + creditHours.containsKey("IT-1025"));
    System.out.println("IT-2110 is in the map: " + creditHours.containsKey("IT-2110"));

    // Step 6: Print all of the values in the map
    System.out.println("\nAll entries in the map:");
    for (String key : creditHours.keySet()) {
      System.out.println(key + ": " + creditHours.get(key) + " credit hours");
    }

    // Step 7: Remove IT-2030 and IT-1150
    creditHours.remove("IT-2030");
    creditHours.remove("IT-1150");

    // Step 8: Print all of the values in the map
    System.out.println("\nUpdated entries in the map:");
    for (String key : creditHours.keySet()) {
      System.out.println(key + ": " + creditHours.get(key) + " credit hours");
    }
  }
}