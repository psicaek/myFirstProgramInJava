package chapter12;

import java.util.*;

public class CollectionsDemo {

    public static void main(String [] args){
       // setDemo();
       // listDemo();
        //queueDemo();
        mapDemo();
    }

    public static void setDemo(){
        Set fruit=new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size());
        System.out.println(fruit);
    /*
        HasNext with iterator
    */
        var i =fruit.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
       }
    /*
        forEach method  with this x->(action)
    */
         fruit.forEach(x->System.out.println(x));
         /*
         Or fruit.forEach(System.out::println);
          */
    }
    public static void listDemo(){

        List<String> fruit=new ArrayList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.get(2));
        System.out.println(fruit.size());
        System.out.println(fruit);
/*
        enhanced For loop
 */
        for (String item: fruit){
            System.out.println(item);
        }


    }
    public static void queueDemo(){
        Queue fruit = new LinkedList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size());
        System.out.println(fruit);

    }
    public static void mapDemo(){

        Map<String, Integer> fruitCalories= new HashMap();
        fruitCalories.put("apple",95);
        fruitCalories.put("lemon",20);
        fruitCalories.put("banana",105);
        fruitCalories.put("orange",45);
        fruitCalories.put("lemon",17);

        //System.out.println(fruitCalories.size());
       // System.out.println(fruitCalories);
       // System.out.println(fruitCalories.get("banana"));
       // System.out.println(fruitCalories.values());
       // System.out.println(fruitCalories.entrySet());
      //  fruitCalories.remove("orange" );
      //  System.out.println(fruitCalories);
        /*
        enhanced For loop
        */
      // for (var entry:fruitCalories.entrySet()){
      //     System.out.println(entry.getValue());
     //  }
        /*
        forEach method  with this x->(action) with 2 variables
         */
        fruitCalories.forEach((x,k)->System.out.println("Fruit: "+x+" Calories: "+k));
    }
}
