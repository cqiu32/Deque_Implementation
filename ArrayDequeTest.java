public class ArrayDequeTest {
    public static void main(String[] args){
        ArrayDeque<String> list=new ArrayDeque<>();


        list.addLast("a");

       // list.removeFirst();

        list.addLast("b");
        list.addLast("c");
        list.addLast("d");

        String c=list.removeFirst();


        list.addLast("e");
        list.addLast("f");
        list.addLast("g");
        list.addLast("h");



        /*
        list.addFirst("a");
        list.addFirst("b");
        list.addFirst("c");
        list.addFirst("d");
        list.addFirst("e");
        list.addFirst("f");
        list.addFirst("g");
        list.addFirst("h");
        */





        list.addFirst("k");


        list.addLast("O");

        list.printDeque();



        list.removeFirst();
        list.removeLast();
        list.removeFirst();
        list.removeFirst();
        list.removeLast();
        list.removeFirst();


        list.removeFirst();
        //list.removeFirst();
        list.removeLast();
    }
}
