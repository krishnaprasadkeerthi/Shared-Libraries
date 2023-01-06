def jfPing(String url){
  sh "jf rt ping --url ${url}"
}

def jfUpload(String url, String access_token, String src, String dest){
  sh "jf rt u --url ${url} --access-token ${access_token} ${src} ${dest}"
}

def nexus(String artifactId, String classifier, String file, String type, String credentialsId, String groupId, String nexusUrl, String nexusVersion, String protocol, String repository, String version)
{
nexusArtifactUploader artifacts: [
                    [
                      artifactId: ${artifactId},
                      classifier: ${classifier},
                      file: ${file},
                      type: ${type}
                     ]
                ],
                credentialsId: ${credentialsId}, 
                groupId: ${groupId}, 
                nexusUrl: ${nexusUrl}, 
                nexusVersion: ${nexusVersion}, 
                protocol: ${protocol}, 
                repository: ${repository}, 
                version: ${version}
}
