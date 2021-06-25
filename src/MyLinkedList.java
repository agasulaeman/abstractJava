public class MyLinkedList implements INodeList {
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            //The list was empty,so this item becomes a head of list
            this.root = newItem;
            return true;
        }
        ListItem cureentItem = this.root;
        while (cureentItem != null) {
            int compare = (cureentItem.compareTo(newItem));
            if (compare < 0) {
                //new item is greater , move right if possible
                //if (cureentItem != null){
                if (cureentItem.next() != null) {
                    //cureentItem.setNext(newItem);
                    //newItem.setNext(cureentItem);
                    cureentItem = cureentItem.next();
                    //return true;
                } else {
                    cureentItem.setNext(newItem).setPrevious(cureentItem);
                    return true;
                }
            } else if (compare > 0) {
                //new item is less , insert before
                if (cureentItem.previous() != null) {
                    //cureentItem.previous().setNext(newItem);
                    //newItem.setPrevious(cureentItem.previous());
                    cureentItem.previous().setNext(newItem).setPrevious(cureentItem.previous());
                    //newItem.setNext(cureentItem);
                    //cureentItem.setPrevious(newItem);
                    newItem.setNext(cureentItem).setPrevious(newItem);
                } else {
                    // the node with a previous is the root
                    // newItem.setNext(this.root);
                    // this.root.setPrevious(newItem);
                    newItem.setNext(this.root).setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            } else {
                //equal
                System.out.println(newItem.getValue() + " is already present and not added");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null){
            System.out.println(" Deleting item " +item.getValue());
        }
        ListItem currentItem = this.root;
        while (currentItem != null){
            int comparison = currentItem.compareTo(item);
            if (comparison ==0){
                //found the item to delete
                if (currentItem == this.root){
                    this.root = currentItem.next();
                }else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() !=null){
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
            return true;
            } else if (comparison <0){
                currentItem= currentItem.next();
            }else {
                //comparison >0
                //we are at an item greater than the one to be deleted
                //so the item is not in the list
                return false;
            }
        }
        //we have a reached the end of the list
        //without finding the item to deleted
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println(" the list is empty ");
        } else {
          while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }


    }
}
