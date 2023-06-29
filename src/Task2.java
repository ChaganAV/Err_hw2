public class Task2 {
    public static void main(String[] args) {
        // Задача 2
        // не было объявлен массив
        // добавил проверку делителя на 0
        task2();
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
