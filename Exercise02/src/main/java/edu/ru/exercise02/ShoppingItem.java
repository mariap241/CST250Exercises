
package edu.ru.exercise02;


public class ShoppingItem {
    private String name;
    private ShoppingStatus status;

    public ShoppingItem(String name, ShoppingStatus status) {
        this.name = name;
        this.status = status;
    }
    
    public ShoppingItem(String name){
        this.name = name;
        this.status = ShoppingStatus.LISTED;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShoppingStatus getStatus() {
        return status;
    }

    public void setStatus(ShoppingStatus status) {
        this.status = status;
    }
    
    public void display(){
        System.out.println(this.name + "\t\t" + this.status);
    }
}
