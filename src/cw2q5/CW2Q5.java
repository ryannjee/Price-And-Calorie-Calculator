/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cw2q5;

/**
 *
 * @author Ryan
 */
import java.util.*;

public class CW2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int food;
        char last;
        boolean valid = false;
        int qty, i=0;
        Food A = new Food();
        Scanner s = new Scanner(System.in);
      
        do{
        System.out.println("-----------------Food List-----------------");
        System.out.println("1. | Sandwich     | 100g(304kcal) | RM7.00");
        System.out.println("2. | Chicken Rice | 100g(116kcal) | RM12.00");
        System.out.println("3. | Pizza        | 100g(276kcal) | RM15.00");
        System.out.println("4. | Meatball     | 100g(202kcal) | RM20.00");
        System.out.println("-------------------------------------------");
        
        do{
        System.out.println("Choose Food From List: "); //Key in food option
        food = s.next().charAt(0);
      
        switch(food){
            case '1': //when user choose option1 
            { 
                Food.qty();
                Food.price1 = 7;
                Food.cal1 = 304;
                System.out.println("        ****Result****        ");
                System.out.println("Food name       : Sandwich");
                System.out.println("Quantity        : " +Food.qty);
                System.out.println("Portion(g)      : " +A.por1());
                System.out.printf("Calories in kcal: %.3f" ,A.kcal1());
                System.out.printf("\nCalories in kJ  : %.3f" ,A.kj1());
                System.out.printf("\nTotal Price     : RM%.2f" ,A.tprice1());
                System.out.println("\n        **************        ");
                //output for option1
                i=1;
            }
            break;
            
            case '2': //when user choose option2
            {
                Food.qty();
                Food.price2 = 12;
                Food.cal2 = 116;
                System.out.println("        ****Result****        ");
                System.out.println("Food name       : Chicken Rice");
                System.out.println("Quantity        : " +Food.qty);
                System.out.println("Portion(g)      : " +A.por2());
                System.out.printf("Calories in kcal: %.3f" ,A.kcal2());
                System.out.printf("\nCalories in kJ  : %.3f" ,A.kj2());
                System.out.printf("\nTotal Price     : RM%.2f" ,A.tprice2());
                System.out.println("\n        **************        ");
                //output for option2
                i=1;
            }
            break;
          
            case '3': //when user choose option 3
            {
                Food.qty();
                Food.price3 = 15;
                Food.cal3 = 276;
                System.out.println("        ****Result****        ");
                System.out.println("Food name       : Pizza");
                System.out.println("Quantity        : " +Food.qty);
                System.out.println("Portion(g)      : " +A.por3());
                System.out.printf("Calories in kcal: %.3f" ,A.kcal3());
                System.out.printf("\nCalories in kJ  : %.3f" ,A.kj3());
                System.out.printf("\nTotal Price     : RM%.2f" ,A.tprice3());
                System.out.println("\n        **************        ");
                //output for option3
                i=1;
            }
            break;
          
            case '4': //when user choose option 4
            {
                Food.qty();
                Food.price4 = 20;
                Food.cal4 = 202;
                System.out.println("        ****Result****        "); 
                System.out.println("Food name       : Meatball");
                System.out.println("Quantity        : " +Food.qty);
                System.out.println("Portion(g)      : " +A.por4());
                System.out.printf("Calories in kcal: %.3f" ,A.kcal4());
                System.out.printf("\nCalories in kJ  : %.3f" ,A.kj4());
                System.out.printf("\nTotal Price     : RM%.2f" ,A.tprice4()); 
                System.out.println("\n        **************        ");
                //output for option4
                i=1;
            }
            break;
          
            default: 
            {
                System.out.println("Invalid Input, Please Try Again"); 
                //if user type wrong code
                i=0;
            }
        }
    }while(i==0);
        
        System.out.println("\nPress C If You Want To Count Again"); 
        System.out.println("Pres Any Key To Exit");
        //choose between counting again or exit
        last = s.next().charAt(0);
        
        if(last == 'C' || last == 'c')
        {
           valid = false; 
        }
        
        else
        {
            valid = true;
            System.out.println("Thank You");
        }
        }while(valid != true);
    }
}

