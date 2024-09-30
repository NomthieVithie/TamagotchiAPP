**Tamagotchi App**
This is a virtual pet application,The code implements a simple Android application that allows users to interact with a virtual pet. Users can feed, clean, and play with the pet, which affects the pet's status metrics: hunger, happiness, and cleanliness. The app updates the visual representation of the pet based on user actions.

**User interface**
btnFeed(Button) :This button is clicked to stimulate the pet's Hunger level,there is a txtHunger2(ViewText) parallel to this button where the Hunger level is shown.
btnClean: This button is clicked for the pets cleanliness , there is a txtClean(TextView)parrallel to it that shows the results of the cleanliness level.
btnPlay: This button is clicked for pets Happines level, there is a txtHappiness(TextView) parallel to it that shows the result of the Happiness level

updateMoodTextViews(txtHunger, txtHappy, txtClean) to initialize TextViews to the curent status of the pet

Strengths:

Simplicity: The code is straightforward and easy to understand. Encapsulation: The pet's state is encapsulated within the MainActivity2 class, promoting code organization. Event Handling: The use of OnClickListeners ensures a responsive user experience. Weaknesses:

Hardcoded Values: The initial values for hunger, happiness, and cleanliness are fixed. Lack of Constraints: There are no upper limits for the status variables. No Decrementing Logic: The pet's needs don't automatically decrease over time. Potential Improvements:

Dynamic State Management: Introduce a timer to decrease status levels gradually and set upper limits for each variable. Enhanced User Feedback: Add sound effects, animations, or notifications. State Persistence: Save the pet's state using SharedPreferences or a database. User Customization: Allow users to personalize the pet's appearance and name.

Conclusion: The Virtual Pet App provides a basic framework for a virtual pet experience. By addressing the identified weaknesses and incorporating the suggested improvements, the app can evolve into a more engaging and immersive experience for users.

Strengths:

Simplicity: The code is straightforward and easy to understand. Encapsulation: The pet's state is encapsulated within the MainActivity2 class, promoting code organization. Event Handling: The use of OnClickListeners ensures a responsive user experience. Weaknesses:

Hardcoded Values: The initial values for hunger, happiness, and cleanliness are fixed. Lack of Constraints: There are no upper limits for the status variables. No Decrementing Logic: The pet's needs don't automatically decrease over time. Potential Improvements:

Dynamic State Management: Introduce a timer to decrease status levels gradually and set upper limits for each variable. Enhanced User Feedback: Add sound effects, animations, or notifications. State Persistence: Save the pet's state using SharedPreferences or a database. User Customization: Allow users to personalize the pet's appearance and name.

Conclusion: The Virtual Pet App provides a basic framework for a virtual pet experience. By addressing the identified weaknesses and incorporating the suggested improvements, the app can evolve into a more engaging and immersive experience for users.


**technologies used**
-Kotlin was used to code the android appplication
-Android Studio to develop the applicaution
-Github to test the application

The app was developed using Kotlin in Android Studio. Kotlin was chosen for its concise syntax and full compatibility with Android development. Version control was set up using Git, and the project was hosted on GitHub for collaboration and backup purposes. The app’s main functionality resides in the MainActivity.kt file, where user input is processed and validated before being compared to a predefined list of historical figures.

**testing**
**Manual Testing**
-App is launched, and pet's initial hunger level is displayed.
-Click on the "Feed" button
Expected Result:
Hunger increases by 5.
Happiness increases by 10.
Image changes to eating.
The same method for two other buttons

Automated testing
-This repository uses GitHub Actions for Continuous Integration 
-Every time you push changes, GitHub Actions will automatically run tests and build the project.



