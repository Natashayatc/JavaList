/* class Stock задача которого, хранить товар
 *
 * @version 1.0 05 Nov 2018
 * @author Natasha Yatcenya
 * @param
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
public class Stock {
    public static void main(final String[] args) {
        ArrayList<String> product = new ArrayList<>();
        LinkedList<String> goods = new LinkedList<>();
        product.add("Юбка");
        product.add("Джинсы");
        product.add("Платье");
        product.add("Шарф");
        goods.add("Платок");
        goods.add("Туфли");
        Iterator<String> pp = product.iterator();
        for (String p: product ){
            System.out.println(pp.next());
        }
        Iterator<String> ss  = goods.iterator();
        for (String g: goods ) {
            System.out.println(ss.next());
        }

    }
    }

