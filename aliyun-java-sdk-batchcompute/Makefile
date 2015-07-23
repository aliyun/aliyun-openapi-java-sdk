NO_TEST=-DfailIfNoTests
SKIP_TEST=-Dmaven.test.skip=true
REPO=-DaltDeploymentRepository=snapshots::default::http://mvnrepo.alibaba-inc.com/mvn/snapshots
ENCODING=-Dfile.encoding=UTF-8
clean:
	mvn clean
install:
	mvn install $(NO_TEST)
test:
	mvn test
co:
	mvn cobertura:cobertura
doc:
	mvn javadoc:javadoc $(ENCODING)

deploy:
	mvn clean deploy -e $(REPO) $(SKIP_TEST)
