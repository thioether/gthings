feeds = new XmlParser().parse("feed.xml");

println feeds.find {
    it['title'] 
}

ch = feeds.channel
println ch.title.text()


mems = ['wife','me','daughter']
bld = new groovy.xml.StreamingMarkupBuilder().bind {
    mkp.xmlDeclaration()
    mkp.declareNamespace(rawat:'http://rsr.com');
    family {
        comment << "Comments ...."
        members {
          mems.each { 
              member(relation:"$it") {
                  fame ("$it")
              }  
          }
        }
    }
}    
println bld