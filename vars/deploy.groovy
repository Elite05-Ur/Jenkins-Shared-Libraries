def call(){
  sh "mkdir -p data/mysql/db"
  sh "docker compose up --build -d"
}
