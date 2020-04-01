<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create User</title>
</head>
<body>
<h1>Adding new user</h1>
<br>
<form name="user" action="/addUser" method="post">
    Name
    <input title="Name" type="text" name="name">
    Email
    <input title="Email" type="text" name="email">
    Age
    <input title="Age" type="number" name="age">
    <br>
    <input type="submit" value="Create user">
</form>
</body>
</html>