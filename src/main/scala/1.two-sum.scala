/*
 * @lc app=leetcode id=1 lang=scala
 *
 * [1] Two Sum
 */

// @lc code=start
object Solution {
    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
        val result = new Array[Int](2)
        var isRunning = true
        for(i <- 0 until nums.length if isRunning) {
            for(j <- (i + 1) until nums.length if isRunning) {
                if(nums(i) + nums(j) == target) {
                    isRunning = false
                    result(0) = i
                    result(1) = j
                }
            }
        }
        result
    }
}
// @lc code=end

