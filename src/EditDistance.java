public class EditDistance {
    public static int editDistance(String s, String t) {
        int c=0;
        StringBuffer sb=new StringBuffer();
        sb.append(s);
        while(!sb.toString().equals(t)){

            if(sb.length()<t.length()){
                int i=1;
                while(i<=t.length()){
                    String st=sb.substring(0,i);
                    if(!st.equals(t.substring(0,i))) {
                        sb.insert(i - 1, t.charAt(i - 1));
                        c++;
                    }
                    else
                        i++;
                }
            }

            else if(sb.length()>t.length()){
                int i=1;
                while(i<=sb.length()){
                    String st=sb.substring(0,i);
                    if(!st.equals(t.substring(0,i))) {
                        sb.deleteCharAt(i - 1);
                        c++;
                    }
                    else
                        i++;
                }
            }

            else{
                if(sb.length()==t.length()){
                    int i=1;
                    while(i<=sb.length()){
                        String st=sb.substring(0,i);
                        if(!st.equals(t.substring(0,i))) {
                            sb.deleteCharAt(i - 1);
                            sb.insert(i - 1, t.charAt(i - 1));
                            c++;
                        }
                        else
                            i++;
                    }
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(editDistance("alok","asohkl"));
    }
}
