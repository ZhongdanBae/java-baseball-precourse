package model;

import java.util.ArrayList;
import java.util.List;

public class BaseballNumber {
    private final List<Integer> numbers;

    public BaseballNumber(List<Integer> numbers){
        this.numbers = new ArrayList<>(numbers);
        validateNumbers();
    }

    public BaseballNumber(String input){
        this.numbers = parse(input);
        validateNumbers();
    }

    public boolean isValid(){
        if(numbers.size() != 3) return false;
        if(!isRangeValid()) return false;
        if(hasDuplicate()) return false;
        return true;
    }

    public List<Integer> getNumbers(){
        return new ArrayList<>(numbers);
    }

    private List<Integer> parse(String input){
        if(input == null) throw new IllegalArgumentException("입력값이 비어 있습니다.");
        if(input.length() != 3) throw new IllegalArgumentException("3자리 숫자를 입력해야 합니다.");

        List<Integer> parsed = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if(!Character.isDigit(ch)) throw new IllegalArgumentException("숫자만 입력해야 합니다.");
            parsed.add(ch - '0');
        }
        return parsed;
    }

    private void validateNumbers(){
        if(isValid()) return;
        throw new IllegalArgumentException("1~9의 서로 다른 3자리 숫자를 입력해야 합니다.");
    }

    private boolean isRangeValid(){
        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if(number < 1 || number > 9) return false;
        }
        return true;
    }

    private boolean hasDuplicate(){
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if(numbers.get(i).equals(numbers.get(j))) return true;
            }
        }
        return false;
    }

}
