/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpsobjects;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author svlln
 */
public class game {
    
//====================== Declare variables =========

 private String userName, userPickRPS, compChoice;
 private String continueOn = "";
 private int userPickRounds;
 private int overallRoundsContinued = 0;
 private int computerWins = 0;
 private int userWins = 0;
 private int numTies = 0;
 private int rounds = 0;
 private int compInt;
 Rounds numRounds = new Rounds();
//================= Randomizer / Scanner ==================        
Scanner userInput = new Scanner(System.in);
Random randomizer = new Random();


public void run(){
    
    // =========================== INTRO ========================
     System.out.print("Whats your name? ");
     userName = userInput.next();
     System.out.println("Hello, " +userName+ " Lets play a few round's of Rock, paper, scissors! bet you cant beat me.");

do{ // Continue if player wants to play again
     System.out.println("***************************************");
     System.out.println("*                                     *");
     System.out.println("*        ROCK PAPER SCISSOR!!         *");
     System.out.println("*                                     *");
     System.out.println("***************************************");
     System.out.println("");
                
//======================= INTRO END ==============================     
  do{ 
       
        numRounds.round();
      
  } while(numRounds.getUserPickRounds() < 1 || numRounds.getUserPickRounds() > 10 );
  
    do{
        do{
            System.out.println("==============");
            System.out.println("Round: " +(rounds + 1) +"!!" );
            System.out.println("==============");
            System.out.println("");
            System.out.println("Rock, Paper, or Scissor? ");
            userPickRPS = userInput.next();
    // if user picks anything besides these 3 choices it loops until they write correct option        
    if (userPickRPS.equalsIgnoreCase("rock")||userPickRPS.equalsIgnoreCase("paper") || userPickRPS.equalsIgnoreCase("scissor")){

            
        //Generate computer's play (1,2,3) 
        compInt = randomizer.nextInt(3)+1; 

                //Translate computer's randomly generated play to
                //string using switch statements
                switch (compInt) {
                    case 1:
                        compChoice = "rock";
                        break;
                    case 2:
                        compChoice = "paper";
                        //System.out.println("my pick is: " + compPick); 
                        break;
                    case 3:
                        compChoice = "scissor";
                        break;
                    default:
                        break;
                }
    //================= Determines who won ====================            
    
                // rock
            if (userPickRPS.equalsIgnoreCase("rock") && compInt == 1){
              System.out.println("you got a tie");
               numTies++;
            } else if (userPickRPS.equalsIgnoreCase("rock") && compInt == 2){
                System.out.println("Paper wraps Rock");
                computerWins++;
            } else if (userPickRPS.equalsIgnoreCase("rock") && compInt == 3){
                System.out.println("Rock crushes Scissor");
                userWins++;
            }
        
            // paper
            if (userPickRPS.equalsIgnoreCase("paper") && compInt == 1){
                System.out.println("You got a tie");
                numTies++;
            } else if (userPickRPS.equalsIgnoreCase("paper") && compInt == 2){
                System.out.println("Paper wraps Rock");
                userWins++;
            } else if (userPickRPS.equalsIgnoreCase("paper") && compInt == 3){
                System.out.println("Scissor cuts paper");
                computerWins++;
            } 
            //Scissor
            if(userPickRPS.equalsIgnoreCase("scissor") && compInt == 3){
                System.out.println("You got a tie");
                numTies++;
            } else if (userPickRPS.equalsIgnoreCase("scissor") && compInt == 2){
                System.out.println("Scissor cuts paper");
                userWins++;
            } else if (userPickRPS.equalsIgnoreCase("scissor") && compInt == 1){
                System.out.println("Rock Crushes scissor");
                computerWins++;
                
            }       // increses rounds and displays points
                    rounds++;
                    System.out.println("");
                    System.out.println("");
                    System.out.println("****************");
                    System.out.println( userName + " wins: " + userWins);
                    System.out.println("Computer wins: " + computerWins);
                    System.out.println("****************");
                    System.out.println("");
             } else{ // if user picks other than Rock, paper, scissor- displays this message
                 System.out.println("Pick either rock, paper, scissor..");
             } 
                        
        // keep doing game going while they use RPS other wise loop    
        } while( rounds < (numRounds.getUserPickRounds()) );/*userPickRPS.equalsIgnoreCase("rock") || userPickRPS.equalsIgnoreCase("paper") || userPickRPS.equalsIgnoreCase("scissor")*/  // do while u pick either rock paper or scissor
        
    }while(rounds < (numRounds.getUserPickRounds()));
    
    System.out.println(" Would you lke to continue? (y/n)");
    System.out.println("");

    continueOn = userInput.next();
        switch (continueOn) {
            case "y":
                System.out.println("Lets go again!");
                overallRoundsContinued++;
                userWins = 0;
                computerWins = 0;
                numTies = 0;
                break;
                        
            case "n":
                System.out.println("Thanks for playing");
                System.out.println("");
                break;
            default:
                System.out.println(" Please select 'y' for Yes or 'n' for No");
                }
                
 }while(rounds < (numRounds.getUserPickRounds()));// should continue if player hit y / rounds < numRounds
        

        // Displays final Scores and winner 
        
        if(numTies == userWins || numTies == computerWins){
            System.out.println("You almost Had me!! Better Luck next time " + userName);
        } else if (computerWins > userWins){
            System.out.println("Told you before " + userName + "! YOU CANNOT DEFEAT ME!");
        } else if (computerWins < userWins){
            System.out.println("I underestimated  you...");
        }
        
        
            System.out.println("");
            System.out.println("The final results are: ");
            System.out.println("");
            System.out.println(" Number Of Total Rounds Played: " + (rounds + overallRoundsContinued));
            System.out.println( userName + " Wins: " + userWins);
            System.out.println(" Computer Wins: " + computerWins);
            System.out.println(" Ties: " + numTies);

        
        
    
    
    
    
}


    
    
}
