public class MainMethodAbstract {
    public static void main(String[] args) {
//        MyLinkedList list = new MyLinkedList(null);
//        list.traverse(list.getRoot());
        SearchTree st = new SearchTree(null);
        st.traverse(st.getRoot());
        //String dataKota = " Jakarta Bandung Yogyakarta Madiun Ngawi Sragen Jakarta Bogor Depok Tangerang";

        //String[] data = dataKota.split(" ");
        //for ( String s: data) {
        //   list.addItem(new Node(s));
        //}
        // list.traverse(list.getRoot());

/*        String dataAngka = " 0 1 2 3 4 5 6 7 8 9 ";
        String [] angka1 = dataAngka.split(" ");
        for (String angka: angka1) {
            list.addItem(new Node(angka));
        }
        list.traverse(list.getRoot());*/
        String angka = "0 1 2 3 4 5 6 7 8 9 ";
        String[] data = angka.split(" ");
        for (String s : data) {
            st.addItem(new Node(s));
        }
        st.traverse(st.getRoot());
    }
}
