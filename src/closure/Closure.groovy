package closure
def func(a,b=1,int[] c) {
    println a +"" + b  + "" + c 
}

func(1,3,5,7,8)

def examine(closure) {   
   println "$closure.maximumNumberOfParameters "
   for ( a in closure.parameterTypes ) {
       println a
   }
   closure(1,2)
}

examine {
    a ,b ->
    println a + " " + b
}



