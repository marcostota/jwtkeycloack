# Use a lightweight PostgreSQL image based on Alpine
FROM postgres:alpine

# Set environment variables
ENV POSTGRES_USER=tota \
    POSTGRES_PASSWORD=123 \
    POSTGRES_DB=projectdb

# Expose PostgreSQL port
EXPOSE 5432

# Use the default PostgreSQL entrypoint
#CMD ["postgres"]
