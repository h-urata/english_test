package Game;

import java.util.InputMismatchException;
import java.util.Scanner;

public class English_Test extends Base implements App {
    Scanner stdIn = new Scanner(System.in);
    Select_Mode sel_mode = new Select_Mode();

    public void start() {
        System.out.println("英単語テストを開始します。");
        System.out.println();
        super.difficulty();
        select();
    }

    protected void select() {
        try {
            Integer mode = stdIn.nextInt();
            if (mode == 1) {
                System.out.println();
                System.out.println("初級編を開始します。");
                sel_mode.list(mode);
            } else if (mode == 2) {
                System.out.println();
                System.out.println("中級編を開始します。");
                sel_mode.list(mode);
            } else if (mode == 3) {
                System.out.println();
                System.out.println("上級編を開始します。");
                sel_mode.list(mode);
            } else {
                System.out.println();
                System.out.println("1~3以外が入力されました。");
                System.out.print("1~3を入力してください:");
                select();
            }
        } catch (InputMismatchException e) {
            System.out.println("1~3以外が入力されました。");
            System.out.print("1~3を入力してください:");
            select();
        }
    }
}
