<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
    <body>

		<form:form action="processForm" modelAttribute="student">
		
			First name: <form:input path="firstName" />
			
			<br />
			
			last name: <form:input path="lastName" />
			
			<br />
			
			<input type="submit" value="Submit" />
			
		</form:form>

    </body>
</html>