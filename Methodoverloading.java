public class Methodoverloading {
    static int add(int a , int b){
        return a+b;
    }
    static int add(int a , int b, int c){
        return a+b+c;
    }
    static double add(double d1, double d2){
        return d1+d2;

    }
    public static void main(String[] args) {
        System.out.println(add(10, 5));
        System.out.println(add(10, 5, 5));
        System.out.println(add(5.66, 6.66));
    }
}