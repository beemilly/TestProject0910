<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="false" %>
<html>
<head>
	<title>로그인화면</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
	<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
	<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
	<script>


	</script>
	<style type="text/css">
		body {
			padding-top: 120px;
		}
	</style>
</head>
<body>
	<div class="container">
		<div class="col-xs-4 col-xs-offset-4">
			<div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title" style="">근무관리표</h3>
				</div>
				<div class="panel-body">
					<form accept-charset="UTF-8" role="form" action="login_check" method="post">
						<fieldset>
							<div class="form-group">
								<input class="form-control" id="loginId" placeholder="아이디" name="loginId" type="text">
							</div>
							<div class="form-group">
								<input class="form-control" id="password" placeholder="비밀번호" name="loginPassword" type="password" onchange="passwordCheck()">
							</div>
							<div style="color:red" id="warningPasswordMsg">
							</div>
							<div class="form-group">
								<input class="btn btn-lg btn-success btn-block" type="submit" value="Login">
							</div>
						</fieldset>
					</form>
					<a class="btn btn-primary" href="find_password">비밀번호 찾기</a>
					<div style="color:red">${msg}</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
