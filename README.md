# Binary Search Tree

A social networking website stores information about its users in a binary search tree. In addition to the components that provide access to the left and right branches of the tree, each node in the tree contains a unique user number (the key value), the user's name, and a list of the names of each of the user's friends. Write the data definitions needed for this binary search tree.
  •	Write a method friend-count which takes a user number and returns the number of friends that the person with the given user number has. You may assume the user number exists in the tree. Your function should be written efficiently, such that it performs as few comparisons in the tree as is necessary.
  •	Write a method friend-everyone, which takes the name of a person and returns a new binary search tree such that the named person has been added to each user's friend list.
  •	Write a method list-names-in-order, which takes a binary search tree and produces a list of the names of users in the tree, such that the list of names is in ascending numeric order by user number. (Hint: you do not have to write a sorting algorithm. Use what you know about the order of items in a binary search tree to help you.)
  •	Write a method add-new-user, which takes a user number, and a user name, and adds a new user with the given information to the binary search tree. The user's list of friends should be empty. Make sure that the tree that is produced is a binary search tree. You may assume that the user number does not already exist in the given tree. 
  •	Write a method delete-user, which takes a user number, and deletes this user from the binary search tree. Make sure that the tree that is produced is a binary search tree. You may assume that the user number exists in the given tree.
  •	Write the main method to test your program

