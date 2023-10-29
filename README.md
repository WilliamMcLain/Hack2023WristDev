# Hack2023WristDev
## Simple overview of use/purpose.
This project utilizes Inertial Measurement Units (IMUs) to develop a biosensor monitor for carpal tunnel rehabilitation. The code for this project allows the IMU to be able to run, the usage of the values gathered to train and test in a machine learning algorithm, and a UX for an interface.

This project is intended to monitor the rehabilitation process of carpal tunnel. Because of the risk of repetitive motions and angular velocity experienced by the wrist post-rehab, the project monitors the angular velocity and determines whether the experienced values are acceptable or not through a machine learning algorithm. The algorithm then displays a summary of the recorded values on a user interface for clinicians to monitor and review. The languages used are C++ for the Arduino, Python for the model, and Javascript for the UI/UX.

## Getting Started
The system utilizes the Arduino IDE (C++ language) to read data from the sensors, Python for preprocessing and machine-learning model, and Java for user interface and experience. The system is compatible with the following systems and above: Arduino IDE 2.2, Python 23.7, and Java 17.
### Libraries and Packages
**Arduino:** 
- SparkFun_ISM330DHCX.h
**Python**
- numpy
- pandas
- sklearn.model_selection
- sklearn.linear_model
**Java**
- java.io.*
- javax.swing.*
- java.util.*
- java.awt.*

## Hardware Setup
The IMU is powered by 3.3V and communicates with the Arduino through I2C by connecting the SDA and SCL. The IMU is placed in the center of the back of the hand, and is mounted to the glove to have it fixed in the appropriate position. The Arduino, along with its casing, is mounted on the forearm with a strap similar to a watch.

## How to run the program
- The 
code blocks for commands
Help
Any advise for common problems or issues.

command to run if program contains helper info
Authors
Contributors names and contact info

ex. Dominique Pizzie
ex. @DomPizzie

Version History
0.2
Various bug fixes and optimizations
See commit change or See release history
0.1
Initial Release
License
This project is licensed under the [NAME HERE] License - see the LICENSE.md file for details

Acknowledgments
Inspiration, code snippets, etc.

awesome-readme
PurpleBooth
dbader
zenorocha
fvcproductions

# Project Title

Getting Started
Dependencies
Describe any prerequisites, libraries, OS version, etc., needed before installing program.
ex. Windows 10
Installing
How/where to download your program
Any modifications needed to be made to files/folders
Executing program
How to run the program
Step-by-step bullets
code blocks for commands
Help
Any advise for common problems or issues.

command to run if program contains helper info
Authors
Contributors names and contact info

ex. Dominique Pizzie
ex. @DomPizzie

Version History
0.2
Various bug fixes and optimizations
See commit change or See release history
0.1
Initial Release
License
This project is licensed under the [NAME HERE] License - see the LICENSE.md file for details

Acknowledgments
Inspiration, code snippets, etc.

awesome-readme
PurpleBooth
dbader
zenorocha
fvcproductions
