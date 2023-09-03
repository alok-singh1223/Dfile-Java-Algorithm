import java.util.Arrays;

public class SmallestWindow {
    public static void smallestWindow(String S, String p) {
char[] ch=S.toCharArray();
int i=0,start=0,end=p.length();
String st="";
while(start<end){
st+=ch[start];
start++;
}
if(st.contains(p)){
  //  return st;
}
        i=start;
while(i<S.length()){

}
    }


    public static void main(String[] args) {
char[] a="alok".toCharArray();
        System.out.println(Arrays.toString(a));
    }
}