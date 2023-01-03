def sonarAnalysis(String key, String name, String url, String login){
      sh "mvn sonar:sonar -Dsonar.projectKey=${key}	-Dsonar.projectName=${name} -Dsonar.host.url=${url}  -Dsonar.login=${login}"
}
