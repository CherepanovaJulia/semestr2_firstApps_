package laba9;

public class ex5_1 {
    public static class List{

        public int value;
        public List next;

        List(int value, List next) {
            this.value = value;
            this.next = next;
        }
    }
    public static void main(String[] args) {

        List head = null;
        for(int i = 9; i >= 0;i-- ){
            head = new List(i, head);
        }
        List ref = head;
        while (ref != null) {
            System.out.println(" " + ref.value);
            ref = ref.next;
        }
    }
}

