# DataAnalyzer

## Goal
The project allows you to parse through a CSV file and convert it to Java object that are then stored in an ArrayList. Then, the objects are stored into a hash map so that each object is assigned a key for it's values. Then, the hash map is printed with all the keys with their values. Then, the user is able to find the data they need by inputting their criterias.

In this specific project, we have SP.csv which contains data about all the students that were a part of a study. Then, we parsed through the CSV and converted each line to a student objects that were stored in an ArrayList. Then, we wanted to assign each student object a ID number so we implemented a hashmap that did this. The hash map is printed. Once all is printed, the program requests the user to enter one by one the criterias they are looking for such as gender, race, use of test preparation courses, and test scores. Once all the user inputs are completed, we have several if-else statements that check for the conditions of the user input to be met and the objects that match criterias are pushed into a stack that is then printed. This program allows for ease in analyzing a large data set and in looking for trends or specific information in large data sets.


## Data Structures
### ArrayList
We parsed the csv file and converted each line into a student object that was stored into an ArrayList. This was one of the beginning points of our project as it began to develop.

### HashMap
We wanted to assign each student object its own specific ID number. We wanted a key-value system with the ID being the key and the variables such as gender, race, scores, etc. as the values. We implemented a hashmap in order to do this. We also have so the hashmap is printed when the program is ran.

### Stack
Once the user input part is completed and the matches are found, each match is pushed into a stack as it found and that stack is then printed out and the program ends once we have that printed.


## Other Features

We make use of a csv file and parse through it and create object from it. This feature allowed up from having to manually enter in each object into the data structures we chose.

We utilize user input in our program. The program allows for the user to enter the criteria and prints out matches. The user input works and matches objects with the following requests:
  * “Enter 1 for Female. 2 For Male. 0 for Both”     
   Makes comparison for gender. Can input 0 to get back objects regardless of specific gender  
  * “Enter A for Group A. B for Group B. C for Group C. D for Group D. E for Group E. 0 for All.”  
   Each group correlates to a race and entering 0 allows you to return objects that match the other criteria but can belong to any group
  * "Enter 1 for Associate's Degree. Enter 2 for high school. Enter 3 for some high school. Enter 4 for Bachelor's degree. Enter 5 for some college. Enter 0 for all."  
  Same mechanism as previous two variables  
  * “Enter 1 for standard. Enter 2 for free/reduced. Enter 0 for all."  
   Same mechanism as previous three variables
  * “Enter 1 for none. Enter 2 for completed. Enter 0 for all.”  
   Same mechanism as previous variables
  * "Enter math score. Must be a minimum of 0: "  
   Compares the scores of each object and as a result prints the objects that are greater than the minimum you set through your input.
  * "Enter reading score. Must be a minimum of 0: "  
   Same mechanism as math score.  
  * "Enter writing score. Must be a minimum of 0: "  
   Same mechanism as the math and reading scores.
   
For the scores, you will get matches that meet the score you inputted and greater. 

We also added an ASCII image that is printed at the very beginning of our program as an additional fun feature to reflect the theme of the data we are using.

We used GitHub as our version control to keep the updated files shared with all the members of the group.

The code should run on almost all IDEs

## Difficulties/Challenges
We had several issues that popped up in the development of this program that ranged from us having to avoid certain paths since they involved topics we have yet to be exposed to such as building a Web Crawler or parsing through HTML on websites. We had to limit our scopes greatly and we eventually came to the conclusion of using a csv file as a solution to the issue regarding the difficulty we were having using jSoup and web crawling. We had a few issues come regarding our files running with our original csv files. We had to remove the headers from our csv file in order to ensure we we were not getting errors for the headers being unreadable. 

## Future Possibilities
For future development, this project can take several routes. There can be more done with the matches; currently, we get a printout of the the student objects that match the criteria of the user’s input. It could possible to do more with the matches or objects overall such as averaging the scores or running other statistical tests on them that may add to the use of this program in a research setting. 


This project was created as the final project for a Data Structures course with two teammates during the Fall 2018 semester.
