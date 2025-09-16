# LE11 Change Denomination
Determines the change to be dispenses from a vending machine. The user enters an amount between 1 cent and 99 cents. The program determines a combination of coins equal to that amount. Denominations is in a formed of: quarter, dime, nickel and penny.

# LE12 Multiply the Digits
Reads an integer between 0 and 1000. Display and multiplies all the digits in the integer. Assume that the user follows directions.

# LE13 Chocolate Bars
The Harris-Benedict equation estimates the number of calories your body needs to maintain your weight if you do no exercise. This is called your basal metabolic rate, or BMR

The calories needed for a woman to maintain her weight is:
```javascript
BMR = 655 + (4.3 x weight_in_pounds) + (4.7 x height_in_inches) - (4.7 x age_in_years)
```

The calories needed for a man to maintain his weight is:z
```javascript
BMR = 66 + (6.3 x weight_in_lbs) + (12.9 x height_in_inches) - (6.8 x age_in_yrs)
```

A typical chocolate bar will contain around 230 calories. Write a program that allows the user to input their weight in pounds, height in inches, and age in years. The program should then output the number of chocolate bars that should be consumed to maintain one's weight for both a woman and a man of the input weight, height, age.

# LE14 Distance between Two points
Prompts the user to enter two points (x1, y1) and (x2, y2) and displays their distance. The formula for computing the distance is sqrt((x2 - x1)^2 + (y2 -y1)^2). Note you can use Math.pow(a, 0.5) to compute square-root.