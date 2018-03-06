package by.epam.preTraining.SiarheiHuba.tasks.Task7.Model;

import by.epam.preTraining.SiarheiHuba.tasks.Task7.View.View;

import javax.swing.plaf.metal.MetalIconFactory;
import java.util.Comparator;

public class Tree<T extends Comparable> {
    private T data;
    private int size = 0;
    private TreeLeaf treeRoot;
    Comparator<T> comparator;

    public Tree() {
    }

    public int compare(Object obj1, Object obj2){
        if (obj1.equals(obj2)) return 0;
        if (obj1.hashCode()>obj2.hashCode()) return 1;
        else return -1;
    }

    private class TreeLeaf<T extends Comparable>{
        private TreeLeaf leftChild;
        private TreeLeaf rightChild;
        private TreeLeaf parent;
        private T data;

        private TreeLeaf(T element, TreeLeaf parent){
            data = element;
            this.parent = parent;
        }
    }

    public void add(T element) {
        if (treeRoot == null) {
            treeRoot = new TreeLeaf(element, null);
            size++;
            data = element;
        } else addTo(treeRoot, element);
    }

    public void addTo(TreeLeaf parent, T element) {
        if (compare(getData(parent), element) < 0) {
            if (parent.leftChild == null) {
                parent.leftChild = new TreeLeaf(element, parent);
                size++;
            } else addTo(parent.leftChild, element);
        } else if (compare(getData(parent), element) > 0) {
            if (parent.rightChild == null) {
                parent.rightChild = new TreeLeaf(element, parent);
                size++;
            } else addTo(parent.rightChild, element);
        } else View.view("Duplicate objects... skipping...");
    }

    public void remove(T element) {
        if (treeRoot == null)
            return;
        else {
            TreeLeaf toBeRemoved = findBranch(element, treeRoot);
            if (toBeRemoved==null) return;

            //Node to be removed has no children.
            if (toBeRemoved.leftChild == null && toBeRemoved.rightChild == null) {
                toBeRemoved = null;

                //Node to be removed has one child.
            } else if (toBeRemoved.leftChild != null && toBeRemoved.rightChild == null) {
                toBeRemoved = toBeRemoved.leftChild;
            } else if (toBeRemoved.leftChild == null && toBeRemoved.rightChild != null) {
                toBeRemoved = toBeRemoved.rightChild;

                //Node to be removed has two children.
            } else {
                TreeLeaf currentTree = toBeRemoved.rightChild;
                if (toBeRemoved.rightChild.leftChild != null) {
                    while (currentTree.leftChild != null) {
                        currentTree = currentTree.leftChild;
                    }
                    TreeLeaf tempTree = currentTree;
                    remove(getData(currentTree));
                    toBeRemoved = tempTree;
                } else {
                    toBeRemoved = currentTree;
                }
            }
            size--;
        }
    }

    public T getData(TreeLeaf element) {
        return this.data;
    }

    public int getSize() {
        return size;
    }

    public boolean contains(T element) {
        if (treeRoot.equals(new TreeLeaf(element, treeRoot))) {
            return true;
        } else return findBranch(element, treeRoot) != null;
    }

    public TreeLeaf findBranch(T element, TreeLeaf parent) {
        if (compare(getData(parent), element) < 0) {
            if (parent.leftChild == null) return null;
            else findBranch(element, parent.leftChild);
        } else if (compare(getData(parent), element) > 0) {
            if (parent.rightChild == null) return null;
            else findBranch(element, parent.rightChild);
        }
        return parent;
    }

    @Override
    public String toString() {
        return "TreeImpl{" + "treeRoot=" + treeRoot + ", data=" + data + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tree<?> tree = (Tree<?>) o;

        if (size != tree.size) return false;
        if (data != null ? !data.equals(tree.data) : tree.data != null) return false;
        if (treeRoot != null ? !treeRoot.equals(tree.treeRoot) : tree.treeRoot != null) return false;
        return comparator != null ? comparator.equals(tree.comparator) : tree.comparator == null;
    }

    @Override
    public int hashCode() {
        int result = data != null ? data.hashCode() : 0;
        result = 31 * result + size;
        result = 31 * result + (treeRoot != null ? treeRoot.hashCode() : 0);
        result = 31 * result + (comparator != null ? comparator.hashCode() : 0);
        return result;
    }
}

