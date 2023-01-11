<html>
<head>

<%@include file="allBootstrap.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<h1 class="text-center mb-3">Welcome to Book App</h1>

			<table class="table">
				<thead class="thead-dark">
					<tr>
						<th scope="col">Book Code</th>
						<th scope="col">Book Name</th>
						<th scope="col">Author</th>
						<th scope="col">Date</th>
						<th scope="col">Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${books}" var="book">
						<tr>
							<th scope="row">${book.id}</th>
							<td>${book.name }</td>
							<td>${book.author }</td>
							<td>${book.date }</td>
							<td>
							<a href="delete/${book.id }"><i class="fa-sharp fa-solid fa-trash text-danger" style="30px"></i></a>
							<a href="update/${book.id }"><i class="fa-solid fa-pen-to-square text-primary" style="30px"></i></a>
							
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<div class="container text-center">
				<a href="add-book" class="btn btn-success">Add Book</a>
			</div>
		</div>
	</div>


</body>
</html>
