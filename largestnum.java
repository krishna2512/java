import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        double n1, n2, n3;
        Scanner sc=new Scanner(System.in);
        n1=sc.nextDouble();
        n2=sc.nextDouble();
        n3=sc.nextDouble();

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " ");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 +" " );

        else
            System.out.println(n3 + " ");
    

    }
} 