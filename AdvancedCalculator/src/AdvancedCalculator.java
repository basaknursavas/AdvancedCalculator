import java.util.Scanner;

public class AdvancedCalculator {

    static int sum (int a, int b){
        int result = a + b ;
        System.out.println("The result is : " + result);
        return result ;
    }

    static int minus(int a, int b){
        int result = a - b ;
        System.out.println("The result is : " + result);
        return result ;
    }

    static int times (int a, int b){
        int result = a * b ;
        System.out.println("The result is : " + result);
        return result ;
    }

    static int divided (int a, int b){
        if (b == 0){
            return 0 ;
        }
        int result = a / b ;
        System.out.println("The result is : " + result);
        return result ;
    }

    static int power (int a, int b){
        int result = 1 ;
        for (int i = 1 ; i <= b ; i++){
            result *= a ;
        }
        System.out.println("The result is : " + result);
        return result ;
    }


    static int mode (int a, int b){
        int result = a % b ;
        System.out.println("The result is : " + result);
        return result ;
    }
    static void areaPerimeter(int a, int b){
        System.out.println("The area is : " + (a * b)) ;
        System.out.println("The perimeter is : " + 2 * (a + b));
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int select;
        String menu = "1- Plus \n"
                     + "2- Minus \n"
                     + "3- Times \n"
                     + "4- Divided \n"
                     + "5- Exponential Calculation \n"
                     + "6- Mode Calculation \n"
                     + "7- Rectangular Area and Perimeter \n"
                     + "0- Exit" ;

        while(true){
            System.out.println(menu);
            System.out.print("Choose an operation : ");
            select = input.nextInt();

            if (select == 0 ){
                break;
            }

            System.out.print("Enter the first number : ");
            int a = input.nextInt();
            System.out.print("Enter the second number : ");
            int b = input.nextInt();

            switch (select){
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4 :
                   if (divided(a,b) == 0){
                       System.out.println("The second number must be different from zero !");
                    }
                    break;
                case 5 :
                    power(a,b);
                    break;
                case 6 :
                    mode(a,b);
                    break;
                case 7 :
                    areaPerimeter(a,b);
                    break;
                default:
                    System.out.println("You have entered an invalid operation !");

            }



        }

        System.out.println("See you soon !");


        
    }
}
