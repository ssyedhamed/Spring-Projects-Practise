<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

</head>
<body>
	<div class="container col-md-5">
		<form class="row g-3 mt-5" action="submitForm" method="post">
			<div class="container text-center">
				<h1>Register Now</h1>
				<div class="alert alert-danger" role="alert"><form:errors path="user.*"/></div>
			</div>
			<div class="col-md-6">
				<label for="inputEmail4" class="form-label">Email</label> <input
					type="email" class="form-control" id="inputEmail4" name="email">
			</div>
			<div class="col-md-6">
				<label for="inputPassword4" class="form-label">Password</label> <input
					type="password" class="form-control" id="inputPassword4"
					name="password">
			</div>
			<div class="row-md-12">
				<label>Address </label>
				<hr>
				<div class="row">
					<div class="col-md-6">
						<label for="inputCity" class="form-label">City</label> <input
							type="text" class="form-control" id="inputCity"
							name="address.city">
					</div>
					<div class="col-md-6">
						<label for="inputAddress" class="form-label">State</label> <input
							type="text" class="form-control" id="inputAddress"
							name="address.state">
					</div>
				</div>
			</div>
			<div class="col-md-6">
				<label for="courses" class="form-label">Courses</label> <select
					id="courses" class="form-select" name="course">
					<option selected disabled="disabled">Choose...</option>
					<option value="IT">Information Technology</option>
					<option value="Mech">Mech</option>
					<option value="Civil">Civil</option>
				</select>
			</div>
			<div class="col-md-6">
				<label for="inputZip" class="form-label">Zip</label> <input
					type="text" class="form-control" id="inputZip" name="zip">
			</div>
			<!--  <div class="col-md-6">
				<label for="dob" class="form-label">DOB</label> <input
					type="date" class="form-control" id="dob" name="dob">
			</div>
			-->
			<div class="col-12">
				<div class="form-check">
					<label class="form-check-label" for="gridCheck"> Check me
						out </label> <input class="form-check-input" type="checkbox"
						id="gridCheck" name="check" value="checked">
				</div>
			</div>
			<div class="col-12">
				<button type="submit" class="btn btn-success">Sign in</button>
			</div>
		</form>


	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
		integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
		integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
		crossorigin="anonymous"></script>

</body>
</html>