def mavenTest(){
   sh 'mvn clean test'
}

def mavenInstall(){
  sh 'mvn install'
}
