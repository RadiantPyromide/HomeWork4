import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
                int n;
            n=scanner.nextInt();
        int[] f=new int[n];
        f[0]=0;
        f[1]=1;
        f[2]=1;
        f[3]=2;
        f[4]=3;
        f[5]=5;
        f[6]=8;
        f[7]=13;
        for (int i=2;i<n;++i){
            f[i]=f[i-1]+f[i-2];
            System.out.println(f[i]);
        }


    }}
