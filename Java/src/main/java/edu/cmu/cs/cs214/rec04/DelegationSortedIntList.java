package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class DelegationSortedIntList implements IntegerList {
    int totalAdded = 0;
    private SortedIntList lst = new SortedIntList();

    // Write your implementation below with API documentation
    public int getTotalAdded() {
        return totalAdded;
    }

    public boolean add(int num) {
        totalAdded++;
        return lst.add(num);
    }

    public boolean addAll(IntegerList list) {
        totalAdded = totalAdded + list.size();
        return lst.addAll(list);
    }

    public int get(int index) {
        return lst.get(index);
    }

    public boolean remove(int num) {
        return lst.remove(num);
    }

    public int size() {
        return lst.size();
    }

    public boolean removeAll(IntegerList list) {
        return lst.removeAll(list);
    }

}