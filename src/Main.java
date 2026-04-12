import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.comparison(m.Setting());
    }

    public int Setting() {
        System.out.println("キーボード入力してください");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println("入力された文字は「" + num + "」です");
        return num;
        /*実行コマンド
        javac -encoding UTF-8 Main.java
        java -Dfile.encoding=UTF-8 Main*/
    }

    public void comparison(int num) {
        String[] array = {"グー", "チョキ", "パー"};
        boolean a = true;
        while(a) {
            if(num > 2) {
                System.out.println("もう一度入力してください");
                System.out.println("キーボード入力してください");
                Scanner scan = new Scanner(System.in);
                num = scan.nextInt();
                System.out.println("入力された文字は「" + num + "」です");
            } else {
                a = false;
            }
        }
        System.out.println("finish");//確認用
    }
}