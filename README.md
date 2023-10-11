# Jawwy-Automated-UI is a test automation project automates https://subscribe.jawwy.tv/dz-en and also reports the test result with Allure-testng reporting library.

## Tools and Libraries:
* Selenium-Java 4.12.1
* WebDriverManager 5.5.3
* TestNG 7.8.0
* Allure-testng 2.24.0

## Technologies:
* Page Object Model (POM)
* Allure reporting from command line.
* Running tests using testng.xml
* Reading data from .properties files.
* Writting test results to .txt file.

## To run the tests and generate allure report:
* Install Allure command line application using Scoop commandline-installer
   * Run below command from your PowerShell to install scoop to its default location (C:\Users\\scoop)
     * One of the easiest way to start PowerShell in Windows, is using Run window. Press Win + R keys on your keyboard, then type powershell and press Enter or click OK.
     * Run the following command in PowerShell iex (new-object net.webclient).downloadstring('https://get.scoop.sh')
     * If you get an error, you might have to set the execution policy (i.e. enable Powershell)with **Set-ExecutionPolicy RemoteSigned -scope CurrentUser**
   * To install Allure, using Scoop, run the below command **scoop install allure**
* Create testng.xml file to execute tests.
*  Now, open command prompt, navigate to the project directory, and run tests using below command! **mvn clean test**
   * If you get an error **'mvn' is not recognized as an internal or external command, operable program or batch file.**
      * Open IntelliJ and press Ctrl+Alt+S -> Build, Execution, Deployment -> Build tool -> Maven -> Maven home directory
      * go to System environment variables and set these variables
      * set these variables:
          Variable name: MAVEN_HOME
          Variable value: C:/Program Files/JetBrains/IntelliJ IDEA 2019.3.1/plugins/maven/lib/maven3
      * After defining system variable MAVEN_HOME find variable path and add this line to the list
         %MAVEN_HOME%\bin
* Re-open command prompt, navigate to the project directory, and run tests using below command! **mvn clean test**
* Once the execution is completed, By default, TestNG attaches a few basic listeners to generate HTML and XML reports and surefire generates TEST-*.xml files under ${basedir}/target/surefire-reports.
  * Now let us run below command to generate allure reports **allure serve**
* To output Allure results to the build directory (the default is target/allure-results), We need to put the allure.properties file in src/test/resources/ and add below value :
   * File name : - allure.properties
     value : allure.results.directory=target/allure-results
* If you want to save html report on your project directory, run the below allure command **allure generate**

  Further reading on how to use Allure report: **https://www.seleniumeasy.com/testng-tutorials/allure-example**
  Further reading on how to solve **'mvn' is not recognized as an internal or external command, operable program or batch file.**
   https://stackoverflow.com/questions/17432809/mvn-is-not-recognized-as-an-internal-or-external-command-operable-program-or




  ## Twitter Test Cases Design Document 
[Twitter - App - Test Plan.xlsx](https://github.com/AliEleish/Jawwy-Automated-UI/files/12875490/Twitter.-.App.-.Test.Plan.xlsx)
