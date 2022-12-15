import java.util.Scanner;

public class Q7 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter plain text : ");
    String s = sc.nextLine();
    System.out.print("Enter shift : ");
    int n = sc.nextInt();
    String data = "abcdefghijklmnopqrstuvwxyz";
    String ans = "";
    for(int i=0;i<s.length();i++){
        int idx = data.indexOf(s.charAt(i));
        ans+=data.charAt((idx+n)%26);
    }
    System.out.println("Encrypted text is :"+ans);
    }
}
