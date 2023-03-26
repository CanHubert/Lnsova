import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class Task1Test {

    public static Stream<Arguments> numbersSource() {
        return Stream.of(
                Arguments.of(List.of(1, 10, 20, 20, 2, 5), """
                        1 2 5 10 20
                        count: 6
                        distinct: 5
                        min: 1
                        max: 20"""),
                Arguments.of(List.of(1, 1, 1, -3, 4, 5, 6, 6 ,6, 7, 7, 8, 100), """
                        -3 1 4 5 6 7 8 100
                        count: 13
                        distinct: 8
                        min: -3
                        max: 100""")
        );
    }

    @ParameterizedTest
    @MethodSource("numbersSource")
    public void testTask1(List<Integer> integerList, String expectedResult) {
        Assertions.assertThat(Task1.task1(integerList)).isEqualTo(expectedResult);
    }
}