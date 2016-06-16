flatworm: Flat File Parser
=====================================
Flatworm is a Java library intended to allow a developer to describe the format of a flat file using an XML definition file, and then to be able to automatically read lines from that file, and have one or more beans be instantiated for each logical record (original description from James M. Turner). 

Requires JDK 1.8 or higher (as 4.0.0-SNAPSHOT).

Latest release
--------------
The most recent release is [flatworm 3.0.3]() 

To add a dependency on Guava using Maven, use the following:

```xml
<dependency>
  <groupId>com.blackbear</groupId>
  <artifactId>flatworm</artifactId>
  <version>3.0.3</version>
</dependency>
```

The actively developed release is [flatworm 4.0.0-SNAPSHOT]().

Background
----------
The flatworm project is inherited from the efforts of multiple others. The original source code was authored by James M. Turner in what appears to be 2004. The last contributions from Mr. Turner appear to be 2.0.x and from there it appears that Josh Brackett took over and iterated it to the 3.0.x releases. There are also remnants of edits from another developer, Dave Berry, but it's unclear at what point those contributions were made.

Alan Henson has since taken over the code base and has modified it to be compatible with Maven from a build and package management sense. Additionally, where applicable, code has been converted to use Java 8 constructs. 

License
-------
flatworm is open source and is licensed under the [Apache 2.0 license](http://www.apache.org/licenses/LICENSE-2.0).

TODOs
-------
* Update the "Field Guide" to reflect the latest changes and usages
* Update the examples to reflect the latest capabilities and provide more guidance within the examples
* Add annotations support to all for beans to define their record makeup
* 