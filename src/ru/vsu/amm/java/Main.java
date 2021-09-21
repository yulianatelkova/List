package ru.vsu.amm.java;

/**основной класс Main с методом <b>main</b>
 * @autor Юлиана Телкова
 * @version 2021.2.1
 */
public class Main {
    public static void main(String[] args)
    {
        List list = new List();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.insert(8);

        list.print();

        //удаляем в голове
        list.delete(1);
        list.print();
        //удаляем в середине
        list.delete(4);
        list.print();
        //удаляем несуществующий
        list.delete(10);
        list.print();
    }
}
