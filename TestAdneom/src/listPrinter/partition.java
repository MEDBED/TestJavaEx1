package listPrinter;

import java.util.List;
import java.util.AbstractList;
import java.util.ArrayList;

public final class partition<T> extends AbstractList<List<T>> {
	
	private final List<T> list;
    private final int size;
    
    public partition(List<T> list, int size) {
        this.list = new ArrayList<>(list);
        this.size = size;
    }

    public static <T> partition<T> ofSize(List<T> list, int size) {
        return new partition<>(list, size);
    }

    @Override
    public List<T> get(int index) {
        int start = index * size;
        int end = Math.min(start + size, list.size());

        if (start > end) {
            throw new IndexOutOfBoundsException("Index " + index + 
            		" is out of the list range <0," + (size() - 1) + ">");
        }

        return new ArrayList<>(list.subList(start, end));
    }

    @Override
    public int size() {
        return (int) Math.ceil((double) list.size() / (double) size);
    }
}