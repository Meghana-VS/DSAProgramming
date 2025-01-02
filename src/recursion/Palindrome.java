package recursion;

public class Palindrome {
    public static void main(String[] args) {
        String name = "A man, a plan, a canal: Panama";
        System.out.println(func(0,name));
    }
    public static boolean func(int index, String name){
        name = name.toLowerCase().replaceAll("[^a-z0-9]","");
        int n = name.length();

        if (index >= n/2) return true;

        if(name.charAt(index) != name.charAt(n-index-1)){
            return false;
        }
        return func(index+1,name);
    }
}
