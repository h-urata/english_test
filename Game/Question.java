package Game;

import java.util.Random;
import java.util.Scanner;

public class Question {
    Random rand = new Random();
    Scanner stdIn = new Scanner(System.in);

    public void disp(String[][] word_li) {
        String[][] word_list = word_li;
        Integer correct = 0;
        Integer wrong = 0;
        for (int i = 1; i < 11; i++) {
            Integer num = rand.nextInt(word_list.length);
            String question = word_list[num][0];
            String target = word_list[num][1];
            System.out.println();
            System.out.println("第" + i + "問");
            System.out.println(question + " を英語に訳しなさい");
            System.out.print("ここに入力:");
            String answer = stdIn.next();
            if (target.equals(answer) == true) {
                System.out.println("正解です!!");
                correct += 1;
            } else {
                System.out.println("不正解です……");
                System.out.println("正解は " + target + " でした");
                wrong += 1;
            }
        }
    }
}
