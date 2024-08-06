
import java.util.Scanner;

public class fizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double inputValue = Double.parseDouble(input.next());
        if(inputValue % 3 == 0 && inputValue % 5 == 0){
            System.out.println("Fizz Buzz");
        }else if (inputValue % 3 == 0){
            System.out.println("Fizz");
        }else if (inputValue % 5 == 0){
            System.out.println("Buzz");
        }else{
            System.out.println(inputValue);
        }
    }
    
}