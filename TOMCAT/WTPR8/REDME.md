🧩 Tools Required
✅ Apache Tomcat (v7/8/9)
✅ JDK (Java Development Kit)
✅ Eclipse IDE for Java EE Developers (recommended)
✅ Struts JARs in /WEB-INF/lib

🚀 Steps to Run Java Files in Struts Project
🧱 Step 1: Setup Project Structure in Eclipse
Open Eclipse IDE.

Go to File > New > Dynamic Web Project.

Name the project WTPR8.

Set Target Runtime to Apache Tomcat.

Click Finish.

📂 Step 2: Add Your Code Files
Add your .java files (LoginAction.java, LoginForm.java) to:

swift
Copy code
/WTPR8/src/com/wtpr8/action/
/WTPR8/src/com/wtpr8/form/
Add JSP files to:

bash
Copy code
/WTPR8/WebContent/login.jsp
/WTPR8/WebContent/success.jsp
Put your web.xml and struts-config.xml in:

swift
Copy code
/WTPR8/WebContent/WEB-INF/
Add Struts JARs in /WEB-INF/lib. (Need help finding them? I can provide a download list.)

🛠 Step 3: Build & Compile Automatically
Eclipse will auto-compile .java files into .class files and place them in build/classes.

If not, go to:

java
Copy code
Project > Build Automatically (✅)
▶️ Step 4: Run on Tomcat Server
Right-click your project > Run As > Run on Server.

Choose Apache Tomcat.

App runs on:

arduino
Copy code
http://localhost:8080/WTPR8/
Example:

Visit http://localhost:8080/WTPR8/login.jsp

Fill the form and submit

You will be forwarded to success.jsp

🧪 (Alternative) Compile Java Manually (without Eclipse)
If you're not using Eclipse:

bash
Copy code
# Navigate to src
cd WTPR8/src

# Compile .java files
javac -classpath "path/to/struts.jar;." com/wtpr8/form/LoginForm.java
javac -classpath "path/to/struts.jar;." com/wtpr8/action/LoginAction.java