public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");

    }
}

class Main {
  public static void main(String[] args) {
    hello();
  }
  
  public static void hello() {
    // "Hello World"を、"Hello Java"に書き換えてください
    System.out.println("Hello Java");
  }
}

class Main {
  public static void main(String[] args) {
    // 引数に「Kate Jones」を渡してください
    printData("Kate Jones");
    
    // 引数に「John Christopher Smith」を渡してください
    printData("John Christopher Smith");
    
  }

  // 引数を受け取るようにしてください
  public static void printData(String name) {
    // 「私の名前は◯◯です」と出力されるように書き換えてください
    System.out.println("私の名前は" + name + "です");

  }
    public static void main(String[] args) {
    // それぞれ年齢に関する引数を追加してください
    printData("Kate Jones",27);
    printData("John Christopher Smith",65);
  }

  // 年齢に関する引数を受け取れるようにしてください
  public static void printData(String name, int age) {
    System.out.println("私の名前は" + name + "です");
    // 「年齢は◯◯歳です」と出力してください
    System.out.println("年齢は" + age + "歳です");

  }
  
public class Main {
	public static void main(String[] args) {
		System.out.println("hello, world!");
		int x=5;
		int y=10;
		int z=x+y;
		String message ="x+yは"+z;
        System.out.println(message);
    
        int a;
        a = 100;
        a++;
        System.out.println(a);

        System.out.println("ようこそ占いの館へ");
        System.out.println("あなたの名前を表示してください");
        String name = new java.util.scanner(System.in).nextLine();
        System.out.println("貴方の年齢を入力してください");
        String ageString = new java.util.scanner(System.in).nextLine();
        //Int age = (int) ageString;
        int age = Interger.parseInt(ageString);
        int fortune = new java.util.Random().nextInt(3);
        fortune++;
        System.out.println("占いの結果が出ましさんた ！");
        System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");

        //練習問題３
        int isHungry = 0;
        String food = "パスタ";
        System.out.println("こんにちは");
        if (isHungry==0){
          System.out.println("おなかがいっぱいです");
        }else{
          System.out.println(food +"をいただきます");
        }

	}
}




}