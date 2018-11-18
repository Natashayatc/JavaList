/* Class Stock задача которого, хранить товар
 *
 * @version 1.0 18 Nov 2018
 * @author Natasha Yatcenya
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class Stock<T> implements Iterable<T> {

    private List<T> product = new ArrayList<>();
     // Метод добавления товара в список
    public void add(final T prod) {
        product.add(prod);
    }
    // Метода удаления товара из списка
    public boolean remove(final T prod ) {
        return product.remove(prod);
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int currentIndex = 0;
            private T current = (T) product.get(currentIndex);

            @Override
            public boolean hasNext() {
                return currentIndex < product.size() && current != null;
            }

            @Override
            public T next() {
                return (T) product.get(currentIndex++);
            }

        };
    }
    }


