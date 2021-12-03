import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greet("Aid", "2018");
        remindName();
        guessAge();
        count();
        about_test();
        test();
        end();
    }

    static void greet(String assistantName, String birthYear) {
        String data = String.format("""
                           Hello! My name is %s
                           I was created in %s
                           Please, remind me your name.
                           """, assistantName, birthYear);
        System.out.println(data);
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.printf("What a great name you have, %s!%n", name);
    }

    static void guessAge() {
        System.out.println("""
        
        Let me guess your age.
        Enter remainders of dividing your age by 3, 5 and 7.""");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.printf("Your age is %s, that's a good time to start programming!%n", age);
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any integer number you want.");
        int num = scanner.nextInt();
        Stream.iterate(0, n -> n + 1)
                .limit(num+1)
                .forEach(x -> System.out.println(x + "!"));
    }

    static void about_test() {
        System.out.println("""
        Let's test your programming knowledge.
        Why do we use methods? [Enter 1-4]
        1. To repeat a statement multiple times.
        2. To decompose a program into several small subroutines.
        3. To determine the execution time of a program.
        4. To interrupt the execution of a program.
        """);
    }
    static void test() {
        int correct_answer = 2;
        int input_answer = scanner.nextInt();
        if (correct_answer == input_answer) {
            System.out.println("Completed!");
        } else
        {
            System.out.println("Please, try again.");
            test();
        }
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!");
        scanner.close();
    }
}