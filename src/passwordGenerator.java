import java.util.*;
public class passwordGenerator {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String lowerCase = "abcdefghijklmnopqrstuvwxyz";
            String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String digits = "0123456789";

            System.out.println("Enter number of uppercase letter");
            int upperCase1 = sc.nextInt();
            System.out.println("Enter number of lowercase letter");
            int lowerCase1 = sc.nextInt();
            System.out.println("Enter number of digits");
            int digit1 = sc.nextInt();
            System.out.println("Enter the total number of symbols ");
            int totalSymbols = sc.nextInt();

            int totalVal = upperCase1 + lowerCase1 + digit1;
            int restValue = totalSymbols - totalVal;
            upperCase1 = upperCase1 + restValue;

            int counter = 0;
            char[] upperCaseVal = new char[upperCase1];
            for (int i = 0; i < upperCase1; i++) {
                upperCaseVal[i] = upperCase.charAt(counter);
                counter = counter + 2;
                if (counter > 20) {
                    counter = counter - 19;
                }
            }

            int counter2 = 0;
            char[] lowerCaseVal = new char[lowerCase1];
            for (int i = 0; i < lowerCase1; i++) {
                lowerCaseVal[i] = lowerCase.charAt(counter2);
                counter2 = counter2 + 2;
                if (counter2 > 20) {
                    counter2 = counter2 - 19;
                }
            }

            int counter3 = 0;
            char[] digitVal = new char[digit1];
            for (int i = 0; i < digit1; i++) {
                digitVal[i] = digits.charAt(counter3);
                counter3 = counter3 + 2;
                if (counter3 >= 8) {
                    counter3 = counter3 - 7;
                }
            }

            String upperval = new String(upperCaseVal);
            String lowerval = new String(lowerCaseVal);
            String digitvalue = new String(digitVal);

            String yourPassword = upperval + lowerval + digitvalue;

            System.out.println("Based on your requirement, we suggest you this password : ");

            System.out.print(yourPassword);

            System.out.println("Thank you for using our system !! Feel free to suggest your friend this program..");


        }
    }


