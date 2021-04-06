
package edu.ru.exercise04;

public class MainClass {
  public static void main(String [] args){
      
      long start;
      long end;
      long duration;
      
      long executionTime_1 = 0;
      for (int i = 0; i<10; i++){
          start = System.nanoTime();
          sumToN_1(100000);
          end = System.nanoTime();
          duration = end - start;
          executionTime_1 = executionTime_1 + duration;
          
      }
      long average_1 = executionTime_1/10;
      System.out.println("Average execution time for implentation 1: " + average_1 + " nano seconds.");
      
      long executionTime_2 = 0;
      for (int i = 0; i<10; i++){
          start = System.nanoTime();
          sumToN_2(100000);
          end = System.nanoTime();
          duration = end - start;
          executionTime_2 = executionTime_2 + duration;
          
      }
      long average_2 = executionTime_2/10;
      System.out.println("Average execution time for implentation 1: " + average_2 + " nano seconds.");
      
     
  }  
  public static int sumToN_1(int n){
      int sum = 0;
      for (int i = 0; i<n+1; i++){
          sum = sum + i;
          
      }
      return sum;
  }
  public static int sumToN_2(int n){
      int sum = (n *(n+1))/2;
      return sum;
  }
}
