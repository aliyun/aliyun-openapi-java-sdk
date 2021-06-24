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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryZoneGroupWaterLevelResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryZoneGroupWaterLevelResponse extends AcsResponse {

	private String requestId;

	private List<ZoneGroupWaterLevel> zoneGroupWaterLevels;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ZoneGroupWaterLevel> getZoneGroupWaterLevels() {
		return this.zoneGroupWaterLevels;
	}

	public void setZoneGroupWaterLevels(List<ZoneGroupWaterLevel> zoneGroupWaterLevels) {
		this.zoneGroupWaterLevels = zoneGroupWaterLevels;
	}

	public static class ZoneGroupWaterLevel {

		private Long highLevel;

		private String flavor;

		private String grayBizType;

		private Integer networkType;

		private String clusterGroup;

		private String bizType;

		private String regionId;

		private Integer ioOptimized;

		private Long riLevel;

		private Integer resourceType;

		private Long lowLevel;

		private String izNo;

		public Long getHighLevel() {
			return this.highLevel;
		}

		public void setHighLevel(Long highLevel) {
			this.highLevel = highLevel;
		}

		public String getFlavor() {
			return this.flavor;
		}

		public void setFlavor(String flavor) {
			this.flavor = flavor;
		}

		public String getGrayBizType() {
			return this.grayBizType;
		}

		public void setGrayBizType(String grayBizType) {
			this.grayBizType = grayBizType;
		}

		public Integer getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(Integer networkType) {
			this.networkType = networkType;
		}

		public String getClusterGroup() {
			return this.clusterGroup;
		}

		public void setClusterGroup(String clusterGroup) {
			this.clusterGroup = clusterGroup;
		}

		public String getBizType() {
			return this.bizType;
		}

		public void setBizType(String bizType) {
			this.bizType = bizType;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Integer getIoOptimized() {
			return this.ioOptimized;
		}

		public void setIoOptimized(Integer ioOptimized) {
			this.ioOptimized = ioOptimized;
		}

		public Long getRiLevel() {
			return this.riLevel;
		}

		public void setRiLevel(Long riLevel) {
			this.riLevel = riLevel;
		}

		public Integer getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(Integer resourceType) {
			this.resourceType = resourceType;
		}

		public Long getLowLevel() {
			return this.lowLevel;
		}

		public void setLowLevel(Long lowLevel) {
			this.lowLevel = lowLevel;
		}

		public String getIzNo() {
			return this.izNo;
		}

		public void setIzNo(String izNo) {
			this.izNo = izNo;
		}
	}

	@Override
	public OpsQueryZoneGroupWaterLevelResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryZoneGroupWaterLevelResponseUnmarshaller.unmarshall(this, context);
	}
}
