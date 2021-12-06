import java.util.Scanner;
import java.util.stream.IntStream;

public class SimpleBot {

    private final Scanner scanner = new Scanner(System.in);

    public void run() {
        greet("Aid", "2018");
        remindName();
        guessAge();
        count();
        aboutTest();
        test();
        scanner.close();
        end();
    }

    private void greet(String assistantName, String birthYear) {
        String data = String.format("""
                Hello! My name is %s
                I was created in %s
                Please, remind me your name.
                """, assistantName, birthYear);
        System.out.println(data);
    }

    private void remindName() {
        String name = scanner.nextLine();
        System.out.printf("What a great name you have, %s!%n", name);
    }

    private void guessAge() {
        System.out.println("""
                Let me guess your age.
                Enter remainders of dividing your age by 3, 5 and 7.""");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.printf("Your age is %s, that's a good time to start programming!%n", age);
    }

    private void count() {
        System.out.println("Now I will prove to you that I can count to any integer number you want.");
        int num = scanner.nextInt();
        IntStream.rangeClosed(0, num)
                .forEach(x -> System.out.println(x + "!"));
    }

    private void aboutTest() {
        System.out.println("""
                Let's test your programming knowledge.
                Why do we use SimpleBot? [Enter 1-4]
                1. To repeat a statement multiple times.
                2. To decompose a program into several small subroutines.
                3. To determine the execution time of a program.
                4. To interrupt the execution of a program.
                """);
    }

    private void test() {
        int correct_answer = 2;
        int input_answer = scanner.nextInt();
        if (correct_answer == input_answer) {
            System.out.println("Completed!");
        } else {
            System.out.println("Please, try again.");
            test();
        }
    }

    private void end() {
        System.out.println("Congratulations, have a nice day!");
    }

}
