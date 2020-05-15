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
import com.aliyuncs.rds.transform.v20140815.DescribeAvailableZonesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAvailableZonesResponse extends AcsResponse {

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

		private String networkTypes;

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

		public String getNetworkTypes() {
			return this.networkTypes;
		}

		public void setNetworkTypes(String networkTypes) {
			this.networkTypes = networkTypes;
		}

		public List<SupportedEngine> getSupportedEngines() {
			return this.supportedEngines;
		}

		public void setSupportedEngines(List<SupportedEngine> supportedEngines) {
			this.supportedEngines = supportedEngines;
		}

		public static class SupportedEngine {

			private String engine;

			private List<SupportedEngineVersion> supportedEngineVersions;

			public String getEngine() {
				return this.engine;
			}

			public void setEngine(String engine) {
				this.engine = engine;
			}

			public List<SupportedEngineVersion> getSupportedEngineVersions() {
				return this.supportedEngineVersions;
			}

			public void setSupportedEngineVersions(List<SupportedEngineVersion> supportedEngineVersions) {
				this.supportedEngineVersions = supportedEngineVersions;
			}

			public static class SupportedEngineVersion {

				private String version;

				private List<SupportedCategory> supportedCategorys;

				public String getVersion() {
					return this.version;
				}

				public void setVersion(String version) {
					this.version = version;
				}

				public List<SupportedCategory> getSupportedCategorys() {
					return this.supportedCategorys;
				}

				public void setSupportedCategorys(List<SupportedCategory> supportedCategorys) {
					this.supportedCategorys = supportedCategorys;
				}

				public static class SupportedCategory {

					private String category;

					private List<SupportedStorageType> supportedStorageTypes;

					public String getCategory() {
						return this.category;
					}

					public void setCategory(String category) {
						this.category = category;
					}

					public List<SupportedStorageType> getSupportedStorageTypes() {
						return this.supportedStorageTypes;
					}

					public void setSupportedStorageTypes(List<SupportedStorageType> supportedStorageTypes) {
						this.supportedStorageTypes = supportedStorageTypes;
					}

					public static class SupportedStorageType {

						private String storageType;

						public String getStorageType() {
							return this.storageType;
						}

						public void setStorageType(String storageType) {
							this.storageType = storageType;
						}
					}
				}
			}
		}
	}

	@Override
	public DescribeAvailableZonesResponse getInstance(UnmarshallerContext context) {
		return	DescribeAvailableZonesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
