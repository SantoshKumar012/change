import java.util.Scanner;  // Import the Scanner class

class Lemonade {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = sc.nextLine();  // Read user input
    System.out.println("Username is: " + userName); 
    sc.close();
  }
}