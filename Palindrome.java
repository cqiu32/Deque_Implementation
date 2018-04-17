public class Palindrome {

    public Deque<Character> wordToDeque(String word){
        Deque<Character> d=new LinkedListDeque<>();

        for(int i=0;i<word.length();i++){
            d.addLast(word.charAt(i));
        }

        return d;
    }



    public boolean isPalindrome(String word){

        Deque<Character> dd=wordToDeque(word);
        if(dd.size()==0 ||dd.size()==1){
            return true;
        }

        int test=dd.size();

        Character left,right;



        if(test%2==0){
            while(dd.size()!=0){
                left=dd.removeFirst();
                right=dd.removeLast();
                if(left!=right){
                    return false;
                }
            }
        }else {


            while (dd.size() != 1) {
                if (dd.removeFirst() != dd.removeLast()) {
                    return false;
                }
            }


        }

        return true;
    }


    public boolean isPalindrome(String word, CharacterComparator cc){
        Deque<Character> dd=wordToDeque(word);
        if(dd.size()==0 ||dd.size()==1){
            return true;
        }

        int test=dd.size();

        Character left,right;



        if(test%2==0){
            while(dd.size()!=0){
                left=dd.removeFirst();
                right=dd.removeLast();
                if(!cc.equalChars(left,right)){
                    return false;
                }
            }
        }else {


            while (dd.size() != 1) {
                left=dd.removeFirst();
                right=dd.removeLast();
                if (!cc.equalChars(left,right)) {
                    return false;
                }
            }


        }

        return true;
    }




}
