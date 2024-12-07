import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\tМОЙ КАЛЬКУЛЯТОР А.В.Денисов");
        int z = 0;                                                              //создаем и обнуляем переменную для результата расчета
        char b = 'n';                                                           //создаем и и присваиваем значение "n" к переменной, которую используем если расчет калькулятора повторный
        System.out.println("Введите 1 число для расчетов");                 //блок считывания первого числа
        Scanner scanner1 = new Scanner(System.in);
        int x = scanner1.nextInt();
        System.out.println(x);
        do {                                                                    //do-while для повторного цикла
            if (b == 'y') {                                                 //при повторном цикле первой переменной присваивается значение результата последнего расчета
                x = z;
                z = 0;
                System.out.println("в условии: " + x + " ; " + z);
            }
            System.out.println("Принято! 1 число = " + x);
            System.out.println("Введите одну из операций расчета '+ - * /'");      //блок считывания операции расчета
            Scanner scanner2 = new Scanner(System.in);
            char a = scanner2.next().charAt(0);
            System.out.println("Принято! операция расчета: " + a);
            System.out.println("Введите 2 число для расчетов");                 //блок считывания второго числа
            Scanner scanner3 = new Scanner(System.in);
            int y = scanner3.nextInt();
            System.out.println("Принято! 2 число = " + y);
            z = calc(x, y, z, a);
        System.out.println("Продолжить расчет c результатом операции? Выберите 'y/n'"); //выбор повтора расчета или окончание работы
        Scanner scanner4 = new Scanner(System.in);
        b = scanner4.next().charAt(0);
        } while(b =='y');
    }
    public static int calc (int x, int y, int z, char a){
        switch (a){                                                     //оператор проверки вида операции и соответствующий расчет результата
            case '+':
                z =x+y;
                System.out.println("Результат расчета: "+ x + " + " + y + " = " + z);
                break;
            case '-':
                z =x-y;
                System.out.println("Результат расчета: "+ x + " - " + y + " = " + z);
                break;
            case '*':
                z =x*y;
                System.out.println("Результат расчета: "+ x + " * " + y + " = " + z);
                break;
            case '/':
                z =x/y;
                System.out.println("Результат расчета: "+ x + " / " + y + " = " + z);
                break;
            default:
                System.out.println("Ошибка операции");
        }
        return z;
    }
}