// def sonarAnalysis(String key, String name, String url, String login){
//       sh "mvn sonar:sonar -Dsonar.projectKey=${key}	-Dsonar.projectName=${name} -Dsonar.host.url=${url}  -Dsonar.login=${login}"
// }

def sonarAnalysis(String Project_Key, String Project_Name, String Sonar_URL, String Sonar_login){
      sh "mvn sonar:sonar -Dsonar.projectKey=${Project_Key}	-Dsonar.projectName=${Project_Name} -Dsonar.host.url=${Sonar_URL}  -Dsonar.login=${Sonar_login}"
}
