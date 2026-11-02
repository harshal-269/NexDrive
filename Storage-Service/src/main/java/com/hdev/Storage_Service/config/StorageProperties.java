package com.hdev.Storage_Service.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

// Cloud Common configuration file maise ho skta h kafi sara data hm la rhe ho
// Like storage.path, storage.directory, storage.size, etc.., ab in sari chizo maise
// hm chate h ki jo properties storage. se shuru ho rhi h vo ek file mai aa jae
// to uske liye below configuration use krte hai

@ConfigurationProperties(prefix = "storage")
public record StorageProperties(String directory) {

}
