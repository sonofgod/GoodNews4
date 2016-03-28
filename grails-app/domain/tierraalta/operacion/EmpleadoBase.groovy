package tierraalta.operacion

import java.util.Date;

import tierraalta.auth.SecUser;

class EmpleadoBase extends Persona{

	//Properties
	Boolean activo = true;
	Float sueldo;
	Date fechaRegistro = new Date();
	Date fechaInicioContrato;
	Date fechaFinContrato;
	String numeroSeguridadSocial;
	Departamento departamento;
	
	SecUser secUser;
	
	
	
    static constraints = {
		
		fechaRegistro display:false
		activo()
		nombre()
		apellidoPaterno()
		apellidoMaterno()
		fechaNacimiento()
//		activo display:false
		email email:true
		direccion blank:true,nullable:true
		telefono blank:true,nullable:true
		numeroSeguridadSocial blank:true,nullable:true
		
		sueldo blank:true,nullable:true
		fechaInicioContrato()
		fechaFinContrato nullable:true
		secUser nullable:true,display:false
		
    }
	
	
	//Functions
	public String toString(){
		return this.nombre;
	}
	
}
