package sx.core


import grails.rest.*
import grails.converters.*

class MarcaController extends RestfulController {
    static responseFormats = ['json', 'xml']
    MarcaController() {
        super(Marca)
    }
}
