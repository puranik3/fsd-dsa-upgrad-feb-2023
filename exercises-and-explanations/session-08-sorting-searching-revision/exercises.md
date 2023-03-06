## _Problem 1_ : Find the square root of a positive number
Given a positive number, find it square root. In the case the given number is not the perfect square, return the floor of it’s square root  

__Examples__  
Input:  x = 12  
Output: 3  
  
Input:  x = 16  
Output: 4  

## _Problem 2_  : Find the element occurring odd number of time in logarithmic time
You are provided with an array of integers with the following conditions:  
1. Every element appears an even number of times, except one element which appears an odd number of times  
2. Identical elements appear in pairs in the array and there cannot be more than two consecutive occurrences of an element  

Find the odd occurring elements in the logarithmic time.  

__Example__  
{2, 3, 2} and {2, 2, 3, 3, 3, 4, 4} both of these arrays are invalid. Why, because identical elements are either not in pair or are more than 2  

Valid input array : {2, 2, 3, 3, 2, 2, 4, 4, 3, 1, 1} , Output = 3   

## _Problem 3_ : Find the Kth smallest element  
Given an unordered array of size n . Find the kth smallest element in the given array  

__Example__  
Input: arr[] = {8, 11, 5, 4, 21, 16}  
k = 3  
Output: 8  

## _Problem 4_ : Minimum time required to produce m items
Consider n machines which produce the same type of items but at different rates i.e., machine 1 takes a1 sec to produce an item, machine 2 takes a2 sec to produce an item. Given an array that contains the time required by i(th) machine to produce an item. Considering all machines are working simultaneously, the task is to find the minimum time required to produce m items.  

__Examples__  
Input : arr[] = {1, 2, 3}, m = 11  
Output : 6  
In 6 sec, machine 1 produces 6 items, machine 2 produces 3 items, and machine 3 produces 2 items. So to produce 11 items minimum 6 sec are required.