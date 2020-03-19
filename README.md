# Java 14 Features

-   [JEP 305 – Pattern Matching for instanceof (Preview)](https://openjdk.java.net/jeps/305)
    -   see example `InstanceOfPatternMatching.java`
-   [JEP 359 – Records (Preview)](https://openjdk.java.net/jeps/359)
    -   something like data classes in Kotlin, see example `Point.java`
-   [JEP 361 – Switch Expressions (Standard)](https://openjdk.java.net/jeps/361)
    -   see `SwitchExpressions.java`
-   [JEP 368 – Text Blocks (Second Preview)](https://openjdk.java.net/jeps/368)
    -   see `TextBlock.java`
-   [JEP 358 – Helpful NullPointerExceptions](https://openjdk.java.net/jeps/358)
    -   see `HelpfulNullPointerExceptions.java` and `HelpfulNullPointerExceptionsTest.java`
    -   is disabled by default and must be enabled with `-XX:+ShowCodeDetailsInExceptionMessages` 
-   [JEP 343 – Packaging Tool (Incubator)](https://openjdk.java.net/jeps/343)
    -   to package Java applications as installation files (exe, msi, pkg, dmg, deb, rpm) for easy installation.
    -   `$ jpackage --name myapp --input lib --main-jar main.jar --main-class myapp.Main --type rpm`
-   [JEP 345 – NUMA-Aware Memory Allocation for G1](https://openjdk.java.net/jeps/345)  
    -   Improve G1 performance on large machines by implementing NUMA-aware memory allocation.
-   [JEP 349 – JFR (Java Flight Recorder) Event Streaming](https://openjdk.java.net/jeps/349)
    -   Expose JDK Flight Recorder data for continuous monitoring.
-   [JEP 352 – Non-Volatile Mapped Byte Buffers](https://openjdk.java.net/jeps/352)
    -   Add new JDK-specific file mapping modes so that the FileChannel API can be used to create MappedByteBuffer instances that refer to non-volatile memory.
-   [JEP 362 – Deprecate the Solaris and SPARC Ports](https://openjdk.java.net/jeps/362)
-   [JEP 363 – Remove the Concurrent Mark Sweep (CMS) Garbage Collector](https://openjdk.java.net/jeps/363)
-   [JEP 364 – ZGC on macOS](https://openjdk.java.net/jeps/364)
    -   [Z Garbage Collector](https://wiki.openjdk.java.net/display/zgc/Main) port to mac OS
-   [JEP 365 – ZGC on Windows](https://openjdk.java.net/jeps/365)
    -   [Z Garbage Collector](https://wiki.openjdk.java.net/display/zgc/Main) port to Windows
-   [JEP 366 – Deprecate the ParallelScavenge + SerialOld GC Combination](https://openjdk.java.net/jeps/366)
-   [JEP 367 – Remove the Pack200 Tools and API](https://openjdk.java.net/jeps/367)
-   [JEP 370: Foreign-Memory Access API (Incubator)](https://openjdk.java.net/jeps/370)
    -   Introduce an API to allow Java programs to safely and efficiently access foreign memory outside of the Java heap.

##### Other References

-   [https://jaxenter.de/java/java-14-update-news-85230]()
-   [https://openjdk.java.net/projects/jdk/14/]()