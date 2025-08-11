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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeRCAvailableResourceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRCAvailableResourceResponse extends AcsResponse {

	private String requestId;

	private List<AvailableZonesItem> availableZones;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<AvailableZonesItem> getAvailableZones() {
		return this.availableZones;
	}

	public void setAvailableZones(List<AvailableZonesItem> availableZones) {
		this.availableZones = availableZones;
	}

	public static class AvailableZonesItem {

		private String status;

		private String statusCategory;

		private String zoneId;

		private String regionId;

		private List<AvailableResourcesItem> availableResources;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getStatusCategory() {
			return this.statusCategory;
		}

		public void setStatusCategory(String statusCategory) {
			this.statusCategory = statusCategory;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public List<AvailableResourcesItem> getAvailableResources() {
			return this.availableResources;
		}

		public void setAvailableResources(List<AvailableResourcesItem> availableResources) {
			this.availableResources = availableResources;
		}

		public static class AvailableResourcesItem {

			private String type;

			private List<SupportedResourcesItem> supportedResources;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public List<SupportedResourcesItem> getSupportedResources() {
				return this.supportedResources;
			}

			public void setSupportedResources(List<SupportedResourcesItem> supportedResources) {
				this.supportedResources = supportedResources;
			}

			public static class SupportedResourcesItem {

				private String status;

				private String statusCategory;

				private Integer min;

				private Integer max;

				private String value;

				private String quotaStatus;

				private String unit;

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public String getStatusCategory() {
					return this.statusCategory;
				}

				public void setStatusCategory(String statusCategory) {
					this.statusCategory = statusCategory;
				}

				public Integer getMin() {
					return this.min;
				}

				public void setMin(Integer min) {
					this.min = min;
				}

				public Integer getMax() {
					return this.max;
				}

				public void setMax(Integer max) {
					this.max = max;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getQuotaStatus() {
					return this.quotaStatus;
				}

				public void setQuotaStatus(String quotaStatus) {
					this.quotaStatus = quotaStatus;
				}

				public String getUnit() {
					return this.unit;
				}

				public void setUnit(String unit) {
					this.unit = unit;
				}
			}
		}
	}

	@Override
	public DescribeRCAvailableResourceResponse getInstance(UnmarshallerContext context) {
		return	DescribeRCAvailableResourceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
