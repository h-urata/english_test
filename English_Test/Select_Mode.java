package English_Test;

//難易度(モード)の選択をするためのクラス
class Select_Mode {
    // Questionクラスのインスタンス化
    Question question = new Question();

    // 選択された難易度を基に条件分岐を行う
    protected void list(Integer mode) {
        if (mode == 1) {
            // Questionクラスのdispメソッドの飛び出し
            // 引数として下記のselect_mode_1メソッドを渡す
            question.disp(select_mode_1());
        } else if (mode == 2) {
            question.disp(select_mode_2());
        } else if (mode == 3) {
            question.disp(select_mode_3());
        }
    }

    // 二次元配列を定義し、作成した二次元配列を戻り値として渡すメソッド
    private String[][] select_mode_1() {
        String[][] array = {
                { "猫", "cat" },
                { "犬", "dog" },
                { "頼む、聞く", "ask" },
                { "賭ける", "bet" },
                { "壊す", "break" },
                { "料理する", "cook" },
                { "コピーする", "copy" },
                { "経費、コスト", "cost" },
                { "泣く", "cry" },
                { "切る", "cut" },
        };
        return array;
    }

    private String[][] select_mode_2() {
        String[][] array = {
                { "猫", "cat" },
                { "犬", "dog" },
                { "頼む、聞く", "ask" },
                { "賭ける", "bet" },
                { "壊す", "break" },
                { "料理する", "cook" },
                { "コピーする", "copy" },
                { "経費、コスト", "cost" },
                { "泣く", "cry" },
                { "切る", "cut" },
        };
        return array;
    }

    private String[][] select_mode_3() {
        String[][] array = {
                { "猫", "cat" },
                { "犬", "dog" },
                { "頼む、聞く", "ask" },
                { "賭ける", "bet" },
                { "壊す", "break" },
                { "料理する", "cook" },
                { "コピーする", "copy" },
                { "経費、コスト", "cost" },
                { "泣く", "cry" },
                { "切る", "cut" },
        };
        return array;
    }
}
