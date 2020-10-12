package mockitoTest;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import unitTest.Calculator;

@ExtendWith(MockitoExtension.class)
public class MockitoSampleTest {

    @Mock
    private Calculator calc;

    @InjectMocks
    private MockitoSample sample;

    // 全てのテストメソッドの前に実行されるよう設定する
    @BeforeEach
    void setUp() {
        // モック設定の初期化するメソッドを呼び出す
        MockitoAnnotations.initMocks(this);
    }

    @Test
    @DisplayName("getSquareResultに5を渡した時に25が表示できる")
    void test() {
        when(calc.square(5)).thenReturn(25);
        String result = sample.getSquareResult(5);

        // 3. 実行結果の実測値と期待値の検証（アサーション）を行う
        assertThat(result, is("5の二乗の結果は25"));
    }
}