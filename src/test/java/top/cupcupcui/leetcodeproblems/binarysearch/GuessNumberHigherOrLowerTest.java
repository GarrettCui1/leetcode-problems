package top.cupcupcui.leetcodeproblems.binarysearch;

import org.junit.Assert;
import org.junit.Test;

public class GuessNumberHigherOrLowerTest {

    /**
     * 输入：n = 10, pick = 6
     * 输出：6
     */
    @Test
    public void test_PositiveCase0() {
        GuessNumberHigherOrLower service = new GuessNumberHigherOrLower();
        int arg1 = 10;
        int arg2 = 6;
        int expected = 6;
        int response = service.guessNumber(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：n = 1, pick = 1
     * 输出：1
     */
    @Test
    public void test_PositiveCase1() {
        GuessNumberHigherOrLower service = new GuessNumberHigherOrLower();
        int arg1 = 1;
        int arg2 = 1;
        int expected = 1;
        int response = service.guessNumber(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：n = 2, pick = 1
     * 输出：1
     */
    @Test
    public void test_PositiveCase2() {
        GuessNumberHigherOrLower service = new GuessNumberHigherOrLower();
        int arg1 = 2;
        int arg2 = 1;
        int expected = 1;
        int response = service.guessNumber(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：n = 230, pick = 230
     * 输出：230
     */
    @Test
    public void test_PositiveCase3() {
        GuessNumberHigherOrLower service = new GuessNumberHigherOrLower();
        int arg1 = 230;
        int arg2 = 230;
        int expected = 230;
        int response = service.guessNumber(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：n = 2, pick = 3
     * 输出：-1（超出题目约束，验证当前实现找不到目标时的返回值）
     */
    @Test
    public void test_PickGreaterThanN() {
        GuessNumberHigherOrLower service = new GuessNumberHigherOrLower();
        int arg1 = 2;
        int arg2 = 3;
        int expected = -1;
        int response = service.guessNumber(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：n = 2, pick = 2
     * 输出：2
     */
    @Test
    public void test_TwoNumbersUpperBoundary() {
        GuessNumberHigherOrLower service = new GuessNumberHigherOrLower();

        Assert.assertEquals(2, service.guessNumber(2, 2));
    }

    /**
     * 输入：n = Integer.MAX_VALUE, pick = 6
     * 输出：6；使用较小的目标值，避免当前顺序查找实现耗时过长。
     */
    @Test
    public void test_MaximumNWithSmallPick() {
        GuessNumberHigherOrLower service = new GuessNumberHigherOrLower();

        Assert.assertEquals(6, service.guessNumber(Integer.MAX_VALUE, 6));
    }

    /**
     * 同一实例连续调用时，每次都应使用新的目标值。
     */
    @Test
    public void test_RepeatedCallsWithDifferentPicks() {
        GuessNumberHigherOrLower service = new GuessNumberHigherOrLower();

        Assert.assertEquals(6, service.guessNumber(10, 6));
        Assert.assertEquals(1, service.guessNumber(10, 1));
        Assert.assertEquals(10, service.guessNumber(10, 10));
    }

}
