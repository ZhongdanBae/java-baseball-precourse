package model;

public class GameResult {
    private final int strike;
    private final int ball;

    public GameResult(int strike, int ball){
        this.strike = strike;
        this.ball = ball;
    }

    public int getStrike(){
        return strike;
    }

    public int getBall(){
        return ball;
    }

    public boolean isThreeStrike(){
        return strike == 3;
    }

    public String getMessage(){
        if(strike == 0 && ball == 0) return "낫싱";
        if(strike == 0) return ball + "볼";
        if(ball == 0) return strike + "스트라이크";
        return strike + "스트라이크 " + ball + "볼";
    }
}
