package Game;

class Select_Mode {
    Question question = new Question();

    protected void list(Integer mode) {
        if (mode == 1) {
            question.disp(select_mode_1());
        } else if (mode == 2) {
            question.disp(select_mode_2());
        } else if (mode == 3){
            question.disp(select_mode_3());
        }
    }

    private String[][] select_mode_1() {
        String[][] array = {
                { "猫", "cat" },
                { "犬", "dog" },
        };
        return array;
    }

    private String[][] select_mode_2() {
        String[][] array = {
                { "猫", "cat" },
                { "犬", "dog" },
        };
        //System.out.println(Arrays.deepToString(array));
        return array;
    }

    private String[][] select_mode_3() {
        String[][] array = {
                { "猫", "cat" },
                { "犬", "dog" },
        };
        //System.out.println(Arrays.deepToString(array));
        return array;
    }
}
