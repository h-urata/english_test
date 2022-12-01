package Game;

public class Base {
    protected void difficulty() {
        System.out.println("1:初級 2:中級 3:上級");
        System.out.print("難易度を選択してください:");
    }

    protected void result(Integer correct, Integer wrong) {
        System.out.println();
        System.out.println("結果");
        System.out.println("正解数は " + correct + "、不正解数は " + wrong + " でした。");
        if (correct==10) {
            System.out.println("全問正解です!");
        }else if (wrong==10) {
            System.out.println("全問不正解です……");
            System.out.println("あなたはこの問題を解くレベルに達していません。");
        }
        System.out.println("お疲れさまでした!");
    }
}
