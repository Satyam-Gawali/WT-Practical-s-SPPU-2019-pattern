<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="container login-container">
        <h2>User Login</h2>
        <html:form action="/login">
            <div class="form-group">
                <label for="name">Name:</label>
                <html:text property="name" styleId="name"/>
            </div>
            
            <div class="form-group">
                <label for="mobile">Mobile Number:</label>
                <html:text property="mobile" styleId="mobile"/>
            </div>
            
            <div class="form-group">
                <label for="email">Email ID:</label>
                <html:text property="email" styleId="email"/>
            </div>
            
            <html:submit value="Login" styleClass="submit-btn"/>
        </html:form>
    </div>
</body>
</html>