public class LinkedListDeque<Item> implements Deque<Item>{
    public class jNode{
        public Item item;
        public jNode prev;
        public jNode next;

        public jNode(Item item){
            this.item=item;
            this.prev=null;
            this.next=null;
        }
    }

    private jNode front;
    private jNode back;
    private int size;

    public LinkedListDeque(){
        //this.front=null;
        //this.back=null;
        this.size=0;
    }


    public void addFirst(Item item){
        jNode current=new jNode(item);

        if(size==0){
            front=current;
            back=current;
        }else{
            jNode temp=front;
            front=current;
            front.next=temp;
            front.next.prev=front;
        }

        size++;

    }

    public void addLast(Item item) {
        jNode current=new jNode(item);

        if(size==0){
            front=current;
            back=current;
        }else{
            jNode temp=back;
            back=current;
            back.prev=temp;
            temp.next=back;
        }

        size++;


    }

    public boolean isEmpty(){
        return (size==0);
    }


    public int size(){
        return size;
    }


    public void printDeque(){
        jNode current=front;
        while(current!=null){
            System.out.print(current.item.toString()+" ");
            current=current.next;
        }
    }

    public Item get(int index){

        if(size==0){
            return null;
        }

        if(index<0 || index>=size){
            return null;
        }


        jNode current=front;
        for(int i=0;i<index;i++){
            current=current.next;

        }

        return current.item;
    }

    public Item getRecursive(int index){

        if(size==0){
            return null;
        }

        if(index<0 || index>=size){
            return null;
        }


        jNode current=front;
       return recursiveHelper(current,index);

    }

    public Item recursiveHelper(jNode n,int index){
        //jNode current=n;
        if(index==0){
            return n.item;
        }
        return recursiveHelper(n.next,index-1);

    }


    public Item removeFirst() {




        if(front==null){
            return null;
        }

        if(size==1){
            Item result=front.item;
            front=null;
            back=null;
            size--;
            return result;
        }

        Item result=front.item;
        front=front.next;
        front.prev=null;
        size--;
        return result;



    }


    public Item removeLast() {




        if(back==null){
            return null;
        }

        if(size==1){
            Item result=back.item;
            front=null;
            back=null;
            size--;
            return result;
        }

        Item result=back.item;
        back=back.prev;
        back.next=null;
        size--;
        return result;
    }

}
