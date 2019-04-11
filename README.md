# nuxeo-custom-fulltext-parser

Plugin contributng a **java** class that will be used as **fulltext parser** by the repository. The default **fulltext parser** performs word-splitting, this one will add the string as it is for property `dc:title` in addition to the splitted words from the property's value. As an example it allows to a document with title `INF-08-000302` using the search string `INF-08-00*`.

The **fulltext parser** is executed when the document is saved in the reporsitory.

This **fulltext parser** will be used **ONLY** if **elasticsearch** is disabled.

# Requirements

Building requires the following software:

* git
* maven

# Build

```
git clone ...
cd nuxeo-custom-fulltext-parser

mvn clean install
```

# Installation

```
nuxeoctl mp-install nuxeo-custom-fulltext-parser/nuxeo-custom-fulltext-parser-package/target/nuxeo-custom-fulltext-parser-package-*.zip
```

# Compatibility

Before `LTS 2019`.

# Support

**These features are not part of the Nuxeo Production platform, they are not supported**

These solutions are provided for inspiration and we encourage customers to use them as code samples and learning resources.

This is a moving project (no API maintenance, no deprecation process, etc.) If any of these solutions are found to be useful for the Nuxeo Platform in general, they will be integrated directly into platform, not maintained here.


# Licensing

[Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0)


# About Nuxeo

Nuxeo dramatically improves how content-based applications are built, managed and deployed, making customers more agile, innovative and successful. Nuxeo provides a next generation, enterprise ready platform for building traditional and cutting-edge content oriented applications. Combining a powerful application development environment with SaaS-based tools and a modular architecture, the Nuxeo Platform and Products provide clear business value to some of the most recognizable brands including Verizon, Electronic Arts, Sharp, FICO, the U.S. Navy, and Boeing. Nuxeo is headquartered in New York and Paris.

More information is available at [www.nuxeo.com](http://www.nuxeo.com).
