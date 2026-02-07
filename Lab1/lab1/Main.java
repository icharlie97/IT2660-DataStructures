//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: 
 */

public class Main {
  public static void main(String[] args) {
    System.out.println("hello, world!");

    // Create array with values {5, 9, 3, 12, 7, 3, 11, 5}
    int[] nums = {5, 9, 3, 12, 7, 3, 11, 5};
    
    // Output the array in order using a while loop
    System.out.println("Array in order (while loop):");
    int i = 0;
    while (i < nums.length) {
      System.out.print(nums[i] + " ");
      i++;
    }
    System.out.println();
    
    // Output the array in reverse using a for loop
    System.out.println("Array in reverse (for loop):");
    for (int j = nums.length - 1; j >= 0; j--) {
      System.out.print(nums[j] + " ");
    }
    System.out.println();
    
    // Output the first and last values
    System.out.println("First value: " + nums[0]);
    System.out.println("Last value: " + nums[nums.length - 1]);
    
    // Create Lab1 object and call methods
    Lab1 lab = new Lab1();
    System.out.println(lab.increment(1));
    System.out.println("Max of 1 and 5: " + lab.max(1, 5));
    System.out.println("Min of 1 and 5: " + lab.min(1, 5));
    System.out.println("Sum of array: " + lab.sum(nums));
    System.out.println("Average of array: " + lab.average(nums));
    System.out.println("Max of array: " + lab.max(nums));
    System.out.println("Min of array: " + lab.min(nums));
  }
}     

// Add all of the methods here
class Lab1 {
  public int increment(int num) {
    return ++num;
  }
  
  // max(int a, int b): Use an if-statement to return the maximum value
  public int max(int a, int b) {
    if (a > b) {
      return a;
    } else {
      return b;
    }
  }
  
  // min(int a, int b): Use an if-statement to return the minimum value
  public int min(int a, int b) {
    if (a < b) {
      return a;
    } else {
      return b;
    }
  }
  
  // sum(int[] nums): Return the sum of all values in the array
  public int sum(int[] nums) {
    int total = 0;
    for (int num : nums) {
      total += num;
    }
    return total;
  }
  
  // average(int[] nums): Use a foreach loop to return the average
  public double average(int[] nums) {
    int total = 0;
    for (int num : nums) {
      total += num;
    }
    return (double) total / nums.length;
  }
  
  // max(int[] nums): Use a for loop to return the maximum value
  public int max(int[] nums) {
    int max = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > max) {
        max = nums[i];
      }
    }
    return max;
  }
  
  // min(int[] nums): Use a for loop to return the minimum value
  public int min(int[] nums) {
    int min = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] < min) {
        min = nums[i];
      }
    }
    return min;
  }
}