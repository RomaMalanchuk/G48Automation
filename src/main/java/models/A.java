package models;

import java.util.ArrayList;
import java.util.List;


public class A {
    String[] my_array;

    public A() {
        this.my_array = new String[]{ "10", "20", "30", "40"};
    }

    public List<String> my_method() {
        int i =0;
        ArrayList<String> my_list = new ArrayList<String>();
        while(i <4){
            my_list.add(my_array[i]);
            i++;
        }
        return my_list;
    }
}
