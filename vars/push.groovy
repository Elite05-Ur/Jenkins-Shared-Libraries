def call(String project, String tag, String dockerHubUser){
  withCredentials([usernamePassword(
                    credentialsId: 'dockerHubDred',
                    passwordVariable: 'dockerHubPass',
                    usernameVariable: 'dockerHubUser')]) {
                    sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
                    sh "docker push ${dockerHubUser}/${project}:${tag}"
                }
}
