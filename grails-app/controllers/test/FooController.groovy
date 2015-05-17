package test
import grails.rest.RestfulController

class FooController extends RestfulController {
    static responseFormats = ['json', 'xml']

    FooController() {
        super(Foo)
    }
}