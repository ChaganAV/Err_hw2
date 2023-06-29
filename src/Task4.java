import java.io.IOException;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) throws Exception{
        run();
    }

    /**
     * @apiNote программа выбросит Exception при вводе пустой строки
     */
    public static void run() throws Exception{
//        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите строку");
            String text = scanner.nextLine();
            if (text.trim().isEmpty()) {
                throw new Exception("Пустые строки вводить нельзя!!!");
            } else {
                System.out.println("Вы ввели: " + text);
            }
//        }catch (Exception e){
//            System.out.println("Нельзя вводить пустую строку!");
//        }
    }
}
