<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>edit contact</title>
</head>
<body>
<jsp:useBean id="contact" scope="session"
		class="com.roywmiller.contacts.model.ContactsUser" />
	<form method="post" action="EditContactAction.perform">
		<table>
				<tr>
					<td>First Name:
					<td>
					<td><input type="text" size="30" name="firstname">
					</td>
				</tr>
				<tr>
					<td>Last Name:
					<td>
					<td><input type="text" size="30" name="lastname">
					</td>
				</tr>
				<tr>
					<td>Street:
					<td>
					<td><input type="text" size="30" name="street">
					</td>
				</tr>
				<tr>
					<td>City:
					<td>
					<td><input type="text" size="30" name="city">
					</td>
				</tr>
				<tr>
					<td>State:
					<td>
					<td><input type="text" size="30" name="state">
					</td>
				</tr>
				<tr>
					<td>Zip:
					<td>
					<td><input type="text" size="30" name="zip">
					</td>
				</tr>
				<tr>
					<td>Type:
					<td>
					<td><input type="radio" size="30" name="type" value="family">
						Family <input type="radio" size="30" name="type"
						value="acquaintance" checked> Acquaintance</td>
				</tr>
			</table>
			<br /> <input type="submit" name="editContact" value="  confirm  ">
	</form>
</body>
</html>