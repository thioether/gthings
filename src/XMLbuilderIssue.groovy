#!/usr/bin/groovy
free  = ['rawatra','munishg','devks']

bld = new groovy.xml.StreamingMarkupBuilder().bind {
    mkp.xmlDeclaration()
    mkp.declareNamespace(rawat:'http://ls-ltr.blogspot.com');
    someIbank  {
        comment << "Comments ...."
         someproject {
          free.each { 
              person(id:it) {
                  name(it)
              }
          }
        }
    }
}    
println bld
