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
			<h1 class="text-center mb-3">Update Book Details</h1>
			<a href="" class="btn btn-primary">Back</a>
			<form action="${pageContext.request.contextPath }/handle-book" method="post">
				<div class="form-group">
					<label for="code">Book Code</label><input name="id" type="text"
						class="form-control"  value="${book.id }" />
				</div>

				<div class="form-group">
					<label for="name">Book Name</label> <input name="name" type="text"
						class="form-control" id="name"  value="${book.name}" } />
				</div>

				<div class="form-group">
					<label for="author">Author Name</label> <input name="author"
						type="text" class="form-control" id="author"
						value="${book.author}"/>
				</div>

				<div class="form-group">
					<label for="date">Added On</label><input name="code" type="text"
						class="form-control" id="code" value="${book.date }" />
				</div>

				<button type="submit" class="btn btn-primary">Update</button>
			</form>
		</div>
	</div>
</body>
</html>