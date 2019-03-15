package massivy;

public class stroki11 {

    public static void main(String[] args) {
        char[] chars = {'Г', 'p', 'y', 'п', 'п', 'a', ' ', 'S', 'K', 'T', 'V', 'р', '1', '8'};
        String sl = "Строки";
        System.out.println("Строка sl до coryValueOf:     " + sl);
        sl = sl.copyValueOf(chars);
        System.out.println("Строка sl после copyValueOf:   " + sl);
        
        
         
        
       char[] chars1 = {'Г', 'p', 'y', 'п', 'п', 'a', ' ', 'S', 'K', 'T', 'V', 'р', '1', '8'};
       String str1 = "Строки";
        String str2 = str1.copyValueOf(chars1);
        String str3 = str1.copyValueOf(chars1, 7, 7);
        System.out.println("Строка без смещением:  " +str2);
        System.out.println("Строка со смещением в 2 и длиной 7:  " +str3);
        
        
       
        

    }

}
