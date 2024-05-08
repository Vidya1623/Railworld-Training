//1.Find a peak element which is not smaller than its neighbours.
import java.util.*;
public class Arraysort{
    public static void main(String args[]){
        Scanner sc=new Scanner();
        int n=sc.nextInt();

        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for (int i = 1; i <a.length-1; i++) {
            if (a[i]>a[i-1] && a[i]>a[i+1]){
                System.out.println(a[i]);
                break;
            }
        }
}
}

//3.
[0,0,0,1,2,2,1]sort it like [2,2,0,0,0,1,1]