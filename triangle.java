/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package floyds;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class triangle {
    public static void main(String args[])
    {
        int n,i,j,k=1;
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(" "+k++);
            }
            System.out.println();
        }
    }
    
}
