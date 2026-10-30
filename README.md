# Dockeriser une application Spring Boot — le code de la vidéo

Le code de la vidéo **ItSkillsMaker** « Dockeriser une application Spring Boot : le guide complet » :
👉 https://youtu.be/t_4a_QeRk5A

Une petite API de commandes (Spring Boot 4.1, Spring Data JPA, PostgreSQL) et les Dockerfiles comparés dans la vidéo.

## Les Dockerfiles

| Fichier | Ce qu'il montre |
|---|---|
| `Dockerfile.naif` | La version qu'on trouve partout : image JDK complète, jar copié tel quel |
| `Dockerfile` | La version recommandée : multi-étapes, jar découpé en couches, image JRE, utilisateur non root |
| `Dockerfile.shell` | La même, avec un `ENTRYPOINT` en forme shell (le piège des signaux d'arrêt) |
| `Dockerfile.alpine` | Variante sur une image Alpine |
| `Dockerfile.aot` | Variante avec le cache AOT de Java 25 pour démarrer plus vite |

`compose.yaml` lance l'application et PostgreSQL ensemble, avec un healthcheck et une limite mémoire.

## Lancer

```bash
cp .env.example .env              # puis choisis un mot de passe
./mvnw package -DskipTests
docker compose up --build
curl http://localhost:8080/actuator/health
```

Pour comparer une variante : `docker build -f Dockerfile.naif -t orders:naif .`

## Playlist

Docker et CI/CD pour développeurs Java : la suite est la vidéo GitLab CI/CD, code sur
https://github.com/SkillMakers/gitlab-ci-spring-boot
