<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
<title>Final Project</title>
</head>
<body>
	<h1>TEST CASES</h1>
	<br>
	<div class="container px-lg-5">
		<div class="row mx-lg-n5">
			<div class="col py-3 px-lg-5 border bg-light">
				<form action="functionServlet" method="get">
					<div class="form-group">
						<label for="exampleFormControlSelect1">Select function</label> <select
							class="form-control" id="exampleFormControlSelect1"
							name="function">
							<option value="triangle">Triangle function</option>
							<option value="commission">Commission function</option>
						</select>
					</div>
					<div class="form-group">
						<label for="exampleFormControlSelect1">Select types</label> <select
							class="form-control" id="exampleFormControlSelect1" name="type">
							<option value="5">5 elements</option>
							<option value="7">7 elements</option>
						</select>
					</div>
					<button type="submit" class="btn btn-primary">Submit</button>
				</form>
			</div>
		</div>
	</div>
	<br>
	<h1>Result</h1>

	<div>
		<table class="table table-striped">
			<thead>
				<tr>
					<th scope="col">Test Case</th>
					<th scope="col">A</th>
					<th scope="col">B</th>
					<th scope="col">C</th>
					<th scope="col">Expected output</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<th scope="row">1</th>
					<td>Mark</td>
					<td>Otto</td>
					<td>@mdo</td>
					<td>@mdo</td>

				</tr>
			</tbody>
		</table>
	</div>
</body>
<style>
.container {
	margin: auto;
	width: 50%;
}

.form-group {
	margin-bottom: 1rem;
}

.btn {
	padding: 0.5rem 1rem;
	font-size: 1rem;
	cursor: pointer;
	background-color: #007bff;
	color: #fff;
	border: none;
	border-radius: 0.25rem;
}

.btn:hover {
	background-color: #0056b3;
}

.border {
	border: 1px solid #dee2e6 !important;
	border-radius: 0.25rem !important;
}

.bg-light {
	background-color: #f8f9fa !important;
}

.py-3 {
	padding-top: 1rem !important;
	padding-bottom: 1rem !important;
}

.px-lg-5 {
	padding-left: 3rem !important;
	padding-right: 3rem !important;
}

.mt-lg-5, .my-lg-5 {
	margin-top: 3rem !important;
	margin-bottom: 3rem !important;
}

.mx-lg-n5 {
	margin-left: -3rem !important;
	margin-right: -3rem !important;
}
</style>
</html>