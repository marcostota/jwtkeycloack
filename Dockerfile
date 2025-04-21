# Use a lightweight PostgreSQL image based on Alpine
FROM postgres:alpine

# Set environment variables
ENV POSTGRES_USER=tota \
    POSTGRES_PASSWORD=123 \
    POSTGRES_DB=projectdb

# Copy initialization script
COPY init-db.sh /docker-entrypoint-initdb.d/

# Expose PostgreSQL port
EXPOSE 5432