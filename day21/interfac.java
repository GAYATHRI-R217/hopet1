package day21;
@FunctionalInterface
interface Math{
    int add(int a,int b);
}
@FunctionalInterface
{
    void sayHello();
}
public class interfac {
    public static void main(String[] args){
        Math obj=(a,b)->a+b;
        /*Math addfunc=new Math(){
            public int add(int a,int b){
                return a+b;
            }
        };
        System.out.println(addfunc.add(11,22));*/
        System.out.println(obj.add(22,44));
    }
}
