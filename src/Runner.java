/*
 * @version 1.0 18 Nov 2018
 * @author Natasha Yatcenya
 */
public class Runner {
    public static void main(final String[] args) {
        Stock<String> goods = new Stock<>();
        goods.add("Юбка");
        goods.add("Джинсы");
        goods.add("Платье");
        goods.add("Шарф");
        goods.add("Платок");
        goods.add("Туфли");
        goods.remove("Юбка");
        for (String name: goods) {
            System.out.println(name);
        }
    }
}
