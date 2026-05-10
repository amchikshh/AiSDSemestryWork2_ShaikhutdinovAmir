public class AANode<T extends Comparable<T>> {
    T info;
    AANode left, right;
    int level;
    public AANode(T info){
        this.info = info;
        this.level = 1;
    }
}
