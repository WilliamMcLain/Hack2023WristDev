# Hack2023WristDev
## Simple overview of use/purpose.
This project utilizes Inertial Measurement Units (IMUs) to develop a biosensor monitor for carpal tunnel rehabilitation. The code for this project allows the IMU to be able to run, the usage of the values gathered to train and test in a machine learning algorithm, and a UX for an interface.

This project is intended to monitor the rehabilitation process of carpal tunnel. Because of the risk of repetitive motions and angular velocity experienced by the wrist post-rehab, the project monitors the angular velocity and determines whether the experienced values are acceptable or not through a machine learning algorithm. The algorithm then displays a summary of the recorded values on a user interface for clinicians to monitor and review. The languages used are C++ for the Arduino, Python for the model, and Javascript for the UI/UX.

## Getting Started
The system utilizes the Arduino IDE (C++ language) to read data from the sensors, Python for preprocessing and machine-learning model, and Java for user interface and experience. The system is compatible with the following systems and above: Arduino IDE 2.2, Python 23.7, and Java 17.
### Libraries and Packages
**Arduino:** 
- SparkFun_ISM330DHCX.h

**Python:**
- numpy
- pandas
- sklearn.model_selection
- sklearn.linear_model

**Java:**
- java.io.*
- javax.swing.*
- java.util.*
- java.awt.*

## Hardware Setup
The IMU is powered by 3.3V and communicates with the Arduino through I2C by connecting the SDA and SCL. The IMU is placed in the center of the back of the hand and is mounted to the glove to have it fixed in the appropriate position. The Arduino, along with its casing, is mounted on the forearm with a strap similar to a watch.

## How to run the program
- The code is initialized by uploading and running the GyroData.ino code to the Arduino. (This only needs to be done once)
- In Python, you can collect personalized data to train the model or use the already collected dataset. To collect personalized data, run the first block from BridgePython.ipynb. Make sure to have arduino_port updated based on the connected COM and select the desired number of samples.
- Run either the already collected datasets, GoodData.csv and BadData.csv, or personalized data (must update csv filenames) to train the Machine Learning model by running the second block from BridgePython.ipynb.
- Lastly, if the first block of BridgePython.ipynb was altered for personalized data collection, revert the filename from the first block of BridgePython.ipynb to "inputData" and run the first and then third block to generate the outputData.
- Run the HackDevWrist class file as a Java Application to open the UI and use the software.

Contributors names and contact info
- Hasan Dheyaa - hassan.dheyaa02@gmail.com
- William McLain - mclaindwilliam@gmail.com
- Tian Wang - mark.wang20020601@gmail.com
