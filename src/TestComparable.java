import java.util.ArrayList;
import java.util.Collections;

public class TestComparable implements Comparable {
    String name;
    int position;

    @Override
    public int compareTo(Object o) {
        TestComparable test = (TestComparable) o;

        if (test.position > this.position) {
            return -1;
        } else if (test.position < this.position) {
            return 1;
        }
        return 0;
    }

    TestComparable(String name, int position){
        this.name = name;
        this.position = position;
    }

    public static void sort(ArrayList<TestComparable> list) {
        Collections.sort(list);
    }


}
