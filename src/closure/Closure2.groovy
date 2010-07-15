package closure
class A {
    
    def examiningClosure(closure)
    {
      closure()
    }

    def inv() {
       examiningClosure() {
          println "In First Closure:"
          println "class is " + getClass().name
          println "this is " + this + ", super:" + this.getClass().superclass.name
          println "owner is " + owner + ", super:" + owner.getClass().superclass.name
          println "delegate is " + delegate +
                      ", super:" + delegate.getClass().superclass.name
          examiningClosure() {
            println "In Closure within the First Closure:"
            println "class is " + getClass().name
            println "this is " + this + ", super:" + this.getClass().superclass.name
            println "owner is " + owner + ", super:" + owner.getClass().superclass.name
            println "delegate is " + delegate +
                        ", super:" + delegate.getClass().superclass.name
          }
        }


    }    
    def static main(args) {
        println "Started"
        def a = new A()
        a.inv()    
    }
}