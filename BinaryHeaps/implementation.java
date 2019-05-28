import java.util.ArrayList;

// Further Programming Generics 😁
public class BinaryHeap<T extends Object> {
    private ArrayList<Item<T>> heap;

    public BinaryHeap() {
        heap = new ArrayList<>();
    }

    private void bubbleUp(int index) {
        if (index == 0) return;

        Item<T> current = heap.get(index);
        int parentIndex = (index - 1) / 2;
        Item<T> parent = heap.get(parentIndex);

        if (current.priority < parent.priority) {
            heap.set(parentIndex, current);
            heap.set(index, parent);
            bubbleUp(parentIndex);
        }
    }

    public void insert(int priority, T item) {
        Item<T> newItem = new Item<>(priority, item);
        heap.add(newItem);
        bubbleUp(heap.size() - 1);
    }

    private void bubbleDown(int index) {
        if (index >= heap.size()) return;

        Item<T> current = heap.get(index);
        int childAIndex = index * 2 + 1;
        Item<T> childA = heap.get(childAIndex);
        int childBIndex = index * 2 + 2;
        Item<T> childB = heap.get(childBIndex);

        if (childA.priority < childB.priority) {
            if (childA.priority < current.priority) {
                heap.set(index, childA);
                heap.set(childAIndex, current);
            }
        } else {
            if (childB.priority < current.priority) {
                bubbleDown(childBIndex);
                heap.set(childBIndex, current);
                bubbleDown(childBIndex);
            }
        }
    }

    public T removeMin() {
        if (heap.size() == 0) return null;

        T root = heap.get(0).item;
        heap.set(0, heap.remove(heap.size() - 1));

        bubbleDown(0);
        return root;
    }

    private class Item<T> {
        int priority;
        T item;

        Item(int priority, T item) {
            this.priority = priority;
            this.item = item;
        }
    }
}
