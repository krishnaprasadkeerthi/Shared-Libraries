def jfPing(String url){
  sh "jf rt ping --url ${url}"
}

def jfUpload(String url, String access_token, String src, String dest){
  sh "jf rt u --url ${url} --access-token ${access_token} ${src} ${dest}"
}

def nexus(String artifactId, String classifier, String file, String type, String credentialsId, String groupId, String nexusUrl, String nexusVersion, String protocol, String repository, String version)
{
// nexusArtifactUploader artifacts: [
//                     [
//                       artifactId: ${artifactId},
//                       classifier: ${classifier},
//                       file: ${file},
//                       type: ${type}
//                      ]
//                 ],
//                 credentialsId: ${credentialsId}, 
//                 groupId: ${groupId}, 
//                 nexusUrl: ${nexusUrl}, 
//                 nexusVersion: ${nexusVersion}, 
//                 protocol: ${protocol}, 
//                 repository: ${repository}, 
//                 version: ${version}
// }
         nexusArtifactUploader artifacts: [
                     [
                      artifactId: 'spring-boot-thymeleaf',
                      classifier: '',
                      file: '/var/lib/jenkins/.m2/repository/pl/codeleak/demos/sbt/spring-boot-thymeleaf/2.0.0/spring-boot-thymeleaf-2.0.0.war',
                      type: 'war'
                      ]
                 ],
                 credentialsId: 'nexus', 
                 groupId: 'pl.codeleak.demos.sbt', 
                 nexusUrl: '13.233.100.229:8081', 
                 nexusVersion: 'nexus3', 
                 protocol: 'http', 
                 repository: 'ansible', 
                 version: '2.0.0'
}
