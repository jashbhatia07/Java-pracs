import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Q4 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter element"+(i+1)+" : ");
            a[i]=sc.nextInt();
        }
        System.out.println("1. Search element ");
        System.out.println("2. Sort in  descending order");
        System.out.println("3. Remove duplicate elements");
        System.out.print("Enter your choice :");
        int c=sc.nextInt();
        switch(c) {
            case 1:
            System.out.print("Enter element to search :");
            int e = sc.nextInt();
            int idx=-1;
            for(int i=0;i<n;i++){
                if(a[i]==e) {
                    idx=i+1;
                    break;
                }
            }
            if(idx==-1)
            System.out.print("Element not found");
            else
            System.out.print("Element found at position "+idx);
            break;
            case 2:
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(a[i]<a[j]){
                        int temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }
                }
            }
            case 3:
            Set<Integer> s=new LinkedHashSet<Integer>();
            for(int i=0;i<n;i++)
            s.add(a[i]);
            System.out.println("Array after removing duplicates is : "+s);
            break;
        default:
            System.out.println("Enter valid choice");
            
        }
    }
}