git add . && git stash && git pull origin main && mvn clean install -Dmaven.test.skip=true && docker image build -t docker-spring-boot:test . && docker compose up -d
