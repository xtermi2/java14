# Java 14 Features

- [JEP 305 – Pattern Matching for instanceof (Preview)](https://openjdk.java.net/jeps/305)
  - see example `InstanceOfPatternMatching`
- [JEP 359 – Records (Preview)](https://openjdk.java.net/jeps/359)
  - something like data classes in Kotlin, see example `Point`
- [JEP 361 – Switch Expressions (Standard)](https://openjdk.java.net/jeps/361)
  - see `SwitchExpressions`
- [JEP 368 – Text Blocks (Second Preview)](https://openjdk.java.net/jeps/368)
    - see `TextBlock`
- [JEP 358 – Helpful NullPointerExceptions](https://openjdk.java.net/jeps/358)
    - can't test this with build 14+36-1461. I never got something like expected below:
    ```
    Exception in thread "main" java.lang.NullPointerException: 
            Cannot read field 'c' because 'a.b' is null.
        at Prog.main(Prog.java:5)
    
  
    Exception in thread "main" java.lang.NullPointerException: 
            Cannot assign field 'i' because 'a' is null.
        at Prog.main(Prog.java:5)
    ``` 
- [JEP 343 – Packaging Tool](https://openjdk.java.net/jeps/343)
  - to package Java Applications as exe files for easy installation on Windows
- [JEP 345 – NUMA-Aware Memory Allocation for G1](https://openjdk.java.net/jeps/345)  
- [JEP 349 – JFR (Java Flight Recorder) Event Streaming](https://openjdk.java.net/jeps/349)
- [JEP 352 – Non-Volatile Mapped Byte Buffers](https://openjdk.java.net/jeps/352)
- [JEP 362 – Deprecate the Solaris and SPARC Ports](https://openjdk.java.net/jeps/362)
- [JEP 363 – Remove the Concurrent Mark Sweep (CMS) Garbage Collector](https://openjdk.java.net/jeps/363)
- [JEP 364 – ZGC on macOS](https://openjdk.java.net/jeps/364)
    - Z Garbage Collector on mac OS
- [JEP 365 – ZGC on Windows](https://openjdk.java.net/jeps/365)
    - Z Garbage Collector on Windows
- [JEP 366 – Deprecate the ParallelScavenge + SerialOld GC Combination](https://openjdk.java.net/jeps/366)
- [JEP 367 – Remove the Pack200 Tools and API](https://openjdk.java.net/jeps/367)
- [JEP 370: Foreign-Memory Access API (Incubator)](https://openjdk.java.net/jeps/370)
    - Better API to access memory outside of heap.

##### Other References

- https://jaxenter.de/java/java-14-update-news-85230