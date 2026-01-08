/* Q1
You have this code:
*/

class Box1 {
    Object value;
    void set(Object v) { value = v; }
    Object get() { return value; }
}

/*
Task:

Convert this to a generic class
Identify:
What runtime problem existed earlier?
What compile-time guarantee you gained?
*/

class Box<T>{
    T value;
    void  setValue(T value){
        this.value=value;
    }

    T getValue() {
        return value;
    }
}

class another{
    Box<String> box = new Box<String>();
    box.setValue("Ramesh");

    box.setValue(10); // it will throw compile time error
}

/*
What runtime problem existed earlier?

Intially we had the value of object type becuase of which we can store any type of values into the value var
as it is type of Object type.
So, there is not type checking at runtime and no type safty. We will have to handle type-casting manually.

What compile-time guarantee you gained?
Once Generic mplemented, we will have to define the class-type at the time of object creation which will help
to adopt and store single type of values at a time and also same generic class can be used for all other types.
 */
