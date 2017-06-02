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
package com.aliyuncs.ecs.v20140526.model;

import java.util.List;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.v20140526.transform.DescribeRegionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

public class DescribeRegionsResponse extends AcsResponse {

    private List<Region> regions;
    private String requestId;

    public List<Region> getRegions() {
        return this.regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    public static class Region {

        private String regionId;

        private String localName;

        public String getRegionId() {
            return this.regionId;
        }

        public void setRegionId(String regionId) {
            this.regionId = regionId;
        }

        public String getLocalName() {
            return this.localName;
        }

        public void setLocalName(String localName) {
            this.localName = localName;
        }
    }

    @Override
    public DescribeRegionsResponse getInstance(UnmarshallerContext context) {
        return DescribeRegionsResponseUnmarshaller.unmarshall(this, context);
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}
