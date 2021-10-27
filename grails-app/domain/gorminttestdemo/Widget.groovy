package gorminttestdemo

class Widget {
    String name
    static constraints = {
        name matches: /[A-Z].*/
    }
}
