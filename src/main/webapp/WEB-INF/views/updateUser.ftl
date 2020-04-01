<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User editor</title>
</head>
<body>
<h1>Editing ${user.name}</h1>
<br>
<form name="user" action="/updateUser" method="post">
    Id
    <input title="Id" type="number" name="id" value="${user.id}" >
    Name
    <input title="Name" type="text" name="name" value="${user.name}">
    Email
    <input title="Email" type="email" name="email" value="${user.email}">
    Age
    <input title="Age" type="number" name="age" value="${user.age}">
    <br>
    <input type="submit" value="Save">
</form>
<br>
<a href="/delete/${user.id}">delete this user</a>
<a href="/users">Go back</a>
</body>
</html>