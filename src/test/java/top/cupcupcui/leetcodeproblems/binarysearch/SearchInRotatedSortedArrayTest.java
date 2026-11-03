package top.cupcupcui.leetcodeproblems.binarysearch;

import org.junit.Assert;
import org.junit.Test;

public class SearchInRotatedSortedArrayTest {

    /**
     * 输入：nums = [4,5,6,7,0,1,2], target = 0
     * 输出：4
     */
    @Test
    public void test_PositiveCase0() {
        SearchInRotatedSortedArray service = new SearchInRotatedSortedArray();
        int[] arg1 = {4, 5, 6, 7, 0, 1, 2};
        int arg2 = 0;
        int expected = 4;
        int response = service.search(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：nums = [4,5,6,7,0,1,2], target = 3
     * 输出：-1
     */
    @Test
    public void test_PositiveCase1() {
        SearchInRotatedSortedArray service = new SearchInRotatedSortedArray();
        int[] arg1 = {4, 5, 6, 7, 0, 1, 2};
        int arg2 = 3;
        int expected = -1;
        int response = service.search(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：nums = [1], target = 0
     * 输出：-1
     */
    @Test
    public void test_PositiveCase2() {
        SearchInRotatedSortedArray service = new SearchInRotatedSortedArray();
        int[] arg1 = {1};
        int arg2 = 0;
        int expected = -1;
        int response = service.search(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：nums = [1], target = 1
     * 输出：0
     */
    @Test
    public void test_PositiveCase3() {
        SearchInRotatedSortedArray service = new SearchInRotatedSortedArray();
        int[] arg1 = {1};
        int arg2 = 1;
        int expected = 0;
        int response = service.search(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：nums = [4,5,6,7,0,1,2], target = 4
     * 输出：0
     */
    @Test
    public void test_PositiveCase4() {
        SearchInRotatedSortedArray service = new SearchInRotatedSortedArray();
        int[] arg1 = {4, 5, 6, 7, 0, 1, 2};
        int arg2 = 4;
        int expected = 0;
        int response = service.search(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：nums = [4,5,6,7,0,1,2], target = 2
     * 输出：6
     */
    @Test
    public void test_PositiveCase5() {
        SearchInRotatedSortedArray service = new SearchInRotatedSortedArray();
        int[] arg1 = {4, 5, 6, 7, 0, 1, 2};
        int arg2 = 2;
        int expected = 6;
        int response = service.search(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：nums = [4,5,6,7,0,1,2], target = 7
     * 输出：3
     */
    @Test
    public void test_PositiveCase6() {
        SearchInRotatedSortedArray service = new SearchInRotatedSortedArray();
        int[] arg1 = {4, 5, 6, 7, 0, 1, 2};
        int arg2 = 7;
        int expected = 3;
        int response = service.search(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：nums = [3,1], target = 3
     * 输出：0
     */
    @Test
    public void test_PositiveCase7() {
        SearchInRotatedSortedArray service = new SearchInRotatedSortedArray();
        int[] arg1 = {3, 1};
        int arg2 = 3;
        int expected = 0;
        int response = service.search(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：nums = [3,1], target = 1
     * 输出：1
     */
    @Test
    public void test_PositiveCase8() {
        SearchInRotatedSortedArray service = new SearchInRotatedSortedArray();
        int[] arg1 = {3, 1};
        int arg2 = 1;
        int expected = 1;
        int response = service.search(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：nums = [3,1], target = 2
     * 输出：-1
     */
    @Test
    public void test_PositiveCase9() {
        SearchInRotatedSortedArray service = new SearchInRotatedSortedArray();
        int[] arg1 = {3, 1};
        int arg2 = 2;
        int expected = -1;
        int response = service.search(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：nums = [1,2,3,4,5], target = 4
     * 输出：3
     */
    @Test
    public void test_PositiveCase10() {
        SearchInRotatedSortedArray service = new SearchInRotatedSortedArray();
        int[] arg1 = {1, 2, 3, 4, 5};
        int arg2 = 4;
        int expected = 3;
        int response = service.search(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：nums = [1,2,3,4,5], target = 6
     * 输出：-1
     */
    @Test
    public void test_PositiveCase11() {
        SearchInRotatedSortedArray service = new SearchInRotatedSortedArray();
        int[] arg1 = {1, 2, 3, 4, 5};
        int arg2 = 6;
        int expected = -1;
        int response = service.search(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：nums = [2,3,4,5,1], target = 1
     * 输出：4
     */
    @Test
    public void test_PositiveCase12() {
        SearchInRotatedSortedArray service = new SearchInRotatedSortedArray();
        int[] arg1 = {2, 3, 4, 5, 1};
        int arg2 = 1;
        int expected = 4;
        int response = service.search(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：nums = [5,1,2,3,4], target = 2
     * 输出：2
     */
    @Test
    public void test_PositiveCase13() {
        SearchInRotatedSortedArray service = new SearchInRotatedSortedArray();
        int[] arg1 = {5, 1, 2, 3, 4};
        int arg2 = 2;
        int expected = 2;
        int response = service.search(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：nums = [0,3,8,-10,-5,-2], target = -5
     * 输出：4
     */
    @Test
    public void test_PositiveCase14() {
        SearchInRotatedSortedArray service = new SearchInRotatedSortedArray();
        int[] arg1 = {0, 3, 8, -10, -5, -2};
        int arg2 = -5;
        int expected = 4;
        int response = service.search(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：nums = [10000,-10000,-1,0], target = -10000
     * 输出：1
     */
    @Test
    public void test_PositiveCase15() {
        SearchInRotatedSortedArray service = new SearchInRotatedSortedArray();
        int[] arg1 = {10000, -10000, -1, 0};
        int arg2 = -10000;
        int expected = 1;
        int response = service.search(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：nums = [10000,-10000,-1,0], target = 10000
     * 输出：0
     */
    @Test
    public void test_PositiveCase16() {
        SearchInRotatedSortedArray service = new SearchInRotatedSortedArray();
        int[] arg1 = {10000, -10000, -1, 0};
        int arg2 = 10000;
        int expected = 0;
        int response = service.search(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

}
