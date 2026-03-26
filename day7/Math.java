package day7;
class Calculator{
    int add(int num1,int num2){
        return num1+num2;
    }
    //int addThreeNumber(int a,int b, int c)
    int add(int a,int b,int c){
        return a+b+c;
    }
    //double addDecimalNumber(double a,double b)
    double add(double a,double b){
        return a+b;
    }
}
public class Math {
    public static void main(String [] args){
        Calculator c=new Calculator();
        //System.out.println(c.add(1,2));
        //System.out.println(c.addThreeNumber(11, 12, 13));
        //System.out.println(c.addDecimalNumber(0.012342, 2.43545));
        System.out.println(c.add(11,12,13));
        System.out.println(c.add(13,14));
        System.out.println(c.add(11.000,12.0192));
        System.out.println(c.add(12,12.04));//decimal and integer is added because of implicit type conversion
        System.out.println(c.add(12,13));
    }
}
