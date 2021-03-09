/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ru.exercise02;


public class Person {
    
     private String name;
     private ShoppingList shoppingList;
     
     
    public Person(String name, ShoppingList shoppingList) {
        this.name = name;
        this.shoppingList = shoppingList;

    }

    public Person(String name) {
        this.name = name;
        this.shoppingList = new ShoppingList();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShoppingList getShoppingList() {
        return shoppingList;
    }

    public void setShoppingList(ShoppingList shoppingList) {
        this.shoppingList = shoppingList;
    }
    
    
   
    public void display(){
        System.out.println(this.name + ": ");
        this.shoppingList.display();
    }
}
