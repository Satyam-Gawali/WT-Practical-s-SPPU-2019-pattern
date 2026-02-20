<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Welcome to WTPR7</title>
    <link rel="stylesheet" href="../assets/css/style.css">
    <style>
        .welcome-box {
            background-color: #ffffff;
            padding: 40px;
            border-radius: 15px;
            text-align: center;
            box-shadow: 0 8px 16px rgba(0,0,0,0.1);
            max-width: 500px;
            margin: auto;
            margin-top: 100px;
        }

        .welcome-box h1 {
            font-size: 32px;
            color: #007BFF;
            margin-bottom: 20px;
        }

        .welcome-box p {
            font-size: 18px;
            color: #555;
            margin-bottom: 30px;
        }

        .btn-group a {
            display: inline-block;
            margin: 0 10px;
            padding: 12px 25px;
            background-color: #007BFF;
            color: white;
            border-radius: 8px;
            font-weight: bold;
            transition: background 0.3s;
        }

        .btn-group a:hover {
            background-color: #0056b3;
        }

        @media (max-width: 500px) {
            .btn-group a {
                display: block;
                margin: 10px auto;
                width: 80%;
            }
        }
    </style>
</head>
<body>

<div class="welcome-box">
    <h1>Welcome to WTPR7</h1>
    <p>This is a simple PHP-MySQL web application for user registration and listing.</p>

    <div class="btn-group">
        <a href="register.php">Register User</a>
        <a href="users.php">View Users</a>
    </div>
</div>

</body>
</html>


