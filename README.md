# Variable Manipulation 🧬

### Welcome!
This GitHub repository is where you can work and submit your Act 1 `MySecondProgram.java` activity!

```text
Note: Please read all the information below before starting the activity!
```

For detailed instructions, you can check the presentation here: [Variable Manipulation Presentation](https://docs.google.com/presentation/d/1eCUfjZ_w5CGry1myN7YnOrqM4SbwNX_YQ0Lk1gC_Yes/edit?usp=sharing).

---

## Activity Instructions

In this activity, you will define different variable types and manipulate Strings. The previous instructions were a bit jumbled, so here is the exact step-by-step process you need to follow:

Open `MySecondProgram.java` and complete these tasks in order:

**Part 1: Defining Variables**
1. Define two `String` variables. You can provide any values you want (e.g., "Computer" and "Science").
2. Define two number variables. One must be a whole number (`int`), and the other must be a decimal number (`double`).

**Part 2: Manipulating Data**
3. Define a variable called `third` that will hold the **third character** from your first String. 
    * *Think:* What data type should hold a single character?
4. Define a variable called `sum` that will store the mathematical addition of your two numbers.
5. Define a `String` variable called `second` that contains the value of your second String, but with **only its second character converted to UPPERCASE**. 
    * *Hint:* You will need to use `.substring()` to slice the word into pieces, use `.toUpperCase()` on the middle piece, and glue it all back together!

**Part 3: Password Generation**
6. Define a `String` variable called `password` that concatenates the following pieces in this exact order:
    * **a:** The first character from the second String
    * **b:** The second character from the second String
    * **c:** The first number
    * **d:** The *last* character from the first String
    * **e:** The second number
    * **f:** A special character of your preference (e.g., `/`, `!`, `?`)

> [!WARNING]
> ### 👾 Break-Proofing Your Code (Adversarial Thinking):
> * **0-Based Indexing:** Remember that computers start counting at 0! The "3rd character" is actually at index `2`.
> * **Dynamic Lengths:** For step 6d, do NOT just count the letters in your word and hardcode the index (like `7`). If you change your word to a shorter one, your code will crash with a `StringIndexOutOfBoundsException`! Use `.length() - 1` to find the last character dynamically.
> * **The Char Math Trap:** If you try to add two `char` variables together (`'A' + 'B'`), Java will do math with their ASCII values instead of gluing them together! Always start a string concatenation with an empty string `"" + ` to force Java to treat everything as text.

### Expected Output
*(Your output should follow this exact format, but the values will change based on the words and numbers you picked!)*
```text
1st String: Computer
2nd String: Science
1st Number: 5
2nd Number: 3.5
Third Character from Computer: m
Sum: 8.5
Second: SCience
Password: Sc5e3.5/
```

> [!IMPORTANT]
> ### How to submit your activity:

<details>
<summary> If you're using your own VS Code (Recommended):</summary>

```text
1. In your GitHub assignment, open the file with the name of the program that you want to submit.
2. Click the pencil icon ("edit this file") in the right upper corner.
3. Paste the code from your VS Code into GitHub
4. Click "Commit changes" (Green button in right upper corner).
5. Accept/confirm any prompts, and that's it! You've submitted your activity.
```
</details>

<details>
<summary> If you're using GitHub Codespaces:</summary>

```text
1. Whenever you're ready to submit the activity, click on the "Source Control" tab (usually on the left of your screen).
2. Write your Student ID in the Message textbox (above the green "Commit" button). 
3. Click on commit (if prompted to stage changes, click "Yes").
4. Click on the button "Sync changes", accept everything and that's it!
If you didn't get any errors, you've submitted your activity successfully. Otherwise, send me a message with your error.
```
</details>
