package ru.vsu.amm.java;
import java.lang.StringBuilder;
import java.util.EmptyStackException;

/**
 * класс List с методами <b>insert</b>, <b>print</b>, <b>delete</b>; функцией <b>isEmpty</b>
 * @author Юлиана Телкова
 * @version 2021.2.1
 */
public class List {
    /**
     * заголовок списка
     */
    private Node head;
    /**
     * длина списка
     */
    private int length;

    /**
     * конструктор
     */
    public List() {
        head = null;
        length = 0;
    }

    /**
     * проверка на пустой список
     *
     * @return head;
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * метод для вставки нового узла
     * создаем новый узел с заданными данными
     * проверяем список на пустоту: если пусто - новый узел делаем головой, иначе - вставляем новый узел
     *
     * @param data - значение
     */
    public void Insert(int data) {
        if (isEmpty()) {
            Node x = new Node(data, null);
            this.head = x;
            this.length = 1;
        } else {
            Node x = new Node(data, this.head);
            this.head = x;
            this.length++;
        }
    }

    /**
     * метод для вставки нового узла по ключу
     * создаем новый узел с заданными данными
     * проверяем список на пустоту: если пусто - новый узел делаем головой;
     * иначе - если ключ = 0, новый узел делаем головой;
     * иначе если ключ меньше нуля - @return  ; иначе находим индекс перед которым вставляем наш элемент
     *
     * @param data - значение
     * @param key  - ключ
     */
    public void InsertByKey(int data, int key) {
        if (isEmpty()) {
            if (key == 0) this.Insert(data);
            //ошибка выпадает,когда мы пытаемся получить из массива элемент, позиция которого превышает размер массива
            else throw new IndexOutOfBoundsException();
        } else {
            if (key >= 0 && key <= length - 1) {
                if (key == 0) Insert(data);
                else {
                    Node j = head;
                    for (int i = 1; i < key && j != null; i++, j = j.next) {
                    }
                    Node x = new Node(data, j.next);
                    j.next = x;
                    this.length++;
                }
            } else throw new IndexOutOfBoundsException();
        }
    }

    /**
     * метод для печати листа
     * перебираем значения узлов
     * печать данных на текущем узле -> переход к следующему
     */
    public void Print() {
        Node x = head;
        System.out.print("List: ");
        while (x != null) {
            System.out.print(x.data + " ");
            x = x.next;
        }
        System.out.println();
    }

    /**
     * метод для печати листа
     */
    public String toString(){
        //StringBuilders используется, когда у нас неизвестно количество операций
        StringBuilder list = new StringBuilder("Список: ");
        Node x = head;
        while(x!=null){
            //с помощью append() мы можем добавлять данные любых типов - не только строк
            list.append(x.data + " ");//метод append() обновляет значение объекта
            x = x.next;
        }
        list.append("\n");
        return new String(list);
    }

    /**
     * метод для удаления головного узла
     * если лист пустой - ошибка
     * иначе - проверка на пустоту
     */
    public void DeleteHead() {
        if (isEmpty()) {
            throw new IllegalArgumentException();//пытается передать методу аргумент неправильного типа
        } else {
            if (head.next == null) {
                this.head = null;
            } else {
                this.head = head.next;
            }
        }
    }
    /**
     * метод для удаления узла в месте, кроме головы
     *
     * @param data - значение
     */
    public void DeleteData(int data){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        Node x=head;
        if (x.data==data) {
            DeleteHead();
        }
        else {
            try {
                while (x.next.data != data) x = x.next;
                if (x.next.next != null) {
                    x.next = x.next.next;
                } else x.next = null;
            } catch (Exception expected)
            {
                throw new IllegalArgumentException();
            }
        }
    }

}
