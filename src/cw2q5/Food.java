/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cw2q5;

/**
 *
 * @author Catherine
 */
import java.util.*;

public class Food {
    public static int qty, price;
    public static double price1, price2, price3, price4;
    public static double cal1, cal2, cal3, cal4;
    
    public static void qty(){
    do{
    Scanner s = new Scanner(System.in);
    System.out.println("Enter Quantity: "); //key in quantity
    qty = s.nextInt();
    
    if(qty < 0){
        qty = 1;
    }
    }while(qty < 0);
    }

    public int por1(){
        return qty * 100; //count total portion
    }
    
    public double kcal1(){
        return cal1 * qty; //count total kcal of food
    }
    
    public double kj1(){
        return cal1 * 4.184 * qty; //convert kcal to kj
    }
    
    public double tprice1(){
        if(price1 < 0){
            price1 = 1;
        }
        
        if(qty < 0){
           qty = 1;
        }
        return price1 * qty; //count total price
    }
    
    public int por2(){
        return qty * 100; //count total portion
    }
    
    public double kcal2(){
        return cal2 * qty; //count total kcal of food
    }
        
    public double kj2(){
        return cal2 * 4.184 * qty; //convert kcal to kj
    }
    
    public double tprice2(){
        if(price2 < 0){
            price2 = 1;
        }
        
        if(qty < 0){
            this.qty = 1;
        }
        return price2 * qty; //count total price
    }
    
    public int por3(){
        return qty * 100; //count total portion
    }
    
    public double kcal3(){
        return cal3 * qty; //count total kcal of food
    }
    
    public double kj3(){
        return cal3 * 4.184 * qty; //convert kacl to kj
    }
    
    public double tprice3(){
        if(price3 < 0){
            price3 = 1;
        }
        
        if(qty < 0){
        this.qty = 1;
        }
        return price3 * qty; //count total price
    }
    
    public int por4(){
        return qty * 100; //count total portion
    }
    
    public double kcal4(){
        return cal4 * qty; //count total kcal of food
    }
        
    public double kj4(){
        return cal4 * 4.184 * qty; //convert kacl to kj
    }
    
    public double tprice4(){
        if(price4 < 0)
            price4 = 1;
        
        if(qty < 0)
        this.qty = 1;
        return price4 * qty; //count total price
    }
 
}

