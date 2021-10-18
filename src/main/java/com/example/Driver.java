package com.example;

import com.google.cloud.hadoop.fs.gcs.HadoopCredentialConfiguration;
import com.google.cloud.pubsublite.proto.PubSubMessage;
import com.google.common.flogger.backend.system.DefaultPlatform;

public class Driver {
  public static void main(String[] args) {
    System.out.println(HadoopCredentialConfiguration.class);
    System.out.println(PubSubMessage.class);
    System.out.println("Hello");
    new DefaultPlatform();
    System.out.println("Hello");
  }
}
