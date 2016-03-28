package tierraalta.operacion

import groovy.transform.EqualsAndHashCode;
import groovy.transform.ToString;

@EqualsAndHashCode(includes='name')
@ToString(includes='name',includeNames = false, includePackage = false)
class Departamento implements Serializable {

	private static final long serialVersionUID = 1
	
	//Mappings
	static hasMany = [
		EmpleadoBase
	]
	
	//Properties
	String name;
	
	@Override
	String toString(){
		name;
	}
	
	
	//Function
	Departamento(String departamento){
		this()
		this.name = departamento;
	}
	
	
	
    static constraints = {
		name blank:false,unique:true;
    }
	
	static mapping = {
		cache true
	}
}
