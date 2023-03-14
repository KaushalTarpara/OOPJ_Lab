class demo{
    int a=4;
    demo(){
    System.out.println(a);
    }
}
class CheckVarValue{
    public static void main(String[] args) {
        
        demo d= new demo();
        System.out.println(d.a);
    }
}