/*
 * @lc app=leetcode id=27 lang=scala
 *
 * [27] Remove Element
 */

// @lc code=start
object Solution {
    def removeElement(nums: Array[Int], `val`: Int): Int = {
        var index = 0
        for(i <- 0 until nums.length) {
            if(nums(i) != `val`) {
                if(i!=index){
                    nums(index) = nums(i)
                }
                index = index + 1
            }
        }
        index
    }
}
// @lc code=end

