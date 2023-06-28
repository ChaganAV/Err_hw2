import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float num = getFloat();
        System.out.println(num);
    }
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
    private static boolean contentDigit(String str){
        for (int i = 0; i < str.length(); i++) {
            if(!Character.isDigit(str.charAt(i))){
                if(str.charAt(i)!= '.')
                    return false;
            }
        }
        return true;
    }
}