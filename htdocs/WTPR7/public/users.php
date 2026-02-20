<?php
require_once('../includes/db.php');
$result = $conn->query("SELECT id, name, email FROM users");
?>

<!DOCTYPE html>
<html>
<head>
    <title>User List</title>
    <link rel="stylesheet" href="../assets/css/style.css">
</head>
<body>
    <h2>Registered Users</h2>
    <table border="1" cellpadding="10">
        <tr>
            <th>ID</th><th>Name</th><th>Email</th>
        </tr>
        <?php while($row = $result->fetch_assoc()) : ?>
        <tr>
            <td><?= $row['id']; ?></td>
            <td><?= $row['name']; ?></td>
            <td><?= $row['email']; ?></td>
        </tr>
        <?php endwhile; ?>
    </table>
</body>
</html>
