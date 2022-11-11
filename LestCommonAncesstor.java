Node LCA(Node root, int n1, n2){
    if(root == null) return null;
    
    if(root.data == n1 || root.data == n2) return node;
    
    Node left = LCA(node.left, n1, n2);
    Node right = LCA(node.right, n1, n2);
    
    if(left !=null && right != null) return node;
    
    if(left != null) return left;
    if(right != null) return right;
    
    return null;
}


Ex. BST

          root ->     10
                 1         4
             -2      5  2       9
             
             
             
LCA(root, 5, 2)  ->   10  // 10 is lowest common node
LCA(root, -1, 5)  ->  1   // 1  is lowest common node
