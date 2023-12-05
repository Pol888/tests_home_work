package ex_5;

import java.util.ArrayList;


public class Sheet {
    private final ArrayList<String> library = new ArrayList<>();

    void add(String text){
        library.add(text);
    }

    void edit(int index, String string){
        library.set(index, string);
    }

    void remove(int index){
        library.remove(index);
    }


}
