package ru.vsu.amm.java;
import java.util.Scanner;
import java.util.InputMismatchException;

/** программа реализует приложение, которое
 * создаёт, печатает и удаляет элементы в списке на стандартном потоке вывода
 * основной класс Main с методом <b>main</b>
 * @author Юлиана Телкова
 * @version 2021.2.1
 */
public class Main {
    /**
     * функция main
     * @param args - аргументы
     * */
    public static void main(String[] args)
    {
        List list = new List();

        int command = 1;
        do{
            //создает новый сканер, который создает значения, отсканированные из указанного входного потока
            Scanner in = new Scanner(System.in);//считывает данные из указанного источника
            System.out.println(
                    "1. Добавление элемента\n" +
                    "2. Добавление элемента по ключу\n" +
                    "3. Удаление элемента из головы\n" +
                    "4. Удаление элемента из тела\n" +
                            "5. Выход");
            command = in.nextInt();//считывает и возвращает введённое число
            int x;
            int y;
            switch (command) {
                case 1:
                    System.out.print("Введите элемент: ");
                    try //определяет блок кода, в котором может произойти исключение
                    {
                        x = in.nextInt();
                        list.Insert(x);
                        System.out.print(list.toString());
                    }
                    //если неправильный тип ввода или ввод вне диапазона
                    catch (InputMismatchException expected)//определяет блок кода, в котором происходит обработка исключения
                    {
                        System.out.println("Ошибка: неправильный ввод");
                    }
                    break;

                case 2:
                    try {
                        System.out.print("Введите элемент: ");
                        x = in.nextInt();
                        System.out.print("Введите идекс: ");
                        y = in.nextInt();
                        list.InsertByKey(x, y);
                        System.out.print(list.toString());
                    } catch (Exception expected) {
                        System.out.println("Ошибка: неверный ввод индекса");
                    }
                    break;

                case 3:
                    try {
                        list.DeleteHead();
                        System.out.print(list.toString());
                    } catch (Exception expected) {
                        System.out.println("Ошибка: списка не существует");
                    }
                    break;

                case 4:
                    try {
                        System.out.print("Введите элемент: ");
                        x = in.nextInt();
                        list.DeleteData(x);
                        System.out.print(list.toString());
                    }catch (Exception expected) {
                        System.out.println("Ошибка: неверный ввод элемента");
                    }
                    break;
            }
        } while (command != 5);
    }
}
