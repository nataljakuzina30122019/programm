
package massivy;

public class massiv1 {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMV", "Ford", "Mazda"};
        
       /* System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
        System.out.println(cars[3]);*/
        
        System.out.println();
        cars[2] = "Jaguar";
        System.out.println(cars[2]);
        
        System.out.println("Длина массива:"+cars.length);
        
        for (int i = 0; i < cars.length; i++) {
            
            System.out.println(cars[i]);
        }
    }
    
}
