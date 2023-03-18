package Chapter5;

import java.util.Scanner;

public class GlobalWarmingFactsQuiz {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //String answerOneA = "inheritance";

        //String answerTwoA = "initialization";

        System.out.println("""
                Welcome to climate Quiz.
                Pleased to have you here
                Do enjoy the quiz
                """);

        System.out.println("Do you like to continue: Yes(1) or No(2)");
        int entry = input.nextInt();

        int total = 0;

        while(entry != 2){

            System.out.println("Pick an alphabet ranging from 1 to 5");
            int question = input.nextInt();

            switch(question){

                case 1:
                    System.out.println("What are the pillars of OOP, Answer is :");
                    String answerOneB = input.next();
                    if(answerOneB == "inheritance"){
                    System.out.println("You are correct");
                    }

                    break;




                case 2:
                    System.out.println(" what are the loop conditions");
                    String answerTwoB = input.next();

                    if(answerTwoB == "initialization"){
                        System.out.println("You are correct");
                        total = total + 1;
                        break;
                    }

                case 3:
                    System.out.println("how many loops do we have");
                    break;

                case 4:
                    System.out.println("what are control structures");
                    break;

                case 5:
                    System.out.println("how many selection section do we have");
                    break;
            }

            System.out.println("Do you like to continue: Yes(1) or No(2)");
            entry = input.nextInt();
        }

        System.out.println("Your total result is " + total);
    }

}
