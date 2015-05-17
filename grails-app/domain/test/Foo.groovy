package test
import org.grails.databinding.BindingFormat

class Foo {
	long id
	String username

	@BindingFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
	Date admissionDate

    static constraints = {
    }
}
