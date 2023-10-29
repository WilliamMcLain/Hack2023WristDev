#include <Wire.h>
#include "SparkFun_ISM330DHCX.h"

//Defining the IMU sensor
SparkFun_ISM330DHCX myISM; 

//Structure data into X, Y, and Z
//Accelerometer is needed for sensor setup
sfe_ism_data_t accelData; 
sfe_ism_data_t gyroData;

void setup(){

	Wire.begin();

	Serial.begin(115200);

	if( !myISM.begin() ){
		Serial.println("Did not begin.");
		while(1);
	}

	// Reset the device to default settings.
	myISM.deviceReset();

	// Wait for it to finish reseting
	while( !myISM.getDeviceReset() ){ 
		delay(1);
	} 

	//Serial.println("Reset.");
	//Serial.println("Applying settings.");
	delay(100);
	
	myISM.setDeviceConfig();
	myISM.setBlockDataUpdate();
	
	// Set the output data rate and precision of the accelerometer
	myISM.setAccelDataRate(ISM_XL_ODR_104Hz);
	myISM.setAccelFullScale(ISM_4g); 

	// Set the output data rate and precision of the gyroscope
	myISM.setGyroDataRate(ISM_GY_ODR_104Hz);
	myISM.setGyroFullScale(ISM_500dps); 

	// Turn on the accelerometer's filter and apply settings. 
	myISM.setAccelFilterLP2();
	myISM.setAccelSlopeFilter(ISM_LP_ODR_DIV_100);

	// Turn on the gyroscope's filter and apply settings. 
	myISM.setGyroFilterLP1();
	myISM.setGyroLP1Bandwidth(ISM_MEDIUM);


}

void loop(){

	// Check if gyroscope data is available.
	if( myISM.checkStatus() ){
		myISM.getGyro(&gyroData);

    //Convert the data from dpms to dps
    float gyroX = gyroData.xData/1000;
    float gyroY = gyroData.yData/1000;
    float gyroZ = gyroData.zData/1000;

    //Obtain Angular Velocity in dps
    float gyroData = sqrt((gyroX*gyroX)+(gyroY*gyroY)+(gyroZ*gyroZ));
    
    //Serial.print("Gyroscope: ");
    Serial.println(gyroData);
	}

	delay(250);
}

