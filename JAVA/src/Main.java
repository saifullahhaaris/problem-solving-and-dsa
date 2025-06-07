import java.util.Arrays;
import java.util.Scanner;

//// Check if a Number is Prime
//// Write a function that checks whether a number is prime.
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter a number to check prime: ");
//        int primenum = scanner.nextInt();
//
//        if (primenum<2){
//            System.out.println(primenum + " is not a prime number");
//            return;
//        }
//
//        for (int i = 2; i < primenum; i++ ){
//            if (primenum % i == 0){
//                System.out.println(primenum + " is not a prime number");
//                return;
//            }
//        }
//        System.out.println(primenum + " is a prime number");
//
//        scanner.close();
//    }
//}










//// Find the Largest Number in a List
//// Given a list of numbers, write code to find the largest number without using max().
//
//public class Main {
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter a list of numbers with space dividing: ");
//        String numbers = scanner.nextLine();
//        String[] listing = numbers.split(" ");
//
//        int[] newnums = new int[listing.length];
//
//        for (int i = 0; i< listing.length; i++){
//            newnums[i] = Integer.parseInt(listing[i]);
//        }
//
//        int bignumber = newnums[0];
//        for (int num : newnums){
//            if (num>bignumber){
//                bignumber = num;
//            }
//        }
//        System.out.println(bignumber);
//    }
//}









//// Count Vowels in a Word
//// Write a function that counts how many vowels (a, e, i, o, u) are in a given word.
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter a sentence: ");
//        String sentence = scanner.nextLine();
//        String[] sliced = sentence.split("");
//        int vowelscount = 0;
//        String[] vowels = {"a", "e", "i", "o", "u"};
//
//        for (int i = 0; i<sliced.length; i++){
//            for (int j = 0; j<vowels.length; j++) {
//                if (sliced[i].equalsIgnoreCase(vowels[j])) {
//                    vowelscount++;
//                }
//            }
//        }
//        System.out.println(vowelscount);
//    }
//}










//// Reverse a String
//// Ask the user for a string and print its reverse.
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter a String to reverse: ");
//        String string2 = scanner.nextLine();
//
//        String[] splited = string2.split("");
//        String[] reversed = new String[splited.length];
//
//        for (int i =0; i < splited.length; i++){
//            reversed[splited.length-1-i] = splited[i];
//        }
//
//        String reversedstring = "";
//        for(int i = 0; i<reversed.length;i++){
//            reversedstring += reversed[i];
//        }
//        System.out.println("Reversed String is "+ reversedstring);
//        scanner.close();
////        StringBuilder reversedstring = new StringBuilder();
////        for (String s : reversed){
////            reversedstring.append(s);
////        }
//    }
//}











//// Print All Even Numbers from 1 to 20
//// Write a loop that prints only the even numbers between 1 and 20.
//
//    public class Main{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
//        for (int i =0; i<= numbers.length; i++){
//            if (i % 2 ==0){
//                System.out.println(i);
//            }
//        }
//    }
//}