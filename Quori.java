import java.util.Scanner;
public class Quori {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the canditate : ");
        String name = sc.nextLine();
        System.out.print("Enter the roll number : ");
        int rollno = sc.nextInt();
        System.out.print("Enter the class : ");
        String clasz = sc.next();
        System.out.print("Enter the semister of the canditate : ");
        int semister = sc.nextInt();
        System.out.print("Name : " +name+ "\t Rollno : " +rollno+ "\t Class : " +clasz+ "\t Semister : " +semister );   
    
    }
}
