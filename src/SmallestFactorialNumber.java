public class SmallestFactorialNumber {
    public static boolean check(int p,int n){
        int count=0, temp=p,f=5;
        while(f<=temp){
            count=temp/f;
            f*=5;
        }
        return (count>=n);
    }
    public static  int findNum(int n){
        if(n==1){
            return 5;
        }
        int low=0;
        int high=n*5;
        while(low<high){
            int mid=(low+(high-low))/2;
            if(check(mid,n)){
                high=mid;
            }
            else{
                low=mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        System.out.println(findNum(6));
    }
}
