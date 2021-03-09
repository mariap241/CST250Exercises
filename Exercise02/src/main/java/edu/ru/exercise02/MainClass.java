
package edu.ru.exercise02;


public class MainClass {
    
    public static void main(String[] args){
       Person customer01= new Person("Jack");
       customer01.getShoppingList().addItemToList("Milk");
       customer01.getShoppingList().addItemToList("Bread");
       customer01.display();
       
       
        
      
    }
}
