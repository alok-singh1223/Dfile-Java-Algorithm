class Base {
Base(){
    System.out.println("Base constructor is invoked..");
}
}
class Derived extends Base{
    Derived(){
        System.out.println("Derived constructor invoked..");
    }

    public static void main(String[] args) {
        Base b=new Derived();
    }
}
