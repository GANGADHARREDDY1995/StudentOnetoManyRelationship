<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Pages</title>
</head>
<body>
	<form action="/StudentOneToManyRelationship/registration" method="post">
		<h1 style="text-align: center;">Welcome Student Registration Page</h1>
		<table cellspacing="5px" cellpadding="5px" style="padding-left: 50px">
			<tr>
				<td>Student Name</td>
				<td><input type="text" name="name" ></td>
			</tr>
			<tr>
				<td>Father Name</td>
				<td><input type="text" name="father"></td>
			</tr>
			<tr>
				<td>Mother Name</td>
				<td><input type="text" name="mother"></td>
			</tr>
			<tr>
				<td>Date Of Birth</td>
				<td><input type="date" name="date" ></td>
			</tr>
			<tr>
				<td>Admission Class</td>
				<td><input type="text" name="admissionClass"></td>
			</tr>
			<tr>
				<td>Source </td>
				<td><input type="text" name="source"></td>
			</tr>
			<tr>
				<td>Mobile Number </td>
				<td><input type="text" name="mobile"></td>
			</tr>
			<tr>
				<td>Door Number</td>
				<td><input type="text" name="doorNumber"></td>
			</tr>
			<tr>
				<td>Street  </td>
				<td><input type="text" name="street"></td>
			</tr>
			<tr>
				<td>Area </td>
				<td><input type="text" name="area"></td>
			</tr>
			<tr>
				<td>Mandal </td>
				<td><input type="text" name="mandal"></td>
			</tr>
			<tr>
				<td>District </td>
				<td><input type="text" name="district"></td>
			</tr>
			<tr>
				<td>PinCode </td>
				<td><input type="text" name="pincode"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Register"> </td>
				<td><input type="reset" value="Reset"></td>
			</tr>
		</table>
	</form>
</body>
</html>