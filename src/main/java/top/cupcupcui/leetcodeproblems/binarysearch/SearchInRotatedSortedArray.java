package top.cupcupcui.leetcodeproblems.binarysearch;

/**
 * 33. 搜索旋转排序数组
 *
 * @author cuiguanghao
 * @date 2026/11/2 9:15
 */
public class SearchInRotatedSortedArray {
    /**
     * https://leetcode.cn/problems/search-in-rotated-sorted-array/description/?envType=study-plan-v2&envId=binary-search
     * 33. 搜索旋转排序数组
     * 中等
     *
     * 整数数组 nums 按**升序排列**，数组中的值 **互不相同** 。
     * 在传递给函数之前，nums 在预先未知的某个下标 k（0 <= k < nums.length）上进行了 向左旋转，
     * 使数组变为 [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]（下标 从 0 开始 计数）。
     * 例如， [0,1,2,4,5,6,7] 下标 3 上向左旋转后可能变为 [4,5,6,7,0,1,2] 。
     * 给你 旋转后 的数组 nums 和一个整数 target ，如果 nums 中存在这个目标值 target ，则返回它的下标，否则返回 -1 。
     *
     * 你必须设计一个时间复杂度为 O(log n) 的算法解决此问题。
     *
     * 示例 1：
     * 输入：nums = [4,5,6,7,0,1,2], target = 0
     * 输出：4
     *
     * 示例 2：
     * 输入：nums = [4,5,6,7,0,1,2], target = 3
     * 输出：-1
     *
     * 示例 3：
     * 输入：nums = [1], target = 0
     * 输出：-1
     *
     * 提示：
     * 1 <= nums.length <= 5000
     * -104 <= nums[i] <= 104
     * nums 中的**每个值都 独一无二**
     * 题目数据保证 nums 在预先未知的某个下标上进行了旋转
     * -104 <= target <= 104
     *
     * 相关标签
     * 数组 二分查找
     */

    /**
     * 两个关键问题：1.查找旋转点；2.从有序数组（升序排列，元素互不相同）中查找元素
     * 思路：
     * 1.暴力解法，遍历数组，查找元素，时间复杂度O(n)
     * 2.先找到旋转点坐标，把数组分为左右两部分，分别在两部分做二分法
     * 3.先找到旋转点坐标，把数组还原为旋转前的数组，二分法求解
     */


    /**
     * 思路：
     * 确定一个中间点 mid，在[left, mid]区间或[mid+1, right]区间，至少有一个区间是有序的，如果target落在有序区间，则在有序区间二分查找；如果target落在无序区间，则重复上一步；
     * 如果[left, mid]区间有序、[mid+1, right]区间无序，
     *  如果target在[left, mid]有序区间内，则二分查找；
     *  如果target在[mid+1, right]无序区间内，则重复上一步骤；
     * 退出条件：left<=right
     * 时间复杂度：O()
     * 空间复杂度：O()
     *
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        /**
         * 输入：nums = [4,5,6,7,0,1,2], target = 0
         * 输出：4
         */

        return -1;
    }

    /**
     * 思路：
     * 先找到旋转点坐标，把数组分为左右两部分，在元素所在半区间做二分遍历搜索
     * 放弃这个思路，这个思路不够好，复杂度高，不容易理解，根据codex提示，更换另一个思路解法
     * 时间复杂度：O()
     * 空间复杂度：O()
     *
     * @param nums
     * @param target
     * @return
     */
    public int searchV3(int[] nums, int target) {
        /**
         * 输入：nums = [4,5,6,7,0,1,2], target = 0
         * 输出：4
         */

        if (nums.length == 1) {
            if (nums[0] == target) {
                return 0;
            } else {
                return -1;
            }
        }

        int leftMaxIndex = -1;
        // 先找到旋转点坐标，即在无序数组中找数组中的最小值（或最大值）
        // 根据 ChatGPT 的提示：
        //  二分法，在[left, right]区间内,比较选中的中间值 midV 和区间最右侧值 rightV，
        //  如果 midV > rightV,在[mid, right]区间中继续二分查找
        //  如果 midV < rightV,在[left, mid]区间中继续二分查找
        //  如果 left <= right,continue
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == nums[right]) {
                left = mid;
            } else if (nums[mid] > nums[right]) {
                left = mid;
            } else {
                right = mid;
            }
        }

        leftMaxIndex = left;

        if (nums[0] < nums[nums.length - 1]) {
            // 原始数组按升序排列
            leftMaxIndex = -1;
        }


        // 左侧最大值下标，遍历所有元素，时间复杂度O(n)
        // TODO: refactor me，优化为时间复杂度O(logn)
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                leftMaxIndex = i;
            }
        }

        // int left;
        // int right;
        // if (leftMaxIndex == -1) {
        //     left = 0;
        //     right = nums.length - 1;
        // } else if (nums[0] <= target && target <= nums[leftMaxIndex]) {
        //     // 在 [0,leftMaxIndex] 区间二分查找
        //     left = 0;
        //     right = leftMaxIndex;
        // } else {
        //     // 在 [leftMaxIndex,nums.length-1] 区间二分查找
        //     left = leftMaxIndex + 1;
        //     right = nums.length - 1;
        // }
        //
        // // 在 left,right 区间内二分查找，时间复杂度O(n)
        // for (int i = left; i <= right; i++) {
        //     if (nums[i] == target) {
        //         return i;
        //     }
        // }

        return -1;
    }


    /**
     * 思路：
     * 先找到旋转点坐标，把数组分为左右两部分，在元素所在半区间做遍历搜索
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     *
     * @param nums
     * @param target
     * @return
     */
    public int searchV2(int[] nums, int target) {
        /**
         * 输入：nums = [4,5,6,7,0,1,2], target = 0
         * 输出：4
         */

        if (nums.length == 1) {
            if (nums[0] == target) {
                return 0;
            } else {
                return -1;
            }
        }

        // 左侧最大值下标，时间复杂度O(n)
        int leftMaxIndex = -1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                leftMaxIndex = i;
            }
        }

        int left;
        int right;
        if (leftMaxIndex == -1) {
            left = 0;
            right = nums.length - 1;
        } else if (nums[0] <= target && target <= nums[leftMaxIndex]) {
            // 在 [0,leftMaxIndex] 区间遍历搜索
            left = 0;
            right = leftMaxIndex;
        } else {
            // 在 [leftMaxIndex,nums.length-1] 区间遍历搜索
            left = leftMaxIndex + 1;
            right = nums.length - 1;
        }

        // 在 left,right 区间内遍历搜索，时间复杂度O(n)
        for (int i = left; i <= right; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        return -1;
    }

    /**
     * 思路：
     * 1.暴力解法，遍历数组，查找元素，时间复杂度O(n)
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     *
     * @param nums
     * @param target
     * @return
     */
    public int searchV1(int[] nums, int target) {
        /**
         * 输入：nums = [4,5,6,7,0,1,2], target = 0
         * 输出：4
         */
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        return -1;
    }

}
