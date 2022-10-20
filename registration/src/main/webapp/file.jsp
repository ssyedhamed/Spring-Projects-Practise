<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>File Upload</title>
</head>
<body>
	<h1>upload your file</h1>


	<form action="upload" method="post" enctype="multipart/form-data">
		<div>
			<input type="file" name="img">
		</div>
		<div>
		<button type="submit">Submit</button>
		</div>
	
	</form>
</body>
</html>