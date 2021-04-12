import java.util.*;
class Guess_The_numberGame
{   public static void main()
    {
     Scanner obj =new Scanner(System.in);
     System.out.println("GUESS THE NUMBER GAME!");
     System.out.println("Enter your name!");
     
     String name = obj.next();System.out.println("Welcome" +"    "+name+"    "+"Enjoy the game!");//hello there
     
     int number,guess,tries=0;
     number = (int)(Math.random()*100)+1;
     char choice;char feedback;String write,write1;
     System.out.println("Guess a no. between 1 to 100");
        
         do
          {  guess=obj.nextInt();
            tries++;
        if(guess>number)
        System.out.println("Too high. Try again!:(");
        else if(guess<number)
        System.out.println("Too less. Try again!:(");
        else if(guess==number)
        {System.out.println("Yay u guessed it right!"+"   "+"You took"+"  "+tries+"    "+"guesses");
        
        }
        }while(guess!=number);
        System.out.println("Did you like the game Y or N? To end the game press E");
        char n =obj.next().charAt(0);
        switch(n)
        {
            case 'Y':
                System.out.println("I am glad you liked it." + "   "+"If you want to give feedback press F");
                feedback = obj.next().charAt(0);
                switch(feedback)
                {
                      case 'F' :System.out.println("please enter your feedback");
                              write=obj.next();
                              System.out.println("Thanks for your valuable feedback!");break;
                      
                      }
                      break;
                      
            case 'N':System.out.println("please tell how i can improve");
                         write1 = obj.next();
                         System.out.println("Ok. I will definitely try to improve it");break;
            case 'E' : System.exit(0);
                     
            }
            
          System.out.println("Thanks for playing! see you soon. :)");
 }
       
}
