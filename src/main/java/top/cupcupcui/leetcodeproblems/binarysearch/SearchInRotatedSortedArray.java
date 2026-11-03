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
     * 时间复杂度：O()
     * 空间复杂度：O()
     *
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {

        return -1;
    }

}
