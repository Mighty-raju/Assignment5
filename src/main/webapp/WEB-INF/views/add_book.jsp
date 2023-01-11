<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="allBootstrap.jsp"%>
</head>
<body>

	<div class=row>
		<div class="col-md-6 offset-md-3">

			<h1 class="text-center mb-3">Fill Book Details</h1>
			<a href="" class="btn btn-primary">Back</a>
			<form action="handle-book" method="post">
				<div class="form-group">
					<label for="code">Book Code</label>
				</div>

				<div class="form-group">
					<label for="name">Book Name</label> <input name="name" type="text"
						class="form-control" id="name" placeholder="Enter Name of book" />
				</div>

				<div class="form-group">
					<label for="author">Author Name</label> <input name="author"
						type="text" class="form-control" id="author"
						placeholder="Enter Author of book" />
				</div>

				<div class="form-group">
					<label for="date">Added On</label>
				</div>

				<button type="submit" class="btn btn-primary">Submit</button>
			</form>
		</div>
	</div>
</body>
</html>