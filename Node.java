package a4;

import java.util.LinkedList;

public class Node {

    private String name;
    private int id;
    private LinkedList <String> friends;
    private Node right = null;
    private Node left = null;

    public Node(String s , int v ){
        name=s;
        id=v;
        friends = new LinkedList();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LinkedList<String> getFriends() {
        return friends;
    }

    public void setFriends(LinkedList<String> friends) {
        this.friends = friends;
    }

    public void addFriend(String s){
        friends.addLast(s);
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

}
