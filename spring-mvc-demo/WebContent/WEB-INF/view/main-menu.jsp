<!DOCTYPE html>
<html>

	<head>
		<script src="${pageContext.request.contextPath}/assets/js/script.js" type="text/javascript"></script>
		<link href="${pageContext.request.contextPath}/assets/css/style.css" type="text/css" rel="stylesheet"></link>
	</head>

	<body>
		<h1>Hello from Spring 5 MVC!</h1>
		
		<hr/>
		
		<a href="hw/showForm">Show form</a>
		
		<hr/>
		
		<form action="usingModel">
			<h3>Using a model</h3>
            <input type="text" name="param"/>
            <input type="submit" value="Submit Query"/>
        </form>
		
		<hr/>
		
		<button onclick="window.showJsAlert()">Alert</button>
		
		<hr/>
		
		<a href="student/showForm">Student | Show form</a>
	</body>

</html>