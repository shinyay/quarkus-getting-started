#!/usr/bin/env fish

mvn io.quarkus:quarkus-maven-plugin:1.8.3.Final:create \
      -DprojectGroupId=com.google.shinyay \
      -DprojectArtifactId=quarkus-getting-started \
      -DprojectVersion=0.0.1-SNAPSHOT \
      -DclassName="com.google.shinyay.GreetingResource" \
      -Dpath="/greeting" \
      -Dextensions="kotlin,resteasy-jsonb" \
      -DbuildTool=gradle
