package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        try {
            System.out.println("Enter a number between 0 and 100:");
            int number = Input.nextInt();
            if (number >= 0 && number <= 100) {
                number = number*number;
                System.out.println("Here is the square of your number: "+number);
            }else{
                throw new RuntimeException();
            }
        } catch(InputMismatchException e){
            System.err.println(e);
        } catch (RuntimeException e) {
            System.err.println(e);
            System.out.println("Out of range");
        }


    }
}