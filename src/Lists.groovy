def lst = [1,2,3]
println lst - 1
println lst

println lst

lst = 1..1

lst.inject(1) {BigDecimal fact, v -> fact * v }

//Error on book
friends = [ briang = 'Brian Goetz' , brians = 'Brian Sletten' ,
        davidb = 'David Bock' , davidg = 'David Geary' ,
        scottd = 'Scott Davis' , scottl = 'Scott Leberknight' ,
        stuarth = 'Stuart Halloway' ]

println friends.getClass()
friends.each {println it}
groupByFirstName = friends.groupBy { println it.getClass(); it.split(' ' )[0] }


map = [1:'1',2:'4',3:'9',4:'16']

println map.groupBy { a,b -> return a%2}


