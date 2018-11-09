public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> ListInteger = new MyList<Integer>();

        ListInteger.add(1);
        ListInteger.add(2);
        ListInteger.add(3);
        ListInteger.add(3);
        ListInteger.add(4);
//        ListInteger.add(5);
//        ListInteger.add(6);
//        ListInteger.add(7);
//        ListInteger.add(8);
//        ListInteger.add(9);
//        ListInteger.add(10);
//        ListInteger.add(11);

        System.out.println("List: ");
        ListInteger.output();

        ListInteger.add(3, 7);
        System.out.println("After add index: ");
        ListInteger.output();

        ListInteger.remove(1);
        System.out.println("After remove: ");
        ListInteger.output();

        System.out.println("Have 5: " + ListInteger.contain(5));
        System.out.println("Have 7: " + ListInteger.contain(7));

        System.out.println("Index of 7: " + ListInteger.indexOf(7));
        System.out.println("Index of 5: " + ListInteger.indexOf(5));

        ListInteger.clear();
        System.out.println("After Clear: ");
        ListInteger.output();
    }
}