package ru.vsu.amm.java;

/** ����� Node � �������������
 * @author ������ �������
 * @version 2021.2.1
 */
public class Node {
    /** ���� ���������� ������� �������*/
    public int data;
    /** ��������� �������*/
    public Node next;

    /** ����������� � ������������ - �������� ������ �������
     * @param data - ��������
     * @param next - ��������� �������
     */
    Node(int data,Node next) {
        this.data = data;
        this.next = next;
    }
}