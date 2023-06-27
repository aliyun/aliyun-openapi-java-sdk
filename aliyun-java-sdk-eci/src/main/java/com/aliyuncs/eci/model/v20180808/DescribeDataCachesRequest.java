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
 * @version 1.4.0
 */
public class DescribeDataCachesRequest extends RpcAcsRequest<DescribeDataCachesResponse> {

    public DescribeDataCachesRequest() {
        super("Eci", "2018-08-08", "DescribeDataCaches", "eci");
    }

    private List<String> dataCacheIds;

    private String bucket;

    private String path;

    private List<Tag> tags;

    private String resourceGroupId;

    private Integer limit;

    private String nextToken;

    public List<String> getDataCacheIds() {
        return dataCacheIds;
    }

    public void setDataCacheIds(List<String> dataCacheIds) {
        this.dataCacheIds = dataCacheIds;
        if (dataCacheIds != null) {
            for (int i = 0; i < dataCacheIds.size(); i++) {
                putQueryParameter("DataCacheId." + (i + 1), dataCacheIds.get(i));
            }
        }
    }

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

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
        if (tags != null) {
            for (int depth1 = 0; depth1 < tags.size(); depth1++) {
                putQueryParameter("Tag." + (depth1 + 1) + ".Key", tags.get(depth1).getKey());
                putQueryParameter("Tag." + (depth1 + 1) + ".Value", tags.get(depth1).getValue());
            }
        }
    }

    public String getResourceGroupId() {
        return resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        if (resourceGroupId != null) {
            putQueryParameter("ResourceGroupId", resourceGroupId);
        }
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
        if (limit != null) {
            putQueryParameter("Limit", limit);
        }
    }

    public String getNextToken() {
        return nextToken;
    }

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
        if (nextToken != null) {
            putQueryParameter("NextToken", nextToken);
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
    public  Class<DescribeDataCachesResponse> getResponseClass() {
        return DescribeDataCachesResponse.class;
    }
}
