<!-- 
 TODO replace ava-mvn-gitlab-template module with the proper name
 TODO replace the group name tripled if needed
 -->
# java-mvn-gitlab-template
[![build status](http://gitlab.rotate-it.be/tripled/java-mvn-gitlab-template/badges/master/build.svg)](http://gitlab.rotate-it.be/tripled/java-mvn-gitlab-template/pipelines)
[![coverage report](http://gitlab.rotate-it.be/tripled/java-mvn-gitlab-template/badges/master/coverage.svg)](http://tripled.gitlab-pages.internal.rotate-it.be/java-mvn-gitlab-template/cobertura/index.html)

A skeleton project to use for quick starting a new project. Do not commit on this project.
Once your project is pushed to gitlab, make sure to configure the gitlab variables $SONAR_LOGIN and $SONAR_PASSWORD on your gitlab project.
Also make sure that the user SONARCUBE has at least developer access to your project or group.

<!-- TODO Project settings on Gitlab -->
Set test coverage parsing value to:TotalTestCoverage\[[0-9.]*\%\]

On https://gitlab.rotate-it.be/util/java-template/pipelines/settings
Set SONAR username and pasword for script

Configure SONAR for feedback to gitlab
In sonar you can install the gitlab plugin. It gains access via an access token. It will use that access to comment on commits in preview mode.


<!-- 
TODO: Some description for my project
-->

## Project code base web sites
<!-- In the gitlab pages url: replace the util prefix with the gitlab group name in the url. And the java-template with the project name -->
<!-- In the sonarcube url: replace the id of the url "util" with the gitlab group name in the url. And the java-template with the project name -->
* [Project overview](http://tripled.gitlab-pages.internal.rotate-it.be/java-mvn-gitlab-template/)
* [Test coverage report](http://tripled.gitlab-pages.internal.rotate-it.be/java-mvn-gitlab-template/cobertura/index.html)
* [Tests overview](http://tripled.gitlab-pages.internal.rotate-it.be/java-mvn-gitlab-template/surefire-report.html)
* [Code quality report](https://sonarqube.internal.rotate-it.be/dashboard/index?id=tripled-java-mvn-gitlab-template)
