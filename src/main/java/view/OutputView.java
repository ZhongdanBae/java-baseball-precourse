package view;

public class OutputView {
    public void printInputGuide() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    public void printResult(String msg) {
        System.out.println(msg);
    }

    public void printGameEnd() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 시마이");
    }

    public void printRestartGuide() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    public void printError(String msg) {
        System.out.println("[ERROR] " + msg);
    }
}
