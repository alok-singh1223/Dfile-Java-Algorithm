class Numbers {
    public Integer getValue(){
        return 23;
    }
}
 class TestNumbers{
    public static void main(String[] args) {
        Numbers[][] number=new Numbers[2][2];
        System.out.println(number[1][0].getValue());
    }
}
