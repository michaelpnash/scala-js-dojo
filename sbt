java -XX:+CMSClassUnloadingEnabled -XX:MaxPermSize=512m -Xss1M -Xmx1024m -XX:ReservedCodeCacheSize=512m -jar sbt-launch-0.13.0.jar "$@"
