package hometask;

import java.util.Scanner;

public class ConsoleView implements View{

    Scanner in = new Scanner(System.in);
    @Override
    public Float getValue(String title) {
        System.out.printf("%s", title);
        try {
            return in.nextFloat();
        } catch (Exception e) {
            System.out.println("You've broken the program. Good Bye!");
            throw new RuntimeException(e);
        }
    }

    @Override
    public void print(ComplexNumber data) {
        System.out.println(data);
    }
}
