import java.util.Scanner;
import java.util.Random;
class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.comparison(m.Setting());
    }

    public int Setting() {
        System.out.println("0:グー 1:チョキ 3:パー");
        System.out.println("いずれかの数字を入力してください")
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println("入力された文字は「" + array[num] + "」です。");
        return num;
        /*実行コマンド
        javac -encoding UTF-8 src/Main.java
        java -Dfile.encoding=UTF-8 src/Main.java*/
    }

    public void comparison(int num) {
        String[] array = {"グー", "チョキ", "パー"};
        boolean a = true;
        while(a) {
            if(num > 2) {
                System.out.println("もう一度入力してください");
                num = Setting();
            } else {
                a = false;
            }
        }
        System.out.println("finish");//確認用
        Random random = new Random();
        int number = random.nextInt(3);
        System.out.println(number);
        if (array[number] == array[num]) {
            System.out.println("あいこ");
        } else if(number > num) {
            if(array[number] == "パー" && array[num] == "チョキ") {
                System.out.println("あなたの勝ちです。");
            } else if(array[number] == "パー" && array[num] == "グー") {
                System.out.println("あなたの負けです。");
            } else if(array[number] == "チョキ" && array[num] == "グー") {
                System.out.println("あなたの勝ちです。");
            }
        } else if(number < num) {
            if(array[number] == "チョキ" && array[num] == "パー") {
                System.out.println("あなたの負けです。");
            } else if(array[number] == "グー" && array[num] == "パー") {
                System.out.println("あなたの勝ちです。");
            } else if(array[number] == "グー" && array[num] == "チョキ"){
                System.out.println("あなたの負けです。");
            }
        }
    }
}