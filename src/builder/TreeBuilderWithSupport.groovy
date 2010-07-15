package builder;

import java.util.Map;

import groovy.util.BuilderSupport;

class TreeBuilderWithSupport extends BuilderSupport{

def out = System.out
 
@Override
protected Object createNode(Object name) {
	out << name + "\n"
	return name;
}

@Override
protected Object createNode(Object name, Object value) {
	out << name + "($value)"
	return name;
}

@Override
protected Object createNode(Object name, Map attributes) {
	out << name
	attributes.each {
		out << "$it.key : $it.value  "
	}
	out <<  +"\n"
	return name;
}

@Override
protected Object createNode(Object name, Map attributes, Object value) {
	out << name 
	attributes.each {
		out << "$it.key $it.value  val=$value"
	}
	out << + "\n"
	return name;
}

@Override
protected void setParent(Object parent, Object child) {
}

def missingMethod(String m, args) {
	out << "missing"
}

}
