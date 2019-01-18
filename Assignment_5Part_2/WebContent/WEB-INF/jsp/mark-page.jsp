<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>  
<html>  
<head>  
    <title>MARKS</title>  
</head>  
<h3>Enter your marks</h3>  
<body>  
    <form:form action="submitForm" modelAttribute="marks">  
        Science Marks : <form:input path="scienceMarks" type="number" min="0" max="100"/>         
        <br><br>  
        Maths Marks: <form:input path="mathsMarks" type="number" min="0" max="100"/>  
        <br><br>
        English Marks: <form:input path="englishMarks" type="number" min="0" max="100"/>  
        <br><br>  
        <input type="submit" value="Submit" />      
    </form:form>  
</body>  
</html>  