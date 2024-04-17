import java.util.Scanner;

public class giorno2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("scrivi il numero di un anno");
        int anno = scanner.nextInt();
        System.out.println(annoBisestile(anno));



    }
    public static boolean stringaPariDispari(String str) {
        return str.length() % 2 == 0 ? true : false;
    }

    public static boolean annoBisestile(int anno) {
        if (anno % 400 == 0) {

            return true;


        } else if (anno % 4 == 0 && anno % 100 != 0) {

            return true;

        } else {

            return true;

        }

    }

}

