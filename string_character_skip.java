public class string_character_skip {
    public static void main(String[] args) {
        String str="abbbabc";
        skip("",str);
        System.out.println(skip1("aabbasg"));
        System.out.println(skip2("asappleaa"));
        System.out.println(skip3("asappleaaapp"));


    }
    public static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if (ch == 'a') {

            skip(p,up.substring(1));
        }else {

            skip(p+ch,up.substring(1));

        }
    }
    //using return
    public static String skip1(String up){
        if(up.isEmpty()){

            return " ";
        }
        char ch=up.charAt(0);
        if (ch == 'a') {

           return skip1(up.substring(1));
        }else {

            return ch+ skip1(up.substring(1));

        }
    }
    public static String skip2(String up){
        if(up.isEmpty()){

            return " ";
        }

        if (up.startsWith("apple")) {


            return skip2(up.substring(5));
        }else {

            return up.charAt(0) +skip2(up.substring(1));

        }
    }
    public static String skip3(String up){
        if(up.isEmpty()){

            return " ";
        }

        if (up.startsWith("app") && !up.startsWith("apple") ) {


            return skip3(up.substring(3));
        }else {

            return up.charAt(0) +skip3(up.substring(1));

        }
    }

}
