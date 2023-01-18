def ping(String pathOfKey, String hosts){
  sh "ansible ${hosts} -m ping --key-file ${pathOfKey}"
}

def playbook_execution(String pathOfKey, String playbook){
  sh "ansible-playbook --key-file ${pathOfKey} ${playbook}"
}

def ansible_deploy_playbook(String inventory, String playbook){
  sh "ansible-playbook -i ${inventory} ${playbook}"
}

def ansible_deploy_playbook1(String inventory, String playbook, String ansible_vault){
  ansiblePlaybook inventory: ${inventory}, playbook: ${playbook}, vaultCredentialsId: ${ansible_vault}
}
