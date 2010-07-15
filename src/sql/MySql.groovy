import groovy.sql.DataSet;

import groovy.sql.*;

def dmp = {
	println it
}
openup = {
	it.class.methods.each {
		dmp it
	}
}

def processData = { rs ->
	while(rs.next()) {
		rs.metaData.columnCount.times {
			print (rs.getString(it+1) + ":") 
		}
		println()
	}
}


props = [driverClassName : "com.mysql.jdbc.Driver",
url:"jdbc:mysql://localhost:3306/sakila",
user:"test",
password:"test123"];
Sql sql = Sql.newInstance(props)
m = sql.connection.getMetaData()
types = m.getTableTypes()

//processData types

tables = m.getTables("", "", "", "TABLE")
processData tables

ds = sql.dataSet('actor')
data = ds.findAll {
	true
}
data.each { 
	println it
}

