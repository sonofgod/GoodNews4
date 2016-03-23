import tierraalta.auth.SecRole;
import tierraalta.auth.SecUser;
import tierraalta.auth.SecUserSecRole;

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
}