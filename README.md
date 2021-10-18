# Repro

Run:

```shell
./gradlew run
```

# Dependency Tree Output:

```
+--- com.google.cloud:gcp-lts-bom:1.0.7
|    +--- com.google.protobuf:protobuf-java-util:3.16.0 (c)
|    +--- io.grpc:grpc-api:1.36.2 -> 1.37.0 (c)
|    +--- io.grpc:grpc-context:1.36.2 -> 1.37.0 (c)
|    +--- io.grpc:grpc-stub:1.36.2 -> 1.37.0 (c)
|    +--- com.google.protobuf:protobuf-java:3.16.0 (c)
|    +--- com.google.api:gax:1.64.0-sp.1 (c)
|    +--- com.google.auth:google-auth-library-oauth2-http:0.25.2-sp.1 -> 0.25.2 (c)
|    +--- com.google.cloud:google-cloud-pubsub:1.111.0-sp.1 -> 1.112.0 (c)
|    +--- io.grpc:grpc-protobuf-lite:1.36.2 -> 1.37.0 (c)
|    +--- io.grpc:grpc-auth:1.36.2 -> 1.37.0 (c)
|    +--- io.grpc:grpc-netty-shaded:1.36.2 -> 1.37.0 (c)
|    +--- io.grpc:grpc-alts:1.36.2 -> 1.37.0 (c)
|    +--- io.grpc:grpc-grpclb:1.36.2 -> 1.37.0 (c)
|    +--- io.grpc:grpc-core:1.36.2 -> 1.37.0 (c)
|    +--- com.google.http-client:google-http-client:1.39.2-sp.1 -> 1.39.2 (c)
|    +--- com.google.api.grpc:proto-google-cloud-pubsub-v1:1.93.0-sp.1 -> 1.94.0 (c)
|    +--- com.google.api:api-common:1.10.1-sp.1 -> 1.10.1 (c)
|    +--- com.google.guava:guava:30.1.1-jre (c)
|    +--- com.google.auto.value:auto-value-annotations:1.8.1 (c)
|    +--- com.google.api:gax-grpc:1.64.0-sp.1 (c)
|    \--- io.grpc:grpc-protobuf:1.36.2 -> 1.37.0 (c)
\--- com.google.cloud:google-cloud-pubsublite:0.13.2
     +--- com.google.protobuf:protobuf-java-util:3.15.8 -> 3.16.0
     +--- io.grpc:grpc-api:1.37.0
     +--- io.grpc:grpc-context:1.37.0
     +--- io.grpc:grpc-stub:1.37.0
     +--- com.google.protobuf:protobuf-java:3.15.8 -> 3.16.0
     +--- com.google.api:gax:1.63.0 -> 1.64.0-sp.1
     +--- com.google.auth:google-auth-library-oauth2-http:0.25.2
     +--- io.opencensus:opencensus-api:0.28.0
     +--- com.google.cloud:google-cloud-pubsub:1.112.0
     +--- io.grpc:grpc-protobuf-lite:1.37.0
     +--- javax.annotation:javax.annotation-api:1.3.2
     +--- com.google.api.grpc:proto-google-iam-v1:1.0.11
     +--- com.google.guava:failureaccess:1.0.1
     +--- com.google.guava:listenablefuture:9999.0-empty-to-avoid-conflict-with-guava
     +--- org.checkerframework:checker-compat-qual:2.5.5
     +--- com.google.j2objc:j2objc-annotations:1.3
     +--- com.google.http-client:google-http-client-gson:1.39.2
     +--- io.grpc:grpc-auth:1.37.0
     +--- com.google.auth:google-auth-library-credentials:0.25.2
     +--- io.grpc:grpc-netty-shaded:1.37.0
     +--- io.grpc:grpc-alts:1.37.0
     +--- io.grpc:grpc-grpclb:1.37.0
     +--- org.conscrypt:conscrypt-openjdk-uber:2.5.1
     +--- io.grpc:grpc-core:1.37.0
     +--- com.google.http-client:google-http-client:1.39.2
     +--- org.apache.httpcomponents:httpclient:4.5.13
     +--- commons-logging:commons-logging:1.2
     +--- commons-codec:commons-codec:1.15
     +--- org.apache.httpcomponents:httpcore:4.4.14
     +--- io.opencensus:opencensus-contrib-http-util:0.28.0
     +--- com.google.api.grpc:proto-google-cloud-pubsub-v1:1.94.0
     +--- com.google.api.grpc:proto-google-cloud-pubsublite-v1:0.13.2
     |    +--- com.google.guava:failureaccess:1.0.1
     |    +--- com.google.guava:listenablefuture:9999.0-empty-to-avoid-conflict-with-guava
     |    +--- com.google.code.findbugs:jsr305:3.0.2
     |    +--- org.checkerframework:checker-compat-qual:2.5.5
     |    +--- com.google.errorprone:error_prone_annotations:2.6.0
     |    +--- com.google.j2objc:j2objc-annotations:1.3
     |    +--- javax.annotation:javax.annotation-api:1.3.2
     |    \--- com.google.auto.value:auto-value-annotations:1.7.4 -> 1.8.1
     +--- com.google.api.grpc:grpc-google-cloud-pubsublite-v1:0.13.2
     |    +--- com.google.api.grpc:proto-google-common-protos:2.1.0
     |    +--- com.google.api:api-common:1.10.1
     |    +--- javax.annotation:javax.annotation-api:1.3.2
     |    +--- com.google.auto.value:auto-value-annotations:1.7.4 -> 1.8.1
     |    +--- io.grpc:grpc-context:1.37.0
     |    +--- com.google.code.findbugs:jsr305:3.0.2
     |    +--- com.google.errorprone:error_prone_annotations:2.6.0
     |    +--- io.grpc:grpc-protobuf-lite:1.37.0
     |    +--- com.google.guava:failureaccess:1.0.1
     |    +--- com.google.guava:listenablefuture:9999.0-empty-to-avoid-conflict-with-guava
     |    +--- org.checkerframework:checker-compat-qual:2.5.5
     |    \--- com.google.j2objc:j2objc-annotations:1.3
     +--- com.google.flogger:google-extensions:0.6
     +--- com.google.flogger:flogger:0.6
     +--- com.google.code.findbugs:jsr305:3.0.2
     +--- com.google.api:api-common:1.10.1
     +--- com.google.guava:guava:30.1.1-android -> 30.1.1-jre
     |    \--- org.checkerframework:checker-qual:3.8.0
     +--- org.threeten:threetenbp:1.5.0
     +--- com.google.errorprone:error_prone_annotations:2.6.0
     +--- com.google.auto.value:auto-value-annotations:1.7.4 -> 1.8.1
     +--- com.google.api.grpc:proto-google-common-protos:2.1.0
     +--- com.google.api:gax-grpc:1.63.0 -> 1.64.0-sp.1
     \--- io.grpc:grpc-protobuf:1.37.0

```