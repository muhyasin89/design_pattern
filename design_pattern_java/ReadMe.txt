What is The bridge Design Pattern
---------------------------------

1. Decouple an abstraction from its implementation so that the two can vary independent
2. The bridge design Pattern is very poorly explained
3. Everyone seems to explain it differently
4. Progressively adding functionality while separating out major differences using abstract classes


When to use the bridge design Pattern
-------------------------------------

1. When you want to be able to change both the abstractions(abstract classes) and concrete class independently
2. When you want the first abstract class to define rulees(Abstract TV)
3. the concrete class adds additional rules(concrete TV)
4. an Abstract class has a reference to the device and it defines abstract methods that will be defined(Abstract Remote)
5. The Concrete Remote defines the abstract methods required