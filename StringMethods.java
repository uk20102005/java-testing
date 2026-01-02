public class StringMethods {
    public static void main(String args[]){
        String s="CSE";

        s=s.concat("Alpha");

        System.out.println(s); 
        System.out.println(s.length());
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(s.length()-1));
    }
