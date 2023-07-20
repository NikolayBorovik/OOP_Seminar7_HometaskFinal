package hometask;

import java.util.Scanner;

public class Presenter {
    View view;
    CalcComplexModel calcComplexModel;

    public Presenter(View view, CalcComplexModel calcComplexModel) {
        this.view = view;
        this.calcComplexModel = calcComplexModel;
    }

    public void buttonClick(){
        Commands com;
        while (true) {
            String command = prompt("Please, enter a command: ");
            boolean done = false;
            while(!done){
                try {
                    com = Commands.valueOf(command);
                    done = true;
                } catch (IllegalArgumentException ex){
                    System.out.println("Wrong command. ");
                    command = prompt("Please, enter a command: ");
                }
            }

            com = Commands.valueOf(command);

            if (com == Commands.EXIT) return;
            switch (com) {
                case ADD:
                    getNumbers();
                    calcComplexModel.add();
                    break;
                case SUBSTRACT:
                    getNumbers();
                    calcComplexModel.substact();
                    break;
                case MULTIPLY:
                    getNumbers();
                    calcComplexModel.multiply();
                    break;
                case DIVIDE:
                    getNumbers();
                    calcComplexModel.divide();
                    break;
                case NONE:
                    while (prompt("Pending a command: ").equals("NONE")){
                        prompt("Pending a command: ");
                    }
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + com);
            }

        }

    }
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private void getNumbers(){
        ComplexNumber a = new ComplexNumber (view.getValue("Please, enter the real part: "),
                view.getValue("Please, enter the imaginary part: "));
        ComplexNumber b = new ComplexNumber (view.getValue("Please, enter the real part: "),
                view.getValue("Please, enter the imaginary part: "));
        calcComplexModel.SetA(a);
        calcComplexModel.SetB(b);
    }


}
