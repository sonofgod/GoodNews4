// Place your Spring DSL code here
beans = {
	
	
	localeResolver(org.springframework.web.servlet.i18n.SessionLocaleResolver) {
		def defaultLocale = new Locale("es","MX")
		java.util.Locale.setDefault(defaultLocale)
	 }
}
 