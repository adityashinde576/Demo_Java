import java.util.*;
public class Sum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value A");
        String s1 =sc.nextLine();
        int A=Integer.parseInt(s1);
        System.out.println("Enter the value B");
        String s2 =sc.nextLine();
        int B=Integer.parseInt(s2);
        int sum = A + B;
        System.out.println("The sum is:"+sum);


    }
}