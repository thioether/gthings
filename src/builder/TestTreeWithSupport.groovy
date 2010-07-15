package builder

import groovy.xml.MarkupBuilder;

class TestTreeWithSupport {

	public static void main(String[] args) {
		def tb = new TreeBuilderWithSupport();
		
		tb.tree {
				level1 (a:1, b:2) {
					level2{
						level3 {
						}
					}
				}
		}
	}
}