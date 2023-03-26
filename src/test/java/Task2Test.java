import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class Task2Test {


    public static Stream<Arguments> numbersSource() {
        return Stream.of(
                Arguments.of(List.of(1, 2, 10, 7, 5, 3, 6, 6, 13, 0), """
                        0 13
                        3 10
                        6 7
                        6 7
                        """),
                Arguments.of(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15), """
                        0 13
                        1 12
                        2 11
                        3 10
                        4 9
                        5 8
                        6 7
                        """),
                Arguments.of(List.of(0, 7, 1, 4, 11, 5, 5, 2, 6, 9, 10, 2, 10, 5, 12, 13, 7, 4, 8, 12, 7), """
                        0 13
                        1 12
                        2 11
                        2 11
                        4 9
                        4 9
                        5 8
                        5 8
                        5 8
                        6 7
                        """
                )
        );
    }

    @ParameterizedTest
    @MethodSource("numbersSource")
    public void test(List<Integer> integers, String expectedResults) {
        Assertions.assertThat(Task2.task2(integers)).isEqualTo(expectedResults);
    }
}