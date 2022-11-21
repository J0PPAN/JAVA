import java.util.Scanner;
public class SWAP
{
    static void swap(float x , float y ) {
        float temp;
        temp = x;
        x = y;
        y = temp;
        System.out.print(x+" and "+y);
    }
    
    public static void main(String[] args) {
        float a , b , temp ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        a = sc.nextFloat();
        System.out.print("Enter the second number : ");
        b = sc.nextFloat();
        swap(a,b);
    }

}
