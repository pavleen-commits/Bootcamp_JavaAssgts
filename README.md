
# Java Assignment-2 questions: (Solutions in ~/java2 package.)
<ul>
<li>1. Create Java classes having suitable attributes for Library management system.Use OOPs concepts in your design.Also try to use interfaces and abstract classes.</li>
<li>2. WAP to sorting string without using string Methods?.</li>
<li>3. WAP to produce NoClassDefFoundError and ClassNotFoundException exception.</li>
<li>4. WAP to create singleton class.</li>
<li>5. WAP to show object cloning in java using cloneable and copy constructor both.</li>
<li>6. WAP showing try, multi-catch and finally blocks.</li>
<li>7. WAP to convert seconds into days, hours, minutes and seconds.</li>
<li>8. WAP to read words from the keyboard until the word done is entered. For each word except done, report whether its first character is equal   to  its last character. For the required loop, use a 
<ol><li>while statement </li>
<li>do-while statement</li>
</ol>
<li>9.  Design classes having attributes for furniture where there are wooden chairs and tables, metal chairs and tables. There are stress and fire tests for each products.
</li>
<li>10. Design classes having attributes and method(only skeleton) for a coffee shop. There are three different actors in our scenario and i have listed the different actions they do also below

* Customer
  - Pays the cash to the cashier and places his order, get a token number back
  - Waits for the intimation that order for his token is ready
  - Upon intimation/notification he collects the coffee and enjoys his drink
  ( Assumption:  Customer waits till the coffee is done, he wont timeout and cancel the order. Customer always likes the drink served. Exceptions like he not liking his coffee, he getting wrong coffee are not considered to keep the design simple.)

* Cashier
  - Takes an order and payment from the customer
  - Upon payment, creates an order and places it into the order queue
  - Intimates the customer that he has to wait for his token and gives him his token
  ( Assumption: Token returned to the customer is the order id. Order queue is unlimited. With a simple modification, we can design for a limited queue size)

* Barista
 - Gets the next order from the queue
 - Prepares the coffee
 - Places the coffee in the completed order queue
 - Places a notification that order for token is ready
</li>
<li>11. Convert the following code so that it uses nested while statements instead of for statements: 
    int s = 0; 
    int t = 1; 
    for (int i = 0; i < 10; i++) 
    { 
    s = s + i; 
    for (int j = i; j > 0; j−−) 
    { 
    t = t * (j - i); 
    } 
    s = s * t; 
    System.out.println("T is " + t); 
    } 
    System.out.println("S is " + s);
</li>
<li>
12.What will be the  output on new Child(); ? 
    class Parent extends Grandparent {
       
        {
        System.out.println("instance - parent");
        }

        public Parent() {
        System.out.println("constructor - parent");
        }

        static {
        System.out.println("static - parent");
        }
    }

    class Grandparent {
      
        static {
        System.out.println("static - grandparent");
        }

        {
        System.out.println("instance - grandparent");
        }

        public Grandparent() {
        System.out.println("constructor - grandparent");
        }
    }

    class Child extends Parent {

        public Child() {
        System.out.println("constructor - child");
        }

        static {
        System.out.println("static - child");
        }

        {
        System.out.println("instance - child");
        }
    }
</li>
<li>
Q13. Create a custom exception that do not have any stack trace.</li>
</ul>

# Java Assignment-3(collections & date) questions: (Solutions in ~/java_collections package.)
<ol>
<li>Write Java code to define List . Insert 5 floating point numbers in List, and using an iterator, find the sum of the numbers in List.</li>
<li>Write a method that takes a string and returns the number of unique characters in the string.</li>
<li>Write a method that takes a string and print the number of occurrence of each character characters in the string.</li>
<li>Write a program to sort Employee objects based on highest salary using Comparator. Employee class{ Double Age; Double Salary; String Name} </li>
<li>Write a program to sort the Student objects based on Score , if the score are same then sort on First Name . Class Student{ String Name; Double Score; Double Age} </li>
<li>Print the elements of an array in the decreasing frequency if 2 numbers have same frequency then print the one which came first.</li>
<li>Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull() and an additional operation getMin() which should return minimum element from the SpecialStack. (Expected complexity ­ O(1))</li>
<li>Write a program to format date as example "21-March-2016"</li>
<li>Write a program to display times in different country format.</li>
</ol>

# Java Assignment-4 (JAVA8 Features) questions: (Solutions in ~/java8_features package)
<ol>
  <li> Write the following a functional interface and implement it using lambda: </li>
<ol><li>First number is greater than second number or not : Parameter (int ,int ) Return boolean</li>
    <li>Increment the number by 1 and return incremented value : Parameter (int) Return int</li>
   <li>Concatination of 2 string Parameter (String , String ) : Return (String)</li>
  <li>Convert a string to uppercase and return : Parameter (String) Return (String)</li></ol>
  <li>Create a functional interface whose method takes 2 integers and return one integer.</li>

<li>Using (instance) Method reference create and apply add and subtract method and using (Static) Method reference create and apply multiplication method for the functional interface created.</li>

<li>Create an Employee Class with instance variables (String) name, (Integer)age, (String)city and get the instance of the Class using constructor reference  
Implement following functional interfaces from java.util.function using lambdas:</li>

(1) Consumer

(2) Supplier

(3) Predicate

(4) Function

<li>Create and access default and static method of an interface.</li>

 <li>Override the default method of the interface.</li>

<li> Implement multiple inheritance with default method inside  interface.</li>

<li>Collect all the even numbers from an integer list.</li>

<li>Sum all the numbers greater than 5 in the integer list.</li>

<li>Find average of the number inside integer list after doubling it.</li>

<li>Find the first even number in the integer list which is greater than 3.</li>
</ol>

# Java Assignment-5 (Multi threading concepts) questions : (Solutions in ~/java_multithreading package)
<ol>
  <li> Create and Run a Thread using Runnable Interface and Thread class.</li>
  <li>Use sleep and join methods with thread.</li>
  <li>Use a singleThreadExecutor to submit multiple threads.</li>
  <li>Try shutdown() and shutdownNow() and observe the difference.</li>
  <li>Use isShutDown() and isTerminated() with ExecutorService.</li>
<li>Return a Future from ExecutorService by using callable and use get(), isDone(), isCancelled() with the Future object to know the status of task submitted.</li>
  <li>Submit List of tasks to ExecutorService and wait for the completion of all the tasks.</li>
  <li>Schedule task using schedule(), scheduleAtFixedRate() and scheduleAtFixedDelay()</li>
<li>Increase concurrency with Thread pools using newCachedThreadPool() and newFixedThreadPool().</li>
<li>Use Synchronize method to enable synchronization between multiple threads trying to access method at same time.</li>
<li>Use Synchronize block to enable synchronization between multiple threads trying to access method at same time.</li>
  <li>Use Atomic Classes instead of Synchronize method and blocks.</li>
  <li>Coordinate 2 threads using wait() and notify().</li>
  <li>Coordinate mulitple threads using wait() and notifyAll()</li>
  <li>Use Reentrant lock for coordinating 2 threads with signal(), signalAll() and wait().</li>
  <li>Create a deadlock and Resolve it using tryLock().</li>
  </ol>
