package hometask;

import hometask.logging.ConsoleLogger;

public class Main {
    public static void main(String[] args) {
//        ConsoleView consoleView = new ConsoleView();
//        consoleView.getValue("")
        Presenter p = new Presenter(new ConsoleView(), new CalcComplexModel(new ConsoleLogger()));
        p.buttonClick();
    }
}
