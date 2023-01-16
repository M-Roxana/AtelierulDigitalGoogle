Builder Pattern

Scenario: Use Builder Design Pattern to help users to create their own personalized T-shirts.

The user has several options with which he can create his own various t-shirt designs. He can choose if is for a woman or for a man, his size, color,
 if he desires a print and the print pattern, cut, and he has the possibility to write a text on the t-shirt.
 The user is not bound to choose all options available, that's why this pattern is very useful. The user can very quickly make a similar order to a t-shirt,
 changing only some options, without having to enter again all the preferences.

 Advantages:
 We can set just the properties we need and the build method can handle defaults.

 Disadvantages:
 Code duplication as Builder needs to copy all fields from Original or Item class.