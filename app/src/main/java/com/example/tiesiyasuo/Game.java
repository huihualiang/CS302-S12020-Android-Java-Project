package com.example.tiesiyasuo;

public class Game{
    String name;
    String console;
    Float price;
    String ID;
    String Descrip;
    static int count = 0;
    public Game(String name, String console, Float price, String description){
        count++;
        String temp = Integer.toString(count);
        while (temp.length() < 5){
            temp = "0" + temp;
        }
        this.ID = temp;
        this.name = name;
        this.console = console;
        this.price = (float) price;
        this.Descrip = description;
    }

    public Game(String name, String console, Float price){
        count++;
        String temp = Integer.toString(count);
        while (temp.length() < 5){
            temp = "0" + temp;
        }
        this.ID = temp;
        this.name = name;
        this.console = console;
        this.price = (float) price;
        this.Descrip = "...";
    }

    public String getName(){
        return this.name;
    }

    public String getConsole(){
        return this.console;
    }

    public String getPrice(){
        return "$" + this.price;
    }

    public Float getPriceInt(){
        return this.price;
    }
    public String getID(){
        return this.ID;
    }

    public String getDescription(){return this.Descrip;}

}
