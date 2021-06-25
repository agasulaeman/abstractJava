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

        st.traverse(st.getRoot());
        st.removeItem(new Node("3"));
        st.traverse(st.getRoot());

        st.removeItem(new Node("5"));
        st.traverse(st.getRoot());

        st.removeItem(new Node("0"));
        st.removeItem(new Node("4"));
        st.removeItem(new Node("2"));
        st.traverse(st.getRoot());

        st.removeItem(new Node("9"));
        st.traverse(st.getRoot());
        st.removeItem(new Node("8"));
        st.traverse(st.getRoot());
        st.removeItem(new Node("6"));
        st.traverse(st.getRoot());
        st.removeItem(st.getRoot());
        st.traverse(st.getRoot());
        st.removeItem(st.getRoot());
        st.traverse(st.getRoot());
    }
}
 /*   SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());
    // Create a string data array to avoid typing loads of addItem instructions:
    String stringData = "5 7 3 9 8 2 1 0 4 6";
//        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";


    String[] data = stringData.split(" ");
        for (String s : data) {
        tree.addItem(new Node(s));
    }


        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("3"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("5"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("0"));
        tree.removeItem(new Node("4"));
        tree.removeItem(new Node("2"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("9"));
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("8"));
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("6"));
        tree.traverse(tree.getRoot());
        tree.removeItem(tree.getRoot());
        tree.traverse(tree.getRoot());
        tree.removeItem(tree.getRoot());
        tree.traverse(tree.getRoot());
}
*/