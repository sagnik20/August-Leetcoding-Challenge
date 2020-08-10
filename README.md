# August-Leetcoding-Challenge

[![Maintenance](https://img.shields.io/badge/Maintained%3F-yes-green.svg)](https://github.com/sagnik20/August-Leetcoding-Challenge/graphs/commit-activity) [![Ask Me Anything !](https://img.shields.io/badge/Ask%20me-anything-1abc9c.svg)](https://GitHub.com/sagnik20/ama) [![made-for-LeetCode](https://img.shields.io/badge/Made%20for-LeetCode-1f425f.svg)](https://leetcode.com/) [![GitHub issues](https://img.shields.io/github/issues/sagnik20/August-Leetcoding-Challenge)](https://github.com/sagnik20/August-Leetcoding-Challenge/issues)
[![GitHub forks](https://img.shields.io/github/forks/sagnik20/August-Leetcoding-Challenge?style=social)](https://github.com/sagnik20/August-Leetcoding-Challenge/network) [![GitHub stars](https://img.shields.io/github/stars/sagnik20/August-Leetcoding-Challenge?style=social)](https://github.com/sagnik20/August-Leetcoding-Challenge/stargazers) [![Open Source Love svg1](https://badges.frapsoft.com/os/v1/open-source.svg?v=103)](https://github.com/ellerbrock/open-source-badges/)

I have started from 1st August in this Challenge. And this repository contains my solutions to the challenge. Only the `exact solution`. If you want to improve the solutions, Please open a `Issue first`.

## :rocket: Get Started

### Questions : 

#### Day-01 : 
**Detect Capital :** 
>Given a word, you need to judge whether the usage of capitals in it is right or not.

>We define the usage of capitals in a word to be right when one of the following cases holds:

>All letters in this word are capitals, like "USA".
>All letters in this word are not capitals, like "leetcode".
>Only the first letter in this word is capital, like "Google".
>Otherwise, we define that this word doesn't use capitals in a right way.

**Example :**

```

Input: "USA"
Output: True

```
```

Input: "FlaG"
Output: False

```

**Note:** The input will be a non-empty word consisting of uppercase and lowercase latin letters.

***

#### Day-02 : 
**Design HashSet :** 
>Design a HashSet without using any built-in hash table libraries.

>To be specific, your design should include these functions:

> - add(value): Insert a value into the HashSet. 
> - contains(value) : Return whether the value exists in the HashSet or not.
> - remove(value): Remove a value in the HashSet. If the value does not exist in the HashSet, do nothing.

**Example :**

```

MyHashSet hashSet = new MyHashSet();
hashSet.add(1);         
hashSet.add(2);         
hashSet.contains(1);    // returns true
hashSet.contains(3);    // returns false (not found)
hashSet.add(2);          
hashSet.contains(2);    // returns true
hashSet.remove(2);          
hashSet.contains(2);    // returns false (already removed)

```

**Note:**

- All values will be in the range of [0, 1000000].
- The number of operations will be in the range of [1, 10000].
- Please do not use the built-in HashSet library.

***

#### Day-03 : 
**Valid Palindrome :**

>Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

**Note:** For the purpose of this problem, we define empty string as valid palindrome.

**Example :**
```

Input: "A man, a plan, a canal: Panama"
Output: true

```
```

Input: "race a car"
Output: false

```

**Constraints:**

- `s` consists only of printable ASCII characters.

***

#### Day-04 : 
**Power of Four :**

>Given an integer (signed 32 bits), write a function to check whether it is a power of 4.

**Example :**

```

Input: 16
Output: true

```
```

Input: 5
Output: false

```

***

#### Day-05 : 
**Add and Search Word - Data structure design :**

>Design a data structure that supports the following two operations:
```
void addWord(word)
bool search(word)
```
>search(word) can search a literal word or a regular expression string containing only letters `a-z` or `.`. `A` `.` means it can represent any one letter.

**Example :**

```

addWord("bad")
addWord("dad")
addWord("mad")
search("pad") -> false
search("bad") -> true
search(".ad") -> true
search("b..") -> true

```

***

#### Day-06 : 
**Find All Duplicates in an Array :** 
>Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear **twice** and others appear **once**.

>Find all the elements that appear **twice** in this array.

>Could you do it without extra space and in O(n) runtime?

**Examples :**

```

Input:
[4,3,2,7,8,2,3,1]

Output:
[2,3]

```

#### Day-07 : 
**Vertical Order Traversal of a Binary Tree :** 
>Given a binary tree, return the vertical order traversal of its nodes values.

>For each node at position `(X, Y)`, its left and right children respectively will be at positions `(X-1, Y-1)` and `(X+1, Y-1)`.

>Running a vertical line from `X = -infinity to X = +infinity`, whenever the vertical line touches some nodes, we report the values of the nodes in order from top to bottom (decreasing `Y` coordinates).

>If two nodes have the same position, then the value of the node that is reported first is the value that is smaller.

>Return an list of non-empty reports in order of `X` coordinate.  Every report will have a list of values of nodes.

**Examples :**

![](https://assets.leetcode.com/uploads/2019/01/31/1236_example_1.PNG)

```

Input: [3,9,20,null,null,15,7]
Output: [[9],[3,15],[20],[7]]
Explanation: 
Without loss of generality, we can assume the root node is at position (0, 0):
Then, the node with value 9 occurs at position (-1, -1);
The nodes with values 3 and 15 occur at positions (0, 0) and (0, -2);
The node with value 20 occurs at position (1, -1);
The node with value 7 occurs at position (2, -2).

```
![](https://assets.leetcode.com/uploads/2019/01/31/tree2.png)
```

Input: [1,2,3,4,5,6,7]
Output: [[4],[2],[1,5,6],[3],[7]]
Explanation: 
The node with value 5 and the node with value 6 have the same position according to the given scheme.
However, in the report "[1,5,6]", the node value of 5 comes first since 5 is smaller than 6.

```

**Note:**

- The tree will have between `1` and `1000` nodes.
- Each node's value will be between `0` and `1000`.


***

### :heart: Found this project useful?

If you found this project useful, then please consider giving it a :star: on Github and sharing it with your friends via social media.

## Project Created & Maintained By

### Sagnik Chattopadhyaya

Microsoft Student Partner, Student, Working for betterment of all, Competitive Coder, YouTuber

<a href="https://twitter.com/sagnik_20"><img src="https://github.com/tombryan/social-icon-font/blob/master/svg/twitter.svg?raw=true" width="60"></a>
<a href="https://www.linkedin.com/in/sagnik-chattopadhyaya/"><img src="https://github.com/tombryan/social-icon-font/blob/master/svg/linkedin.svg?raw=true" width="60"></a>
<a href="https://youtube.com/c/learnoverflow"><img src="https://github.com/tombryan/social-icon-font/blob/master/svg/youtube.svg?raw=true" width="60"></a>
<a href="https://medium.com/@meshagy18"><img src="https://github.com/shalinguyen/socialicious/blob/master/svg/icon_medium-sign.svg?raw=true" width="60"></a>
<a href="https://facebook.com/sagnik.chatterjee.9216"><img src="https://github.com/tombryan/social-icon-font/blob/master/svg/facebook.svg?raw=true" width="60"></a>
<a href="https://instagram.com/sagnik20"><img src="https://github.com/tombryan/social-icon-font/blob/master/svg/instagram.svg?raw=true" width="60"></a>
<a href="http://sagnikc.azurewebsites.net/"><img src="https://github.com/tombryan/social-icon-font/blob/master/svg/wordpress.svg?raw=true" width="60"></a>

# Donate

> If you found this project helpful or you learned something from the source code and want to thank me, consider buying me a cup of :coffee:
>
<a href="https://www.paypal.me/sagnik20/"><img src="https://github.com/slaterjohn/payment-logos/blob/master/Rounded%20Corners/PNG/medium/paypal%402x.png?raw=true" style="zoom:50%;"></a>
