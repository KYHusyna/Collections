package com;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrList();
        PriorityQueue();
        set();
        map();
        colection();
    }


    public static void ArrList() {
        List collection = new ArrayList();
        System.out.println("ArrayList");
        collection.add("HI");
        collection.add("rock");
        collection.add("MY");
        collection.add("program");
        collection.add("boar");
        collection.add("today");
        collection.add("bread");
        for (int i = 0; i < collection.size(); i++) {
            System.out.println(collection.get(i));
        }
        System.out.println("\nUpdate list");
        collection.set(1, "Its");
        collection.set(4, "happy");
        collection.remove("bread");
        for (int i = 0; i < collection.size(); i++) {
            System.out.println(collection.get(i));
        }
    }

    public static void PriorityQueue() {
        Queue collection = new PriorityQueue();
        System.out.println("\nPriorityQueue");
        collection.offer("2620");
        collection.offer("1000");
        collection.offer("1750");
        collection.offer("3700");
        System.out.println("Count month = " + collection.size() +
                "\nGrowth of income from magazines by months");
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(collection.poll());
        }

        System.out.println("Count elements after deleting = " + collection.size());
    }

    public static void set() {
        Set collection = new HashSet();
        System.out.println("\nHashSet");
        System.out.println("Journals available:");
        collection.add("Business Journal");
        collection.add("Business Journal");
        collection.add("Business Journal");
        collection.add("Farmer Journal");
        collection.add("Farmer Journal");
        collection.add("Farmer Journal");
        collection.add("Fashion Journal");
        collection.add("Fashion Journal");
        collection.add("Fashion Journal");
        collection.add("Farmer Journal");
        collection.add("Business Journal");
        collection.add("Business Journal");
        for (Object o : collection) {
            System.out.println(o);
        }
    }

    public static void map() {
        Map collection = new TreeMap();
        System.out.println("\nTreeMap");
        System.out.println("journals with most interest");
        collection.put("1 ", " Business Journal");
        collection.put("2 ", " Farmer Journal");
        collection.put("3 ", " Fashion Journal");
        Set set = collection.entrySet();
        for (Object o : set) {
            System.out.println(o);
        }
    }

    public static void colection() {
        Collection collection = new ArrayList();
        System.out.println("\nArrayList");
        collection.add("Buy journals");
        collection.add("Read books");
        collection.add("Smoke");
        collection.add("Develop");
        collection.remove("Smoke");
        for (Object o : collection) {
            System.out.println(o);
        }

    }

}

