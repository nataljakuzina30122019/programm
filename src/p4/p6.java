
package p4;

public class p6 {
    public static void main(String[] args) {
        String sentense = "Я помню чудное мгновенье!";
        System.out.println(sentense.length());
        System.out.println();
        
          String sentence1 = "Я помню чудное мгновенье!";
          sentence1 = sentence1.concat("Передо мной явилась ты");
          System.out.println(sentence1);
        
          String result = sentence1.toUpperCase();
          System.out.println(" " + result);
          String result1 = sentence1.toLowerCase();
         System.out.println(  "   " + result1);
         String s1="  Я помню чудное мгновенье!  ";
         String s2="      Передо мной явилась ты      ";
         System.out.println(s1);
         System.out.println(s2.trim());
         System.out.println(sentense.substring(5));
         System.out.println(sentense.substring(2,  10));
         
         
          
          
          
        
       
        
    }
    
}
