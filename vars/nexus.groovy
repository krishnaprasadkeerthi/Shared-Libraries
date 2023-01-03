def jfPing(String url){
  sh "jf rt ping --url ${url}"
}

def jfUpload(String url, String access_token, String src, String dest){
  sh "jf rt u --url ${url} --access-token ${access_token} ${src} ${dest}"
}
