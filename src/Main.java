import java.util.Scanner;

public class Main {
      public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter number: ");
            int number = in.nextInt();
            
            String[]smallNumbers = {"Null", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
            		"Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
            String[]tenNumbers = {"", "", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
            String[]hundredNumbers = {"", "One hundred", "Two hundred", "Three hundred", "Four hundred", "Five hundred", "Six hundred", "Seven hundred", "Eight hundred", "Nine hundred"};
            
            if(number < 20) {
                System.out.print(smallNumbers[number]);
          }
          if(number > 20 && number < 100) {
                int firstNumber = number / 10;
                int secondNumber = number % 10;
                System.out.print(tenNumbers[firstNumber] + "  " + smallNumbers[secondNumber]);
          }
          if(number > 99 && number < 1000) {
                switch(number) {
                      case 100 : System.out.print(hundredNumbers[0]); break;
                      case 200 : System.out.print(hundredNumbers[1]); break;
                      case 300 : System.out.print(hundredNumbers[2]); break;
                      case 400 : System.out.print(hundredNumbers[3]); break;
                      case 500 : System.out.print(hundredNumbers[4]); break;
                      case 600 : System.out.print(hundredNumbers[5]); break;
                      case 700 : System.out.print(hundredNumbers[6]); break;
                      case 800 : System.out.print(hundredNumbers[7]); break;
                      case 900 : System.out.print(hundredNumbers[8]); break;
                }
                int firstNumber = number / 100;
                int secondNumber = number % 100;
                int otherNumber = number / 10;
                if(otherNumber == 20 || otherNumber == 30 || otherNumber == 40 || otherNumber == 50 || otherNumber == 60 || otherNumber == 70 || otherNumber == 80 || otherNumber == 90) {
                      secondNumber = 0;
                }
                else {
                      if(secondNumber > 19) {
                            secondNumber = secondNumber / 10;
                            
                      }
                }
                int thirdNumber = (number % 100) % 10;
                if(secondNumber < 1) {
                      System.out.print(hundredNumbers[firstNumber] + "  " + smallNumbers[thirdNumber]);
                }
                else {
                      if(secondNumber > 9 && secondNumber < 20) {
                            System.out.print(hundredNumbers[firstNumber] + "  " + smallNumbers[secondNumber]);
                      }
                      else {
                            System.out.print(hundredNumbers[firstNumber] + " " + tenNumbers[secondNumber] + "  " + smallNumbers[thirdNumber]);      
                      }
                }
          }
    }
}