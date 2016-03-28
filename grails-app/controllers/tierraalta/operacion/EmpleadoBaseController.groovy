package tierraalta.operacion



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class EmpleadoBaseController {
	
//	static scaffold = EmpleadoBase;
	
//	def create(){
//		def empleado = new EmpleadoBase()
//		
//		[empleado:empleado]
//	}


    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond EmpleadoBase.list(params), model:[empleadoBaseInstanceCount: EmpleadoBase.count()]
    }

    def show(EmpleadoBase empleadoBaseInstance) {
        respond empleadoBaseInstance
    }

    def create() {
        respond new EmpleadoBase(params)
    }

    @Transactional
    def save(EmpleadoBase empleadoBaseInstance) {
        if (empleadoBaseInstance == null) {
            notFound()
            return
        }

        if (empleadoBaseInstance.hasErrors()) {
            respond empleadoBaseInstance.errors, view:'create'
            return
        }

        empleadoBaseInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'empleadoBase.label', default: 'EmpleadoBase'), empleadoBaseInstance.id])
                redirect empleadoBaseInstance
            }
            '*' { respond empleadoBaseInstance, [status: CREATED] }
        }
    }

    def edit(EmpleadoBase empleadoBaseInstance) {
        respond empleadoBaseInstance
    }

    @Transactional
    def update(EmpleadoBase empleadoBaseInstance) {
        if (empleadoBaseInstance == null) {
            notFound()
            return
        }

        if (empleadoBaseInstance.hasErrors()) {
            respond empleadoBaseInstance.errors, view:'edit'
            return
        }

        empleadoBaseInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'EmpleadoBase.label', default: 'EmpleadoBase'), empleadoBaseInstance.id])
                redirect empleadoBaseInstance
            }
            '*'{ respond empleadoBaseInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(EmpleadoBase empleadoBaseInstance) {

        if (empleadoBaseInstance == null) {
            notFound()
            return
        }

        empleadoBaseInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'EmpleadoBase.label', default: 'EmpleadoBase'), empleadoBaseInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'empleadoBase.label', default: 'EmpleadoBase'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
