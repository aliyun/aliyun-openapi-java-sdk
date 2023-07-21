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

import java.util.List;

/**
 * @author xiaohui
 * @version 1.4.3
 */
public class CopyDataCacheRequest extends RpcAcsRequest<CopyDataCacheResponse>{
    public CopyDataCacheRequest() {
        super("Eci", "2018-08-08", "CopyDataCache", "eci");
    }

    private String bucket;

    private String path;

    private String name;

    private Integer retentionDays;

    private String resourceGroupId;

    private String clientToken;

    private List<Tag> tags;

    private String dataCacheId;

    private String destinationRegionId;

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
        if (bucket != null) {
            putQueryParameter("Bucket", bucket);
        }
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
        if (path != null) {
            putQueryParameter("Path", path);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        if (name != null) {
            putQueryParameter("Name", name);
        }
    }

    public Integer getRetentionDays() {
        return retentionDays;
    }

    public void setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        if (retentionDays !=null) {
            putQueryParameter("RetentionDays", retentionDays);
        }
    }

    public String getResourceGroupId() {
        return resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        if (resourceGroupId !=null) {
            putQueryParameter("ResourceGroupId", resourceGroupId);
        }
    }

    public String getClientToken() {
        return clientToken;
    }

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
        if (clientToken != null) {
            putQueryParameter("ClientToken", clientToken);
        }
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
        if (tags != null) {
            for (int i = 0; i < tags.size(); i++) {
                putQueryParameter("Tag." + (i + 1) + ".Key", tags.get(i).getKey());
                putQueryParameter("Tag." + (i + 1) + ".Value", tags.get(i).getValue());
            }
        }
    }

    public String getDataCacheId() {
        return dataCacheId;
    }

    public void setDataCacheId(String dataCacheId) {
        this.dataCacheId = dataCacheId;
        if (dataCacheId != null) {
            putQueryParameter("DataCacheId", dataCacheId);
        }
    }

    public String getDestinationRegionId() {
        return destinationRegionId;
    }

    public void setDestinationRegionId(String destinationRegionId) {
        this.destinationRegionId = destinationRegionId;
        if (destinationRegionId != null) {
            putQueryParameter("DestinationRegionId", destinationRegionId);
        }
    }

    public static class Tag {

        private String key;

        private String value;

        public String getKey() {
            return this.key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return this.value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }


    @Override
    public Class<CopyDataCacheResponse> getResponseClass() {
        return CopyDataCacheResponse.class;
    }

}
