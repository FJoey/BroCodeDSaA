import java.util.ArrayList;
import java.util.LinkedList;

public class Graph2 {

    ArrayList<LinkedList<Node2>> alist;

    Graph2(){
        alist = new ArrayList<>();
    }

    public void addNode(Node2 node){
        LinkedList<Node2> currentList = new LinkedList<>();
        currentList.add(node);
        alist.add(currentList);
    }

    public void addEdge(int src, int dst){
        LinkedList<Node2> currentList = alist.get(src);
        Node2 dstNode = alist.get(dst).get(0);
        currentList.add(dstNode);
    }

    public boolean checkEdge(int src, int dst){
        LinkedList<Node2> currentList = alist.get(src);
        Node2 dstNode = alist.get(dst).get(0);

        for(Node2 node: currentList){
            if(node == dstNode){
                return true;
            }
        }
        return false;
    }

    public void print(){
        for(LinkedList<Node2> currentList : alist){
            for(Node2 node : currentList){
                System.out.print(node.data + " -> ");
            }
            System.out.println();
        }
    }
}
