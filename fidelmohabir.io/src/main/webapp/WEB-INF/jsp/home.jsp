<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>fidelmohabir.io</title>
<meta name="viewport" content="width=device-width, initial-scale=1"></meta>
<meta name="description" content="Homepage for Fidel Mohabir's website.">
<link rel="stylesheet"
	href="https://unpkg.com/material-components-web@0.27.0/dist/material-components-web.min.css">
</head>

<script src="js/main.js"></script>
<link href="css/main.css" rel="stylesheet">

<body>
	<main>
		<div class="button-row hidden" id="buttonrow">
			<ul>
				<c:forEach items="${homelinks}" var="link">
					<a class="mdc-button mdc-button--raised"
						data-mdc-auto-init="MDCRipple" href="${link.getAddr()}">
						${link.getName()} </a>
				</c:forEach>
			</ul>
		</div>
	</main>

</body>
</html>