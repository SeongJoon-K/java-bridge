package bridge.view;

/**
 * 사용자에게 게임 진행 상황과 결과를 출력하는 역할을 한다.
 */
public class OutputView {
    private static final String MOVING_SELECT_MESSAGE = "이동할 칸을 선택해주세요. (위: U, 아래: D)";
    private static final String GAME_RETRY_MESSAGE = "게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)";
    private static final String GAME_RESULT_MESSAGE = "최종 게임 결과";

    /**
     * 현재까지 이동한 다리의 상태를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public static void printMap(StringBuilder upSide, StringBuilder downSide) {
        System.out.println(upSide);
        System.out.println(downSide);
        System.out.println();
    }
}
