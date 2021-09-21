package cikrakdisablegormversion

import grails.gorm.annotation.Entity

@Entity
class Widget {
    String name
    static mapping = {
        version false
    }
}
