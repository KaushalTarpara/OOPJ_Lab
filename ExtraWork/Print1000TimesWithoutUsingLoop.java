public class Print1000TimesWithoutUsingLoop {
    public static void main(String[] args){
        String name="Kaushal";
        String str="X";
       
        str=str.replaceAll("X","XXXXXXXXXX");
        str=str.replaceAll("X","XXXXXXXXXX");
        str=str.replaceAll("X","XXXXXXXXXX");
        str=str.replaceAll("X", name+"\n");

        System.out.println(str);

    }
}
