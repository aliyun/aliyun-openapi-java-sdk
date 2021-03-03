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

		private String networkTypes;

		private String regionId;

		private String status;

		private String zoneId;

		private List<SupportedEngine> supportedEngines;

		public String getNetworkTypes() {
			return this.networkTypes;
		}

		public void setNetworkTypes(String networkTypes) {
			this.networkTypes = networkTypes;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
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

						private List<AvailableResource> availableResources;

						public String getStorageType() {
							return this.storageType;
						}

						public void setStorageType(String storageType) {
							this.storageType = storageType;
						}

						public List<AvailableResource> getAvailableResources() {
							return this.availableResources;
						}

						public void setAvailableResources(List<AvailableResource> availableResources) {
							this.availableResources = availableResources;
						}

						public static class AvailableResource {

							private String dBInstanceClass;

							private String storageRange;

							private DBInstanceStorageRange dBInstanceStorageRange;

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

							public DBInstanceStorageRange getDBInstanceStorageRange() {
								return this.dBInstanceStorageRange;
							}

							public void setDBInstanceStorageRange(DBInstanceStorageRange dBInstanceStorageRange) {
								this.dBInstanceStorageRange = dBInstanceStorageRange;
							}

							public static class DBInstanceStorageRange {

								private Integer max;

								private Integer min;

								private Integer step;

								public Integer getMax() {
									return this.max;
								}

								public void setMax(Integer max) {
									this.max = max;
								}

								public Integer getMin() {
									return this.min;
								}

								public void setMin(Integer min) {
									this.min = min;
								}

								public Integer getStep() {
									return this.step;
								}

								public void setStep(Integer step) {
									this.step = step;
								}
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
