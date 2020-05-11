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

package com.aliyuncs.polardb.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribeDBClusterAvailableResourcesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBClusterAvailableResourcesResponse extends AcsResponse {

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

		private List<SupportedEngine> supportedEngines;

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

		public List<SupportedEngine> getSupportedEngines() {
			return this.supportedEngines;
		}

		public void setSupportedEngines(List<SupportedEngine> supportedEngines) {
			this.supportedEngines = supportedEngines;
		}

		public static class SupportedEngine {

			private String engine;

			private List<AvailableResource> availableResources;

			public String getEngine() {
				return this.engine;
			}

			public void setEngine(String engine) {
				this.engine = engine;
			}

			public List<AvailableResource> getAvailableResources() {
				return this.availableResources;
			}

			public void setAvailableResources(List<AvailableResource> availableResources) {
				this.availableResources = availableResources;
			}

			public static class AvailableResource {

				private String dBNodeClass;

				private String category;

				public String getDBNodeClass() {
					return this.dBNodeClass;
				}

				public void setDBNodeClass(String dBNodeClass) {
					this.dBNodeClass = dBNodeClass;
				}

				public String getCategory() {
					return this.category;
				}

				public void setCategory(String category) {
					this.category = category;
				}
			}
		}
	}

	@Override
	public DescribeDBClusterAvailableResourcesResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBClusterAvailableResourcesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
