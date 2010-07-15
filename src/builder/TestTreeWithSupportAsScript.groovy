package builder

def tb = new TreeBuilderWithSupport();
	
tb.tree {
		level1 (a:1, b:2) {
			level2{
				level3 {
				}
			}
		}
}
