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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eci.transform.v20180808.DescribeRegionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version
 */
public class DescribeRegionsResponse extends AcsResponse {

    private String requestId;

    private List<Region> regions;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<Region> getRegions() {
        return this.regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    public static class Region {

        private String regionId;

        private String regionEndpoint;

        private List<String> zones;

        /**
         * @deprecated use setBizRegionId instead of this.
         */
        @Deprecated
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @deprecated use setBizRegionId instead of this.
         */
        @Deprecated
        public void setRegionId(String regionId) {
            this.regionId = regionId;
        }

        public String getRegionEndpoint() {
            return this.regionEndpoint;
        }

        public void setRegionEndpoint(String regionEndpoint) {
            this.regionEndpoint = regionEndpoint;
        }

        public List<String> getZones() {
            return this.zones;
        }

        public void setZones(List<String> zones) {
            this.zones = zones;
        }

    }

    @Override
    public DescribeRegionsResponse getInstance(UnmarshallerContext context) {
        return	DescribeRegionsResponseUnmarshaller.unmarshall(this, context);
    }

    @Override
    public boolean checkShowJsonItemName() {
        return false;
    }
}

