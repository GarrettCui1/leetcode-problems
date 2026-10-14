package top.cupcupcui.leetcodeproblems.binarysearch;

/**
 * 374. 猜数字大小
 *
 * @author cuiguanghao
 * @date 2026/10/14 9:07
 */
public class GuessNumberHigherOrLower {
    /**
     * https://leetcode.cn/problems/guess-number-higher-or-lower/description/?envType=study-plan-v2&envId=binary-search
     * 374. 猜数字大小
     * 简单
     * 我们正在玩猜数字游戏。猜数字游戏的规则如下：
     * 我会从 1 到 n 随机选择一个数字。 请你猜选出的是哪个数字。（我选的数字在整个游戏中保持不变）。
     * 如果你猜错了，我会告诉你，我选出的数字比你猜测的数字大了还是小了。
     * 你可以通过调用一个预先定义好的接口 int guess(int num) 来获取猜测结果，返回值一共有三种可能的情况：
     * <p>
     * -1：你猜的数字比我选出的数字大 （即 num > pick）。
     * 1：你猜的数字比我选出的数字小 （即 num < pick）。
     * 0：你猜的数字与我选出的数字相等。（即 num == pick）。
     * 返回我选出的数字。
     * <p>
     * <p>
     * 示例 1：
     * 输入：n = 10, pick = 6
     * 输出：6
     * <p>
     * 示例 2：
     * 输入：n = 1, pick = 1
     * 输出：1
     * <p>
     * 示例 3：
     * 输入：n = 2, pick = 1
     * 输出：1
     * <p>
     * 提示：
     * 1 <= n <= 231 - 1
     * 1 <= pick <= n
     * <p>
     * 相关标签
     * 二分查找 交互
     */

    int pick;

    /**
     * 思路：二分法，每次都从中间区间缩小区间范围
     * 时间复杂度：O(logn)
     * 空间复杂度：O(1)
     * 结果:
     * 优化建议：
     *
     * @param n
     * @return
     */
    public int guessNumber(int n, int pick) {
        /**
         * 我们正在玩猜数字游戏。猜数字游戏的规则如下：
         * 我会从 1 到 n 随机选择一个数字。 请你猜选出的是哪个数字。（我选的数字在整个游戏中保持不变）。
         * 如果你猜错了，我会告诉你，我选出的数字比你猜测的数字大了还是小了。
         * 你可以通过调用一个预先定义好的接口 int guess(int num) 来获取猜测结果，返回值一共有三种可能的情况：
         * -1：你猜的数字比我选出的数字大 （即 num > pick）。
         * 1：你猜的数字比我选出的数字小 （即 num < pick）。
         * 0：你猜的数字与我选出的数字相等。（即 num == pick）。
         */
        this.pick = pick;
        // 二分法，每次都从中间区间缩小区间范围
        int left = 1;
        int right = n;

        while (left <= right) {
            int currGuess = left + (right - left) / 2;
            int guessResult = guess(currGuess);
            if (guessResult == 0) {
                // 0：你猜的数字与我选出的数字相等。（即 num == pick）。
                return currGuess;
            } else if (guessResult == -1) {
                // -1：你猜的数字比我选出的数字大 （即 num > pick）。
                right = currGuess - 1;
            } else {
                // 1：你猜的数字比我选出的数字小 （即 num < pick）。
                left = currGuess + 1;
            }
        }
        return -1;
    }

    /**
     * 思路：顺序查找
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     * 结果: 超出时间限制
     * 优化建议：
     *
     * @param n
     * @return
     */
    public int guessNumberV1(int n, int pick) {
        this.pick = pick;
        for (int i = 1; i <= n; i++) {
            int guessResult = guess(i);
            if (guessResult == 0) {
                return i;
            }
        }

        return -1;
    }

    int guess(int num) {
        // 我选的数字
        if (num > pick) {
            return -1;
        } else if (num < pick) {
            return 1;
        } else {
            return 0;
        }
    }
}
