/* 
private class node {
  int data;
  Node right = null, left = null;
  Node(int data){
      this.data = data;
  }
}
*/

private void LevelOrderTriversal(Node root){
    Queue<Node> PQ = new LinkedList<>();
    PQ.add(root);
    while(!PQ.isEmpty()){
        int size = PQ.size();
        for(int i = 0; i < size; i++){
            Node curr = PQ.poll();
            //sum operation 
            if(curr.left != null) PQ.add(curr.left);
            if(curr.right != null) PQ.add(curr.right);
        }
    }
}



Eg.                            1                 ----------------->  1st level => 1
                      2                  3       ----------------->  2nd level => 2, 3
                4          5       6           7 ----------------->  3rd level => 4, 5, 6 & 7
