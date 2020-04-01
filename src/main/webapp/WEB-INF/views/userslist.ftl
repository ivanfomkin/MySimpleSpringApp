<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>My First SpringApp</title>
</head>
<body>
<h1>Users list from database:</h1>
<table border="1">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Age</th>
    </tr>
    <#list users as user>
        <tr>
            <td><a href="/users/${user.id}">${user.id}</a></td>
            <td>${user.name}</td>
            <td>${user.email}</td>
            <td>${user.age}</td>
            <td><a href="/delete/${user.id}">delete</a></td>
            <td><a href="/update/${user.id}">update</a></td>
        </tr>
    </#list>
</table>
<br>
<a href="/addUser">Create new user</a>
</body>
</html>