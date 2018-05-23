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

package com.aliyuncs.drds.model.v20171016;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.drds.transform.v20171016.DescribeRegionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRegionsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private List<DrdsRegion> drdsRegions;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<DrdsRegion> getDrdsRegions() {
		return this.drdsRegions;
	}

	public void setDrdsRegions(List<DrdsRegion> drdsRegions) {
		this.drdsRegions = drdsRegions;
	}

	public static class DrdsRegion {

		private String regionId;

		private String regionName;

		private String zoneId;

		private String zoneName;

		private List<InstanceSeries> instanceSeriesList;

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

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getZoneName() {
			return this.zoneName;
		}

		public void setZoneName(String zoneName) {
			this.zoneName = zoneName;
		}

		public List<InstanceSeries> getInstanceSeriesList() {
			return this.instanceSeriesList;
		}

		public void setInstanceSeriesList(List<InstanceSeries> instanceSeriesList) {
			this.instanceSeriesList = instanceSeriesList;
		}

		public static class InstanceSeries {

			private String seriesId;

			private String seriesName;

			private List<Spec> specList;

			public String getSeriesId() {
				return this.seriesId;
			}

			public void setSeriesId(String seriesId) {
				this.seriesId = seriesId;
			}

			public String getSeriesName() {
				return this.seriesName;
			}

			public void setSeriesName(String seriesName) {
				this.seriesName = seriesName;
			}

			public List<Spec> getSpecList() {
				return this.specList;
			}

			public void setSpecList(List<Spec> specList) {
				this.specList = specList;
			}

			public static class Spec {

				private String specId;

				private String specName;

				public String getSpecId() {
					return this.specId;
				}

				public void setSpecId(String specId) {
					this.specId = specId;
				}

				public String getSpecName() {
					return this.specName;
				}

				public void setSpecName(String specName) {
					this.specName = specName;
				}
			}
		}
	}

	@Override
	public DescribeRegionsResponse getInstance(UnmarshallerContext context) {
		return	DescribeRegionsResponseUnmarshaller.unmarshall(this, context);
	}
}
