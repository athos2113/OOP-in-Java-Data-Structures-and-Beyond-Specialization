# Capstone: Analyzing (Social) Network Data

![logo](logo.jpg)

[Course Link](https://www.coursera.org/learn/intermediate-programming-capstone)

About this Course:
>In this capstone project we’ll combine  all of the skills from all four specialization courses to do something really fun: analyze social networks!  

The opportunities for learning are practically endless in a social network.  Who are the “influential” members of the network?  What are the sub-communities in the network?   Who is connected to whom, and by how many links?   These are just some of the questions you can explore in this project.

We will provide you with a real-world data set and some infrastructure for getting started, as well as some warm up tasks and basic project requirements, but then it’ll be up to you where you want to take the project.  If you’re running short on ideas, we’ll have several suggested directions that can help get your creativity and imagination going.  Finally, to integrate the skills you acquired in course 4 (and to show off your project!) you will be asked to create a video showcase of your final product.

This course is provided by UCSD

![uni_logo](ucsd.png)


## After completing this course, you will be able to...
1. Independently implement a Java project of significant size.
2. Pose questions that can be answered with social network data.
3. Develop or find/select algorithms to answer these questions.
4. Make software design decisions.
5. Describe a technical project both through written reports and oral presentations.
6. Review others’ code design and oral presentation.
7. Analyze algorithms to assess their appropriateness for solving a given problem on real-world data.
8. Iterate a design to improve style and efficiency.


## Project Overview
In this capstone project you will explore social network data, completing a project where you work with graphs and other data structures you’ve learned in previous courses in this specialization, while applying at least one new algorithm to solve a problem of your choosing.

Social network data is all around us, and is easily represented as a graph. For example, if you think about your friend network on Facebook, each person can be represented as a node in the graph, and each friendship connection can be represented as an undirected edge between the nodes containing the people involved in the friendship. Twitter can be represented similarly, but with directed edges since following someone is a one-way relationship (you can follow someone without them following you back).

Using this graph abstraction, we can answer many interesting questions about the data underlying the graph. For example, we can automatically discover communities in a social network; we can recommend that people connect as friends based on the structure of their mutual acquaintances in the graph; we can figure out who the “influencers” are; and, we can look at how information might travel within and across groups.

In this capstone project, you will explore some of these issues. Which questions you answer and which properties you consider will largely be up to you: we’re looking for creativity and personal expression. We’ll provide you with some support, but where you go with it is up to you and we look forward to seeing what you uncover in the world of social network data!



### Questions
**Easier:** For a given user, which of their friends aren’t connected as friends? For example, if the given user, Maria, is friends
with both Jamaal and Huang, if Jamaal and Huang are not friends, we’ll suggest them as potential friends.

**Harder:** Find the Exact Cover Set. Figure out the smallest set of people who are connected to everyone in the network. For example, if everyone in the smallest set were to post something to their friends, everyone would see the post.

### Algorithms, Data Structures, and Answer to Question
**Main Data Structure:** The network has been laid out as a classic graph using an adjacency list. Each individual in the graph
is a vertex and an edge between vertices represents a friendship. This should work for both problems. Each node is stored as the key in a HashMap, with values representing the node’s outgoing edges, stored as a HashSet for quick O(1) lookup.

The exact cover problem is represented in Algorithm X using a matrix A consisting of 0s and 1s. The goal is to select a subset of the rows so that the digit 1 appears in each column exactly once.

[Algorithm X](https://en.wikipedia.org/wiki/Knuth%27s_Algorithm_X) functions as follows:

    If the matrix A has no columns, the current partial solution

    is a valid solution; terminate successfully. 
   
    Otherwise, choose a column c (deterministically). 

    Choose a row r such that A[r] = 1 (nondeterministically). 

    Include row r in the partial solution. 

    For each column j such that A[r][j] = 1,

        for each row i such that A[i][j] = 1, 
        
            delete row i from matrix A. 
            
        delete column j from matrix A. 
      
    Repeat this algorithm recursively on the reduced matrix A. 



### Test Results

    //facebook_1000 -> 214
    //facebook_2000 -> 223
    //facebook_ucsd -> 357 (16K Nodes)
