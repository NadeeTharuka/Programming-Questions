# Gift Vouchers  
## Difficulty: Easy

![Gift Vouchers](https://github.com/NadeeTharuka/Programming-Questions/blob/main/Gift%20Vouchers/gift-vouchers.jpg)

ABC Super Center is a shopping complex located in the Colombo 02 area and sells all its products. They have clothes, bags, cosmetics, shoes, kitchen utensils, etc. During the Christmas season, they have launched a number of promotional programs under which they offer gift vouchers for every item priced Rs. 1000 or higher. 

If the value of that item exceeds Rs. 1000, another voucher will be issued for the next Rs. 1000. For example, if you purchase an item worth Rs. 2,500, two gift vouchers will be issued. 
It is possible for one customer to purchase an N number of items.

Employees make mistakes when calculating the number of vouchers to be issued. So write a program for this.

## Input Format
1) The input contains N number of amounts separated by spaces.
2) The number of amounts ends with letter "e", and it is not case sensitive.
3) If an entered item has a price over Rs. 100000, you can ignore that by considering it to be a mistake by the cashier. 

## Constraints  
0 < Item Price < 100,000

## Output Format
The outputs should be answers to the below questions and they must appear in three single lines.
1) Do have vouchers?
2) The total value of the bill.
3) The number of vouchers.

### Sample Input (1)
1000  
E

### Sample Output (1)
Yes  
1000  
1

### Sample Input (2)
1500  
2000  
200000  
e

### Sample Output (2)
Yes  
3500  
3

### Important
Feel free to use any programming language. (Eg: Java or C++)  
If the user's input is not correct, you should throw an exception. For those who are unfamiliar with exception handling, just print an Error message.

**Question was taken from BitCode V 3.0**  
Organized by  
**BITSA**  
Department of Information Systems  
Faculty of Management  
Rajarata University of Sri Lanka
