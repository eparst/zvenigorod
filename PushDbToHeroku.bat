cd C:\j\denwer\usr\local\pgsql-8.4\bin
heroku pg:reset DATABASE --app zvenigorod --confirm zvenigorod
pg_dump --no-acl --no-owner -h localhost -U postgres zvenigorod | heroku pg:psql --app zvenigorod