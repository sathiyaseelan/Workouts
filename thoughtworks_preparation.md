Thoughtworks CheatSheet
=======================

Topics to be prepared:
---------------------

#### Design patterns - **99%**

+ ~~ Strategy~~
+ ~~Observer~~
+ ~~Decorator~~
+ ~~Abstract Factory~~
+ ~~Factory Method~~
+  ~~Abstract Factory~~
+ ~~Singleton~~
+ ~~Facade~~
+ ~~Adapter~~
+ ~~Command~~
+ ~~Template method~~
+ ~~Iterator~~
+ ~~Composite~~
+ ~~State~~
+ ~~Proxy~~



#### OOPs - **0%**

+ UML
	-  Theater multiplex
	-  Visitor entry management system
	-  Grocery store management system

#### Data structures - **30%**

+ **Linked List**
+ Stack
+ Queue
+ ~~Binary Tree~~
+ ~~Binary Search Tree ~~
+ ~~Binary Heap~~
+ Hashing
+ Graph
+ Advanced Data Structure
+ Array
+ Matrix
+ Misc

#### Database - **40%**

+ Schema design
	-  ~~Theater multiplex~~
	-  Visitor entry management system
	-  Grocery store management system

+ ~~Queries~~

#### Projects - **100%**

+ ~~NGVCP ATF~~
+ ~~Certificate Processing System~~

#### Algorithm - **5%**
+ **Sorting**
	- ~~Merge Sort~~
	- Quick Sort
	- Selection Sort
	- Insertion Sort
	- ~~Heap Sort~~
	- BubbleSort

+ Dynamic Programming

+ Searching

+ Graph problems

+ Greedy Technique

+ Ad hoc


Interview Questions
-------------------

#### First round questions:

+ Mars rover - Inprogress

>A squad of robotic rovers are to be landed by NASA on a plateau on Mars.
>This plateau, which is curiously rectangular, must be navigated by the
>rovers so that their on-board cameras can get a complete view of the
>surrounding terrain to send back to Earth.
>
>A rover’s position and location is represented by a combination of x and y
>co-ordinates and a letter representing one of the four cardinal compass
>points. The plateau is divided up into a grid to simplify navigation. An
>example position might be 0, 0, N, which means the rover is in the bottom
>left corner and facing North.
>
>In order to control a rover, NASA sends a simple string of letters. The
>possible letters are ‘L’, ‘R’ and ‘M’. ‘L’ and ‘R’ makes the rover spin 90
>degrees left or right respectively, without moving from its current spot.
>‘M’ means move forward one grid point, and maintain the same heading.
>
>Assume that the square directly North from (x, y) is (x, y+1).
>
>INPUT:
>The first line of input is the upper-right coordinates of the plateau, the
>lower-left coordinates are assumed to be 0,0.
>
>The rest of the input is information pertaining to the rovers that have
>been deployed. Each rover has two lines of input. The first line gives the
>rover’s position, and the second line is a series of instructions telling
>the rover how to explore the plateau.
>
>The position is made up of two integers and a letter separated by spaces,
>corresponding to the x and y co-ordinates and the rover’s orientation.
>
>Each rover will be finished sequentially, which means that the second rover
>won’t start to move until the first one has finished moving.
>
>OUTPUT
>The output for each rover should be its final co-ordinates and heading.
>
>INPUT AND OUTPUT
>
>Test Input:
>5 5
>1 2 N
>LMLMLMLMM
>3 3 E
>MMRMMRMRRM
>
>Expected Output:
>1 3 N
>5 1 E
>
+ ~~Sales taxes~~

>Basic sales tax is applicable at a rate of 10% on all goods, except books, food,
>and medical products that are exempt. Import duty is an additional sales tax
>applicable on all imported goods at a rate of 5%, with no exemptions.

>When I purchase items I receive a receipt which lists the name of all the items
> and their price (including tax), finishing with the total cost of the items,
> and the total amounts of sales taxes paid.  The rounding rules for sales tax are
> that for a tax rate of n%, a shelf price of p contains (np/100 rounded up to
> the nearest 0.05) amount of sales tax.
> `
>Write an application that prints out the receipt details for these shopping baskets...
>INPUT:
>Input 1:
>1 book at 12.49
>1 music CD at 14.99
>1 chocolate bar at 0.85
>
>Input 2:
>1 imported box of chocolates at 10.00
>1 imported bottle of perfume at 47.50
>
>Input 3:
>1 imported bottle of perfume at 27.99
>1 bottle of perfume at 18.99
>1 packet of headache pills at 9.75
>1 box of imported chocolates at 11.25
>
>OUTPUT
>Output 1:
>1 book: 12.49
>1 music CD: 16.49
>1 chocolate bar: 0.85
>Sales Taxes: 1.50
>Total: 29.83
>
>Output 2:
>1 imported box of chocolates: 10.50
>1 imported bottle of perfume: 54.65
>Sales Taxes: 7.65
>Total: 65.15
>
>Output 3:
>1 imported bottle of perfume: 32.19
>1 bottle of perfume: 20.89
>1 packet of headache pills: 9.75
>1 imported box of chocolates: 11.85
>Sales Taxes: 6.70
>Total: 74.68

	`Use Decorator pattern for wrapping up the item with additional taxes`

+ IPOD inventory

>There is a company which have started selling the ipods ONLINE . But they want to sell these ipods online at best price.
>i) They have ipod Inventories at Brazil and Argentina. Each of the inventory can store only 100 ipods.
>ii) ipods at Brazil are sold at 100$/unit  and at Argentina they are sold at 50$/unit.
>iii) after every order the stock at both brazil and argentina inventories are again back to 100 units.
>iv) the no of ipods ordered should be only in multiple of 10.(i.e no of ipods ordered shouldnt be im number like 123 etc. )
>v) the order placed should be either fullfilled completely or nothing
>vi) if the order is placed like 120 ipods from brazil then the remaining ipods can be brought from the other inventory i.e.argentina.
>but here shipping price of 400$ per 10 units is applied.
>they have also given the 4 set of inputs and outputs which your program should produce
>:
>: :
>i) Brazil : 5
>500 : 95 : 100
>ii) Brazil : 50
>4500 : 100 : 50
>(this trick here is u first have to calculate the cost prize at both brazil and argentina..and d one which is low should be given..here argentina)
>iii) Argentina : 120
>7800 : 80 :20
>(this was the case where i made a silly mistake…out of 120 only 100 ipods should be sold according to the price at argentina..while reamaining 20 should be sold at prize at brazil which is 100$ + shipping charges (800$))
>iv) Argentina : 250
>Out of stock!!!!


Points to keep in my mind:
--------------------------

#### Round 1:

+ Use proper variable names
+ Closed for modification and open for extension.

Bookmarks
---------

[Coding round Questions](https://lifefucks.wordpress.com/2012/09/24/thoughtworks-question-paper-coding-round/) 

[4 part series of hacking thoughtworks](https://vampwillow.wordpress.com/2014/07/21/hacking-thoughtworks-recruitment-part-1/)
