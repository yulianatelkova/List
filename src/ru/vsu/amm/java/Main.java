package ru.vsu.amm.java;
import java.util.Scanner;
import java.util.InputMismatchException;

/** ��������� ��������� ����������, �������
 * ������, �������� � ������� �������� � ������ �� ����������� ������ ������
 * �������� ����� Main � ������� <b>main</b>
 * @author ������ �������
 * @version 2021.2.1
 */
public class Main {
    /**
     * ������� main
     * @param args - ���������
     * */
    public static void main(String[] args)
    {
        List list = new List();

        int command = 1;
        do{
            //������� ����� ������, ������� ������� ��������, ��������������� �� ���������� �������� ������
            Scanner in = new Scanner(System.in);//��������� ������ �� ���������� ���������
            System.out.println(
                    "1. ���������� ��������\n" +
                    "2. ���������� �������� �� �����\n" +
                    "3. �������� �������� �� ������\n" +
                    "4. �������� �������� �� ����\n" +
                            "5. �����");
            command = in.nextInt();//��������� � ���������� �������� �����
            int x;
            int y;
            switch (command) {
                case 1:
                    System.out.print("������� �������: ");
                    try //���������� ���� ����, � ������� ����� ��������� ����������
                    {
                        x = in.nextInt();
                        list.Insert(x);
                        System.out.print(list.toString());
                    }
                    //���� ������������ ��� ����� ��� ���� ��� ���������
                    catch (InputMismatchException expected)//���������� ���� ����, � ������� ���������� ��������� ����������
                    {
                        System.out.println("������: ������������ ����");
                    }
                    break;

                case 2:
                    try {
                        System.out.print("������� �������: ");
                        x = in.nextInt();
                        System.out.print("������� �����: ");
                        y = in.nextInt();
                        list.InsertByKey(x, y);
                        System.out.print(list.toString());
                    } catch (Exception expected) {
                        System.out.println("������: �������� ���� �������");
                    }
                    break;

                case 3:
                    try {
                        list.DeleteHead();
                        System.out.print(list.toString());
                    } catch (Exception expected) {
                        System.out.println("������: ������ �� ����������");
                    }
                    break;

                case 4:
                    try {
                        System.out.print("������� �������: ");
                        x = in.nextInt();
                        list.DeleteData(x);
                        System.out.print(list.toString());
                    }catch (Exception expected) {
                        System.out.println("������: �������� ���� ��������");
                    }
                    break;
            }
        } while (command != 5);
    }
}
