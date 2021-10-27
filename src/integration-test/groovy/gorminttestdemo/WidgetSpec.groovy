package gorminttestdemo

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.*
import spock.lang.Specification

@Integration
@Rollback
class WidgetSpec extends Specification {

    void "test something"() {
        when:
        new Widget(name: 'First').save()
        new Widget(name: 'Second').save()
        new Widget(name: 'Third').save()

        then:
        Widget.countByName('First') == 1
        Widget.countByName('Fourth') == 0
    }
}
