import tierraalta.auth.SecRole;
import tierraalta.auth.SecUser;
import tierraalta.auth.SecUserSecRole;
import tierraalta.operacion.Departamento

import com.domain.auth.*



class BootStrap {
      def init = { servletContext ->
            def adminRole = SecRole.findOrSaveWhere(authority:'ROLE_ADMIN')
            def user = SecUser.findOrSaveWhere(username:'admin',password:'password')

            if(!user.authorities.contains(adminRole)){
                  SecUserSecRole.create(user,adminRole,true)
            }
}
      def destroy = {
      }
	  
	  
	  //insertando departamentos.
	  Departamento operacion = new Departamento(name: 'Operacion').save()
	  Departamento programa = new Departamento(name: 'Programa').save()
	  Departamento cocina = new Departamento(name: 'Cocina').save()
	  Departamento vigilancia = new Departamento(name: 'Vigilancia').save()
}