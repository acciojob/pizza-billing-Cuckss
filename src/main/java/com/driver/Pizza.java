package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheese;
    private int toppings;
    boolean isExtraCheeseAdded;
    boolean isExtraToppingsAdded;
    boolean isPaperBagAdded;
    boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.isBillGenerated=false;
        this.isExtraCheeseAdded=false;
        this.isExtraToppingsAdded=false;
        this.isPaperBagAdded=false;
        this.bill="";

        if(isVeg){
            this.price=300;
            this.toppings=70;
        }else{
            this.price=400;
            this.toppings=120;
        }
        this.cheese=80;
        this.bill+="Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!isExtraCheeseAdded){
            this.price=this.price+cheese;
           this.isExtraCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        if(!isExtraToppingsAdded){
            this.price+=toppings;
            this.isExtraToppingsAdded=true;
        }
    }

    public void addTakeaway(){
        if(!isPaperBagAdded){
            this.price+=20;
            this.isPaperBagAdded=true;
        }
    }

    public String getBill() {
        if (!isBillGenerated) {
            if (isExtraCheeseAdded) {
                this.bill += "Extra Cheese Added: " + this.cheese + "\n";
            }
            if (isExtraToppingsAdded) {
                this.bill += "Extra Toppings Added: " + this.toppings + "\n";
            }
            if (isPaperBagAdded) {
                this.bill += "Paperbag Added: " + "20" + "\n";
            }
            this.bill += "Total Price: " + this.price;
            isBillGenerated=true;
        }
        return this.bill;
    }
}
