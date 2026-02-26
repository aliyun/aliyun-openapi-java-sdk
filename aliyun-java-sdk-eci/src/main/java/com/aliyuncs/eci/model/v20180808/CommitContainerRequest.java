/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.eci.model.v20180808;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author xiaohui
 * @version 1.3.6
 */
public class CommitContainerRequest extends RpcAcsRequest<CommitContainerResponse> {
    public CommitContainerRequest() {
        super("Eci", "2018-08-08", "CommitContainer", "eci");
    }

    private String containerGroupId;

    private String containerName;

    private Image image;

    private AcrRegistryInfo acrRegistryInfo;

    private Arn arn;

    public String getContainerGroupId() {
        return this.containerGroupId;
    }

    public void setContainerGroupId(String containerGroupId) {
        this.containerGroupId = containerGroupId;
        if (null != containerGroupId) {
            putQueryParameter("ContainerGroupId", containerGroupId);
        }
    }

    public String getContainerName() {
        return this.containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
        if (null != containerName) {
            putQueryParameter("ContainerName", containerName);
        }
    }

    public Image getImage() {
        return this.image;
    }

    public void setImage(Image image) {
        this.image = image;
        if (null != image.repository) {
            putQueryParameter("Image.Repository", image.repository);
        }
        if (null != image.tag) {
            putQueryParameter("Image.Tag", image.tag);
        }
        if (null != image.message) {
            putQueryParameter("Image.Message", image.message);
        }
        if (null != image.author) {
            putQueryParameter("Image.Author", image.author);
        }

    }

    public AcrRegistryInfo getAcrRegistryInfo() {
        return this.acrRegistryInfo;
    }

    public void setAcrRegistryInfo(AcrRegistryInfo acrRegistryInfo) {
        this.acrRegistryInfo = acrRegistryInfo;
        if (null != acrRegistryInfo.regionId) {
            putQueryParameter("AcrRegistryInfo.RegionId", acrRegistryInfo.regionId);
        }
        if (null != acrRegistryInfo.instanceId) {
            putQueryParameter("AcrRegistryInfo.InstanceId", acrRegistryInfo.instanceId);
        }
    }

    public Arn getArn() {
        return this.arn;
    }

    public void setArn(Arn arn) {
        this.arn = arn;
        if (null != arn.roleArn) {
            putQueryParameter("Arn.RoleArn", arn.roleArn);
        }
        if (null != arn.roleType) {
            putQueryParameter("Arn.RoleType", arn.roleType);
        }
    }

    public static class Image {

        private String repository;

        private String tag;

        private String message;

        private String author;

        public String getRepository() {
            return this.repository;
        }

        public void setRepository(String repository) {
            this.repository = repository;
        }

        public String getTag() {
            return this.tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getMessage() {
            return this.message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getAuthor() {
            return this.author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }
    }

    public static class AcrRegistryInfo {

        private String instanceId;

        private String regionId;

        public String getInstanceId() {
            return this.instanceId;
        }

        public void setInstanceId(String instanceId) {
            this.instanceId = instanceId;
        }

        public String getRegionId() {
            return this.regionId;
        }

        public void setRegionId(String regionId) {
            this.regionId = regionId;
        }
    }

    public static class Arn {

        private String roleArn;

        private String roleType;

        public String getRoleArn() {
            return this.roleArn;
        }

        public void setRoleArn(String roleArn) {
            this.roleArn = roleArn;
        }

        public String getRoleType() {
            return this.roleType;
        }

        public void setRoleType(String roleType) {
            this.roleType = roleType;
        }
    }


    @Override
    public Class<CommitContainerResponse> getResponseClass() {
        return CommitContainerResponse.class;
    }
}
