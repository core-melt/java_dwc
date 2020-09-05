package stream;

public class Fruit {
	  // 名前
	  public String name;

	  // 在庫数
	  public int quantity;

	  // 名前と在庫数を引数にしたコンストラクタ
	  public Fruit(String name, int quantity) {
	    this.name = name;
	    this.quantity = quantity;
	  }

	  // 在庫数を増やしたフルーツを返すメソッド
	  public Fruit order(int quantityToAdd) {
	    return new Fruit(this.name, this.quantity + quantityToAdd);
	  }

	  // 出力用にtoStringをオーバーライド
	  @Override
	  public String toString() {
	    return name + ": " + quantity + "個";
	  }
}
