public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> ListInteger = new MyList<Integer>(); // tạo đối tượng mới
        MyList<Integer> cloneList = new MyList<Integer>();

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
        // phần này dùng để kiểm tra tác dụng của ensuCapa khi ta add quá số capacity đã thiết lập

        System.out.println("List: "); //in ra list đã tạo
        ListInteger.output();

        ListInteger.add(4, 7); //add 7 vào vị trí ô thứ 3
        System.out.println("After add index: ");
        ListInteger.output();

        System.out.println("after clone: ");
        cloneList.output();

        ListInteger.remove(1); // loại bỏ giá trị ở ô có số 1
        System.out.println("After remove: ");
        ListInteger.output();

        System.out.println("Have 5: " + ListInteger.contain(5)); // kiểm tra có giá trị hay không
        System.out.println("Have 7: " + ListInteger.contain(7)); // nếu có thì trả về true. else false

        System.out.println("Index of 7: " + ListInteger.indexOf(7)); // trả ra giá trị  của ô có giá trị 7
        System.out.println("Index of 5: " + ListInteger.indexOf(5)); //

        ListInteger.clear();
        System.out.println("After Clear: ");
        ListInteger.output();
    }
}