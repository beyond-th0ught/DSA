
private void preOrder(Node root){
    if(root == null) return;
    System.out.println(root.data);
    preOrder(root.left);
    preOrder(root.right);
}

private void inOrder(Node root){
    if(root == null) return;
    preOrder(root.left);
    System.out.println(root.data);
    preOrder(root.right);
}

private void preOrder(Node root){
    if(root == null) return;
    preOrder(root.left);
    preOrder(root.right);
    System.out.println(root.data);
}
