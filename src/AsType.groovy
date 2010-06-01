
interface OnlyMe {
    def run();
}

class A {
    def run() {
        println 'old'
    }
}


a = {println 'its me'}.asType(OnlyMe.class);
a.run()
// a.buzz()  NPE
