public class Parent {
    public int doStuff(int x){
        return x*2;
    }
}
class child extends Parent{
    public static void main(String[] args) {
        child cc=new child();
        long x=cc.doStuff(7);
        System.out.println("x = "+x);
    }



   //
}