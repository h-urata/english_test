package English_Test;

import java.util.InputMismatchException;
import java.util.Scanner;

//Baseクラスの継承とAppインターフェースの実装
public class English_Test_Main extends Base implements App {
    // Scannerクラスのインスタンス化
    Scanner stdIn = new Scanner(System.in);
    // Select_Modeクラスのインスタンス化
    Select_Mode sel_mode = new Select_Mode();

    // startメソッド作成
    public void start() {
        System.out.println("英単語テストを開始します。");
        System.out.println();
        // 親クラスのdifficultyメソッドの呼出し
        super.difficulty();
        // selectメソッドの呼出し
        select();
    }

    protected void select() {
        // 整数の入力を行ってもらうため、例外処理を行う
        try {
            // 整数の入力
            Integer mode = stdIn.nextInt();
            // 整数が入力された場合、if文での判定に移行
            if (mode == 1) {
                System.out.println();
                System.out.println("初級編を開始します。");
                // Select_Modeクラスのlistメソッドの呼出し
                sel_mode.list(mode);
            } else if (mode == 2) {
                System.out.println();
                System.out.println("中級編を開始します。");
                // Select_Modeクラスのlistメソッドの呼出し
                sel_mode.list(mode);
            } else if (mode == 3) {
                System.out.println();
                System.out.println("上級編を開始します。");
                // Select_Modeクラスのlistメソッドの呼出し
                sel_mode.list(mode);
            } else {
                // 1~3以外の整数が入力されたときの処理
                System.out.println();
                System.out.println("1~3以外が入力されました。");
                System.out.print("1~3を入力してください:");
                // 再帰処理
                select();
            }
            // 整数以外が入力されたときの処理
        } catch (InputMismatchException e) {
            System.out.println("整数以外が入力されました。");
            System.out.print("整数1~3を入力してください:");
            // 再帰処理
            select();
        }
    }
}
