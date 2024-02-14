package edu.cmu.cs.cs214.rec04;

public class SortedIntList extends AbstractIntList {
    int count = 0;

    @Override
    public boolean add(int num) {
        count++;
        return false;
    }

    @Override
    public boolean addAll(IntegerList list) {
        count = count + list.size();
        return super.addAll(list);
    }

    @Override
    public boolean remove(int num) {
        count--;
        return false;
    }

    @Override
    public boolean removeAll(IntegerList list) {
        count = count - list.size();
        return false;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public int get(int index) {
        return 0;
    }
}
