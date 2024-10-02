**Tamagotchi App**

The Tamagotchi App is a virtual pet application designed to provide users with an interactive experience, allowing them to engage with a digital pet. Through this simple Android application, users can feed, clean, and play with their virtual pet. These interactions directly impact the pet's status metrics, which include hunger, happiness, and cleanliness. The app is designed to update the visual representation of the pet based on the actions taken by the user, creating an engaging and immersive experience.

**User Interface**
The user interface of the Tamagotchi App is intuitive and user-friendly, featuring several key components:

Feed Button (btnFeed): This button is used to stimulate the pet's hunger level. When clicked, it increases the pet's hunger metric. Adjacent to this button is a TextView (txtHunger2) that displays the current hunger level of the pet, allowing users to easily track their pet’s needs.

Clean Button (btnClean): This button serves the purpose of enhancing the pet's cleanliness level. Users can click this button to clean their pet, which updates the corresponding cleanliness metric. A parallel TextView (txtClean) shows the current cleanliness status, providing immediate feedback on the pet’s hygiene.

Play Button (btnPlay): This button is designed to enhance the pet's happiness level. When users engage with their pet by clicking this button, the happiness metric is positively affected. A related TextView (txtHappiness) displays the current happiness level, giving users insight into their pet’s emotional state.

**Functionality**
The core functionality of the app is encapsulated in the updateMoodTextViews(txtHunger, txtHappy, txtClean) method. This method initializes the TextViews to reflect the current status of the pet accurately. It is a fundamental part of the app, ensuring that users receive real-time updates about their virtual pet's needs.

**Strengths of the Application**
The Tamagotchi App has several notable strengths:

Simplicity: The code structure is straightforward and easy to comprehend. This simplicity makes it accessible to both novice and experienced developers, as well as users who may not have a technical background.

Encapsulation: The pet's state is encapsulated within the MainActivity2 class. This encapsulation promotes better organization of the code and makes it easier to manage the pet’s data and behavior.

Event Handling: The app utilizes OnClickListeners effectively, which ensures a responsive user experience. Users can interact with the pet seamlessly, making the application feel more dynamic.

Weaknesses of the Application
While the Tamagotchi App has many strengths, it also has some weaknesses that can be addressed to enhance the user experience:

Hardcoded Values: The initial values for hunger, happiness, and cleanliness are fixed within the code. This lack of variability can lead to a monotonous experience, as users may not feel the consequences of their actions in a meaningful way.

Lack of Constraints: There are currently no upper limits set for the status variables. This means that users can theoretically increase their pet's metrics indefinitely, which may diminish the challenge and engagement over time.

No Decrementing Logic: The pet's needs do not automatically decrease over time. Without a system in place to simulate the natural decline of the pet's needs, users may not feel a sense of urgency or responsibility for their virtual pet.

Potential Improvements
To address the identified weaknesses, several potential improvements could be implemented:

Dynamic State Management: Introducing a timer to gradually decrease the status levels of hunger, happiness, and cleanliness would create a more engaging experience. Additionally, setting upper limits for each variable would add a layer of strategy, encouraging users to balance their interactions effectively.

Enhanced User Feedback: Adding sound effects, animations, or notifications could significantly enhance the user experience. For instance, playful sounds when the pet is fed or animated reactions to user actions would make the app feel more lively and engaging.

State Persistence: Implementing a method to save the pet's state using SharedPreferences or a database would allow users to return to their pet without losing progress. This feature would make the app more user-friendly and encourage longer-term engagement.

User Customization: Allowing users to personalize their pet's appearance and name would create a deeper emotional connection. Features such as choosing colors, outfits, or accessories could make the experience more enjoyable and unique for each user.

**Conclusion**
The Virtual Pet App serves as a foundational framework for a digital pet experience. While it currently offers basic interactions and functionality, addressing the identified weaknesses and incorporating suggested improvements can significantly enhance the overall user experience. By evolving the app into a more dynamic and engaging platform, it can better meet the expectations of users seeking an immersive virtual pet experience.

**Technologies Used**
The Tamagotchi App was developed using several key technologies:

Kotlin: The app is coded in Kotlin, a modern programming language that offers a concise syntax and full compatibility with Android development. Kotlin was chosen for its expressive features and ease of use, which facilitate rapid development.

Android Studio: This integrated development environment (IDE) was utilized to create the application. Android Studio provides a comprehensive suite of tools for Android app development, including a layout editor, debugging tools, and performance analysis.

GitHub: Version control was set up using Git, and the project was hosted on GitHub. This allows for collaborative development, code versioning, and easy backup of the project, ensuring that the development process is streamlined and organized.

**Testing**
The application underwent both manual and automated testing to ensure functionality and reliability:

Manual Testing
During manual testing, the following steps were conducted:

The app was launched, and the pet's initial hunger level was displayed.
Users clicked on the "Feed" button.
Expected Result: The hunger level increased by 5, the happiness level increased by 10, and the pet's image changed to reflect that it was eating.
The same testing method was applied to the clean and play buttons, ensuring that all features functioned as intended.
Automated Testing
Automated testing was implemented using GitHub Actions for continuous integration. This means that every time changes are pushed to the repository, GitHub Actions automatically runs tests and builds the project. This automated process ensures that the app remains stable and functional as new features and improvements are added.



![home](https://github.com/user-attachments/assets/8bdac51c-413b-4fa2-a64d-6387c4b5442f)

![home 2](https://github.com/user-attachments/assets/6c09f198-15cf-47db-b0e5-fa0e8e96eccf)
![feed2](https://github.com/user-attachments/assets/f0f0aab1-b70c-492d-824b-2261f717f2e0)
![play2](https://github.com/user-attachments/assets/365ed477-f465-4332-b86b-1100f81aa189)
![clean2](https://github.com/user-attachments/assets/a1c32b53-0a8d-423b-917d-0153805d0840)

Youtube Link: https://youtu.be/ZlKZO3mcdP4
