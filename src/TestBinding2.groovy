def someClosure = {
	assert "apple", a
	println "this->" + this
	println "delegate->" + delegate
	print "Done"
}

void testMeasurement() {
	println this
	prepareData(this.someClosure)
}

void prepareData(testCase) {
	def binding = new Binding()
	binding.setVariable("a", "apple")
	testCase.setBinding(binding)
	testCase.call()
}
testMeasurement()

