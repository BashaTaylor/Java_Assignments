import java.util.ArrayList;

class ExceptionLists {
    public static void main(String [] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        for(int i = 0; i < myList.size(); i++) {
            try{
                Integer castedValue = (Integer) myList.get(i);
            }catch (ClassCastException e ){
                System.out.println(e.getMessage()  + "Index: " + i + myList.get(i));
            }  
        }
    }
}




