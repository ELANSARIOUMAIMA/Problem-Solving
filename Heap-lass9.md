# Heap (PriorityQueue) - Java Cheat Sheet

## What is a Heap?
A Heap is a data structure that always keeps the highest-priority element at the top.

- **Min Heap** → Smallest element first (Default in Java)
- **Max Heap** → Largest element first

---

## Min Heap

```java
PriorityQueue<Integer> minHeap = new PriorityQueue<>();
```

Example:

```
1
2
5
8
```

`peek()` → 1

---

## Max Heap

```java
PriorityQueue<Integer> maxHeap =
    new PriorityQueue<>(Collections.reverseOrder());
```

Example:

```
8
5
2
1
```

`peek()` → 8

---

## Heap Ordered by Another Value (Custom Comparator)

Example: Sort keys according to their frequency in a HashMap.

```java
PriorityQueue<Integer> maxHeap =
    new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
```

Used for:
- Top K Frequent Elements
- K Closest Points
- Dijkstra
- Custom object sorting

---

# Methods

### Insert

```java
offer(x);
```

or

```java
add(x);
```

Time: **O(log n)**

---

### Remove highest-priority element

```java
poll();
```

- Removes and returns the top element.
- Returns `null` if empty.

Time: **O(log n)**

---

### Get top element

```java
peek();
```

- Does NOT remove it.
- Returns `null` if empty.

Time: **O(1)**

---

### Remove top element (throws exception if empty)

```java
remove();
```

Time: **O(log n)**

---

### Number of elements

```java
size();
```

Time: **O(1)**

---

### Check if empty

```java
isEmpty();
```

Time: **O(1)**

---

### Check if an element exists

```java
contains(x);
```

Time: **O(n)**

---

### Remove a specific element

```java
remove(x);
```

Time: **O(n)**

---

# Time Complexity

| Operation | Complexity |
|-----------|------------|
| add() | O(log n) |
| offer() | O(log n) |
| poll() | O(log n) |
| remove() | O(log n) |
| peek() | O(1) |
| size() | O(1) |
| isEmpty() | O(1) |
| contains() | O(n) |
| remove(Object) | O(n) |

---

# Common Problems

✅ Kth Largest Element

✅ Top K Frequent Elements

✅ K Closest Points to Origin

✅ Merge K Sorted Lists

✅ Find Median from Data Stream

✅ Task Scheduler

✅ Dijkstra's Algorithm

---

# Interview Tips

### Need the smallest element repeatedly?

```java
PriorityQueue<Integer> pq = new PriorityQueue<>();
```

---

### Need the largest element repeatedly?

```java
PriorityQueue<Integer> pq =
    new PriorityQueue<>(Collections.reverseOrder());
```

---

### Need to sort by frequency, distance, or another property?

```java
PriorityQueue<Type> pq =
    new PriorityQueue<>((a, b) -> ...);
```

Use a **custom comparator**.

---

# Pattern 1: K Largest

```java
PriorityQueue<Integer> maxHeap =
    new PriorityQueue<>(Collections.reverseOrder());

for (int x : nums)
    maxHeap.offer(x);

while (!maxHeap.isEmpty())
    System.out.println(maxHeap.poll());
```

---

# Pattern 2: Top K Frequent

```java
HashMap<Integer, Integer> map = new HashMap<>();

// Count frequency
for (int num : nums)
    map.put(num, map.getOrDefault(num, 0) + 1);

// Max Heap ordered by frequency
PriorityQueue<Integer> maxHeap =
    new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

// Add keys
for (int key : map.keySet())
    maxHeap.offer(key);

// Get top k
for (int i = 0; i < k; i++)
    result[i] = maxHeap.poll();
```
