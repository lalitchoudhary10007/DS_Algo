package Collections.ArrayList;


public class ListMain {

    public static void main(String[] args) {
        MyList list = new MyList(2);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list.remove(3);



       System.out.println("Size:- "+list.size());
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }

}
