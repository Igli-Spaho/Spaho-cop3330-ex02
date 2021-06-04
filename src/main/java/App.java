//UCF COP3330 Summer 2021 Assignment 2 Solution
//Copyright 2021 igli spaho
//Create a program that prompts for an input string and displays output that shows the input string and the number of characters the string contains.
//
//Example Output

//What is the input string? Homer
//Homer has 5 characters.
//Constraints

//Be sure the output contains the original string.
//Use a single output statement to construct the output.
//Use a built-in function of the programming language to determine the length of the string.



import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner Output = new Scanner(System.in);
        System.out.print("What is the input string? ");

        String name = Output.nextLine();

        int length = name.length();

        System.out.println( name + " has " +length+ " Characters.");

    }



}
