import java.util.Scanner;

class Main {
  public static void main(String[] args) {
      System.out.println("Welcome! Please select a user option:");
      System.out.println("1. User 1 ");    
      System.out.println("2. User 2 ");    
      System.out.println("3. User 3 ");

    Scanner scan = new Scanner(System.in); 
    int x = scan.nextInt();

    if(x == 1){
        String user1 = "Yellow"; 
        String pass1 = "Shirt"; 

      System.out.println("Please enter the username  for User 1");
        String user1a = scan.nextLine(); 

      System.out.println("Please enter the password for User1");
        String pass1a = scan.nextLine();

         if(user1a.equals("Yellow") && pass1a.equals("Shirt")){
            System.out.println("Welcome Yellow!");
         }
         else if(!user1a.equals("Yellow") && pass1a.equals("Shirt")){ 
            System.out.println("Your username is incorrect!");
            System.out.println("Please re-enter:");

            user1a = scan.nextLine();
            if(user1a.equals("Yellow")){
                System.out.println("Welcome Yellow!");
              }
            else{
              System.out.println("Your username is incorrect");
              System.out.println("You have reached the maximum number of attempts");
              System.out.println("Goodbye!");
              System.exit(0);
            }

         }
         else if(user1a.equals("Yellow") && !pass1a.equals("Shirt")){
            System.out.println("Your password is incorrect!");
            System.out.println("Please re-enter:");

            pass1a = scan.nextLine(); 
            if(pass1a.equals("Shirt")){
              System.out.println("Welcome Yellow!");
            }
            else{
              System.out.println("Your username is incorrect");
              System.out.println("You have reached the maximum number of attempts");
              System.out.println("Goodbye");
              System.exit(0);
            }
         }
    }
    else if (x == 2){
      System.out.println("Please enter the username and password for User 2");

        String user2 = "Black"; 
        String pass2 = "Bird"; 

        String user2b = scan.nextLine(); 
        String pass2b = scan.nextLine();

         if(user2b.equals("Black") && pass2b.equals("Bird")){
            System.out.println("Welcome Black!");
         }
         else if(!user2b.equals("Black") && pass2b.equals("Bird")){ 
            System.out.println("Your username is incorrect!");
            System.out.println("Please re-enter your username:");

            user2b = scan.nextLine();
            if(user2b.equals("Black")){
              System.out.println("Welcome Black!");
            }
            else{
              System.out.println("Your username is incorrect");
              System.out.println("You have reached the maximum number of attempts");
              System.out.println("Goodbye");
              System.exit(0);
            } 

         }
         else if(user2b.equals("Black") && !pass2b.equals("Bird")){
            System.out.println("Your password is incorrect!");
            System.out.println("Please re-enter your password:");

            pass2b = scan.nextLine(); 
            if(pass2b.equals("Bird")){
              System.out.println("Welcome Black!");
              }
            else{
              System.out.println("Your password is incorrect");
              System.out.println("You've reached the maximum number of attempts!");
              System.out.println("Goodbye");
              System.exit(0); 
            }
         }
    else if(x == 3){
      System.out.println("Please enter the username and password for User 3");

        String user3 = "Red"; 
        String pass3 = "Flame"; 

        String user3c = scan.nextLine(); 
        String pass3c = scan.nextLine();

         if(user3c.equals("Red") && pass3c.equals("Flame")){
            System.out.println("Welcome Red!");
         }
         else if(!user3c.equals("Red") && pass3c.equals("Flame")){ 
            System.out.println("Your username is incorrect!");
            System.out.println("Please re-enter your username:");

            user2b = scan.nextLine();
            if(user3c.equals("Red")){
              System.out.println("Welcome Red!");
            }
            else{
                System.out.println("Your password is incorrect");
                System.out.println("You've reached the maximum number of attempts!");
                System.out.println("Goodbye");
                System.exit(0);
              } 
            }
         else if(user3c.equals("Red")  && !pass3c.equals("Flame")){
            System.out.println("Your password is incorrect!");
            System.out.println("Please re-enter your password:");

            pass2b = scan.nextLine(); 
            if(pass3c.equals("Flame")){
              System.out.println("Welcome Red!");
              }
            else{
              System.out.println("Your password is incorrect");
              System.out.println("You've reached the maximum number of attempts!");
              System.out.println("Goodbye");
              System.exit(0); 
            }
         }      
      }
    }
    }


  }
