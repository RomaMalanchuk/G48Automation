package models;

import java.util.Collections;
import java.util.List;

public class B {
    public void my_method(List<String> list) {
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
