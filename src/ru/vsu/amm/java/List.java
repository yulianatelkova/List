package ru.vsu.amm.java;

       /** класс List с методами <b>insert</b>, <b>print</b>, <b>delete</b>; функцией <b>isEmpty</b>
        * @autor Юлиана Телкова
        * @version 2021.2.1
        */
       public class List {
    public Node head; // заголовок списка
    public List(){
        head=null;
    }
    public boolean isEmpty(){
        return head==null;
    }

        /**метод для вставки нового узла
         * создаем новый узел с заданными данными
         * проверяем список на пустоту: если пусто - новый узел делаем головой, иначе - вставляем новый узел
         * @param data - значение
         * @see insert#insert()
         */
    public void insert(int data) {
        if (isEmpty()){
            Node x = new Node(data,null);
            this.head = x;
        }
        else{
            Node x = new Node(data,this.head);
            this.head = x;
        }
    }

         /** метод для печати листа
          * перебираем значения узлов
          * печать данных на текущем узле -> переход к следующему
          * @see print#print()
          */
    public void print() {
        Node x = head;
        System.out.print("List: ");
        while (x != null) {
            System.out.print(x.data + " ");
            x = x.next;
        }
        System.out.println();
    }

        /** метод для удаления узла в листе с помощью ключа
         * 1. если головной узел и есть наш ключ
         * 2. если головной узел НЕ наш ключ
         * 3. если ключа нет
         * @param key - ключ
         */
    public void delete(int key) {
        Node x = this.head, prev = null; // сохраняем головной узел
        if(head == null) //списка нет
            return;
        /*1.*/
        if (x != null && x.data == key) {
            this.head = x.next; // измененная голова
            System.out.println(key + " found and deleted");
        }
        /*2.*/
        // если x не держит ключ, перейти к следующему узлу
        while (x != null && x.data != key) {
            prev = x;
            x = x.next;
        }
        // если ключ присутствовал, он должен быть в x
        if (x != null) {
            // поскольку ключ находится в x, удалить его из листа
            prev.next = x.next;
            System.out.println(key + " found and deleted");
        }
        // если ключа нет, то x - нулевой
        if (x == null) {
            System.out.println(key + " not found");
        }
    }
}
