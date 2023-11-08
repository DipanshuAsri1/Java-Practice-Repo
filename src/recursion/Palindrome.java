package recursion;

public class Palindrome {
    public static void main(String[] args) {
        String str="mam";

        if(palinCheck(str,0,str.length()-1,0)==1){
            System.out.println("Not palin");
        }else{
            System.out.println("Yes it is palin");
        }
    }

    public static int  palinCheck(String str ,int i , int j , int f) {
        if(i==j || (f==1))
            return f;
        else{
            if(str.charAt(i)!=str.charAt(j)) {
                f = 1;
            }
            return palinCheck(str,++i,--j,f);
        }
    }
}
