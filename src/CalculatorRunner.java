import java.util.Scanner;
public class CalculatorRunner {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
    System.out.println("Enter an expression with *, /, +. -, %, or ^: ");
    String expression = scan.nextLine();
    if(expression.indexOf("*")>0){
        int index = expression.indexOf("*");
        if(expression.substring(index-1,index)!=" " && expression.substring(index+1,index+2)!=" "){
            double num1 = Double.parseDouble(expression.substring(0,index-1));
            double num2 = Double.parseDouble(expression.substring(index+1));
        }
    }
    }
}
