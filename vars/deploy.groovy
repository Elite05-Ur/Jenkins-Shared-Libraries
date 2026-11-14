def call(){
  sh "mkdir -p data/mysql/db"
  sh "docker compose down && docker compose up --build -d"
}
