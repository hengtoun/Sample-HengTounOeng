package assignment1;
import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args) {
        //for user to input #
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = input.nextInt();
        
        for(int i=1; i<=n; i++){
            for(int l=1; l<=4*(n-i); l++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.printf("%4d",j);
            }
                System.out.println();
            }
            
                    
        
    
    
}
