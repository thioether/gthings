
def o = ''
println String.metaClass.methods.each {println it}

// Inject static method 
Integer.metaClass.static.hello = { println 1; 1 }
println Integer.hello()

//Inject static property
Integer.metaClass.static.getHello =  { 1 }
Integer.hello
