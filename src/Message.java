class Message {
    String text="Hello World !";
}
class mySuperClass{
    Message msg=new Message();
}
class myClass1 extends mySuperClass{
    public static void main(String[] args) {
        myClass1 obj=new myClass1();
        obj.print();
    }
public void print(){
    System.out.println(msg.text);
}

}
