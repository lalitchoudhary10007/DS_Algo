package Collections.ArrayList;


public class MyList {

    private int[] list = null;
    private int pointer = 0;

    public MyList(){
        list = new int[5];
    }

    public MyList(int size){
        list = new int[size];
    }

    public void add(int element){
        if (pointer == list.length){
            int[] newList = new int[list.length * 2];
            System.arraycopy(list, 0, newList, 0, list.length);
            list = newList;
        }
        list[pointer] = element;
        pointer++;
    }

    public int size(){
        return pointer;
    }

    public int get(int index){
        return list[index];
    }


    public void remove(int element){
         if (contains(element)){
            int index = getIndex(element);
            for (int i = index; i < size(); i++){
                list[index] = list[index + 1];
                index++;
            }
            pointer--;
         }
    }

    public boolean contains(int element){
        for (int j : list) {
            if (j == element) {
                return true;
            }
        }
        return false;
    }

    public int getIndex(int element){
        for (int i = 0; i < size(); i++){
            if (list[i] == element){
                return i;
            }
        }
        return -1;
    }

    //insertAt

}
