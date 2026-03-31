package chapter3;

public class StringLesson {
    static String ProperCase(String word){
        return word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase();
    }
    public static void main(String[] args){
        String name = "fluffy";
        String a = "1";
        a = "0";
        a+="2";
        a+="3";
        String b = "1";
        String name2 = "Fluffy";
        name = null;
        name2 = null;
        String name3 = new String("fluffy");
        System.out.println(a);String word1 = "Stand alone";
        System.out.println(word1.toUpperCase());
        word1= word1.toUpperCase();
        System.out.println(word1.toLowerCase());
        System.out.println(word1);
        String trimSample = "       \t \n \t Marc Yim          \t \n";
        System.out.println(trimSample.trim());
        
        System.out.println(ProperCase("TOWER"));
        
        StringBuilder sb = new StringBuilder("marco");
        StringBuilder sb2 = sb.append("Yim");
        System.out.println(sb2.append("the"));
        System.out.println(sb);
       }
}