import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NoNameClass {
    public static void main(String[] args) {
/*    	A b = new A() {

		  // {}の中にメソッドを追加します。

		  // クラスAのhelloメソッドをオーバーライドします。
		  @Override
		  public String hello() {
		    // "Hello B!"を返します。
		    return "Hello B!";
		  }
		};
		System.out.println(b.hello());
*/
		/*B b = new BImpl();
		System.out.println(b.hello());*/


    	// ()のあとに{}を追加
    	B b = new B() {
    	  // helloメソッドを実装
    	  @Override
    	  public String hello() {
    	    return "Hello B!";
    	  }
    	};
    	System.out.println(b.hello());


    	// 並び替え対象のリスト
    	List<Integer> numbers = Arrays.asList(1, -8, 4, 2);

    	Collections.sort(
    	    numbers,
    	    new Comparator<Integer>() {
    	      @Override
    	      public int compare(Integer x, Integer y) {
    	        // 数値が小さい順に並べる
    	        return Integer.compare(x, y);
    	      }
    	    });

    	System.out.println(numbers);

    	List<String> animals = Arrays.asList("dog", "cat", "fox", "elephant");

    	for (String s: animals) {
    		System.out.println(s);
    	}

    	Collections.sort(
    		    animals,
    		    new Comparator<String>() {
    		      @Override
    		      public int compare(String x, String y) {
    		        // 数値が小さい順に並べる
    		        return x.compareTo(y);
    		      }
    		    });

    	for (String s: animals) {
    		System.out.println(s);
    	}

    }
}
