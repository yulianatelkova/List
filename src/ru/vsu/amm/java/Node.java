package ru.vsu.amm.java;

/** класс Node с конструктором
 * @autor Юлиана Телкова
 * @version 2021.2.1
 */
public class Node {
    public int data;
    public Node next;

    /** конструктор с пармеметрами - создание нового объекта
     * @param data - значение, next - следующий элемент
     */
    Node(int data,Node next) {
        this.data = data;
        this.next = next;
    }
}