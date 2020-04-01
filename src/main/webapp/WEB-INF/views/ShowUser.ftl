<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User info</title>
</head>
<body>
<h1>Info about ${user.name}</h1>
<table>
    <tr>
        <td>id</td>
        <td>${user.id}</td>
    </tr>
    <tr>
        <td>name</td>
        <td>${user.name}</td>
    </tr>
    <tr>
        <td>email</td>
        <td>${user.email}</td>
    </tr>
    <tr>
        <td>age</td>
        <td>${user.age}</td>
    </tr>
</table>
<br>
<a href="/delete/${user.id}">delete this user</a>
<a href="/update/${user.id}">edit this user</a>
<a href="/users">Go back</a>
</body>
</html>