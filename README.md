# Java Coding Puzzle

The Alfresco Java Coding Puzzle. This is the skeleton project used as part of the on-site interview process.

You should receive a copy of the instructions for the coding challenge.

As a reminder: **It's less important how much of the challenge you complete, and more important the approach you take to do it**

Good luck.

## About the code

The Java code is Java 8 compatible.

It can be built using Maven. This will also run the tests.

```
   mvn clean package
```

### Models

Two models are provided as `Film` and `DirectorAndLeadingActorPair`. The `Film` model represents a film, and has many fields. You may not need to use all of the fields as part of the challenge.

`DirectorAndLeadingActorPair` is a class representing a Director and an Actor pairing. You will need it to answer one of the questions as part of the coding challenge.

### Repository

The `MovieRepository` class provides a method for reading the JSON document (which contains the list of movies), and turns it into a `List<Film>`.

### App

The `App` class shows usage of the `MovieRepository` class.

### Question One
`FilmStats` is a stub class for the first part of your challenge. Feel free to modify this class, or its contents as part of solving the first problem.

To help you out with answering these questions, you may find the following information about the data useful:

+ Numeric values which are unknown are either stored as 0 or -1
+ String values which are unknown are either the empty string or `null`
+ The data set contains duplicate movie titles. We're not bothered if your results filter out these duplicates or not

Tests (with the correct answers) are provided in `FilmStatsTest`.

### Question Two

For question two, we need you to design and code a simple application. You should structure the classes, tests and any other associated code any way you like in order to solve the challenge.

