import java.util.Scanner;
public class SWAP
{
    static void swap(int x , int y ) {
        int temp;
        temp = x;
        x = y;
        y = temp;
        System.out.print(x+" and "+y);
    }
    
    public static void main(String[] args) {
        int a , b , temp ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        a = sc.nextInt();
        System.out.print("Enter the second number : ");
        b = sc.nextInt();
        swap(a,b);
    }

}
