import java.util.ArrayList;
import java.util.List;

public class BoundaryWild {
    public static void main(String[] args) {
		List<? extends Fruit> fruits;
		List<Apple> apples = new ArrayList<>();

		fruits = apples;// コンパイルエラーにならない
		BoundaryWild.doSomething(apples); // コンパイルエラーにならない
    }

    static void doSomething(List<? extends Fruit> fruits) {  // 型パラメータとして、Fruitを継承したクラスを指定
    	  System.out.println("OK");
    }
}
