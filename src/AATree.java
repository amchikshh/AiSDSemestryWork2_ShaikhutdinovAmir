public class AATree<T extends Comparable<T>> {
    private AANode<T> root;

    private AANode<T> skew(AANode<T> root){
        if (root == null){
            return null;
        }

        if (root.left == null){
            return root;
        }

        if (root.left.level == root.level){
            AANode<T> newRoot = root.left;
            AANode<T> newRight = new AANode<>(root.info);

            newRight.level = root.level;
            newRight.left = root.left.right;
            newRight.right = root.right;

            newRoot.left = root.left.left;
            newRoot.right = newRight;

            return newRoot;
        }
        return root;
    }

    private AANode<T> split(AANode<T> root){
        if (root == null){
            return null;
        }

        if (root.right == null | root.right.right == null){
            return root;
        }

        if (root.level == root.right.right.level){
            AANode<T> newRoot = root.right;
            AANode<T> newLeft = new AANode<>(root.info);

            newLeft.level = root.level;
            newLeft.left = root.left;
            newLeft.right = root.right.left;

            newRoot.level = root.right.level + 1;
            newRoot.left = newLeft;
            newRoot.right = root.right.right;

            return newRoot;
        }
        return root;
    }

//    public AANode<T> insert(T info, AANode<T> root){
//
//    }
}
