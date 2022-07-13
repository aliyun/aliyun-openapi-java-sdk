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
import com.aliyuncs.eci.transform.v20180808.DescribeAvailableResourceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.List;


/**
 * @author xiaohui
 * @version 1.3.2
 */
public class DescribeAvailableResourceResponse extends AcsResponse {

    private String requestId;

    private List<AvailableZone> availableZones;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<AvailableZone> getAvailableZones() {
        return this.availableZones;
    }

    public void setAvailableZones(List<AvailableZone> availableZones) {
        this.availableZones = availableZones;
    }

    public static class AvailableZone {
        private String regionId;

        private String zoneId;

        private List<AvailableResource> availableResources;

        public String getRegionId() {
            return this.regionId;
        }

        public void setRegionId(String regionId) {
            this.regionId = regionId;
        }

        public String getZoneId() {
            return this.zoneId;
        }

        public void setZoneId(String zoneId) {
            this.zoneId = zoneId;
        }

        public List<AvailableResource> getAvailableResources() {
            return this.availableResources;
        }

        public void setAvailableResources(List<AvailableResource> availableResources) {
            this.availableResources = availableResources;
        }

        public static class AvailableResource {
            private String type;

            private List<SupportedResource> supportedResources;

            public String getType() {
                return this.type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public List<SupportedResource> getSupportedResources() {
                return this.supportedResources;
            }

            public void setSupportedResources(List<SupportedResource> supportedResources) {
                this.supportedResources = supportedResources;
            }

            public static class SupportedResource {
                private String value;

                private String statusCategory;

                public String getValue() {
                    return this.value;
                }

                public void setValue(String value) {
                    this.value = value;
                }

                public String getStatusCategory() {
                    return this.statusCategory;
                }

                public void setStatusCategory(String statusCategory) {
                    this.statusCategory = statusCategory;
                }
            }

        }

    }

    @Override
    public DescribeAvailableResourceResponse getInstance(UnmarshallerContext context) {
        return DescribeAvailableResourceResponseUnmarshaller.unmarshall(this, context);
    }
}
