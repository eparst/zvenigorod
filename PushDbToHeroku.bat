cd C:\j\denwer\usr\local\pgsql-8.4\bin
heroku pg:reset DATABASE --app zvenigorod --confirm zvenigorod
pg_dump --no-acl --no-owner -h localhost -U postgres zvenigorod | heroku pg:psql --app zvenigorod

#dropdb zvenigorod
#heroku pg:pull DATABASE zvenigorod --app zvenigorod

pg_restore --verbose --clean --no-acl --no-owner -h localhost -U postgres -d zvenigorod 1.dump

curl -o b013.dump `heroku pg:backups public-url`
pg_restore --verbose --clean --no-acl --no-owner -h localhost -U postgres -d zvenigorod C:\j\2015_10\zvenigorod\1.dump