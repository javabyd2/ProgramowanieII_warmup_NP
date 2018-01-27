package com.sdabyd2.programowanie;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<String> lista  = new ArrayList<String>();
        lista.add("bla");
        lista.add("blab");
        lista.add("blaa");
        lista.add("blabla");

        List<String> result = PTestImpl.rendomSelect(lista, 2);
        for (String s : result) {
            System.out.println(s);
        }

    }
}
