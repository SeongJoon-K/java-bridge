package bridge;

public class Validator {

    /*
    - 다리의 길이는 3 ~ 20 의 숫자임
    */

    private static final String SIZE_INPUT_TYPE_ERROR = "[ERROR] 다리 길이는 정수형 입력만 가능합니다.";
    private static final String SIZE_RANGE_ERROR = "[ERROR] 다리의 길이는 3 이상 20 이하의 숫자만 입력할 수 있습니다.";
    private static final String MOVING_WORD_INPUT_ERROR = "[ERROR] 위 칸('U'), 아래 칸('D')만 입력할 수 있습니다.";
    private static final String SIZE_INPUT_TYPE_CHECK = "[0-9]+";
    private static final int MIN_BRIDGE_SIZE = 3;
    private static final int MAX_BRIDGE_SIZE = 20;

    public static void validateInputBridgeSizeType(String size) {
        if (!size.matches(SIZE_INPUT_TYPE_CHECK)) {
            throw new IllegalArgumentException(SIZE_INPUT_TYPE_ERROR);
        }
    }

    public static void validateInputBridgeSizeRange(String size) {
        int bridgeSize = Integer.parseInt(size);
        if(bridgeSize < MIN_BRIDGE_SIZE || bridgeSize > MAX_BRIDGE_SIZE) {
            throw new IllegalArgumentException(SIZE_RANGE_ERROR);
        }
    }
}