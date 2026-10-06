package rockPaperScissor;

// Rock paper scissor
// players -user computer

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Random random =new Random();

        //user instruction
        System.out.println("Choose one option");
        System.out.println("1- Rock");
        System.out.println("2- Paper");
        System.out.println("3- scissor");

        //user input
        System.out.print("Enter user choice : ");
        int userChoice=sc.nextInt();

        //computer random choice (1to 3)
        int computerChoice=(int) Math.floor(Math.random()*3)+1;

        //show choice
        System.out.println("userChoice : " + getChoiceName(userChoice));
        System.out.println("computerChoice :" +getChoiceName(computerChoice));

        //decision winner
        if(userChoice==computerChoice) {
        } else if((userChoice==1&&computerChoice==3)||
        (userChoice==2&& computerChoice==1)||
                (userChoice==3&&computerChoice==2)){
            System.out.println("result : User wins");

        }else{
            System.out.println("result: Computer wins");
        }
        sc.close();
    }
    public static String getChoiceName(int choice) {
        //getChoice number ko convert kar dati ha rock paper scissro ma
        switch (choice){
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissor";
            default:
                return "Invalid choice";
        }

    }
}
