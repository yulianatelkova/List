package ru.vsu.amm.java;

/*Package org.junit.jupiter.api for writing test*/
/*@Test annotation denotes that method is a test method*/
/*@BeforeEach annotated method will run before each @Test. must not be static and must not return a value!!!->exception*/

public class ListTest {

    List list;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        list= new List();
        int i,n=10;
        /*  for(i=0;i<n;i++) {
            list.Insert(i);
        }*/
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        if (list.isEmpty()) System.out.println("the list is empty");
        else System.out.println("the list is not empty");
    }

    @org.junit.jupiter.api.Test
    void Insert() {
        int i,n=10;
        for(i=0;i<n;i++) {
            list.Insert(i);
        }
        System.out.println(list.toString());
    }

    @org.junit.jupiter.api.Test
    void InsertByKey() {
        int i,n=10;
        for(i=0;i<n;i++) {
            list.InsertByKey(i,i+2);
        }
        System.out.println(list.toString());
    }

    @org.junit.jupiter.api.Test
    String toStringTest(){
        StringBuilder list = new StringBuilder("List");
        return new String(list);
    }

    @org.junit.jupiter.api.Test
    void DeleteHead(){
        list.DeleteHead();
    }

    @org.junit.jupiter.api.Test
    void DeleteData() {
        int i,n=10;
        for (i=0;i<n-1;i++) {
            list.DeleteData(i);
        }
        System.out.println(list.toString());
    }

}
