# Java Interview Cheat Sheet

## String

```java
s.length();
s.isEmpty();

s.charAt(i);

s.substring(start);
s.substring(start, end);

s.equals(other);
s.equalsIgnoreCase(other);

s.contains(str);

s.startsWith(prefix);
s.endsWith(suffix);

s.indexOf(ch);
s.lastIndexOf(ch);

s.toLowerCase();
s.toUpperCase();

s.trim();

s.split(" ");

String.valueOf(x);
```

Example:

```java
String s = "hello";

s.length();        // 5
s.charAt(1);       // 'e'
s.substring(1,4);  // "ell"
```

---

# Arrays

```java
Arrays.sort(nums);

Arrays.fill(nums,0);

Arrays.equals(a,b);

Arrays.copyOf(nums,n);

Arrays.toString(nums);
```

---

# HashMap

```java
map.put(key,val);

map.get(key);

map.getOrDefault(key,0);

map.containsKey(key);

map.remove(key);

map.size();

map.isEmpty();

map.keySet();

map.values();

map.entrySet();
```

Example:

```java
HashMap<Integer,Integer> map = new HashMap<>();

map.put(1,5);

map.get(1);

map.containsKey(1);
```

---

# HashSet

```java
set.add(x);

set.remove(x);

set.contains(x);

set.size();

set.isEmpty();
```

Useful trick:

```java
if (!set.add(x)) {
    // x already exists
}
```

---

# ArrayList

```java
list.add(x);

list.add(index,x);

list.get(i);

list.set(i,x);

list.remove(i);

list.remove(Object);

list.size();

list.isEmpty();

list.contains(x);
```

---

# Queue

```java
offer();

poll();

peek();

isEmpty();

size();
```

Example:

```java
Queue<Integer> q = new LinkedList<>();

q.offer(1);

q.poll();

q.peek();
```

---

# Stack

```java
push();

pop();

peek();

isEmpty();

size();
```

---

# Deque

```java
addFirst();

addLast();

pollFirst();

pollLast();

peekFirst();

peekLast();
```

---

# PriorityQueue

### Min Heap

```java
PriorityQueue<Integer> pq =
new PriorityQueue<>();
```

### Max Heap

```java
PriorityQueue<Integer> pq =
new PriorityQueue<>(Collections.reverseOrder());
```

Methods:

```java
offer();

poll();

peek();

isEmpty();

size();
```

---

# Math

```java
Math.max(a,b);

Math.min(a,b);

Math.abs(x);

Math.sqrt(x);

Math.pow(a,b);

Math.ceil(x);

Math.floor(x);

Math.round(x);
```

---

# Character

```java
Character.isDigit(c);

Character.isLetter(c);

Character.isUpperCase(c);

Character.isLowerCase(c);

Character.toLowerCase(c);

Character.toUpperCase(c);
```

---

# StringBuilder

```java
append();

deleteCharAt(i);

reverse();

insert(i,x);

toString();

length();

charAt(i);
```

Example:

```java
StringBuilder sb = new StringBuilder();

sb.append("abc");

sb.reverse();

String s = sb.toString();
```

---

# Collections

```java
Collections.sort(list);

Collections.reverse(list);

Collections.max(list);

Collections.min(list);
```

---

# Frequently Used Patterns

### HashMap Frequency Counter

```java
map.put(x, map.getOrDefault(x, 0) + 1);
```

### Contains Duplicate

```java
if (!set.add(x)) return true;
```

### Convert int → String

```java
String.valueOf(num);
```

### Convert String → int

```java
Integer.parseInt(s);
```

### Sort Array

```java
Arrays.sort(nums);
```

### Reverse String

```java
String reversed =
new StringBuilder(s)
.reverse()
.toString();
```

---

# Tier 1 (Must Know)

* String
* HashMap
* HashSet
* ArrayList
* Arrays.sort()
* StringBuilder
* Math.max()
* Math.min()

---

# Tier 2

* Queue
* Deque
* PriorityQueue
* Stack
* Character
* Collections

---

# Goal

Memorize the Tier 1 methods first.

After solving around **100 LeetCode problems**, most of these methods will become automatic.
