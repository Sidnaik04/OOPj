// Shopping list using vectors

import java.util.Vector;

public class code_2 {
    public static void main(String[] args) {
        String[] arrayItems = {"Apple","banana","Chiku","Mango","watermelon"};

        Vector<String> vectorItems = new Vector<>();
        for(int i=0;i<arrayItems.length;i++){
            vectorItems.add(arrayItems[i]);
        }
        System.out.println(vectorItems);

        vectorItems.remove(2);
        System.out.println("Item removed");

        vectorItems.add(2,"Strawberry");
        System.out.println("Item added");

        vectorItems.addElement("Grapes");
        System.out.println("Item added");

        System.out.println(vectorItems.toString());
    }
}
