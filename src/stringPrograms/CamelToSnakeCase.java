package stringPrograms;

/**
 * //camel case = WardVsVitalSigh
 * //snake case = ward_vs_vital_sigh
 */
public class CamelToSnakeCase {
    public static void main(String[] args) {

        String str="WardVsVitalSigh";
        // Empty String
        String result = "";
        //char s[] ={'W','a','r','d','V','s'};

        fun(str);
        // Append first character(in lower case)
        // to result string
        char c = str.charAt(0);
        result = result + Character.toLowerCase(c);

        // Traverse the string from
        // ist index to last index
        for (int i = 1; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Check if the character is upper case
            // then append '_' and such character
            // (in lower case) to result string
            if (Character.isUpperCase(ch)) {
                result = result + '_';
                result
                        = result
                        + Character.toLowerCase(ch);
            }

            // If the character is lower case then
            // add such character into result string
            else {
                result = result + ch;
            }
        }

        System.out.println(""+result);

    }


    //camel case = WardVsVitalSigh
    //snake case = ward_vs_vital_sigh
    static void fun(String str){
        //String str=s.toString();
        System.out.println(" str is "+str);
        String res="";
        char ch;
        ch=Character.toLowerCase(str.charAt(0));
        res=""+ch;
       // System.out.println( "result is : "+res);
        for(int i=1;i<str.length();i++){
            ch=str.charAt(i);
            if(Character.isUpperCase(ch)){
                res=res+"_";
                res=res+Character.toLowerCase(ch);
            }else{
                res=res+ch;
            }
        }
        System.out.println("Hello : "+ res);
    }
}
