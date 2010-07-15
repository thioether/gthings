package builder

import groovy.lang.Closure;

class TreeBuilder {
	def o = System.out;
	def level = 0
	def build(m, x) {
		o << m.name + "\n"
		x.delegate = this;
		x.call()
	}
	
	def invokeMethod(String name, args) {
		level++;
		level.times {o << "  "}
		o << name  + "\n"
		//o << args
		if (args.length > 0 && args[-1] instanceof Closure) {
			args[-1].call()
		}
		level--;
	}
/*	
	def methodMissing(String name, args) {
		o << name 
		o << args
		if (args[-1] instanceof Closure) {
			arg[-1].delegate = this;
		}
	}
*/	
	def propertyMissing(name) {
		o << name
	}
}
