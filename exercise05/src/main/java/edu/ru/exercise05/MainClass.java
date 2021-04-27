
package edu.ru.exercise05;

public class MainClass {
    public static void main(String[] args){
        System.out.println(fibonacciRecursive(7));
        
        
    }
    
    public static int factorial(int n){
        int result = 1;
        for (int i = 1; i<=n; i++){
            result = result * i;    
        }
        return result;
    }
    
    public static int factorialRecursive(int n){
        if (n ==1){
            return 1;
        }
            
        return factorialRecursive(n-1) * n;
    }
    
    public static int fibonacci(int n){
        
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int first = 0;
        int second = 1;
        int target = first + second;
        
        for(int i = 2; i<=n;i++){
            target = first + second;
            second = target;
        }
        return target;
    }
    
    public static int fibonacciRecursive(int n){
        if(n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        
        return fibonacciRecursive(n-1)+ fibonacciRecursive(n-2);
        
    }
}
