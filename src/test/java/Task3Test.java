import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Task3Test {


    public static Stream<Arguments> connections() {
        return Stream.of(
                Arguments.of("""
                        4
                        1 2
                        2 3
                        5 6
                        6 7
                        """, 2),
                Arguments.of("""
                        5
                        1 2
                        2 3
                        10 11
                        11 12
                        14 15
                        """, 3),
                Arguments.of("""
                        5
                        1 2
                        3 4
                        5 6
                        7 8
                        9 10
                        """, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("connections")
    public void test(String connectionsString, int expectedConnections) {
        Assertions.assertThat(Task3.task3(connectionsString)).isEqualTo(expectedConnections);
    }
}