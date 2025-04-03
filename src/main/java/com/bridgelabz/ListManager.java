package com.bridgelabz;

import java.util.List;

public class ListManager {

    public void addElement(List<Integer> list, int element){
        list.add(element);
    }

    public void removeElement(List<Integer> list, int element){
        list.remove(Integer.valueOf(element));
    }

    public int updateElement(List<Integer> list){
        return list.size();
    }
}
