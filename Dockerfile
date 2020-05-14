# syntax=docker/dockerfile:experimental

FROM clojure:openjdk-8-lein-slim-buster
WORKDIR /app
RUN --mount=source=.,target=/app,type=bind,rw lein do -U deps, check, test
ENTRYPOINT lein repl
