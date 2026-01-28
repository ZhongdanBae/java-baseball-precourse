package model;

import model.BaseballNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberGenerator {

    public BaseballNumber generate(){
        List<Integer> digits = IntStream.rangeClosed(1, 9)
                .boxed()
                .collect(Collectors.toList());
        Collections.shuffle(digits);

        return new BaseballNumber(digits);
    }
}
