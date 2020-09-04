class Peach extends Fruit {
	Peach(String name, int price) {
		super(name, price);
	}

	  @Override
	  protected String getName() {
		  return name;
	  }

	  @Override
	  protected int getPrice() {
		  return price;
	  }
}