class TestBinding extends GroovyTestCase {
	void testMeasurement() {
		prepareData(someClosure)
	}
	
	def someClosure = {
		assertEquals("apple", a)
	}
	
	void prepareData(testCase) {
		def binding = new Binding()
		binding.setVariable("a", "apple")
		//this.setBinding(binding)
		testCase.setBinding(binding)
		testCase.call()
	}
}