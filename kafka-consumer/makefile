#!makefile

.PHONY: build up down

COMPOSE_FILE=etc/docker-compose/docker-compose.yml

# Build the Docker image using Spring Boot Maven plugin
build:
	mvn spring-boot:build-image

# Start Docker Compose, but first ensure the image is built
up: build
	docker compose -f $(COMPOSE_FILE) up -d

# Stop and remove Docker Compose containers
down:
	docker compose -f $(COMPOSE_FILE) down