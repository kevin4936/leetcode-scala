/*
 * @lc app=leetcode id=2 lang=scala
 *
 * [2] Add Two Numbers
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode(_x: Int = 0, _next: ListNode = null) {
 *   var next: ListNode = _next
 *   var x: Int = _x
 * }
 */
object Solution {
    def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
        
        def addNumbers(l1: ListNode, l2: ListNode, carry: Option[ListNode] = None): ListNode = {
            val rsListNode = new ListNode()
            val x1 = Option(l1).map(l => l.x).getOrElse(0) 
            val x2 = Option(l2).map(l => l.x).getOrElse(0) 
            val cy = carry.map(l => l.x).getOrElse(0) 
            val x = x1 + x2 + cy
            var next: Option[ListNode] = None
            if(x<10){
                rsListNode.x = x
            }
            else {
                rsListNode.x = x - 10
                next = Some(new ListNode(1))
            }
            val next1 = Option(l1).flatMap(l => Option(l.next))
            val next2 = Option(l2).flatMap(l => Option(l.next))
            if(!next1.isEmpty || !next2.isEmpty) {
                rsListNode.next = addNumbers(next1.getOrElse(null), next2.getOrElse(null), next)
            }
            else {
                rsListNode.next = next.getOrElse(null)
            }
            rsListNode
        }

        addNumbers(l1, l2)
    }
}
// @lc code=end

