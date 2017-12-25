import java.util.Scanner;

public class EX2017122503 {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int line[][]=new int[2][n];
        for (int i=0;i<n;i++){
            line[0][i]=scn.nextInt();
            line[1][i]=fun(line[0][i]);
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (line[1][i]>line[1][j]){
                    int tmp=line[1][i];
                    line[1][i]=line[1][j];
                    line[1][j]=tmp;
                    tmp=line[0][i];
                    line[0][i]=line[0][j];
                    line[0][j]=tmp;
                }
            }
        }
    }
    public static int fun(int x){
        int sum=0;
        while (x>0){
            sum=sum+x%10;
            x=x/10;
        }
        return sum;
    }
}
