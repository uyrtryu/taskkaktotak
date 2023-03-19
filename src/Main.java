public class Main {
    public static void main(String[] args) {
        List list =new List();

        list.pushFirst(1);
        for (int i = 2; i < 8; i++) {
            list.pushEnd(i);
        }
        list.pushEnd(60000);
        list.print();

        System.out.println();
        list.reverse();

        list.print();

    }
}