import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userNum;
        boolean hexaNum;


        System.out.println("Enter a hexadecimal number: ");
        userNum = scnr.nextLine();

        if(userNum.startsWith("0x", 0)){
            hexaNum = true;
            long sum = 0;
            long newSum = 0;

            //Create a new substring that does not include "0x"
            String newHexaNum = userNum.substring(2, userNum.length());

            //do a for loop
            for(int i = newHexaNum.length()-1; i >=0; i--){

                switch(newHexaNum.charAt(i)){
                    case '1':
                        newSum = 1 * (int) (Math.pow(16, ((newHexaNum.length()-1) - i) ));
                        break;
                    case '2':
                        newSum = 2 * (int) (Math.pow(16, ((newHexaNum.length()-1) - i) ));
                        break;
                    case '3':
                        newSum = 3 * (int) (Math.pow(16, ((newHexaNum.length()-1) - i) ));
                        break;
                    case '4':
                        newSum = 4 * (int) (Math.pow(16, ((newHexaNum.length()-1) - i) ));
                        break;
                    case '5':
                        newSum = 5 * (int) (Math.pow(16, ((newHexaNum.length()-1) - i) ));
                        break;
                    case '6':
                        newSum = 6 * (int) (Math.pow(16, ((newHexaNum.length()-1) - i) ));
                        break;
                    case '7':
                        newSum = 7 * (int) (Math.pow(16, ((newHexaNum.length()-1) - i) ));
                        break;
                    case '8':
                        newSum = 8 * (int) (Math.pow(16, ((newHexaNum.length()-1) - i) ));
                        break;
                    case '9':
                        newSum = 9 * (int) (Math.pow(16, ((newHexaNum.length()-1) - i) ));
                        break;
                    case 'A':
                        newSum = 10 * (int) (Math.pow(16, ((newHexaNum.length()-1) - i) ));
                        break;
                    case 'B':
                        newSum = 11 * (int) (Math.pow(16, ((newHexaNum.length()-1) - i) ));
                        break;
                    case 'C':
                        newSum = 12 * (int) (Math.pow(16, ((newHexaNum.length()-1) - i) ));
                        break;
                    case 'D':
                        newSum = 13 * (long) (Math.pow(16, ((newHexaNum.length()-1) - i) ));
                        break;
                    case 'E':
                        newSum = 14 * (int) (Math.pow(16, ((newHexaNum.length()-1) - i) ));
                        break;
                    case 'F':
                        newSum = 15 * (long) (Math.pow(16, ((newHexaNum.length()-1) - i) ));
                        break;
                    case 'a':
                        newSum = 10 * (int) (Math.pow(16, ((newHexaNum.length()-1) - i) ));
                        break;
                    case 'b':
                        newSum = 11 * (int) (Math.pow(16, ((newHexaNum.length()-1) - i) ));
                        break;
                    case 'c':
                        newSum = 12 * (int) (Math.pow(16, ((newHexaNum.length()-1) - i) ));
                        break;
                    case 'd':
                        newSum = 13 * (int) (Math.pow(16, ((newHexaNum.length()-1) - i) ));
                        break;
                    case 'e':
                        newSum = 14 * (int) (Math.pow(16, ((newHexaNum.length()-1) - i) ));
                        break;
                    case 'f':
                        newSum = 15 * (int) (Math.pow(16, ((newHexaNum.length()-1) - i) ));
                        break;
                }
                sum += newSum;
            }

            System.out.println("Your number is " + sum + " in decimal");
        }else {
            int sum = 0;
            int newSum = 0;

            //Since there is no "0x" you can use normal string
            for(int i = userNum.length()-1; i >=0; i--){

                switch(userNum.charAt(i)){
                    case '1':
                        newSum = 1 * (int) (Math.pow(16, ((userNum.length()-1) - i) ));
                        break;
                    case '2':
                        newSum = 2 * (int) (Math.pow(16, ((userNum.length()-1) - i) ));
                        break;
                    case '3':
                        newSum = 3 * (int) (Math.pow(16, ((userNum.length()-1) - i) ));
                        break;
                    case '4':
                        newSum = 4 * (int) (Math.pow(16, ((userNum.length()-1) - i) ));
                        break;
                    case '5':
                        newSum = 5 * (int) (Math.pow(16, ((userNum.length()-1) - i) ));
                        break;
                    case '6':
                        newSum = 6 * (int) (Math.pow(16, ((userNum.length()-1) - i) ));
                        break;
                    case '7':
                        newSum = 7 * (int) (Math.pow(16, ((userNum.length()-1) - i) ));
                        break;
                    case '8':
                        newSum = 8 * (int) (Math.pow(16, ((userNum.length()-1) - i) ));
                        break;
                    case '9':
                        newSum = 9 * (int) (Math.pow(16, ((userNum.length()-1) - i) ));
                        break;
                    case 'A':
                        newSum = 10 * (int) (Math.pow(16, ((userNum.length()-1) - i) ));
                        break;
                    case 'B':
                        newSum = 11 * (int) (Math.pow(16, ((userNum.length()-1) - i) ));
                        break;
                    case 'C':
                        newSum = 12 * (int) (Math.pow(16, ((userNum.length()-1) - i) ));
                        break;
                    case 'D':
                        newSum = 13 * (int) (Math.pow(16, ((userNum.length()-1) - i) ));
                        break;
                    case 'E':
                        newSum = 14 * (int) (Math.pow(16, ((userNum.length()-1) - i) ));
                        break;
                    case 'F':
                        newSum = 15 * (int) (Math.pow(16, ((userNum.length()-1) - i) ));
                        break;
                    case 'a':
                        newSum = 10 * (int) (Math.pow(16, ((userNum.length()-1) - i) ));
                        break;
                    case 'b':
                        newSum = 11 * (int) (Math.pow(16, ((userNum.length()-1) - i) ));
                        break;
                    case 'c':
                        newSum = 12 * (int) (Math.pow(16, ((userNum.length()-1) - i) ));
                        break;
                    case 'd':
                        newSum = 13 * (int) (Math.pow(16, ((userNum.length()-1) - i) ));
                        break;
                    case 'e':
                        newSum = 14 * (int) (Math.pow(16, ((userNum.length()-1) - i) ));
                        break;
                    case 'f':
                        newSum = 15 * (int) (Math.pow(16, ((userNum.length()-1) - i) ));
                        break;
                }
                sum += newSum;
            }

            System.out.println("Your number is " + sum + " in decimal");

        }

    }

}