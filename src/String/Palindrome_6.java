package String;

public class Palindrome_6 {
    public static void main(String[] args) {
        
        System.out.println(new Palindrome_6().isPalNum(121));
        System.out.println(new Palindrome_6().isPalStr("ababa"));
    }

    boolean isPalNum(int n){
        int temp = n;
        int rev = 0;

        while(n!=0){
            rev = rev*10 + n%10;
            n = n/10;
        }

        if(rev==temp){
            return true;
        }
        return false;
    }

    boolean isPalStr(String s){

        String rev = "";
        for(int i=0; i<s.length(); i++){
            rev = rev + s.charAt(i);
        }
        
        for(int i=0; i<s.length(); i++){
            if(rev.charAt(i) == s.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
