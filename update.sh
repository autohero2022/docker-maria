git add . && \
git stash && \
git pull origin main && \
mvn clean install -Dmaven.test.skip=true && \
docker image build -t docker-spring-boot:test . && \
#docker compose kill && \
#docker container prune -f && \
#docker image prune -f && \
docker compose up -d
