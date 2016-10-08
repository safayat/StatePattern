import java.util.Scanner;

/**
 * Created by safayat on 10/7/16.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Acceptable commands: add,sub,mul,div,exit");
        System.out.println("example: add 5 7");
        System.out.println("example: sub 10 7");
        System.out.println("example: mul 56 7");
        System.out.println("example: div 24 3");
        System.out.println("hit exit to terminate....");
        while (true) {
            String commandString = in.nextLine();
            if (commandString.equalsIgnoreCase("exit")) {
                break;
            }

            Context context = new Context();
            String[] commands = commandString.split(" ");
            if ("add".equalsIgnoreCase(commands[0])) {
                AddState add = new AddState();
                add.setA(Integer.parseInt(commands[1]));
                add.setB(Integer.parseInt(commands[2]));
                context.setState(add);
            }else if("mul".equalsIgnoreCase(commands[0])){
                MultiplyState multiply = new MultiplyState();
                multiply.setA(Integer.parseInt(commands[1]));
                multiply.setB(Integer.parseInt(commands[2]));
                context.setState(multiply);

            }
            else if("div".equalsIgnoreCase(commands[0])){
                DivideState divide = new DivideState();
                divide.setA(Integer.parseInt(commands[1]));
                divide.setB(Integer.parseInt(commands[2]));
                context.setState(divide);

            }
            else if("sub".equalsIgnoreCase(commands[0])){
                SubtractState subtract = new SubtractState();
                subtract.setA(Integer.parseInt(commands[1]));
                subtract.setB(Integer.parseInt(commands[2]));
                context.setState(subtract);

            }
            System.out.println(context.calculate());
        }
    }
}