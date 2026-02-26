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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.eci.transform.v20180808.DescribeDataCachesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.List;

/**
 * @author xiaohui
 * @version 1.4.0
 */
public class DescribeDataCachesResponse extends AcsResponse{

    private String requestId;

    private List<DataCache> dataCaches;

    private String nextToken;

    private Integer totalCount;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<DataCache> getDataCaches() {
        return dataCaches;
    }

    public void setDataCaches(List<DataCache> dataCaches) {
        this.dataCaches = dataCaches;
    }

    public String getNextToken() {
        return nextToken;
    }

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public static class DataCache {

        private String dataCacheId;

        private String creationTime;

        private String status;

        private String progress;

        private String lastMatchedTime;

        private String expireDateTime;

        private String containerGroupId;

        private List<Tag> tags;

        private List<Event> events;

        private String regionId;

        private String snapshotId;

        private String flashSnapshotId;

        private String resourceGroupId;

        private Integer size;

        private String name;

        private DataSource dataSource;

        private String bucket;

        private String path;

        public String getDataCacheId() {
            return dataCacheId;
        }

        public void setDataCacheId(String dataCacheId) {
            this.dataCacheId = dataCacheId;
        }

        public String getCreationTime() {
            return creationTime;
        }

        public void setCreationTime(String creationTime) {
            this.creationTime = creationTime;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getProgress() {
            return progress;
        }

        public void setProgress(String progress) {
            this.progress = progress;
        }

        public String getLastMatchedTime() {
            return lastMatchedTime;
        }

        public void setLastMatchedTime(String lastMatchedTime) {
            this.lastMatchedTime = lastMatchedTime;
        }

        public String getExpireDateTime() {
            return expireDateTime;
        }

        public void setExpireDateTime(String expireDateTime) {
            this.expireDateTime = expireDateTime;
        }

        public String getContainerGroupId() {
            return containerGroupId;
        }

        public void setContainerGroupId(String containerGroupId) {
            this.containerGroupId = containerGroupId;
        }

        public List<Tag> getTags() {
            return tags;
        }

        public void setTags(List<Tag> tags) {
            this.tags = tags;
        }

        public List<Event> getEvents() {
            return events;
        }

        public void setEvents(List<Event> events) {
            this.events = events;
        }

        public String getRegionId() {
            return regionId;
        }

        public void setRegionId(String regionId) {
            this.regionId = regionId;
        }

        public String getSnapshotId() {
            return snapshotId;
        }

        public void setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
        }

        public String getFlashSnapshotId() {
            return flashSnapshotId;
        }

        public void setFlashSnapshotId(String flashSnapshotId) {
            this.flashSnapshotId = flashSnapshotId;
        }

        public String getResourceGroupId() {
            return resourceGroupId;
        }

        public void setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
        }

        public Integer getSize() {
            return size;
        }

        public void setSize(Integer size) {
            this.size = size;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public DataSource getDataSource() {
            return dataSource;
        }

        public void setDataSource(DataSource dataSource) {
            this.dataSource = dataSource;
        }

        public String getBucket() {
            return bucket;
        }

        public void setBucket(String bucket) {
            this.bucket = bucket;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
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

        public static class Event {

            private Integer count;

            private String type;

            private String name;

            private String message;

            private String firstTimestamp;

            private String lastTimestamp;

            public Integer getCount() {
                return count;
            }

            public void setCount(Integer count) {
                this.count = count;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getMessage() {
                return message;
            }

            public void setMessage(String message) {
                this.message = message;
            }

            public String getFirstTimestamp() {
                return firstTimestamp;
            }

            public void setFirstTimestamp(String firstTimestamp) {
                this.firstTimestamp = firstTimestamp;
            }

            public String getLastTimestamp() {
                return lastTimestamp;
            }

            public void setLastTimestamp(String lastTimestamp) {
                this.lastTimestamp = lastTimestamp;
            }
        }

        public static class DataSource {

            private String type;

            private String options;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getOptions() {
                return options;
            }

            public void setOptions(String options) {
                this.options = options;
            }
        }
    }

    @Override
    public DescribeDataCachesResponse getInstance(UnmarshallerContext context) {
        return	DescribeDataCachesResponseUnmarshaller.unmarshall(this, context);
    }

    @Override
    public boolean checkShowJsonItemName() {
        return false;
    }
}
