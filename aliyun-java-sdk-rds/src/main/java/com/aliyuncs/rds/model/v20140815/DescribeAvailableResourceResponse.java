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
import com.aliyuncs.rds.transform.v20140815.DescribeAvailableResourceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAvailableResourceResponse extends AcsResponse {

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

		private String networkTypes;

		private List<SupportedEngines> supportedEngine;

		public String getBizRegionId() {
			return this.regionId;
		}

		public void setBizRegionId(String regionId) {
			this.regionId = regionId;
		}

		/**
		 * @deprecated use getBizRegionId instead of this.
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

		public String getNetworkTypes() {
			return this.networkTypes;
		}

		public void setNetworkTypes(String networkTypes) {
			this.networkTypes = networkTypes;
		}

		public List<SupportedEngines> getSupportedEngine() {
			return this.supportedEngine;
		}

		public void setSupportedEngine(List<SupportedEngines> supportedEngine) {
			this.supportedEngine = supportedEngine;
		}

		public static class SupportedEngines {

			private String engine;

			private List<SupportedEngineVersions> supportedEngineVersion;

			public String getEngine() {
				return this.engine;
			}

			public void setEngine(String engine) {
				this.engine = engine;
			}

			public List<SupportedEngineVersions> getSupportedEngineVersion() {
				return this.supportedEngineVersion;
			}

			public void setSupportedEngineVersion(List<SupportedEngineVersions> supportedEngineVersion) {
				this.supportedEngineVersion = supportedEngineVersion;
			}

			public static class SupportedEngineVersions {

				private String version;

				private List<SupportedCategorys> supportedCategory;

				public String getBizVersion() {
					return this.version;
				}

				public void setBizVersion(String version) {
					this.version = version;
				}

				/**
				 * @deprecated use getBizVersion instead of this.
				 */
				@Deprecated
				public String getVersion() {
					return this.version;
				}

				/**
				 * @deprecated use setBizVersion instead of this.
				 */
				@Deprecated
				public void setVersion(String version) {
					this.version = version;
				}

				public List<SupportedCategorys> getSupportedCategory() {
					return this.supportedCategory;
				}

				public void setSupportedCategory(List<SupportedCategorys> supportedCategory) {
					this.supportedCategory = supportedCategory;
				}

				public static class SupportedCategorys {

					private String category;

					private List<SupportedStorageTypes> supportedStorageType;

					public String getCategory() {
						return this.category;
					}

					public void setCategory(String category) {
						this.category = category;
					}

					public List<SupportedStorageTypes> getSupportedStorageType() {
						return this.supportedStorageType;
					}

					public void setSupportedStorageType(List<SupportedStorageTypes> supportedStorageType) {
						this.supportedStorageType = supportedStorageType;
					}

					public static class SupportedStorageTypes {

						private String storageType;

						private List<AvailableResources> availableResource;

						public String getStorageType() {
							return this.storageType;
						}

						public void setStorageType(String storageType) {
							this.storageType = storageType;
						}

						public List<AvailableResources> getAvailableResource() {
							return this.availableResource;
						}

						public void setAvailableResource(List<AvailableResources> availableResource) {
							this.availableResource = availableResource;
						}

						public static class AvailableResources {

							private String dBInstanceClass;

							private String storageRange;

							public String getDBInstanceClass() {
								return this.dBInstanceClass;
							}

							public void setDBInstanceClass(String dBInstanceClass) {
								this.dBInstanceClass = dBInstanceClass;
							}

							public String getStorageRange() {
								return this.storageRange;
							}

							public void setStorageRange(String storageRange) {
								this.storageRange = storageRange;
							}
						}
					}
				}
			}
		}
	}

	@Override
	public DescribeAvailableResourceResponse getInstance(UnmarshallerContext context) {
		return	DescribeAvailableResourceResponseUnmarshaller.unmarshall(this, context);
	}
}
