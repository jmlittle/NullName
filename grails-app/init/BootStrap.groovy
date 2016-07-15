


class BootStrap {

    def init = { servletContext ->
		if (!nullname.SecUser.findByUsername('admin'))
		{
			def adminRole = new nullname.SecRole(authority: 'ROLE_ADMIN').save(flush: true)
			def userRole = new nullname.SecRole(authority: 'ROLE_USER').save(flush: true)

			def adminUser = new nullname.SecUser(username: 'admin', password: 'admin', enabled: true)
			adminUser.save(flush: true)

			def devUser = new nullname.SecUser(username: 'jlittle', password: 'jlittle', enabled: true) 
			devUser.save(flush: true)

			nullname.SecUserSecRole.create adminUser, adminRole
			nullname.SecUserSecRole.create devUser, adminRole
		}
		
    }
    def destroy = {
    }
}
