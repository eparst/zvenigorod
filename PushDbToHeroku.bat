cd C:\j\denwer\usr\local\pgsql-8.4\bin
heroku pg:reset DATABASE --app zvenigorod --confirm zvenigorod
pg_dump --no-acl --no-owner -h localhost -U postgres zvenigorod | heroku pg:psql --app zvenigorod

#dropdb zvenigorod
#heroku pg:pull DATABASE zvenigorod --app zvenigorod

pg_restore --verbose --clean --no-acl --no-owner -h localhost -U postgres -d zvenigorod 1.dump

curl -o b013.dump `heroku pg:backups public-url`
pg_restore --verbose --clean --no-acl --no-owner -h localhost -U postgres -d zvenigorod C:\j\2015_10\zvenigorod\1.dump

to openshift:
через port-forward: pg_restore --verbose --clean --no-acl --no-owner -h localhost -U adminhpcaky5 -d oleg C:\j\2015_10\tmp\oleg.dump
через ssh вход:
curl --user rus-f1@ya.ru:gtxty.irf1 -o oleg.dump https://webdav.yandex.ru/oleg.dump
pg_restore --verbose --clean --no-acl --no-owner -h localhost -U adminhpcaky5 -d oleg oleg.dump

psql -U adminhpcaky5  -d oleg -W -f oleg.dump
passw: vYX4xtwr2kzw

pg_restore --verbose --clean --no-acl --no-owner -h localhost -U adminkhmytne -d simargl oleg.dump