 # code challange 10
# Stacks and Queues
### the stack and queue are data structure the properties of stack is LIFO and for queue is FIFO

## Challenge
### implement the stack and queue and use there method enqueue and dequeue and peek and for stak (peek ,pop ,push ) 

## Approach & Efficiency
bigO(1)

## API
* push:adds a new node with that value to the top of the stack with an O(1) Time performance.
* pop:Removes the node from the top of the stack
* peek:Returns: Value of the node located at the top of the stack
* is empty:Returns: Boolean indicating whether or not the stack is empty.
* enqueue:adds a new node with that value to the back of the queue with an O(1) Time performance
* dequeue:Removes the node from the front of the queue
* peek:Returns: Value of the node located at the front of the queue
* is empty:Returns: Boolean indicating whether or not the queue is empty

# code challange 11
## description 
Create a class Pseudoqueue which utilizes two stacks and has the methods enqueue(T value) and dequeue() and acts in the same way as the Class Queue.

## white board
![cc 11]( images/pesudoQueue.png)

## Approach & Efficiency
bigO (enqueue)
time:O(1)
space:O(1)
BigO (dequeue)
time:O(n)
space:O(1)

# code challange 12 
## description 
Create a class called AnimalShelter which holds only dogs and cats and The shelter operates using a first-in, first-out approach and write 2 method enqueue
Arguments: animal
animal can be either a dog or a cat object.
dequeue
Arguments: pref
pref can be either "dog" or "cat"
Return: either a dog or a cat, based on preference.
If pref is not "dog" or "cat" then return null.

## white board
![cc 12]( images/animalShelter.png)

## Approach & Efficiency
for enqueue function :
Time: O(1)    Space: O(1)
for dequeue function:
Time: O(1)   Space: O(1)


# code challange 13

## description 
Write a function called validate brackets
Arguments: string
Return: boolean
representing whether or not the brackets in the string are balanced

## white board
![cc 13]( images/bracket.png)


## Approach & Efficiency
big O
time -->O(n)
space--->O(1)