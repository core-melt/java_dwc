
public class Chapter07 {
    public static void main(String[] args) {
    	int kyori = 5;

    	if (kyori >= 5) {
    		System.out.println("とても近いです");
    	}
    	else if (kyori > 5 && 10 <= kyori) {
    		System.out.println("近いです");
    	}
    	else if (kyori > 10 && 15 <= kyori) {
    		System.out.println("遠いです");
    	}
    	else if (kyori > 15) {
    		System.out.println("とても遠いです");
    	}

    	String signal = "red";

        switch (signal) {
        case "red":
            System.out.println("赤信号です");
            break;
        case "yellow":
            System.out.println("黄信号です");
            break;
        case "blue":
            System.out.println("青信号です");
            break;
        default:
            System.out.println("信号の色ではありません");
        }

    }
}
