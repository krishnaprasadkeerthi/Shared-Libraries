def apply(String file){
  sh "kubectl apply -f ${file}"
}

def get(String kind){
  sh "kubectl get ${kind}"
}
