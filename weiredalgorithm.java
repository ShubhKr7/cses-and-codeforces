
import java.util.ArrayList;
import java.util.Scanner;
public class weiredalgorithm {
    public static void solution(long n){
        ArrayList<Long> ls=new ArrayList<>();
        ls.add(n);
        while(n!=1){
            if(n%2==0){
                n/=2;
                ls.add(n);
            }
            else{
                n*=3;
                n+=1;
                ls.add(n);
            }
        }
        for(int i=0;i<ls.size();i++){
            System.out.print(ls.get(i)+" ");
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long n=s.nextLong();
        solution(n);
        s.close();
    }
}