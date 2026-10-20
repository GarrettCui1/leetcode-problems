package top.cupcupcui.leetcodeproblems.binarysearch;

import org.junit.Assert;
import org.junit.Test;

public class SearchA2dMatrixTest {

    /**
     * 输入：matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
     * 输出：true
     */
    @Test
    public void test_PositiveCase0() {
        SearchA2dMatrix service = new SearchA2dMatrix();
        int[][] arg1 = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int arg2 = 3;
        boolean expected = true;
        boolean response = service.searchMatrix(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
     * 输出：false
     */
    @Test
    public void test_PositiveCase1() {
        SearchA2dMatrix service = new SearchA2dMatrix();
        int[][] arg1 = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int arg2 = 13;
        boolean expected = false;
        boolean response = service.searchMatrix(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：matrix = [[1]], target = 1
     * 输出：true
     */
    @Test
    public void test_PositiveCase2() {
        SearchA2dMatrix service = new SearchA2dMatrix();
        int[][] arg1 = {{1}};
        int arg2 = 1;
        boolean expected = true;
        boolean response = service.searchMatrix(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：matrix = [[1]], target = 0
     * 输出：false
     */
    @Test
    public void test_PositiveCase3() {
        SearchA2dMatrix service = new SearchA2dMatrix();
        int[][] arg1 = {{1}};
        int arg2 = 0;
        boolean expected = false;
        boolean response = service.searchMatrix(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：matrix = [[1,3,5,7]], target = 7
     * 输出：true
     */
    @Test
    public void test_PositiveCase4() {
        SearchA2dMatrix service = new SearchA2dMatrix();
        int[][] arg1 = {{1, 3, 5, 7}};
        int arg2 = 7;
        boolean expected = true;
        boolean response = service.searchMatrix(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：matrix = [[1,3,5,7]], target = 4
     * 输出：false
     */
    @Test
    public void test_PositiveCase5() {
        SearchA2dMatrix service = new SearchA2dMatrix();
        int[][] arg1 = {{1, 3, 5, 7}};
        int arg2 = 4;
        boolean expected = false;
        boolean response = service.searchMatrix(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：matrix = [[1],[3],[5]], target = 3
     * 输出：true
     */
    @Test
    public void test_PositiveCase6() {
        SearchA2dMatrix service = new SearchA2dMatrix();
        int[][] arg1 = {{1}, {3}, {5}};
        int arg2 = 3;
        boolean expected = true;
        boolean response = service.searchMatrix(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：matrix = [[1],[3],[5]], target = 4
     * 输出：false
     */
    @Test
    public void test_PositiveCase7() {
        SearchA2dMatrix service = new SearchA2dMatrix();
        int[][] arg1 = {{1}, {3}, {5}};
        int arg2 = 4;
        boolean expected = false;
        boolean response = service.searchMatrix(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：matrix = [[1,3,5],[10,11,16]], target = 1
     * 输出：true
     */
    @Test
    public void test_PositiveCase8() {
        SearchA2dMatrix service = new SearchA2dMatrix();
        int[][] arg1 = {{1, 3, 5}, {10, 11, 16}};
        int arg2 = 1;
        boolean expected = true;
        boolean response = service.searchMatrix(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：matrix = [[1,3,5],[10,11,16]], target = 16
     * 输出：true
     */
    @Test
    public void test_PositiveCase9() {
        SearchA2dMatrix service = new SearchA2dMatrix();
        int[][] arg1 = {{1, 3, 5}, {10, 11, 16}};
        int arg2 = 16;
        boolean expected = true;
        boolean response = service.searchMatrix(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：matrix = [[1,3,5],[10,11,16]], target = 10
     * 输出：true
     */
    @Test
    public void test_PositiveCase10() {
        SearchA2dMatrix service = new SearchA2dMatrix();
        int[][] arg1 = {{1, 3, 5}, {10, 11, 16}};
        int arg2 = 10;
        boolean expected = true;
        boolean response = service.searchMatrix(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：matrix = [[1,3,5],[10,11,16]], target = 7
     * 输出：false
     */
    @Test
    public void test_PositiveCase11() {
        SearchA2dMatrix service = new SearchA2dMatrix();
        int[][] arg1 = {{1, 3, 5}, {10, 11, 16}};
        int arg2 = 7;
        boolean expected = false;
        boolean response = service.searchMatrix(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：matrix = [[1,3,5],[10,11,16]], target = 0
     * 输出：false
     */
    @Test
    public void test_PositiveCase12() {
        SearchA2dMatrix service = new SearchA2dMatrix();
        int[][] arg1 = {{1, 3, 5}, {10, 11, 16}};
        int arg2 = 0;
        boolean expected = false;
        boolean response = service.searchMatrix(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：matrix = [[1,3,5],[10,11,16]], target = 17
     * 输出：false
     */
    @Test
    public void test_PositiveCase13() {
        SearchA2dMatrix service = new SearchA2dMatrix();
        int[][] arg1 = {{1, 3, 5}, {10, 11, 16}};
        int arg2 = 17;
        boolean expected = false;
        boolean response = service.searchMatrix(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：matrix = [[-10000,-5,-5],[0,0,10000]], target = -5
     * 输出：true
     */
    @Test
    public void test_PositiveCase14() {
        SearchA2dMatrix service = new SearchA2dMatrix();
        int[][] arg1 = {{-10000, -5, -5}, {0, 0, 10000}};
        int arg2 = -5;
        boolean expected = true;
        boolean response = service.searchMatrix(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：matrix = [[-10000,-5,-5],[0,0,10000]], target = 0
     * 输出：true
     */
    @Test
    public void test_PositiveCase15() {
        SearchA2dMatrix service = new SearchA2dMatrix();
        int[][] arg1 = {{-10000, -5, -5}, {0, 0, 10000}};
        int arg2 = 0;
        boolean expected = true;
        boolean response = service.searchMatrix(arg1, arg2);

        Assert.assertEquals(expected, response);
    }
}
