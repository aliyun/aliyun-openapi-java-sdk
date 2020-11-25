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
import com.aliyuncs.eci.transform.v20180808.ListUsageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author hxh
 * @version 1.1.14
 */
public class ListUsageResponse extends AcsResponse {

    private String requestId;

    private Attributes attributes;

    public static class Attributes {
        private String maxCpu;
        private String usedCpu;
        private String maxImageCacheCount;
        private String usedImageCacheCount;

        public String getMaxCpu() {
            return maxCpu;
        }

        public void setMaxCpu(String maxCpu) {
            this.maxCpu = maxCpu;
        }

        public String getUsedCpu() {
            return usedCpu;
        }

        public void setUsedCpu(String usedCpu) {
            this.usedCpu = usedCpu;
        }

        public String getMaxImageCacheCount() {
            return maxImageCacheCount;
        }

        public void setMaxImageCacheCount(String maxImageCacheCount) {
            this.maxImageCacheCount = maxImageCacheCount;
        }

        public String getUsedImageCacheCount() {
            return usedImageCacheCount;
        }

        public void setUsedImageCacheCount(String usedImageCacheCount) {
            this.usedImageCacheCount = usedImageCacheCount;
        }
    }


    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    @Override
    public ListUsageResponse getInstance(UnmarshallerContext context) {
        return ListUsageResponseUnmarshaller.unmarshall(this, context);
    }

    @Override
    public boolean checkShowJsonItemName() {
        return false;
    }

}
