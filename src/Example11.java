import java.util.Scanner;
class Example11 {
    public static void main(String[] argv) {
        float x,y;
        System.out.println("Enter first number:");
//Reading the value
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        x = inputValue.nextFloat();

        System.out.println("Enter second number:");
        y = inputValue.nextFloat();
        if (x >=y) {
            System.out.println(y+" , "+x);
        } else {
            System.out.println(x+" , "+y);
        }
    }
}