import java.util.Scanner;

public class Square {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter length");
        int lengthOne = Integer.parseInt(scanner.next());
        System.out.println("Please enter length");
        int lengthTwo = Integer.parseInt(scanner.next());
        System.out.println("Please enter width");
        int widthOne = Integer.parseInt(scanner.next());
        System.out.println("Please enter width");
        int widthTwo = Integer.parseInt(scanner.next());
        if(lengthOne == lengthTwo && lengthTwo == widthOne && widthOne == widthTwo ){
            System.out.println("The figure is a square");
            int pSquare = lengthOne + lengthTwo + widthOne + widthTwo;
            System.out.println("The circumference of the square is" + "\t" + pSquare );
            int sSquare = lengthOne * widthOne;
            System.out.println("Тhe face of the square is\t" + pSquare);
        }else if(lengthOne == lengthTwo && widthOne == widthTwo){
            System.out.println("The figure is a rectangle");
            int pRectangle = lengthOne + lengthTwo + widthOne + widthTwo;
            int sRectangle = lengthOne * widthOne;
            System.out.println("Тhe face of the square is\t" + sRectangle);
            System.out.println("The circumference of the rectangle is" + "\t" + pRectangle);
        }else{
            System.out.println("The figure is not a square ot rectangle ");
        }
    }
}
