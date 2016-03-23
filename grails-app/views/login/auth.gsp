<html>

<head>

<title><g:message code='spring.security.ui.login.title'/></title>
<meta name='layout' content='register'/>

</head>

<body>

<div class="login s2ui_center" style='text-align:center;'>
	<div id="loginFranjaVerde">
<%--	<link rel="shortcut icon" href="" type="image/x-icon"/>--%>
<%--		<div class="responsive-container">--%>
<%--			<asset:image src="login/logoBlanco.png" id="loginLogoBlanco"/>--%>
<%--		</div>--%>


		<table id="loginTitulo">
			<tr>
				<td>
					<p>TIERRA ALTA</p>
				</td>
			</tr>
		</table>
		
		
		
	</div>
	<div class="login-inner">
	<form action='${postUrl}' method='POST' id="loginForm" name="loginForm" autocomplete='off'>
	<div class="sign-in">

<%--	<h1><g:message code='spring.security.ui.login.signin'/></h1>--%>

<%--	<table>--%>
<%--		<tr>--%>
<%--			<td><label for="username"><g:message code='spring.security.ui.login.username'/></label></td>--%>
<%--			<td><input name="j_username" id="username" size="20" /></td>--%>

				
		<div class='input-container'>
	        <div class="icon-ph">
	        	<i class="icon-user"></i>
	        </div>
       		<input class="custom-text" name="j_username" id="username" type="text" 
       		placeholder=<g:message code='spring.security.ui.login.username'/>>
        </div>
			
<%--		</tr>--%>
<%--		--%>
<%--		<tr>--%>
		
		<div class="separadorVertical"></div>
		<div class='input-container'>
	        <div class="icon-ph">
	        	<i class="icon-key"></i>
	        </div>
       		<input class="custom-text" name="j_password" id="password" type="password" 
       		placeholder=<g:message code='spring.security.ui.login.password'/>>
        </div>

<%--			<td><label for="password"><g:message code='spring.security.ui.login.password'/></label></td>--%>
<%--			<td><input type="password" name="j_password" id="password" size="20" /></td>--%>
<%--		</tr>--%>
<%--		--%>
<%--		--%>
<%--		<tr>--%>
		
		
		<div class="separadorVertical"></div>
		<table>
		
		
<%--		<tr>--%>
<%----%>
<%--			<td colspan='2'>--%>
<%--				<input type="checkbox" class="checkbox" name="${rememberMeParameter}" id="remember_me" checked="checked" />--%>
<%--				<label for='remember_me'><g:message code='spring.security.ui.login.rememberme'/></label> |--%>
<%--				<span class="forgot-link">--%>
<%--					<g:link controller='register' action='forgotPassword'><g:message code='spring.security.ui.login.forgotPassword'/></g:link>--%>
<%--				</span>--%>
<%--			</td>--%>
<%--		</tr>--%>




		<tr>
			<td colspan='2'>
<%--				<s2ui:linkButton elementId='register' controller='register' messageCode='spring.security.ui.login.register'/>--%>
				
				<s2ui:submitButton elementId='loginButton' form='loginForm' messageCode='spring.security.ui.login.login'/>

<%--						<a aria-disabled="false" role="button" class="ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only" id="loginButton"><span class="ui-button-text">Entrar</span></a>--%>
<%--						<input value=" " id="loginButton_submit" class="s2ui_hidden_button" type="submit">--%>
<%--						--%>
<%--								<script>--%>
<%--								$(document).ready(function() {--%>
<%--									--%>
<%--									$("#loginButton").button();--%>
<%--									$('#loginButton').bind('click', function() {--%>
<%--									   document.forms.loginForm.submit();--%>
<%--									});--%>
<%--								--%>
<%--								});--%>
<%--						</script>--%>
			
			</td>
		</tr>
	</table>

	</div>
	</form>
	</div>
</div>

<script>
$(document).ready(function() {
	$('#username').focus();
});

<s2ui:initCheckboxes/>

</script>

</body>
</html>
