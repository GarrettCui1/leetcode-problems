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
     * 思路：矩阵按行展开后整体有序，对虚拟一维下标进行二分查找，无需创建新数组。
     * 每轮通过除法和取余，将中间下标映射到矩阵中的行、列，再读取元素进行比较。
     * 时间复杂度：O(log(m * n))，m 为行数，n 为列数；每轮 O(1)，查找范围约减半。
     * 空间复杂度：O(1)
     *
     * @param matrix 满足题目排序条件的非空矩阵
     * @param target 目标值
     * @return 目标值是否存在于矩阵中
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

        // 将矩阵看作有序的一维数组，只计算下标，不复制元素。
        int rowLength = matrix.length;
        int columnLength = matrix[0].length;
        int vMatrixLength = rowLength * columnLength;
        int left = 0;
        int right = vMatrixLength - 1;
        // 若 target 存在，它的一维下标一定在闭区间 [left, right] 中。
        // left == right 时仍有一个元素需要检查，因此使用 <=。
        while (left <= right) {
            int mid = left + (right - left) / 2;
            // 每行 columnLength 个元素：商是行号，余数是列号，二者都从 0 开始。
            int row = mid / columnLength;
            int column = mid % columnLength;
            int midValue = matrix[row][column];

            if (target == midValue) {
                return true;
            } else if (target < midValue) {
                // mid 及其右侧的元素都太大，排除后继续向左查找。
                right = mid - 1;
            } else {
                // mid 及其左侧的元素都太小，排除后继续向右查找。
                left = mid + 1;
            }
        }

        // left > right，候选区间为空，说明目标不存在。
        return false;
    }

    /**
     * 备选方案：两次二分也满足题目要求，与整体二分的时间复杂度等价。
     * 当前主方法采用整体二分，统一查找区间的含义，便于理解边界。
     * 思路：两次二分。先找行尾第一个大于等于 target 的行，再在该行查找 target。
     * 两轮都使用闭区间 [left, right]，区间非空时继续，即 left <= right。
     * 时间复杂度：O(log m + log n)，即 O(log(m * n))
     * 空间复杂度：O(1)
     * 结果:
     * 优化建议：
     *
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrixV3(int[][] matrix, int target) {
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

        // 第一轮：找行尾第一个 >= target 的行（边界查找，不是查找相等的行尾）。
        int rowLength = matrix.length;
        int columnLength = matrix[0].length;
        int left = 0;
        int right = rowLength - 1;
        // 始终保证：left 左侧的行尾都 < target；right 右侧的行尾都 >= target。
        // [left, right] 中的行尾尚未分类。
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (matrix[mid][columnLength - 1] < target) {
                // mid 及之前的整行都太小。
                left = mid + 1;
            } else {
                // mid 满足条件，但前面可能还有满足条件的行，继续向左找边界。
                // 排除的是 mid 的待分类状态，并不是断言 target 不在 mid 行。
                right = mid - 1;
            }
        }

        // 退出时 left == right + 1；left 是第一个行尾 >= target 的行号。
        // left == rowLength 表示所有行都太小，不能用它访问 matrix。
        if (left == rowLength) {
            return false;
        }
        int targetRow = left;

        // 第二轮：在候选行的闭区间 [left, right] 中查找相等的元素。
        // 若 target 存在，它一定在这个区间中；区间为空时说明不存在。
        left = 0;
        right = columnLength - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int value = matrix[targetRow][mid];
            if (value == target) {
                return true;
            } else if (value < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

    /**
     * 思路：
     * 时间复杂度：O(m + n)
     * 空间复杂度：O(1)
     * 结果:
     * 优化建议：
     *
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrixV2(int[][] matrix, int target) {
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

        // 两次线性扫描：
        //  第一个循环定位行
        //  第二个循环遍历定位列

        int targetRow = -1;

        // 辅助数组
        for (int i = 0; i < matrix.length; i++) {
            int lastOfRow = matrix[i].length - 1;
            // 每行最后一个值
            int lastOfRowValue = matrix[i][lastOfRow];
            // 该行最后一个值大于 target，则 target 在该行
            if (lastOfRowValue == target) {
                return true;
            }
            if (lastOfRowValue > target) {
                // 找到 target 所在 row，退出循环
                targetRow = i;
                break;
            }
        }

        // not matched return false
        if (targetRow == -1) {
            return false;
        }

        for (int i = 0; i < matrix[targetRow].length; i++) {
            if (matrix[targetRow][i] == target) {
                return true;
            }
        }

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
