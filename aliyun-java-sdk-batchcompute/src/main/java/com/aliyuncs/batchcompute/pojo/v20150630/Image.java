/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.batchcompute.pojo.v20150630;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by guangchun.luo on 15/4/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Image {

//    @JsonIgnore
//    public Map<String, BlockDevice> getBlockDeviceMapping() {
//        return blockDeviceMapping;
//    }
//
//    @JsonIgnore
//    public void setBlockDeviceMapping(Map<String, BlockDevice> blockDeviceMapping) {
//        this.blockDeviceMapping = blockDeviceMapping;
//    }
//
//
//    public void addBlockDeviceMapping(String path, BlockDevice blockDevice) {
//        if (null == blockDeviceMapping) {
//            blockDeviceMapping = new HashMap<String, BlockDevice>();
//        }
//        blockDeviceMapping.put(path, blockDevice);
//    }

    @JsonIgnore
    public String getImageName() {
        return imageName;
    }

    @JsonIgnore
    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    @JsonIgnore
    public String getPlatform() {
        return platform;
    }

    @JsonIgnore
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @JsonIgnore
    public String getDescription() {
        return description;
    }

    @JsonIgnore
    public void setDescription(String description) {
        this.description = description;
    }

//    @JsonProperty("BlockDeviceMapping")
//    private Map<String, BlockDevice> blockDeviceMapping;

    @JsonProperty("Name")
    private String imageName;

    @JsonProperty("Platform")
    private String platform;

    @JsonProperty("Description")
    private String description;

    @JsonIgnore
    public String getImageId() {
        return imageId;
    }

    @JsonIgnore
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    @JsonProperty("ResourceId")
    private String imageId;

    public long getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(long creationTime) {
        this.creationTime = creationTime;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    @JsonProperty("CreateTime")
    private long creationTime;

    @JsonProperty("OwnerId")
    private String ownerId;

}
