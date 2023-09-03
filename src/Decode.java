public class Decode {
    public static String decoding(String in1,String in2){
        String[] st=in2.split(":");
        StringBuffer sb=new StringBuffer();
        in1.toUpperCase();
        sb.append(in1);
        int a=in1.indexOf('_');
        sb.deleteCharAt(a);
        String output="";
        for(String x : st){
            if(in1.length()==x.length()){
                x.toUpperCase();
               StringBuffer sb1=new StringBuffer();
               sb1.append(x);
               sb1.deleteCharAt(a);
               if(sb.toString().equals(sb1.toString())){
                   output+=x+":";
               }
            }
        }
        String out=output.substring(0,output.length()-1);
        return out;
    }

    public static void main(String[] args) {
        System.out.println(decoding("Fi_er","Filter:Filer:Figer:Figuer:Fixer"));
    }
}
