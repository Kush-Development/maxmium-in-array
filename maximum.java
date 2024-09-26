import java.util.Scanner;

/**
 * maximum
 */
public class maximum {

    public static void main(String[] args) {
        System.out.println("enter the size of ArrAy");

        Scanner scan = new Scanner(System.in);

        int b = scan.nextInt();

        int  [] a  = new int[b];

        for(int i =0; i < a.length ; i++){
            a [i] = scan.nextInt();
        }






        for(int i =0; i < a.length ; i++){
            System.out.print(a[i] +" ");
        }



         


    }
}