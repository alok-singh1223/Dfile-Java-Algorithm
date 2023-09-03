import java.util.ArrayList;

public class RotateBits {
 public static ArrayList<Integer> rotate(int N,int D){
     ArrayList<Integer> al=new ArrayList<Integer>();
    if(D>16){
        D%=16;
    }
    int bit=16-D;
    int x=N<<D |N>>bit;
    int y=N>>D | N>>bit;
    al.add(x & 65535);
    al.add(y & 65535);
    return al;
    }

    public static void main(String[] args) {
        System.out.println(rotate(29,2));
    }
}
