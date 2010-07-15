def gStr = " hello"

def depth = 0
def x;
def chotu = { 
    depth++;
    if (depth == 10) return;
    println it;
    if(it.properties) 
        it.properties.each x
    depth--;
}
x = chotu;

def nonrec = { println it}

gStr.properties.each nonrec

gStr.metaClass.properties.each nonrec

println gStr.metaClass.metaClass
println gStr.metaClass.getClass().name
println Integer.metaClass.getClass().name
