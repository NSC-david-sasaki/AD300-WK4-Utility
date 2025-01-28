package org.example;

public class TestMathUtils {
    public boolean testSuite() {
        Double testDivZero = MathUtils.divideInt(1, 0);
        assert (testDivZero == Double.NaN);

        int testAdd = MathUtils.addInt(1, 0);
        assert (testAdd == 1);

        int testSubtract = MathUtils.subtractInt(1, 1);
        assert (testSubtract == 0);

        int testMultiply = MathUtils.multiplyInt(1, 10);
        assert (testMultiply == 10);

        Double testDivide = MathUtils.divideInt(100, 10);
        assert (testDivide == 10);

        return true;
    }
}
