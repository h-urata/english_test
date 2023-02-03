package English_Test;

import java.util.Random;
import java.util.Scanner;

//問題の表示等を行うクラス
//Baseクラスの継承
class Question extends Base {
    // Randomクラスのインスタンス化
    Random rand = new Random();
    // Scannerクラスのインスタンス化
    Scanner stdIn = new Scanner(System.in);

    // 問題の表示、正誤の判定を行うメソッド
    // 二次元配列を引数として受け取る
    protected void disp(String[][] word_li) {
        // 受け取った引数をword_list変数に代入する
        String[][] word_list = word_li;
        // 正解した数を数えるための変数
        Integer correct = 0;
        // 間違えた数を数えるための変数
        Integer wrong = 0;
        // 問題を10問繰り返し処理で表示、正誤の判定を行う
        for (int i = 1; i < 11; i++) {
            // 引数で受け取った配列の長さの中でランダムな数字をnum変数に受け渡す
            Integer num = rand.nextInt(word_list.length);
            // num番目のインデックスにあるインデックス0の文字(日本語)をquestion変数に代入
            String question = word_list[num][0];
            // num番目のインデックスにあるインデックス0の文字(英語)をtarget変数に代入
            String target = word_list[num][1];
            System.out.println();
            System.out.println("第" + i + "問");
            System.out.println(question + " を英語に訳しなさい");
            System.out.print("ここに入力:");
            // 入力された文字をanswer変数に代入
            String answer = stdIn.next();
            // 入力された文字と答えが同じかを判定し条件分岐を行う
            if (target.equals(answer) == true) {
                System.out.println("正解です!!");
                correct += 1;
            } else {
                System.out.println("不正解です……");
                System.out.println("正解は " + target + " でした");
                wrong += 1;
            }
        }
        // 継承した親クラスのresultメソッドを呼び出す
        super.result(correct, wrong);
    }
}
