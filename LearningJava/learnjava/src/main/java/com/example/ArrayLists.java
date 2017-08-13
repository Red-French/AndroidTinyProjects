package com.example;

import java.util.ArrayList;

/**
 * Created by user on 8/16/16.
 */
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList names = new ArrayList();  // not required to define length of array in an ArrayList

        names.add("Carl");
        names.add("Jimmy Neutron");
        names.add("Elroy Jetson");

        System.out.println(names.get(0));  // print "Carl"

        names.remove("Carl");

         System.out.println(names.get(0));  // print "Jimmy Neutron"

        names.remove(0);  // remove "Jimmy Neutron"

        System.out.println(names.get(0));  // print "Elroy Jetson"
    }
}
