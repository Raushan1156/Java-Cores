//Q2: You receive objects from a method:
class Class1 {
    Object display() {
        return "Done";
    }
}

class Class2{
    Class1 c1=new Class1();
    Integer n1=(Integer)c1.display(); // it will crash at runtime
}

/*
Task
Convert this into a generic method
 */
class Class11 {
    <T> T display(T object) {
        return object;
    }
}
class Class22{
    Class11 c1=new Class11();
    Integer n1=c1.display(10);
    String sn1=c1.display(10); // it will give compile-time error.
    String s1=c1.display("String");
}

/*
Explain why casting disappears: we generalise the method and remove the type casting and safty issue.
What error moves from runtime → compile time? -> line 25 explains everything which will fail at compile time only
 */