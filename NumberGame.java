//Task 1:Number Game 
import java.util.*;
class NumberGame{
    public static void main(String[] args) {
        // Create an instance of the Scanner
        Scanner sc=new Scanner(System.in);

        do{
        System.out.println("Guess the Number:");

        //user input to guess the number 
        int input=sc.nextInt();
      
        //create a new instance of the Random class
        Random random = new Random();

        // Generate a random integer between 1 and 100
        int randomNumber = random.nextInt(100) + 1;

         System.out.println("The Random Number is "+ randomNumber);

         //Check the Condition 
        if(input==randomNumber)
        System.out.println("Congrats ! you guess right.");
        else
        System.out.println("Sorry! \n you loss." );

       System.out.println("Do you want to play again? (y/n)"); 

       String option =sc.next();

        if(option.equals("y")){
         continue;
        }
        else{
          break;
        }
     
    }
   while(true);
   sc.close();
    }
    
}