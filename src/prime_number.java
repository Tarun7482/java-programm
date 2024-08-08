import java.util.Scanner;

public class prime_number {
          public static void main(String[] args){
              int n,i,count=0,m;
              System.out.println("enter the number between we have to find the prime number");
              Scanner sc=new Scanner(System.in);
                 m=sc.nextInt();
                  n=sc.nextInt();
               while(n!=m) {
                   for (i = 2; i < n; i++) {
                       if (n % i == 0 ) {
                           break;}
                       if (i == n - 1) {
                         count++;
                           System.out.print(n + "\n");

                       }

                   }
                n--;

               }
              System.out.println("total no.. of the prime number upto to given number"+count);
          }
}
