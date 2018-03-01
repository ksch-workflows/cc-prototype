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
