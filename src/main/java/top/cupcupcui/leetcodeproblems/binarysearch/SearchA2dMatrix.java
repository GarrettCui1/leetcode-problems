package top.cupcupcui.leetcodeproblems.binarysearch;

/**
 * 74. 搜索二维矩阵
 *
 * @author cuiguanghao
 * @date 2026/10/20 9:00
 */
public class SearchA2dMatrix {
    /**
     * https://leetcode.cn/problems/search-a-2d-matrix/description/?envType=study-plan-v2&envId=binary-search
     * 74. 搜索二维矩阵
     * 中等
     * 给你一个满足下述两条属性的 m x n 整数矩阵：
     * 每行中的整数从左到右按非严格递增顺序排列。
     * 每行的第一个整数大于前一行的最后一个整数。
     * 给你一个整数 target ，如果 target 在矩阵中，返回 true ；否则，返回 false 。
     *
     * 你必须编写一个时间复杂度为 O(log(m * n)) 的解决方案。
     *
     * 示例 1：
     * 输入：matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
     * 输出：true
     *
     * 示例 2：
     * 输入：matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
     * 输出：false
     *
     * 提示：
     * m == matrix.length
     * n == matrix[i].length
     * 1 <= m, n <= 100
     * -104 <= matrix[i][j], target <= 104
     *
     * 相关标签
     * 数组 二分查找 矩阵
     */


    /**
     * 思路：
     * 时间复杂度：O()
     * 空间复杂度：O()
     * 结果:
     * 优化建议：
     *
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        /**
         * 给你一个满足下述两条属性的 m x n 整数矩阵：
         * 每行中的整数从左到右按非严格递增顺序排列。
         * 每行的第一个整数大于前一行的最后一个整数。
         * 给你一个整数 target ，如果 target 在矩阵中，返回 true ；否则，返回 false 。
         *
         * 你必须编写一个时间复杂度为 O(log(m * n)) 的解决方案。
         *
         * 示例 1：
         * 输入：matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
         * 输出：true
         */


        return false;
    }

    /**
     * 思路：暴力解法：遍历二维数组所有元素
     * 时间复杂度：O(m * n)
     * 空间复杂度：O(1)
     * 结果:
     * 优化建议：
     *
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrixV1(int[][] matrix, int target) {
        /**
         * 给你一个满足下述两条属性的 m x n 整数矩阵：
         * 每行中的整数从左到右按非严格递增顺序排列。
         * 每行的第一个整数大于前一行的最后一个整数。
         * 给你一个整数 target ，如果 target 在矩阵中，返回 true ；否则，返回 false 。
         *
         * 你必须编写一个时间复杂度为 O(log(m * n)) 的解决方案。
         *
         * 示例 1：
         * 输入：matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
         * 输出：true
         */

        // matrix.length 行数
        // matrix[i].length 第i行列数


        // 暴力解法：遍历二维数组所有元素
        // 遍历所有行
        for (int i = 0; i < matrix.length; i++) {
            // 遍历该行所有元素
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }

        return false;
    }
}
