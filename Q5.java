//5.	An Election is contested by 5 candidates. The candidate numbers are 1 to 5 and the voting is done by making the candidate number on the ballot paper. Write a program to read the ballots and count the vote for each candidate using and array variable count. In case, a number read is outside the range 1 to 5, the ballot should be considered as a ‘spoilt ballot ‘and the program should also count the number of spoiled ballots. 



import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        System.out.print("Enter number of votes :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x[]=new int[n];
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        int e=0;
        int f=0;
        for(int i=0;i<n;i++){
            System.out.print("Enter votes  "+(i+1)+" :");
            x[i]=sc.nextInt();
            if(x[i]==1)
            a++;
            else if(x[i]==2)
            b++;
            else if(x[i]==3)
            c++;
            else if(x[i]==4)
            d++;
            else if(x[i]==5)
            e++;
            else
            f++;
        }
        System.out.println("For candidate A, votes ="+a);
        System.out.println("For candidate B, votes ="+b);
        System.out.println("For candidate C, votes ="+c);
        System.out.println("For candidate D, votes ="+d);
        System.out.println("For candidate E, votes ="+e);
        System.out.println("Spoiled ballots ="+f);
    }
}
