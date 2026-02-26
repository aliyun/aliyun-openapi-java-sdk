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
 * @version 1.3.2
 */
public class DescribeAvailableResourceRequest extends RpcAcsRequest<DescribeAvailableResourceResponse> {

    public DescribeAvailableResourceRequest() {
        super("Eci", "2018-08-08", "DescribeAvailableResource", "eci");
    }

    private String zoneId;

    private DestinationResource destinationResource;

    private SpotAvailableResource spotResource;

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
        if (null != zoneId) {
            putQueryParameter("ZoneId", zoneId);
        }
    }

    public DestinationResource getDestinationResource() {
        return this.destinationResource;
    }

    public void setDestinationResource(DestinationResource destinationResource) {
        this.destinationResource = destinationResource;
        if (null != destinationResource) {
            putQueryParameter("DestinationResource.Category", destinationResource.getCategory());
            putQueryParameter("DestinationResource.Value", destinationResource.getValue());
            putQueryParameter("DestinationResource.Cores", destinationResource.getCores());
            putQueryParameter("DestinationResource.Memory", destinationResource.getMemory());
        }
    }

    public SpotAvailableResource getSpotResource() {
        return this.spotResource;
    }

    public void setSpotResource(SpotAvailableResource spotResource) {
        this.spotResource = spotResource;
        if (null != spotResource) {
            putQueryParameter("SpotResource.SpotStrategy", spotResource.getSpotStrategy());
            putQueryParameter("SpotResource.SpotPriceLimit", spotResource.getSpotPriceLimit());
            putQueryParameter("SpotResource.SpotDuration", spotResource.getSpotDuration());
        }
    }

    public static class DestinationResource {
        private String category;

        private String value;

        private Float cores;

        private Float memory;

        public String getCategory() {
            return this.category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getValue() {
            return this.value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public Float getCores() {
            return this.cores;
        }

        public void setCores(Float cores) {
            this.cores = cores;
        }

        public Float getMemory() {
            return this.memory;
        }

        public void setMemory(Float memory) {
            this.memory = memory;
        }
    }

    public static class SpotAvailableResource {
        private String spotStrategy;

        private Double spotPriceLimit;

        private Integer spotDuration;

        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public void setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
        }

        public Double getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public void setSpotPriceLimit(Double spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
        }

        public Integer getSpotDuration() {
            return this.spotDuration;
        }

        public void setSpotDuration(Integer spotDuration) {
            this.spotDuration = spotDuration;
        }
    }

    @Override
    public Class<DescribeAvailableResourceResponse> getResponseClass() {
        return DescribeAvailableResourceResponse.class;
    }
}
