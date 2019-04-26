/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpsobjects;

import java.util.Scanner;

/**
 *
 * @author svlln
 */
public class Rounds {
    private String choice;
    private int rounds;
    private int  userPickRounds;
    private Scanner input;
    private int userChoice;
    
//    Scanner userInput = new Scanner(System.in);
    
public Rounds(){
    this.input = new Scanner (System.in);
}

    public int getUserPickRounds() {
        return userPickRounds;
    }


    
    

    public int round(){
       // int rounds;
      System.out.println("");
      System.out.print("How many rounds do you want to play?(1-10) ");
        userPickRounds=Integer.parseInt(input.nextLine()); // --- correct later
        // Makes player pick between 1-10 else gets error, repeats until valid input is given
        if(userPickRounds >= 1 && userPickRounds <= 10){
            System.out.println("Awesome, best out of "+ userPickRounds);
            System.out.println("");
        } else{
            System.out.println("");
            System.out.println("*** ERROR ***");
            System.out.println("Pick between 1-10 rounds.");
        }
      
        
        return userPickRounds;
    }   

    
//    private String userPickRounds(){
//        return input.nextLine();
    }
//private String userChoice(){
//    return input.nextLine();
//}    

//    void round() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }


