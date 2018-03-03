# K.S.C.H. Workflows

This project contains the front-end of the K.S.C.H. Workflows application.
It is based upon the [CaptainCasa](http://captaincasa.org) framework.

## Getting started with CaptainCasa

### Installation on Windows

Follow the instructions on the CaptainCasa website: http://captaincasa.org/download

### Installation on Linux and MacOS

Follow the installation from the README file: [README.md](https://github.com/ksch-workflows/cc-dev-tomcat/blob/master/README.md)

### Start the editor

Go to your Tomcat installation directory and run the `catalina.sh` script:
```
cd $TOMCAT
./bin/catalina.sh run
```

Then you can access the CaptainCasa editor on this URL: http://localhost:8080/editor/indexRISC.html


## Development

### Run unit tests

Individual unit tests can be executed from within the IDE. All unit tests can be executed on the commandline
with the following Maven task invocation:

```
mvn test
```

### Run mutation tests

With the help of mutation tests it is possible to improve the quality of the unit
tests. It works like this that the mutation testing tool injects defects into the
source code and then executes the test suite. Afterwards it creates a report about
the defects which where caught by the unit tests and which where not. Those
instances where the injected defects where not caught are hints about parts of the
source code for which better unit tests should be created.

In this project the tool [PIT Mutation Testing](http://pitest.org/) is being used
for this purpose. It can be executed by running this command on the terminal:

```
mvn -DwithHistory org.pitest:pitest-maven:mutationCoverage
```

Afterwards a HTML report is generated and can be found in the `target` directory:

```
find ./target/pit-reports -name index.html
```
