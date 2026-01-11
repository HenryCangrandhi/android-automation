Android Automation Test – Appium + Java + Cucumber

This repository contains an Android automation testing framework built using Java, Appium, Cucumber (BDD), and JUnit.
The project demonstrates an end-to-end checkout flow automation for a sample Android application.

Tech Stack

Java (JDK 11)
Appium (v2+)
Appium UiAutomator2 Driver
Cucumber (BDD)
JUnit 4
Maven
Android Studio
Android Emulator
Appium Inspector
SLF4J Logging

Project Structure
<img width="341" height="473" alt="image" src="https://github.com/user-attachments/assets/6d33192c-5005-4482-9994-1c5e71a8064d" />

Prerequities
1. JDK 11+, verify with java -version
2. Maven, verify with mvn -version
3. Node.js & Appium, verify with
node -v
npm -v
4. Install appium and UIautomator2
5. Install android studio and download emulator from device manager (Ensure environment variable are set).
6. Install appium inspector from website

How to run test
1. Run appium from cmd
2. Ppen emulator from android studio
3. Run cucumber test via Maven or cmd.

Test Scenarios

- The automated tests cover:
- Product selection
- Cart operations
- Login flow
- Checkout process
- Payment submission
- Order completion validation
