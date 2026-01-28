package model;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class BaseballNumber {
    private final List<Integer> numbers;

    public BaseballNumber(List<Integer> numbers){
        this.numbers = numbers;
    }

    public boolean isValid(){
        if(numbers.get(0) < 0 || numbers.get(0) >= 10) return false;
        if(numbers.get(1) < 0 || numbers.get(1) >= 10) return false;
        if(numbers.get(2) < 0 || numbers.get(2) >= 10) return false;

        if(numbers.get(0).equals(numbers.get(1)) || numbers.get(1).equals(numbers.get(2)) || numbers.get(0).equals(numbers.get(2))) return false;

        return true;
    }


}
