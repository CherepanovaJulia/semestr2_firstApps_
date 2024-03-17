package laba9;
//Создать два проекта, в которых продемонстрировать два способа создания линейного
// однонаправленного списка (с головы и с хвоста) согласно примеру 2 из второго раздела.
// Отработать код с помощью отладчика и привести скриншоты минимум трех точек,
// обработанных отладчиком.
public class ex5 {
    public static class List{

        public int value;
        public List next;

        List(int value, List next) {
            this.value = value;
            this.next = next;
        }
    }
    public static void main(String[] args) {

       List node0 = new List(0,null);
       List node1 = new List(1, null);
       List node2 = new List(2, null);
       List node3 = new List(3, null);

        node0.next = node1;
        node1.next = node2;
        node2.next = node3;

       List ref = node0;
        while (ref != null) {
            System.out.println(" " + ref.value);
            ref = ref.next;
        }
    }
}

