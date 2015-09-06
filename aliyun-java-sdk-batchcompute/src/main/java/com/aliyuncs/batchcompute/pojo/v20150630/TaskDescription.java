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
 * Created by guangchun.luo on 15/4/15.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TaskDescription {

    @JsonProperty("TaskName")
    private String taskName;

    @JsonProperty("PackageUri")
    private String PackageUri;

    @JsonProperty("ProgramName")
    private String ProgramName;

    @JsonProperty("ProgramType")
    private String ProgramType;

    @JsonProperty("ProgramArguments")
    private String ProgramArguments;

    @JsonProperty("EnvironmentVariables")
    private Map<String, String> EnvironmentVariables;

    @JsonProperty("ImageId")
    private String ImageId;

//    @JsonProperty("SaveImage")
//    private String SaveImage;

//    @JsonProperty("BlockDeviceMapping")
//    private Map<String, BlockDevice> BlockDeviceMapping;

    @JsonProperty("OssMapping")
    private Map<String, String> OssMapping;

    @JsonProperty("OssMappingLock")
    private boolean OssMappingLock;

    @JsonProperty("OssMappingLocale")
    private String OssMappingLocale;

    @JsonProperty("StdoutRedirectPath")
    private String StdoutRedirectPath;

    @JsonProperty("StderrRedirectPath")
    private String StderrRedirectPath;

    @JsonProperty("Timeout")
    private int Timeout;

    @JsonProperty("InstanceCount")
    private int InstanceCount;

    @JsonProperty("ResourceDescription")
    private ResourceDescription ResourceDescription;

//    @JsonProperty("LoadPreparedData")
//    private boolean LoadPreparedData;

//    @JsonProperty("MaxReplica")
//    private int MaxReplica;
//
//    @JsonProperty("MinReplica")
//    private int MinReplica;
//
//    @JsonProperty("CreateSnapshotAfterTerminated")
//    private String CreateSnapshotAfterTerminated;
//
//    @JsonProperty("LoadImage")
//    private String LoadImage;



    @JsonIgnore
    public String getTaskName() {
        return taskName;
    }

    @JsonIgnore
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

//    @JsonIgnore
//    public String getSaveImage() {
//        return SaveImage;
//    }
//
//    @JsonIgnore
//    public void setSaveImage(String saveImage) {
//        SaveImage = saveImage;
//    }
//
//
//    @JsonIgnore
//    public boolean isLoadPreparedData() {
//        return LoadPreparedData;
//    }
//
//    @JsonIgnore
//    public void setLoadPreparedData(boolean loadPreparedData) {
//        LoadPreparedData = loadPreparedData;
//    }


    @JsonIgnore
    public String getOssMappingLocale() {
        return OssMappingLocale;
    }

    @JsonIgnore
    public void setOssMappingLocale(String ossMappingLocale) {
        OssMappingLocale = ossMappingLocale;
    }

    @JsonIgnore
    public boolean isOssMappingLock() {
        return OssMappingLock;
    }

    @JsonIgnore
    public void setOssMappingLock(boolean ossMappingLock) {
        OssMappingLock = ossMappingLock;
    }

//    @JsonIgnore
//    public int getMaxReplica() {
//        return MaxReplica;
//    }
//
//    @JsonIgnore
//    public void setMaxReplica(int maxReplica) {
//        MaxReplica = maxReplica;
//    }
//
//
//    @JsonIgnore
//    public int getMinReplica() {
//        return MinReplica;
//    }
//
//    @JsonIgnore
//    public void setMinReplica(int minReplica) {
//        MinReplica = minReplica;
//    }

//    @JsonIgnore
//    public String getCreateSnapshotAfterTerminated() {
//        return CreateSnapshotAfterTerminated;
//    }
//
//    @JsonIgnore
//    public void setCreateSnapshotAfterTerminated(String createSnapshotAfterTerminated) {
//        CreateSnapshotAfterTerminated = createSnapshotAfterTerminated;
//    }

//    @JsonIgnore
//    public String getLoadImage() {
//        return LoadImage;
//    }
//
//    @JsonIgnore
//    public void setLoadImage(String loadImage) {
//        LoadImage = loadImage;
//    }


    @JsonIgnore
    public String getPackageUri() {
        return PackageUri;
    }

    @JsonIgnore
    public void setPackageUri(String packageUri) {
        PackageUri = packageUri;
    }

    @JsonIgnore
    public String getProgramName() {
        return ProgramName;
    }

    @JsonIgnore
    public void setProgramName(String programName) {
        ProgramName = programName;
    }

    @JsonIgnore
    public String getProgramType() {
        return ProgramType;
    }

    @JsonIgnore
    public void setProgramType(String programType) {
        ProgramType = programType;
    }

    @JsonIgnore
    public String getProgramArguments() {
        return ProgramArguments;
    }

    @JsonIgnore
    public void setProgramArguments(String programArguments) {
        ProgramArguments = programArguments;
    }

    @JsonIgnore
    public Map<String, String> getEnvironmentVariables() {
        return EnvironmentVariables;
    }

    @JsonIgnore
    public void setEnvironmentVariables(Map<String, String> environmentVariables) {
        EnvironmentVariables = environmentVariables;
    }

    public void addEnvironmentVariables(String key, String value) {
        if (null == EnvironmentVariables) {
            EnvironmentVariables = new HashMap<String, String>();
        }
        EnvironmentVariables.put(key, value);
    }


    @JsonIgnore
    public String getImageId() {
        return ImageId;
    }

    @JsonIgnore
    public void setImageId(String imageId) {
        ImageId = imageId;
    }

//    @JsonIgnore
//    public Map<String, BlockDevice> getBlockDeviceMapping() {
//        return BlockDeviceMapping;
//    }
//
//    @JsonIgnore
//    public void setBlockDeviceMapping(Map<String, BlockDevice> blockDeviceMapping) {
//        BlockDeviceMapping = blockDeviceMapping;
//    }
//
//    public void addBlockDeviceMapping(String key, BlockDevice blockDevice) {
//        if (null == BlockDeviceMapping) {
//            BlockDeviceMapping = new HashMap<String, BlockDevice>();
//        }
//        BlockDeviceMapping.put(key, blockDevice);
//    }

    @JsonIgnore
    public Map<String, String> getOssMapping() {
        return OssMapping;
    }

    @JsonIgnore
    public void setOssMapping(Map<String, String> ossMapping) {
        OssMapping = ossMapping;
    }

    public void addOssMapping(String key, String value) {
        if (null == OssMapping) {
            OssMapping = new HashMap<String, String>();
        }
        OssMapping.put(key, value);
    }

    @JsonIgnore
    public String getStdoutRedirectPath() {
        return StdoutRedirectPath;
    }

    @JsonIgnore
    public void setStdoutRedirectPath(String stdoutRedirectPath) {
        StdoutRedirectPath = stdoutRedirectPath;
    }

    @JsonIgnore
    public String getStderrRedirectPath() {
        return StderrRedirectPath;
    }

    @JsonIgnore
    public void setStderrRedirectPath(String stderrRedirectPath) {
        StderrRedirectPath = stderrRedirectPath;
    }

    @JsonIgnore
    public int getTimeout() {
        return Timeout;
    }

    @JsonIgnore
    public void setTimeout(int timeout) {
        Timeout = timeout;
    }

    @JsonIgnore
    public int getInstanceCount() {
        return InstanceCount;
    }

    @JsonIgnore
    public void setInstanceCount(int instanceCount) {
        InstanceCount = instanceCount;
    }

    @JsonIgnore
    public ResourceDescription getResourceDescription() {
        return ResourceDescription;
    }

    @JsonIgnore
    public void setResourceDescription(ResourceDescription resourceDescription) {
        ResourceDescription = resourceDescription;
    }

}
