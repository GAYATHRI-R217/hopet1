package day21;
//Functional Programming
//Evolution 
//Java1.WORA(Write once read anywhere)->Basic feature
//Java 5:For eachloop,generic
//Java 7:Exceptional handling
//Java 8:Lambda,Functional interface,Stream API
/*public class LambdaExample {
    public static int add(int a, int b){
        return a+b;
    }
    public static void main(String[] args){
        System.out.println(add(22,33));
    }
    
}*/
@FunctionalInterface
interface Math{
  int add(int a,int b);
}
@FunctionalInterface
interface Exercise{
  void sayhello();
}
public class LambdaExample {
  public static int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
      /*Math m=new Math() {
        @Override
        public int add(int a, int b) {
            return a+b;
        }
      };*/
      Math m=(a,b)->a+b;
      Exercise e=()->System.out.println("Hello");
      e.sayhello();
      System.out.println(m.add(10,20));
    }
}
