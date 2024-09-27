import java.io.*;
public class repetitions {
    
    public static long calc(String s){
        long max=0; int i=0,j=0;
        if(s.length()==1) return 1;
        while(j<s.length()){
            if(s.charAt(i)!=s.charAt(j)){
                max=Math.max(max,j-i);
                i=j;
            }
            j+=1;
            max=Math.max(max,j-i);
        }
        if(max==0) return s.length();
        return max;
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        long res=calc(s);
        System.out.println(res);
    }
}
