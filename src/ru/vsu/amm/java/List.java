package ru.vsu.amm.java;
import java.lang.StringBuilder;
import java.util.EmptyStackException;

/**
 * ����� List � �������� <b>insert</b>, <b>print</b>, <b>delete</b>; �������� <b>isEmpty</b>
 * @author ������ �������
 * @version 2021.2.1
 */
public class List {
    /**
     * ��������� ������
     */
    private Node head;
    /**
     * ����� ������
     */
    private int length;

    /**
     * �����������
     */
    public List() {
        head = null;
        length = 0;
    }

    /**
     * �������� �� ������ ������
     *
     * @return head;
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * ����� ��� ������� ������ ����
     * ������� ����� ���� � ��������� �������
     * ��������� ������ �� �������: ���� ����� - ����� ���� ������ �������, ����� - ��������� ����� ����
     *
     * @param data - ��������
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
     * ����� ��� ������� ������ ���� �� �����
     * ������� ����� ���� � ��������� �������
     * ��������� ������ �� �������: ���� ����� - ����� ���� ������ �������;
     * ����� - ���� ���� = 0, ����� ���� ������ �������;
     * ����� ���� ���� ������ ���� - @return  ; ����� ������� ������ ����� ������� ��������� ��� �������
     *
     * @param data - ��������
     * @param key  - ����
     */
    public void InsertByKey(int data, int key) {
        if (isEmpty()) {
            if (key == 0) this.Insert(data);
            //������ ��������,����� �� �������� �������� �� ������� �������, ������� �������� ��������� ������ �������
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
     * ����� ��� ������ �����
     * ���������� �������� �����
     * ������ ������ �� ������� ���� -> ������� � ����������
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
     * ����� ��� ������ �����
     */
    public String toString(){
        //StringBuilders ������������, ����� � ��� ���������� ���������� ��������
        StringBuilder list = new StringBuilder("������: ");
        Node x = head;
        while(x!=null){
            //� ������� append() �� ����� ��������� ������ ����� ����� - �� ������ �����
            list.append(x.data + " ");//����� append() ��������� �������� �������
            x = x.next;
        }
        list.append("\n");
        return new String(list);
    }

    /**
     * ����� ��� �������� ��������� ����
     * ���� ���� ������ - ������
     * ����� - �������� �� �������
     */
    public void DeleteHead() {
        if (isEmpty()) {
            throw new IllegalArgumentException();//�������� �������� ������ �������� ������������� ����
        } else {
            if (head.next == null) {
                this.head = null;
            } else {
                this.head = head.next;
            }
        }
    }
    /**
     * ����� ��� �������� ���� � �����, ����� ������
     *
     * @param data - ��������
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
