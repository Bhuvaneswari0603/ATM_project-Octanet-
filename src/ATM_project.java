import java.util.Scanner;
public class ATM_project
{
    public static void main(String [] args)
    {
    int pin = 12345;
    int balance = 10000;
    int Addamount =0;
    int Takeamount =0;
    String name;
    Scanner sc= new Scanner(System.in);
    
    System.out.println("Enter your pin number:");
     int password = sc.nextInt();
     if ( password == pin)
     {
     System.out.println("Enter your name:");
     name = sc.next();
     System.out.println("Welcome" +name);

     while(true)
     {
        System.out.println("press 1 to check your balance");
        System.out.println("press 2 to add amount");
        System.out.println("press 3 to take amount");
        System.out.println("press 4 to take receipt");
        System.out.println("press 5 to change pin no");
        System.out.println("press 6 to EXIT");

        int opt = sc.nextInt();
        switch(opt)
        {
        
       case 1:
       
  
            System.out.println("Your current amount:"+balance);
        
        break;

        case 2:
        	
            System.out.println("How much money did you want to add:");
            Addamount=sc.nextInt();
            System.out.println("Amount credited sucessfully");
            balance = balance + Addamount;
            break;

        case 3:
            System.out.println("How much money did you want to take:");
            Takeamount=sc.nextInt();
            if(Takeamount>balance)
            {
                System.out.println("Your balance is insufficient");
                System.out.println("Try less than your balance amount");
            }
            else
            {
                System.out.println("Amount depositred sucessfully");
                balance = balance - Takeamount;
            }
            break;

        case 4:
            System.out.println("Welcome to All in one mini ATM");
            System.out.println("Balance Amount:" +balance);
            System.out.println("Amount deposited:" +Takeamount);
            System.out.println("Amount credited:" +Addamount);
            System.out.println("Thanks for coming");
            break;

        case 5:
            System.out.println("Current pin number:" +pin);
            System.out.println("Enter the pin number that you want to change:");
            pin = sc.nextInt();
            System.out.println("Pin number changed successfully");
            break;

        }
        if (opt==6)
        {
            System.out.println("Thank you");
            break;
        }
     }
     }
        else{
            System.out.println("Wrong pin number");
        }

    }
}


     
     
            
    

    

