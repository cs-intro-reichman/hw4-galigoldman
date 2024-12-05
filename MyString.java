public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        // Replace the following statement with your code
        int i;
        char ch;
        String lower = "";
        for(i=0; i < str.length(); i++){
            ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch + 32);
            }
            lower += ch;
        }
        return lower;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        // Replace the following statement with your code
        int i,j,add=0;
        String[] longer = str1.split("");
        String[] shorter = str2.split("");
        for(i=0; i < longer.length - shorter.length ; i++){
            add=0;
            for(j=0; j < shorter.length ; j++){
                if(!longer[i+add].equals(shorter[j])){
                    break;
                }
                add++;
            }
            if(j==shorter.length){
                return true;
            }
        }
        return false;
    }
}
