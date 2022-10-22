package com.example.lesson5;//Copy Paste


 import java.util.ArrayList;
import java.util.Collections;

// Task 1
// public class Main {
// 	public static void main(String[] args) {

// 		ArrayList<String> cars = new ArrayList<String>();

// 		cars.add("Volvo");
// 		cars.add("DMW");
// 		cars.add("Ford");
// 		cars.add("Mazda");
// 		System.out.println(cars);
// 	}
// }


// Task 2
// public class Main {
// 	public static void main(String[] args) {

// 		ArrayList<String> cars = new ArrayList<String>();

// 		cars.add("Volvo");
// 		cars.add("DMW");
// 		cars.add("Ford");
// 		cars.add("Mazda");
// 		for (int i = 0; i < cars.size(); i++ ) {
// 			System.out.println(cars.get(i));
// 		}
// 	}
// }

import java.util.ArrayList;

//Task 3
//public class Main{
//    public static void main(String[] args){
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        for(String i : cars){
//            System.out.println(i);
//        }
//    }
//}


// Task 4
//public class Main {
//    public static void main(String[] args){
//        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
//        myNumbers.add(10);
//        myNumbers.add(15);
//        myNumbers.add(20);
//        myNumbers.add(25);
//        for(String i : myNumbers){
//           System.out.println(i);
//        }
//    }
//}

// Task 5
//public class Main{
//    public static void main(String[] args){
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        Collestions.sort(cars);
//        for(String i : cars){
//            System.out.println(i);
//        }
//    }
//}

// Task 6
//public class Main {
//    public static void main(String[] args){
//        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
//        myNumbers.add(10);
//        myNumbers.add(15);
//        myNumbers.add(20);
//        myNumbers.add(34);
//        myNumbers.add(8);
//        myNumbers.add(12);

//        Collestions.sort(myNumbers);
//        for(String i : myNumbers){
//           System.out.println(i);
//        }
//    }
//}

// Task 7
//public class Main{
//    public static void main(String[] args){
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        System.out.println(cars);

//        String car = cars.get(0);
//        System.out.println("get method:" +car);
//
//        cars.set(0,"Opel");
//        System.out.println("set method:" +cars);
//
//        cars.remove(2);
//        System.out.println("remove method:" +cars);
//
//        cars.clear();
//        System.out.println("clear method:" +cars);
//
//        int s = cars.size();
//        System.out.println("list size" +s);
//}
//}

//Problem 1
//        Write a Java program to create a new array list, add some colors (string) and print out the collection.

//public class Main {
//    public static void main(String[] args){
//        ArrayList<String> colors = new ArrayList<String>();
//        colors.add("yellow");
//        colors.add("purple");
//        colors.add("gray");
//        System.out.println(colors);
//    }
//}


//Problem 2
//        Write a Java program to insert an element into the array list at the first position.

//public class Main {
//    public static void main(String[] args){
//        ArrayList<String> chocolates = new ArrayList<String>();
//        chocolates.add("kitkat");
//        chocolates.add("bounty");
//        chocolates.add("snickers");
//        System.out.println(chocolates);
//    }
//}

//Problem 3
//        Write a Java program to retrieve an element (at a specified index) from a given array list

//public class Main {
//    public static void main(String[] args){
//        ArrayList<String> girls = new ArrayList<String>();
//        girls.add("aizh");
//        girls.add("yuki");
//        girls.add("assem");
//        girls.add("akena");
//        System.out.println(girls.get(2));
//    }
//}

//Problem 4
//        Write a Java program to update specific array element by given element
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> girls = new ArrayList<String>();
//        girls.add("aizh");
//        girls.add("yuki");
//        girls.add("assem");
//        girls.add("akena");
//        girls.set(1, "dina");
//        System.out.println(girls);
//    }
//}

//Problem 5
//        Write a Java program to remove the third element from a array list.

//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> girls = new ArrayList<String>();
//        girls.add("aizh");
//        girls.add("yuki");
//        girls.add("assem");
//        girls.add("akena");
//        girls.remove(3);
//        System.out.println(girls);
//    }
//}


//Problem 6
//        Write a Java program to search an element in a array list

//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> girls = new ArrayList<String>();
//        girls.add("aizh");
//        girls.add("yuki");
//        girls.add("assem");
//        girls.add("akena");
//        System.out.println(girls.contains("dina"));
//    }
//}

//Problem 7
//        Write a Java program to copy one array list into another

//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> girls = new ArrayList<String>();
//        girls.add("aizh");
//        girls.add("yuki");
//        girls.add("assem");
//        ArrayList<String> girlss = new ArrayList<String>();
//        girlss.add("zhumashova");
//        girlss.add("rashid");
//        girlss.add("shimbergenova");
//        Collections.copy(girlss, girls);
//        System.out.println("First list" + girls);
//        System.out.println("Second list" + girlss);
//    }
//}

//Problem 8
//        Write a Java program to shuffle elements in a array list
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> girls = new ArrayList<String>();
//        girls.add("aizh");
//        girls.add("yuki");
//        girls.add("assem");
//        girls.add("akena");
//        Collections.shuffle(girls);
//        System.out.println(girls);
//    }
//}

//Problem 9
//        Write a Java program to reverse elements in a array list
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> girls = new ArrayList<String>();
//        girls.add("aizh");
//        girls.add("yuki");
//        girls.add("assem");
//        girls.add("akena");
//        Collections.reverse(girls);
//        System.out.println(girls);
//    }
//}












