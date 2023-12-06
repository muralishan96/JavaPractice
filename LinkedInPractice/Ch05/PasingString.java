package LinkedInPractice.Ch05;

public class PasingString {
    public static void main(String[] args) {
        String str1 = " my name is Suganya";
        System.out.println("Print the length on string "+str1.length());

        int position = str1.indexOf("Suganya");
        System.out.println("Position ofthe string "+position);

        String sub = str1.substring(11);
        System.out.println("sub string "+sub);

        String s1="Welcome!          ";
        System.out.println(s1.length());
        String s2 = s1.trim();
        System.out.println(s2);
        System.out.println(s2.length());
    }

}
