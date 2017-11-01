package hansung.designpatterns.templatemethod.barista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by B100 on 2017-11-01.
 */
public class DutchCoffeeWithHook extends CaffeineBeverageWithHook{
    public void brew() {
        System.out.println("커피 추출 후 하루이틀 저온에서 숙성");
    }//더치 커피에 맞는 내용 추가
    public void addCondiments() {
        System.out.println("Adding Ice");
    }//더치 커피에 맞는 내용 추가

    public boolean customerWantsCondiments() {
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean dutch() {//더치 커피일때만 참값을 리턴 하도록 오버라이딩
        return true;
    }

    private String getUserInput() {
        String answer = null;
        System.out.print("Would you like ice with your coffee (y/n)? ");// 아이스 추가 여부 질문

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO error trying to read your answer");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
