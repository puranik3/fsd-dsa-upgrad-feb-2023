## _Problem 1_

Given a maze in the form of the binary rectangular matrix, find the shortest path’s length in a maze from a given source to a given destination.  

The path can only be constructed out of cells having value 1, and at any given moment, we can only move one step in one of the four directions (top, right, bottom, left).  

__Examples__  
For example, consider the following binary matrix. If source = (0, 0) and destination = (7, 5), the shortest path from source to destination has length 12 (a move form one cell to the next is an edge, so 13 cells means path size is 12).
<pre>
[ <b style="color: goldenrod;">1</b>  <b style="color: goldenrod;">1</b>  <b style="color: goldenrod;">1</b>  1  1  0  0  1  1  1 ]
[ 0  1  <b style="color: goldenrod;">1</b>  1  1  1  0  1  0  1 ]
[ 0  0  <b style="color: goldenrod;">1</b>  0  1  1  1  0  0  1 ]
[ 1  0  <b style="color: goldenrod;">1</b>  <b style="color: goldenrod;">1</b>  1  0  1  1  0  1 ]
[ 0  0  0  <b style="color: goldenrod;">1</b>  0  0  0  1  0  1 ]
[ 1  0  1  <b style="color: goldenrod;">1</b>  <b style="color: goldenrod;">1</b>  0  0  1  1  0 ]
[ 0  0  0  0  <b style="color: goldenrod;">1</b>  0  0  1  0  1 ]
[ 0  1  1  1  <b style="color: goldenrod;">1</b>  <b style="color: goldenrod;">1</b>  1  1  0  0 ]
[ 1  1  1  1  1  0  0  1  1  1 ]
[ 0  0  1  0  0  1  1  0  0  1 ]
</pre>

__Hints__
- Create an empty queue and enqueue the source cell having a distance 0 from the source (itself) and mark it as visited.
- Loop till queue is empty.
  - Dequeue the front node.
  - If the popped node is the destination node, then return its distance.
  - Otherwise, for each of four adjacent cells of the current cell, enqueue each valid cell with +1 distance and mark them as visited.
- If all the queue nodes are processed, and the destination is not reached, then return false.

__References__
- https://www.techiedelight.com/lee-algorithm-shortest-path-in-a-maze/