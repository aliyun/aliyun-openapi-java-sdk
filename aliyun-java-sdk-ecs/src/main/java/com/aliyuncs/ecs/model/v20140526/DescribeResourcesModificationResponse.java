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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeResourcesModificationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeResourcesModificationResponse extends AcsResponse {

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

		private String status;

		private String statusCategory;

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

				private String status;

				private String statusCategory;

				private Integer min;

				private Integer max;

				private String unit;

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

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
	public DescribeResourcesModificationResponse getInstance(UnmarshallerContext context) {
		return	DescribeResourcesModificationResponseUnmarshaller.unmarshall(this, context);
	}
}
