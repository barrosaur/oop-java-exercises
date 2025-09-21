# LE21 Day of the Week
Zeller's congruence is an algorithm developed by Christian Zeller to calculate the day of the week. The formula is:
```javascript
h = (q + ((26*(m + 1)) / 10) + k + (k/4) + (j/4) + (5*j)) % 7;
```
Where:
<ul>
    <li>h - is the day of the week (): Saturday, 1: Sunday, 2: Monday...)</li>
    <li>q - is the day of the month</li>
    <li>m - is the month (3: March, 4: April...)</li>
    <li>j - (year / 100)</li>
    <li>k - is the year of the century (year % 100)</li>
</ul>

Note all divisions in this exercise perform an integer division. Write a program that prompts the user to enter a year, month, and day of the month, and displays the name of the day of the week.
<i>Hint: January and February are counted as 13 and 14 in the formula, so you need to convert the user input 1 to 13 and 2 to 14 for the month and change the year to the previous year. For example, if the user enters 1 for m and 2015 for year, m will be 13 and year will be 2014 used in the formula.</i>

```
Enter year: 2015
Enter month (1-12): 1
Enter day of the month (1-31): 25
Day of the week is Sunday
```

# LE22 Simulation: Heads or Tails. 
Write a program that simulates flipping a coin two million times and displays the number of heads and tails.

# LE23 Dec to Hex
Create a program that will convert the inputted decimal number into hexadecimal number.
```
Enter a decimal number : 6702
Hexadecimal number     : 1A2E
```