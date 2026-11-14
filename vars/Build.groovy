def call(String app_name){
  docker build -t  "${app_name}" .
}
