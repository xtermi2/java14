Java 14 Features

- JEP 305 – Pattern Matching for instanceof (Preview)
  - see example `InstanceOfPatternMatching`
- JEP 359 – Records (Preview)
  - something like data classes in Kotlin, see example `Point`
- JEP 361 – Switch Expressions (Standard)
  - TODO

- JEP 358 – Helpful NullPointerExceptions
    ```
    Exception in thread "main" java.lang.NullPointerException: 
            Cannot read field 'c' because 'a.b' is null.
        at Prog.main(Prog.java:5)
    
  
    Exception in thread "main" java.lang.NullPointerException: 
            Cannot assign field 'i' because 'a' is null.
        at Prog.main(Prog.java:5)
    ``` 


- JEP 343 – Packaging Tool
  - to package Java Applications as exe files for easy installation on Windows
- JEP 345 – NUMA-Aware Memory Allocation for G1  
- JEP 349 – JFR (Java Flight Recorder) Event Streaming
- JEP 352 – Non-Volatile Mapped Byte Buffers



##### References

- https://jaxenter.de/java/java-14-update-news-85230