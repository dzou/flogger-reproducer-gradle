# Repro

Run:

```shell
./gradlew run
```

# Dependency Tree Output:

```
+--- com.google.cloud:gcp-lts-bom:1.0.7
|    +--- com.google.protobuf:protobuf-java-util:3.16.0 (c)
|    +--- io.grpc:grpc-api:1.36.2 (c)
|    +--- io.grpc:grpc-context:1.36.2 (c)
|    +--- io.grpc:grpc-stub:1.36.2 (c)
|    +--- com.google.protobuf:protobuf-java:3.16.0 (c)
|    +--- com.google.api:gax:1.64.0-sp.1 (c)
|    +--- com.google.auth:google-auth-library-oauth2-http:0.25.2-sp.1 (c)
|    +--- com.google.cloud:google-cloud-pubsub:1.111.0-sp.1 (c)
|    +--- io.grpc:grpc-protobuf-lite:1.36.2 (c)
|    +--- io.grpc:grpc-auth:1.36.2 (c)
|    +--- io.grpc:grpc-netty-shaded:1.36.2 (c)
|    +--- io.grpc:grpc-alts:1.36.2 (c)
|    +--- io.grpc:grpc-grpclb:1.36.2 (c)
|    +--- io.grpc:grpc-core:1.36.2 (c)
|    +--- com.google.http-client:google-http-client:1.39.2-sp.1 (c)
|    +--- com.google.api.grpc:proto-google-cloud-pubsub-v1:1.93.0-sp.1 (c)
|    +--- com.google.api:api-common:1.10.1-sp.1 (c)
|    +--- com.google.guava:guava:30.1.1-jre (c)
|    +--- com.google.auto.value:auto-value-annotations:1.8.1 (c)
|    +--- com.google.api:gax-grpc:1.64.0-sp.1 (c)
|    +--- io.grpc:grpc-protobuf:1.36.2 (c)
|    +--- com.google.oauth-client:google-oauth-client:1.31.4-sp.1 (c)
|    \--- com.google.api-client:google-api-client:1.31.3-sp.1 (c)
+--- com.google.cloud:google-cloud-pubsublite:0.13.2
|    +--- com.google.protobuf:protobuf-java-util:3.15.8 -> 3.16.0
|    |    +--- com.google.protobuf:protobuf-java:3.16.0
|    |    +--- com.google.guava:guava:30.1-android -> 30.1.1-jre
|    |    |    +--- com.google.guava:failureaccess:1.0.1
|    |    |    +--- com.google.guava:listenablefuture:9999.0-empty-to-avoid-conflict-with-guava
|    |    |    +--- com.google.code.findbugs:jsr305:3.0.2
|    |    |    +--- org.checkerframework:checker-qual:3.8.0
|    |    |    +--- com.google.errorprone:error_prone_annotations:2.5.1 -> 2.6.0
|    |    |    \--- com.google.j2objc:j2objc-annotations:1.3
|    |    +--- com.google.errorprone:error_prone_annotations:2.3.4 -> 2.6.0
|    |    \--- com.google.code.gson:gson:2.8.6
|    +--- io.grpc:grpc-api:1.37.0 -> 1.36.2
|    |    +--- io.grpc:grpc-context:1.36.2
|    |    \--- com.google.code.findbugs:jsr305:3.0.2
|    +--- io.grpc:grpc-context:1.37.0 -> 1.36.2
|    +--- io.grpc:grpc-stub:1.37.0 -> 1.36.2
|    |    +--- io.grpc:grpc-api:1.36.2 (*)
|    |    +--- com.google.guava:guava:30.0-android -> 30.1.1-jre (*)
|    |    \--- com.google.errorprone:error_prone_annotations:2.4.0 -> 2.6.0
|    +--- com.google.protobuf:protobuf-java:3.15.8 -> 3.16.0
|    +--- com.google.api:gax:1.63.0 -> 1.64.0-sp.1
|    +--- com.google.auth:google-auth-library-oauth2-http:0.25.2 -> 0.25.2-sp.1
|    |    +--- com.google.auto.value:auto-value-annotations:1.7.4 -> 1.8.1
|    |    +--- com.google.code.findbugs:jsr305:3.0.2
|    |    +--- com.google.auth:google-auth-library-credentials:0.25.2-sp.1 -> 0.25.2
|    |    +--- com.google.http-client:google-http-client:1.39.1 -> 1.39.2-sp.1
|    |    |    +--- org.apache.httpcomponents:httpclient:4.5.13
|    |    |    |    +--- org.apache.httpcomponents:httpcore:4.4.13 -> 4.4.14
|    |    |    |    +--- commons-logging:commons-logging:1.2
|    |    |    |    \--- commons-codec:commons-codec:1.11 -> 1.15
|    |    |    +--- org.apache.httpcomponents:httpcore:4.4.14
|    |    |    +--- com.google.code.findbugs:jsr305:3.0.2
|    |    |    +--- com.google.guava:guava:30.1.1-android -> 30.1.1-jre (*)
|    |    |    +--- com.google.j2objc:j2objc-annotations:1.3
|    |    |    +--- io.opencensus:opencensus-api:0.28.0
|    |    |    |    \--- io.grpc:grpc-context:1.27.2 -> 1.36.2
|    |    |    \--- io.opencensus:opencensus-contrib-http-util:0.28.0
|    |    |         +--- io.opencensus:opencensus-api:0.28.0 (*)
|    |    |         \--- com.google.guava:guava:29.0-android -> 30.1.1-jre (*)
|    |    +--- com.google.http-client:google-http-client-gson:1.39.1 -> 1.39.2
|    |    |    +--- com.google.http-client:google-http-client:1.39.2 -> 1.39.2-sp.1 (*)
|    |    |    \--- com.google.code.gson:gson:2.8.6
|    |    \--- com.google.guava:guava:30.1-android -> 30.1.1-jre (*)
|    +--- io.opencensus:opencensus-api:0.28.0 (*)
|    +--- com.google.cloud:google-cloud-pubsub:1.112.0 -> 1.111.0-sp.1
|    |    +--- com.google.http-client:google-http-client-jackson2:1.38.0
|    |    |    +--- com.google.http-client:google-http-client:1.38.0 -> 1.39.2-sp.1 (*)
|    |    |    \--- com.fasterxml.jackson.core:jackson-core:2.11.3 -> 2.12.1
|    |    |         \--- com.fasterxml.jackson:jackson-bom:2.12.1
|    |    |              \--- com.fasterxml.jackson.core:jackson-core:2.12.1 (c)
|    |    +--- com.fasterxml.jackson.core:jackson-core:2.12.1 (*)
|    |    \--- org.apache.commons:commons-lang3:3.5
|    +--- io.grpc:grpc-protobuf-lite:1.37.0 -> 1.36.2
|    |    \--- io.grpc:grpc-api:1.36.2 (*)
|    +--- javax.annotation:javax.annotation-api:1.3.2
|    +--- com.google.api.grpc:proto-google-iam-v1:1.0.11
|    |    +--- com.google.protobuf:protobuf-java:3.15.5 -> 3.16.0
|    |    \--- com.google.api.grpc:proto-google-common-protos:2.1.0
|    +--- com.google.guava:failureaccess:1.0.1
|    +--- com.google.guava:listenablefuture:9999.0-empty-to-avoid-conflict-with-guava
|    +--- org.checkerframework:checker-compat-qual:2.5.5
|    +--- com.google.j2objc:j2objc-annotations:1.3
|    +--- com.google.http-client:google-http-client-gson:1.39.2 (*)
|    +--- io.grpc:grpc-auth:1.37.0 -> 1.36.2
|    |    +--- io.grpc:grpc-api:1.36.2 (*)
|    |    \--- com.google.auth:google-auth-library-credentials:0.22.2 -> 0.25.2
|    +--- com.google.auth:google-auth-library-credentials:0.25.2
|    +--- io.grpc:grpc-netty-shaded:1.37.0 -> 1.36.2
|    |    \--- io.grpc:grpc-core:1.36.2
|    |         \--- io.grpc:grpc-api:1.36.2 (*)
|    +--- io.grpc:grpc-alts:1.37.0 -> 1.36.2
|    |    +--- io.grpc:grpc-auth:1.36.2 (*)
|    |    +--- io.grpc:grpc-grpclb:1.36.2
|    |    +--- io.grpc:grpc-protobuf:1.36.2
|    |    |    +--- io.grpc:grpc-api:1.36.2 (*)
|    |    |    +--- com.google.code.findbugs:jsr305:3.0.2
|    |    |    +--- com.google.protobuf:protobuf-java:3.12.0 -> 3.16.0
|    |    |    +--- com.google.api.grpc:proto-google-common-protos:2.0.1 -> 2.1.0
|    |    |    \--- io.grpc:grpc-protobuf-lite:1.36.2 (*)
|    |    +--- io.grpc:grpc-stub:1.36.2 (*)
|    |    +--- com.google.protobuf:protobuf-java:3.12.0 -> 3.16.0
|    |    +--- org.conscrypt:conscrypt-openjdk-uber:2.5.1
|    |    +--- com.google.auth:google-auth-library-oauth2-http:0.22.2 -> 0.25.2-sp.1 (*)
|    |    +--- com.google.guava:guava:30.0-android -> 30.1.1-jre (*)
|    |    +--- com.google.errorprone:error_prone_annotations:2.4.0 -> 2.6.0
|    |    \--- io.grpc:grpc-netty-shaded:1.36.2 (*)
|    +--- io.grpc:grpc-grpclb:1.37.0 -> 1.36.2
|    +--- org.conscrypt:conscrypt-openjdk-uber:2.5.1
|    +--- io.grpc:grpc-core:1.37.0 -> 1.36.2 (*)
|    +--- com.google.http-client:google-http-client:1.39.2 -> 1.39.2-sp.1 (*)
|    +--- org.apache.httpcomponents:httpclient:4.5.13 (*)
|    +--- commons-logging:commons-logging:1.2
|    +--- commons-codec:commons-codec:1.15
|    +--- org.apache.httpcomponents:httpcore:4.4.14
|    +--- io.opencensus:opencensus-contrib-http-util:0.28.0 (*)
|    +--- com.google.api.grpc:proto-google-cloud-pubsub-v1:1.94.0 -> 1.93.0-sp.1
|    +--- com.google.api.grpc:proto-google-cloud-pubsublite-v1:0.13.2
|    |    +--- com.google.guava:failureaccess:1.0.1
|    |    +--- com.google.guava:listenablefuture:9999.0-empty-to-avoid-conflict-with-guava
|    |    +--- com.google.code.findbugs:jsr305:3.0.2
|    |    +--- org.checkerframework:checker-compat-qual:2.5.5
|    |    +--- com.google.errorprone:error_prone_annotations:2.6.0
|    |    +--- com.google.j2objc:j2objc-annotations:1.3
|    |    +--- javax.annotation:javax.annotation-api:1.3.2
|    |    \--- com.google.auto.value:auto-value-annotations:1.7.4 -> 1.8.1
|    +--- com.google.api.grpc:grpc-google-cloud-pubsublite-v1:0.13.2
|    |    +--- com.google.api.grpc:proto-google-common-protos:2.1.0
|    |    +--- com.google.api:api-common:1.10.1 -> 1.10.1-sp.1
|    |    +--- javax.annotation:javax.annotation-api:1.3.2
|    |    +--- com.google.auto.value:auto-value-annotations:1.7.4 -> 1.8.1
|    |    +--- io.grpc:grpc-context:1.37.0 -> 1.36.2
|    |    +--- com.google.code.findbugs:jsr305:3.0.2
|    |    +--- com.google.errorprone:error_prone_annotations:2.6.0
|    |    +--- io.grpc:grpc-protobuf-lite:1.37.0 -> 1.36.2 (*)
|    |    +--- com.google.guava:failureaccess:1.0.1
|    |    +--- com.google.guava:listenablefuture:9999.0-empty-to-avoid-conflict-with-guava
|    |    +--- org.checkerframework:checker-compat-qual:2.5.5
|    |    \--- com.google.j2objc:j2objc-annotations:1.3
|    +--- com.google.flogger:google-extensions:0.6
|    |    +--- com.google.flogger:flogger:0.6
|    |    |    \--- org.checkerframework:checker-compat-qual:2.5.3 -> 2.5.5
|    |    \--- com.google.flogger:flogger-system-backend:0.6
|    |         +--- com.google.flogger:flogger:0.6 (*)
|    |         \--- org.checkerframework:checker-compat-qual:2.5.3 -> 2.5.5
|    +--- com.google.flogger:flogger:0.6 (*)
|    +--- com.google.code.findbugs:jsr305:3.0.2
|    +--- com.google.api:api-common:1.10.1 -> 1.10.1-sp.1
|    +--- com.google.guava:guava:30.1.1-android -> 30.1.1-jre (*)
|    +--- org.threeten:threetenbp:1.5.0
|    +--- com.google.errorprone:error_prone_annotations:2.6.0
|    +--- com.google.auto.value:auto-value-annotations:1.7.4 -> 1.8.1
|    +--- com.google.api.grpc:proto-google-common-protos:2.1.0
|    +--- com.google.api:gax-grpc:1.63.0 -> 1.64.0-sp.1
|    \--- io.grpc:grpc-protobuf:1.37.0 -> 1.36.2 (*)
\--- com.google.cloud.bigdataoss:gcs-connector:hadoop3-2.2.0
     +--- com.google.api-client:google-api-client-jackson2:1.31.1
     |    \--- com.google.api-client:google-api-client:1.31.1 -> 1.31.3-sp.1
     |         +--- com.google.oauth-client:google-oauth-client:1.31.4 -> 1.31.4-sp.1
     |         |    +--- com.google.http-client:google-http-client:1.38.0 -> 1.39.2-sp.1 (*)
     |         |    \--- com.google.guava:guava:30.1-android -> 30.1.1-jre (*)
     |         +--- com.google.http-client:google-http-client-gson:1.39.0 -> 1.39.2 (*)
     |         +--- com.google.guava:guava:30.1-android -> 30.1.1-jre (*)
     |         +--- com.google.http-client:google-http-client-apache-v2:1.39.0
     |         |    +--- com.google.http-client:google-http-client:1.39.0 -> 1.39.2-sp.1 (*)
     |         |    +--- org.apache.httpcomponents:httpclient:4.5.13 (*)
     |         |    \--- org.apache.httpcomponents:httpcore:4.4.14
     |         +--- org.apache.httpcomponents:httpcore:4.4.14
     |         +--- org.apache.httpcomponents:httpclient:4.5.13 (*)
     |         \--- com.google.http-client:google-http-client:1.39.0 -> 1.39.2-sp.1 (*)
     +--- com.google.guava:guava:30.1-jre -> 30.1.1-jre (*)
     +--- com.google.oauth-client:google-oauth-client:1.31.2 -> 1.31.4-sp.1 (*)
     +--- com.google.cloud.bigdataoss:util:2.2.0
     |    +--- com.google.http-client:google-http-client-jackson2:1.38.0 (*)
     |    +--- com.google.api-client:google-api-client-jackson2:1.31.1 (*)
     |    +--- com.google.apis:google-api-services-iamcredentials:v1-rev20201022-1.31.0
     |    |    \--- com.google.api-client:google-api-client:1.31.1 -> 1.31.3-sp.1 (*)
     |    +--- com.google.apis:google-api-services-storage:v1-rev20201112-1.31.0
     |    |    \--- com.google.api-client:google-api-client:1.31.1 -> 1.31.3-sp.1 (*)
     |    +--- com.google.guava:guava:30.1-jre -> 30.1.1-jre (*)
     |    +--- com.google.auto.value:auto-value-annotations:1.7.4 -> 1.8.1
     |    +--- com.google.oauth-client:google-oauth-client:1.31.2 -> 1.31.4-sp.1 (*)
     |    +--- com.google.flogger:google-extensions:0.5.1 -> 0.6 (*)
     |    \--- org.apache.httpcomponents:httpclient:4.5.13 (*)
     +--- com.google.cloud.bigdataoss:util-hadoop:hadoop3-2.2.0
     |    +--- com.google.http-client:google-http-client-jackson2:1.38.0 (*)
     |    +--- com.google.api-client:google-api-client-jackson2:1.31.1 (*)
     |    +--- com.google.guava:guava:30.1-jre -> 30.1.1-jre (*)
     |    +--- com.google.oauth-client:google-oauth-client:1.31.2 -> 1.31.4-sp.1 (*)
     |    +--- com.google.cloud.bigdataoss:util:2.2.0 (*)
     |    +--- com.google.flogger:flogger:0.5.1 -> 0.6 (*)
     |    +--- com.google.flogger:google-extensions:0.5.1 -> 0.6 (*)
     |    \--- com.google.flogger:flogger-system-backend:0.5.1 -> 0.6 (*)
     +--- com.google.cloud.bigdataoss:gcsio:2.2.0
     |    +--- com.google.http-client:google-http-client-jackson2:1.38.0 (*)
     |    +--- com.google.api-client:google-api-client-jackson2:1.31.1 (*)
     |    +--- com.google.apis:google-api-services-storage:v1-rev20201112-1.31.0 (*)
     |    +--- io.grpc:grpc-api:1.34.1 -> 1.36.2 (*)
     |    +--- io.grpc:grpc-alts:1.34.1 -> 1.36.2 (*)
     |    +--- io.grpc:grpc-context:1.34.1 -> 1.36.2
     |    +--- io.grpc:grpc-core:1.34.1 -> 1.36.2 (*)
     |    +--- io.grpc:grpc-protobuf:1.34.1 -> 1.36.2 (*)
     |    +--- io.grpc:grpc-stub:1.34.1 -> 1.36.2 (*)
     |    +--- com.google.api.grpc:proto-google-iam-v1:1.0.5 -> 1.0.11 (*)
     |    +--- com.google.guava:guava:30.1-jre -> 30.1.1-jre (*)
     |    +--- com.google.auto.value:auto-value-annotations:1.7.4 -> 1.8.1
     |    +--- com.google.oauth-client:google-oauth-client:1.31.2 -> 1.31.4-sp.1 (*)
     |    +--- com.google.protobuf:protobuf-java:3.14.0 -> 3.16.0
     |    +--- com.google.protobuf:protobuf-java-util:3.14.0 -> 3.16.0 (*)
     |    +--- com.google.flogger:flogger:0.5.1 -> 0.6 (*)
     |    +--- com.google.flogger:google-extensions:0.5.1 -> 0.6 (*)
     |    +--- com.google.cloud.bigdataoss:util:2.2.0 (*)
     |    \--- com.google.code.gson:gson:2.8.6
     +--- com.google.auto.value:auto-value-annotations:1.7.4 -> 1.8.1
     +--- com.google.flogger:flogger:0.5.1 -> 0.6 (*)
     +--- com.google.flogger:google-extensions:0.5.1 -> 0.6 (*)
     \--- com.google.code.gson:gson:2.8.6
```