def mavenTest(){
   sh 'mvn clean test'
}

def mavenInstall(){
  sh 'mvn install'
}

def mavenCleanInstall(){
  sh 'mvn clean install'
}
