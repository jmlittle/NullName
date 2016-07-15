package nullname

import grails.plugin.springsecurity.annotation.Secured
import grails.plugin.springsecurity.SpringSecurityService

@Secured(['ROLE_ADMIN'])
class TmpController {
	
	def springSecurityService

    def index() {
		println springSecurityService.currentUser.username
	}
}
