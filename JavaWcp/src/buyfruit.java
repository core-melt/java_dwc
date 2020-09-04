
public class buyfruit {
    public static void main(String[] args) {
    	Basket<Fruit> appleBasket = new Basket<>(new Apple("ふじ", 200));
    	appleBasket.printName();
    	appleBasket.printPrice();

    	appleBasket.replace(new Apple("紅玉", 200));
    	appleBasket.printName();
    	appleBasket.printPrice();


    	appleBasket.replace(new Peach("黄金桃", 300));
    	appleBasket.printName();
    	appleBasket.printPrice();

    }
}
