//import play.PlayJava
organization := "com.eparst"
name := "zvenigorod"
scalaVersion := "2.11.6"
version := "1.0-SNAPSHOT"

val appDependencies = Seq(
//  "be.objectify"  %% "deadbolt-java"     % "2.3.2",
"be.objectify"  %% "deadbolt-java"     % "2.4.0",
  // Comment the next line for local development of the Play Authentication core:
//  "com.feth"      %% "play-authenticate" % "0.6.8",
//	"com.feth"      %% "play-authenticate" % "0.7.0-SNAPSHOT", //work on heroku fine
	"com.feth"      %% "play-authenticate" % "0.7.1",
//  "postgresql" % "postgresql" % "9.1-901-1.jdbc4",
"org.postgresql" % "postgresql" % "9.4-1206-jdbc42",
//	"org.postgresql" % "postgresql" % "9.2-1003-jdbc4",
//  "org.postgresql" % "postgresql" % "9.4-1206-jdbc42",
//  "mysql" % "mysql-connector-java" % "5.1.34",
//  javaCore,
	cache,
	javaWs,
	javaJdbc,
//  javaEbean,
//  "org.webjars" %% "webjars-play" % "2.3.0",
	"org.webjars" %% "webjars-play" % "2.4.0-1",
	"org.webjars" % "bootstrap" % "3.2.0"
//  evolutions
)
// add resolver for deadbolt and easymail snapshots
resolvers += Resolver.sonatypeRepo("snapshots")
//resolvers += Resolver.sonatypeRepo("releases")

//  Uncomment the next line for local development of the Play Authenticate core:
//	lazy val playAuthenticate = project.in(file("modules/play-authenticate")).enablePlugins(PlayJava)

lazy val root = project.in(file("."))
  .enablePlugins(PlayJava, PlayEbean)
  .settings(
    libraryDependencies ++= appDependencies
  )
  /* Uncomment the next lines for local development of the Play Authenticate core: */
//  .dependsOn(playAuthenticate)
// .aggregate(playAuthenticate)  