import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        float num = getFloat();
        System.out.println(num);
        // Задача 2
        task2();

    }

    /**
     * @apiNote (Задание 1) метод обрабатывает текст в дробное число
     * @return дробное число
     */
    public static float getFloat(){
        float result = 0;
        Scanner scanner = new Scanner(System.in);
        boolean isDigit;
        String str;
        int count = 0;
        int maxCount =4;
        do {
            System.out.println("Введите дробное число");
            str = scanner.next();
            isDigit = contentDigit(str);
            count++;
            if( count == maxCount){
                break;
            }
        }while (!isDigit);
        if(isDigit) {
            result = Float.parseFloat(str);
        }
        return result;
    }

    /**
     * @apiNote проверка на наличие не числовых символов
     * @param str
     * @return логическое значение
     */
    private static boolean contentDigit(String str){
        for (int i = 0; i < str.length(); i++) {
            if(!Character.isDigit(str.charAt(i))){
                if(str.charAt(i)!= '.')
                    return false;
            }
        }
        return true;
    }

    /**
     * @apiNote (Задание 2) Проверка на корректность кода
     */
    public static void task2(){
        //Задание 2
        int[] intArray = {1,4,6,8,4,8,8,3,34,6,67,45}; // не был объявлен массив
        try {
            int d = 0;
            if (d!=0) {
                double catchedRes1 = intArray[8] / d;
                System.out.println("catchedRes1 = " + catchedRes1);
            }else {
                System.out.println("Нельзя делить на 0");
            }
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}