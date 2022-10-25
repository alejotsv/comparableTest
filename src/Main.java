import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Creating first object");
        TestComparable firstObject = new TestComparable("Mouse", 1);
        System.out.println("First object name: " + firstObject.name + "\nFirst object position: " + firstObject.position);
        System.out.println("Creating second object");
        TestComparable secondObject = new TestComparable("Keyboard", 2);
        System.out.println("Second object name: " + secondObject.name + "\nSecond object position: " + secondObject.position);

        ArrayList<TestComparable> myList = new ArrayList();
        myList.add(secondObject);
        myList.add(firstObject);

        System.out.println(myList.get(0).name);

        TestComparable.sort(myList);

        System.out.println(myList.get(0).name);
    }
}
