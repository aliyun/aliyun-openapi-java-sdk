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

package com.aliyuncs.dcdn.model.v20180115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dcdn.transform.v20180115.DescribeDcdnOfflineLogDeliveryRegionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDcdnOfflineLogDeliveryRegionsResponse extends AcsResponse {

	private String requestId;

	private List<Area> areas;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Area> getAreas() {
		return this.areas;
	}

	public void setAreas(List<Area> areas) {
		this.areas = areas;
	}

	public static class Area {

		private String areaId;

		private String areaName;

		private List<RegionInfo> regionInfos;

		public String getAreaId() {
			return this.areaId;
		}

		public void setAreaId(String areaId) {
			this.areaId = areaId;
		}

		public String getAreaName() {
			return this.areaName;
		}

		public void setAreaName(String areaName) {
			this.areaName = areaName;
		}

		public List<RegionInfo> getRegionInfos() {
			return this.regionInfos;
		}

		public void setRegionInfos(List<RegionInfo> regionInfos) {
			this.regionInfos = regionInfos;
		}

		public static class RegionInfo {

			private String regionId;

			private String regionName;

			private String isOverseas;

			private String ossEndpoint;

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getRegionName() {
				return this.regionName;
			}

			public void setRegionName(String regionName) {
				this.regionName = regionName;
			}

			public String getIsOverseas() {
				return this.isOverseas;
			}

			public void setIsOverseas(String isOverseas) {
				this.isOverseas = isOverseas;
			}

			public String getOssEndpoint() {
				return this.ossEndpoint;
			}

			public void setOssEndpoint(String ossEndpoint) {
				this.ossEndpoint = ossEndpoint;
			}
		}
	}

	@Override
	public DescribeDcdnOfflineLogDeliveryRegionsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDcdnOfflineLogDeliveryRegionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
