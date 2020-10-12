package mockitoTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import unitTest.Calculator;

// 拡張機能を追加
@ExtendWith(MockitoExtension.class)
class MockitoSampleTest {

    // モック化するクラスをフィールドに追加
    @Mock
    private Calculator calc;

    // テスト対象クラス（＝モックを利用するクラス）をフィールドに追加
    @InjectMocks
    private MockitoSample sample;

    @Test
    void test() {
        fail("まだ実装されていません");
    }
}