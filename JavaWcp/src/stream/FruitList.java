package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class FruitList {
    public static void main(String[] args) {
    	List<Fruit> fruits = new ArrayList<>();
    	fruits.add(new Fruit("りんご", 7));
    	fruits.add(new Fruit("みかん", 15));
    	fruits.add(new Fruit("いちご", 4));
    	fruits.add(new Fruit("メロン", 8));
    	fruits.add(new Fruit("ぶどう", 20));


    	long count = fruits.stream()
    		    .filter(f -> f.quantity <= 10)
    		    .count();

    	System.out.println(count);

    	List<Fruit> sortedFruits = fruits.stream()
    		    .sorted((f1, f2) -> f2.quantity - f1.quantity)
    		    .collect(Collectors.toList());

    	System.out.println(sortedFruits);

    	/*fruits.stream() // Streamを生成
        .filter(f -> f.quantity <= 10) // 中間操作1: 個数が10個以下のものを抽出
        .map(f -> f.order(20)) // 中間操作2: 20個ずつ発注
        .sorted((f1, f2) -> f1.quantity - f2.quantity) // 中間操作3: 個数の少ない順に並び替え
        .forEach(System.out::println); // 終端操作: 標準出力

    	/*
    	// 10個以下に絞り込まれたリストを作る
    	List<Fruit> filtered = new ArrayList<>();
    	// 拡張for文でfruitsをループ
    	for (Fruit fruit : fruits) {
    	  // if文で10個以下に絞る
    	  if (fruit.quantity <= 10) {
    	    // 絞り込まれたリストに追加
    	    filtered.add(fruit);
    	  }
    	}
    	// 20個ずつ追加する
    	List<Fruit> ordered = new ArrayList<>();
    	for (Fruit fruit : filtered) {
    	  ordered.add(fruit.order(20));
    	}
    	// 個数が少ない順に並べ替える
    	ordered.sort(new Comparator<Fruit>() {
    	  @Override
    	  public int compare(Fruit f1, Fruit f2) {
    	    return f1.quantity - f2.quantity;
    	  }
    	});

    	// 絞り込んで並べ替えたリストを拡張for文でループしながら出力する
    	for (Fruit fruit : ordered) {
    	  // 標準出力
    	  System.out.println(fruit);
    	}*/
    }
}
