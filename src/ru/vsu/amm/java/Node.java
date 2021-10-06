package ru.vsu.amm.java;

/** класс Node с конструктором
 * @author Юлиана Телкова
 * @version 2021.2.1
 */
public class Node {
    /** поле начального размера массива*/
    public int data;
    /** следующий элемент*/
    public Node next;

    /** конструктор с пармеметрами - создание нового объекта
     * @param data - значение
     * @param next - следующий элемент
     */
    Node(int data,Node next) {
        this.data = data;
        this.next = next;
    }
}