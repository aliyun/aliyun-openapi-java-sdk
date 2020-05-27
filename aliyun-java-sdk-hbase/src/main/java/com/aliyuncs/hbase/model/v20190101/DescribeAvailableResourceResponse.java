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

package com.aliyuncs.hbase.model.v20190101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hbase.transform.v20190101.DescribeAvailableResourceResponseUnmarshaller;
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

		private List<SupportedEngine> supportedEngines;

		private List<MasterResource> masterResources;

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

		public List<MasterResource> getMasterResources() {
			return this.masterResources;
		}

		public void setMasterResources(List<MasterResource> masterResources) {
			this.masterResources = masterResources;
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

				private List<SupportedCategoriesItem> supportedCategories;

				public String getVersion() {
					return this.version;
				}

				public void setVersion(String version) {
					this.version = version;
				}

				public List<SupportedCategoriesItem> getSupportedCategories() {
					return this.supportedCategories;
				}

				public void setSupportedCategories(List<SupportedCategoriesItem> supportedCategories) {
					this.supportedCategories = supportedCategories;
				}

				public static class SupportedCategoriesItem {

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

						private List<CoreResource> coreResources;

						public String getStorageType() {
							return this.storageType;
						}

						public void setStorageType(String storageType) {
							this.storageType = storageType;
						}

						public List<CoreResource> getCoreResources() {
							return this.coreResources;
						}

						public void setCoreResources(List<CoreResource> coreResources) {
							this.coreResources = coreResources;
						}

						public static class CoreResource {

							private String instanceType;

							private Integer maxCoreCount;

							private DBInstanceStorageRange dBInstanceStorageRange;

							private InstanceTypeDetail instanceTypeDetail;

							public String getInstanceType() {
								return this.instanceType;
							}

							public void setInstanceType(String instanceType) {
								this.instanceType = instanceType;
							}

							public Integer getMaxCoreCount() {
								return this.maxCoreCount;
							}

							public void setMaxCoreCount(Integer maxCoreCount) {
								this.maxCoreCount = maxCoreCount;
							}

							public DBInstanceStorageRange getDBInstanceStorageRange() {
								return this.dBInstanceStorageRange;
							}

							public void setDBInstanceStorageRange(DBInstanceStorageRange dBInstanceStorageRange) {
								this.dBInstanceStorageRange = dBInstanceStorageRange;
							}

							public InstanceTypeDetail getInstanceTypeDetail() {
								return this.instanceTypeDetail;
							}

							public void setInstanceTypeDetail(InstanceTypeDetail instanceTypeDetail) {
								this.instanceTypeDetail = instanceTypeDetail;
							}

							public static class DBInstanceStorageRange {

								private Integer maxSize;

								private Integer minSize;

								private Integer stepSize;

								public Integer getMaxSize() {
									return this.maxSize;
								}

								public void setMaxSize(Integer maxSize) {
									this.maxSize = maxSize;
								}

								public Integer getMinSize() {
									return this.minSize;
								}

								public void setMinSize(Integer minSize) {
									this.minSize = minSize;
								}

								public Integer getStepSize() {
									return this.stepSize;
								}

								public void setStepSize(Integer stepSize) {
									this.stepSize = stepSize;
								}
							}

							public static class InstanceTypeDetail {

								private Integer cpu;

								private Integer mem;

								public Integer getCpu() {
									return this.cpu;
								}

								public void setCpu(Integer cpu) {
									this.cpu = cpu;
								}

								public Integer getMem() {
									return this.mem;
								}

								public void setMem(Integer mem) {
									this.mem = mem;
								}
							}
						}
					}
				}
			}
		}

		public static class MasterResource {

			private String instanceType;

			private InstanceTypeDetail1 instanceTypeDetail1;

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}

			public InstanceTypeDetail1 getInstanceTypeDetail1() {
				return this.instanceTypeDetail1;
			}

			public void setInstanceTypeDetail1(InstanceTypeDetail1 instanceTypeDetail1) {
				this.instanceTypeDetail1 = instanceTypeDetail1;
			}

			public static class InstanceTypeDetail1 {

				private Integer cpu;

				private Integer mem;

				public Integer getCpu() {
					return this.cpu;
				}

				public void setCpu(Integer cpu) {
					this.cpu = cpu;
				}

				public Integer getMem() {
					return this.mem;
				}

				public void setMem(Integer mem) {
					this.mem = mem;
				}
			}
		}
	}

	@Override
	public DescribeAvailableResourceResponse getInstance(UnmarshallerContext context) {
		return	DescribeAvailableResourceResponseUnmarshaller.unmarshall(this, context);
	}
}
