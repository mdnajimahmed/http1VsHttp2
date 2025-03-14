# Blog Link:
https://www.linkedin.com/pulse/concurrent-api-calls-browser-http11-vs-http2-md-najim-ahmed-ng63c/
# Run locally:
docker compose up -d

# Image version:
https://hub.docker.com/repository/docker/ivplay4689/corridor/tags/500d41/sha256:3db5dd814b20589abac51057d565e62b4834b9b141544c2463093bac0e31bde2
http://localhost:8080/
https://localhost:8443/

# Useful commands:
- docker exec -it http11 watch "netstat -an | grep :8080"
- docker exec -it http2 watch "netstat -an | grep :8443"
- docker run -d --name http11 -e SPRING_PROFILES_ACTIVE=h1 -p 8080:8080 ivplay4689/corridor:500d41
- docker run -d --name http2 -e SPRING_PROFILES_ACTIVE=h2 -p 8443:8443 ivplay4689/corridor:500d41
