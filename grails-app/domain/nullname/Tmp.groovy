package nullname

class Tmp {
	String name
	
    static constraints = {
		name nullable: true
    }

	static mapWith = "neo4j"
}
