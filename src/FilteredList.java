import java.util.Collection;
import java.util.LinkedList;
import java.util.function.Predicate;
import static java.lang.String.format;

public class FilteredList<E> extends LinkedList<E> {

    private final Predicate<E> item;

    public FilteredList (Predicate<E> item) {
        this.item = item;
    }

    @Override
    public boolean add(final E item) {
        testPredicate(item);
        return super.add(item);
    }

    @Override
    public void add(final int index, final E item) {
        testPredicate(item);
        super.add(index, item);
    }

    @Override
    public void addFirst(final E item) {
        testPredicate(item);
        super.addFirst(item);
    }

    @Override
    public void addLast(final E item) {
        testPredicate(item);
        super.addLast(item);
    }

    @Override
    public void push(final E item) {
        addFirst(item);
    }

    @Override
    public boolean offerFirst(final E item) {
        addFirst(item);
        return true;
    }

    @Override
    public boolean offer(final E item) {
        addFirst(item);
        return true;
    }

    @Override
    public boolean offerLast(final E item) {
        addLast(item);
        return true;
    }

    @Override
    public boolean addAll(final int index, final Collection<? extends E> c) {
        c.forEach(this::testPredicate);
        return super.addAll(index, c);

    }


        private void testPredicate(final E item) {
        if(!this.item.test(item)) {
            throw new IllegalArgumentException(format("Unable to add %s to the list", item));
        }
    }

}
