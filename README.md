# TASK-4-AI-BASED_RECOMMENDATION_SYSTEM


# Project Overview

This project is a User-Based Collaborative Filtering Recommendation System developed in Java using Apache Mahout, a library designed for scalable machine learning and data mining. The system’s primary goal is to recommend items to users based on the preferences and behaviors of other users with similar tastes. By analyzing past ratings, the program predicts which items a user is likely to enjoy, making it suitable for applications such as e-commerce platforms, movie or music streaming services, content recommendation websites, and personalized marketing.

The system reads user-item rating data from a CSV file, calculates similarities between users, identifies the most relevant neighbors, and generates personalized recommendations for a specified user. It demonstrates core concepts in collaborative filtering, Java programming, and practical machine learning, including file handling, exception management, and the use of third-party libraries.

# Features

•	User-Based Collaborative Filtering: Suggests items for a user based on ratings from similar users.

•	Pearson Correlation Similarity: Measures how closely users’ ratings align to identify similar tastes.

•	Nearest N User Neighborhood: Focuses the recommendation process on the most relevant users.

•	Interactive Console Input: Users provide their ID and the number of recommendations they want.

•	Preference Scores: Each recommended item includes a predicted score showing the user’s likely interest.

•	Error Handling: Handles missing files, invalid user IDs, or empty recommendation results gracefully.

# Dataset Information
The system uses a structured CSV dataset containing explicit user ratings for items. This type of dataset is commonly called explicit feedback data, as users directly provide ratings to indicate their level of preference.

Dataset structure:

•	User ID: A unique numeric identifier for each user.
•	Item ID: A unique numeric identifier for each item, such as a product, movie, or content piece.
•	Rating: The numeric rating given by the user to the item, typically on a scale from 1 to 5.
Example :

userID,itemID,rating
1,101,5
1,102,4
2,101,4
2,103,2

# Tools and Technologies

•	Java 

•	Apache Mahout

•	Eclipse / IntelliJ IDEA

•	CSV File

•	Console Interface

# Applications

•	Movie and Music Streaming: Suggest movies, shows, or songs a user might like.

•	E-Commerce Platforms: Recommend products that other similar users have purchased.

•	Content Websites: Suggest articles, tutorials, or videos personalized for the user.

•	Personalized Marketing: Provide users with items they are likely to purchase or engage with.

 # Working

•	Data Loading: The program reads the CSV file using Mahout’s FileDataModel.

•	Similarity Calculation: It calculates similarity between users using Pearson correlation, which identifies how closely users rate the same items.

•	Neighborhood Selection: The top N most similar users are selected as neighbors using NearestNUserNeighborhood. These users’ ratings are used to generate predictions.

•	Recommendation Generation: Using GenericUserBasedRecommender, the system predicts items that the target user is likely to enjoy, based on their neighbors’ preferences.

•	User Interaction: The program prompts the user for a User ID and the number of recommendations to display.

•	Output: Recommended items are displayed in the console with their Item IDs and predicted preference scores. If no new items are available, a message informs the user.

# OUTPUT





