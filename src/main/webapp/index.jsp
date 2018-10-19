<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="register" method="post" enctype="multipart/form-data">
    用户名：<input type="text" name="username" /><br/>
    密码：<input type="password" name="password" /><br/>
    确认密码：<input type="password" name="passwordSure" /><br/>
    上传头像：<input type="file" name="file" /><br/>
     <input type="submit" value="注册"><br/>
</form>

</body>
</html>