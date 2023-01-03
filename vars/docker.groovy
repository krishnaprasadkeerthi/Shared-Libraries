def dockerBuild(String repository){
  sh "docker build -t ${repository} ."
}

def dockerPush(String repository){
  sh "docker push ${repository}"
}

def dockerPull(String repository){
  sh "docker pull ${repository}"
}
