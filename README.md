# 📱 Appium Calculator Automation

This is a basic calculator app automation testing project using **Appium** on an Android emulator via **Android Studio**.

---

## Automation Scenario 

This project performs the following test cases:

1.    Sum of 2 numbers → (e.g., 6 + 9 = 15)  
2.  Subtraction of 2 numbers → (e.g., 9 - 1 = 8)  
3.  Solve this series: `100 + 200 - 100 * 2 / 5`  
4.  **Series from CSV file**  
   - From `data.csv`:  
     ```
     50+40-30/2+20     // Expected: 95     
     10*2/2+10-20      // Expected: 0      
     4pi2^3            // Expected: 100
     ```

---

## 🛠️ Tools & Frameworks

| Tool / Framework             | Purpose                          |
|-----------------------------|----------------------------------|
| **Java**                    | Programming Language             |
| **Appium**                  | Mobile automation framework      |
| **Selenium**                | WebDriver integration            |
| **Appium Inspector**        | GUI element inspector            |
| **TestNG**                  | Test execution framework         |
| **Gradle**                  | Build automation tool            |
| **Allure**                  | Test report generation           |
| **IntelliJ / Android Studio** | Integrated Development Environment |

---

## ⚙️ Setups

1. Install [Android Studio](https://developer.android.com/studio)  
2. Install [Appium](https://appium.io/)  
3. Install [Appium Inspector](https://github.com/appium/appium-inspector)  
4. Install **Java JDK 8 or above**  
5. Set the following environment variables:

   - `JAVA_HOME`  
   - `GRADLE_HOME`  
   - `ALLURE_HOME`  

---

##  How to Run the Project

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/SaniaNowshin/Appium-Calculator-app-automation.git
cd Appium-Calculator-Automation
```

### 2️⃣ Start Appium Server

```bash
appium -p 4723
```

### 3️⃣ Start Emulator

- Open Android Studio  
- Create or start an Android Virtual Device (AVD)

### 4️⃣ Run Tests

From the root project directory:

```bash
gradle clean test
```

---

## 📊 Generate Allure Report

After test execution is complete, generate and open the report:

```bash
allure generate allure-results --clean -o allure-report
allure serve allure-results
```

## Automation Video

![Watch the Test Automation](https://github.com/user-attachments/assets/1acfe661-bc2f-44c8-aa7e-bba76c775d41)


---

## Allure Report

![4](https://github.com/user-attachments/assets/b5a22569-53b4-4921-9add-501576cee0ac)
![5](https://github.com/user-attachments/assets/68629c43-527d-40cc-9029-01cb4a8a035f)

