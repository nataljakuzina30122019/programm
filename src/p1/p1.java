package p1;

public class p1 {

    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            System.out.println(i + ": я выполняюсь перед continue!");
            if (i > 2) 
                continue;
            

            System.out.println("      " + i + ":я выполняюсь всего 2 раза");
        }

    }
}
