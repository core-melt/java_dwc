class Basket<E extends Fruit> {
  private E elem;
  final int price = 100;

  Basket(E e) {
    elem = e;
  }

  void replace(E e) {
    elem = e;
  }

  E get() {
    return elem;
  }

  void printName() {
    System.out.println("籠の中身は" + elem.getName() + "です"); // EはFruitのサブクラスなので、getNameが使えると保証されている
  }

  void printPrice() {
	System.out.println("籠は" + price + "円です" + elem.getName() + "は" + elem.getPrice() + "円です");
  }

}


