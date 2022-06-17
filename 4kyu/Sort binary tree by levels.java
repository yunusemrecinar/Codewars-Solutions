import java.util.*;

class Kata {
  public static List<Integer> treeByLevels(Node node)
  {
    List<Integer> list = new ArrayList<Integer>();
    int num = -1;
    
    if(node == null) {
      return list;
    }    
    
    Queue<Node> queue = new LinkedList<Node>();
    queue.add(node);
    
    while(!queue.isEmpty()) {
      Node tempNode = queue.poll();
      
      num = tempNode.value;
      list.add(num);
      
      if(tempNode.left != null) {
        queue.add(tempNode.left);
      }
      
      if(tempNode.right != null) {
        queue.add(tempNode.right);
      }
    }
    
    return list;
  }
}