public class TestComparable implements Comparable {
    String name;
    int position;

    @Override
    public int compareTo(Object o) {
        TestComparable test = (TestComparable) o;
        return 0;
    }

    TestComparable(String name, int position){
        this.name = name;
        this.position = position;
    }

}
