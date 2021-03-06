# Summary

## Misc
* Find mid bias towards left: int mid = (i + j) / 2; 
* Find mid bias towards right: int mid = (i + j) / 2 + 1; 

## Array
* Get array length: arr.length
* Create a 2D array: int[][] m = new int[n][n];
* Create and initialize an array: int[] arr = new int[] {1, 2, 3};

## Arrays
* asList(). 
Note that this is BAD: 
int[] A = new int[]{1, 2, 3}; 
List<Integer> list = Arrays.asList(A);
Cause Integer type vs int type. 

* binarySearch(A, 641)

* copyOf(A)

* copyOfRange(A, 1, 5)

* equals(A, B)

* fill(A, 42)
int[] count = new int[26];
Arrays.fill(count, 0);
Arrays.fill(count, 1, 5); // Give a range[1, 5)

* find(A, 28)

* sort(A): will sort character array in lexicographical order; 

* sort(A, cmp)

* toString()

How to print an array: 
Arrays.toString(myarr);

## Set

## List
* Copy set to a list: List<Integer> list = new ArrayList<>(set);

## Collection 
* Swap two elements of a collection: Collections.swap(c, i, j);
* Sort a list: Collections.sort(list);
* Empty list: Collections.EMPTY_LIST; 
* Sort a list of intervals: 
```
Collections.sort(intervals, new Comparator<Interval>() {
    @Override
        public int compare(Interval i1, Interval i2) {
            return Integer.compare(i1.start, i2.start);
        }
});
```


## String
* Get String length: s.length()
* Get a char from a String: char ch = text.charAt(0);
* Convert a char to string: String s = String.valueOf(ch);
* Convert a char array to string: String s = new String(carr);
* Get substring from index i to j: s.substring(i, j + 1);

## Deque
* add(x)/addLast(x): add to the tail; 
* push(x)/addFirst(x): add to the head; 
* iterator(): return an iterator of this equeue; 
* descendingIterator(): Returns an iterator that has the reverse order for this deque.
* pop(): Removes an element from the head and returns it.
* removeFirst(): Removes the element at the head.
* removeLast(): Removes the element at the tail.
* http://www.geeksforgeeks.org/deque-interface-java-example/

## Queue

## Stack
* push(x)
* pop()
* peek()
* https://www.tutorialspoint.com/java/java_stack_class.htm
* Stack can be used to track increasing/decreasing sequence property. i.e. LC496.

## PriorityQueue
* boolean add(E element): This method inserts the specified element into this priority queue.
* public remove(): This method removes a single instance of the specified element from this queue, if it is present
* public poll(): This method retrieves and removes the head of this queue, or returns null if this queue is empty.
* public peek(): This method retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
* iterator(): Returns an iterator over the elements in this queue.
* boolean contains(Object o): This method returns true if this queue contains the specified element

## Dynamic Programming
Usually, solving and fully understanding a dynamic programming problem is a 4 step process:
* Start with the recursive backtracking solution
* Optimize by using a memoization table (top-down[3] dynamic programming)
* Remove the need for recursion (bottom-up dynamic programming)
* Apply final tricks to reduce the time / memory complexity
