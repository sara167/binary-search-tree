package a4;

import java.util.LinkedList;

public class BST {

    private Node root = null;

    public int countFriends(int v) {
            return rSearch(v, root).getFriends().size();
        
    }
    
    public void printFriends (int v){
        Node ptr = rSearch( v , root);
        LinkedList <String> t = ptr.getFriends();
        for (int i = 0; i < t.size() ; i++) {
            System.out.print(t.get(i)+" ");
        }
        System.out.println("");
    }


    private Node rSearch(int v, Node ptr) {
        if (ptr == null) {
            return null;
        } else {
            if (ptr.getId() == v) {
                return ptr;
            } else if (v > ptr.getId()) {
                return rSearch(v, ptr.getRight());
            } else {
                return rSearch(v, ptr.getLeft());
            }
        }
    }

    public void insert(String name, int id) {
        Node n = new Node(name, id);
        if (root == null) {
            root = n;
        } else {
            Node ptr = root;
            Node prev = root;
            while (ptr != null) {
                prev = ptr;
                if (ptr.getId() < id) {
                    ptr = ptr.getRight();
                } else {
                    ptr = ptr.getLeft();
                }
            }
            if (id > prev.getId()) {
                prev.setRight(n);
            } else {
                prev.setLeft(n);
            }

        }

    }

    public void everyoneFriend(String name) {
        addToAll(name, root);
    }

    private void addToAll(String s, Node ptr) {
        if (ptr != null) {
            addToAll(s, ptr.getLeft());
            ptr.getFriends().addLast(s);
            addToAll(s, ptr.getRight());
        }
    }

    public void inOrder() {
        rInOrder(root);
        System.out.println("");
    }

    private void rInOrder(Node ptr) {
        if (ptr != null) {
            rInOrder(ptr.getLeft());
            System.out.print(ptr.getName() + " ");
            rInOrder(ptr.getRight());
        }

    }

    public void deleteNode(int v) {
        Node prev, ptr;
        boolean found = false;
            ptr = root;
            prev = root;
            while (ptr != null && !found) {
                if (ptr.getId() == v) {
                    found = true;
                } else {
                    prev = ptr;
                    if (ptr.getId() > v) {
                        ptr = ptr.getLeft();
                    } else {
                        ptr = ptr.getRight();
                    }
                }
            }
            if (ptr == null) {// or if (!found) 
                System.out.println("The user is not in the tree.");
            } else if (found) {
                if (ptr == root) {
                    root = deleteFromTree(root);
                } else if (prev.getId() > v) {
                    prev.setLeft(deleteFromTree(prev.getLeft()));
                } else {
                    prev.setRight(deleteFromTree(prev.getRight()));
                }
            }
        }
    

    private Node deleteFromTree(Node p) {
        Node ptr;
        Node prev;
        if (p == null) {
            System.err.println("Error: Can not delete null.");
        } else if (p.getLeft() == null && p.getRight() == null) {
            p = null;
        } else if (p.getLeft() == null) {
            p = p.getRight();
        } else if (p.getRight() == null) {
            p = p.getLeft();
        } else {
            ptr = p.getLeft();
            prev = null;
            while (ptr.getRight() != null) {
                prev = ptr;
                ptr = ptr.getRight();
            }
            p.setId(ptr.getId());

            if (prev == null) {
                p.setLeft(ptr.getLeft());
            } else {
                prev.setRight(ptr.getLeft());
            }
        }

        return p;
    }
}
