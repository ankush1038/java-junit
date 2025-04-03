package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

public class ListManagerTest {

    private ListManager listManager;
    private  List<Integer>list;

    @BeforeEach
    void setUp(){
        listManager = new ListManager();
        list = new ArrayList<>();
    }
    @Test
    public void shouldAddElementToTheList(){
//        ListManager listManager = new ListManager();
//        List list = new ArrayList<>();
         listManager.addElement(list,3);
        listManager.addElement(list,4);
        listManager.addElement(list,5);

        Assertions.assertEquals(3, list.size());
        Assertions.assertTrue(list.contains(4));
    }

    @Test
    public void shouldRemoveElementFromTheList(){

        list.add(1);
        list.add(2);
        list.add(3);
        boolean isPresent = listManager.removeElement(list,2);
        Assertions.assertEquals(true, isPresent);

    }

    @Test
    public void shouldUpdateElementToTheList(){
        list.add(2);
        list.add(3);
        list.add(4);
        int size = list.size();
        Assertions.assertEquals(3,size);
    }
}
