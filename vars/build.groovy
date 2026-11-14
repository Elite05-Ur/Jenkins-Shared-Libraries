def call(String app_name, String tag, String DockerHubUser){
  docker build -t "${DockerHubUser}"/"${app_name}":"${tag}" .
}
