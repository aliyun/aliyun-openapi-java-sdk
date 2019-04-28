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

package com.aliyuncs.r_kvstore.model.v20150101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.r_kvstore.transform.v20150101.DescribeAvailableResourceResponseUnmarshaller;
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

		private List<SupportedEngine> supportedEngines;

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

				private List<SupportedArchitectureType> supportedArchitectureTypes;

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

				public List<SupportedArchitectureType> getSupportedArchitectureTypes() {
					return this.supportedArchitectureTypes;
				}

				public void setSupportedArchitectureTypes(List<SupportedArchitectureType> supportedArchitectureTypes) {
					this.supportedArchitectureTypes = supportedArchitectureTypes;
				}

				public static class SupportedArchitectureType {

					private String architecture;

					private List<SupportedPerformanceType> supportedPerformanceTypes;

					public String getArchitecture() {
						return this.architecture;
					}

					public void setArchitecture(String architecture) {
						this.architecture = architecture;
					}

					public List<SupportedPerformanceType> getSupportedPerformanceTypes() {
						return this.supportedPerformanceTypes;
					}

					public void setSupportedPerformanceTypes(List<SupportedPerformanceType> supportedPerformanceTypes) {
						this.supportedPerformanceTypes = supportedPerformanceTypes;
					}

					public static class SupportedPerformanceType {

						private String performanceType;

						private List<SupportedStorageType> supportedStorageTypes;

						public String getPerformanceType() {
							return this.performanceType;
						}

						public void setPerformanceType(String performanceType) {
							this.performanceType = performanceType;
						}

						public List<SupportedStorageType> getSupportedStorageTypes() {
							return this.supportedStorageTypes;
						}

						public void setSupportedStorageTypes(List<SupportedStorageType> supportedStorageTypes) {
							this.supportedStorageTypes = supportedStorageTypes;
						}

						public static class SupportedStorageType {

							private String storageType;

							private List<SupportedNodeType> supportedNodeTypes;

							public String getStorageType() {
								return this.storageType;
							}

							public void setStorageType(String storageType) {
								this.storageType = storageType;
							}

							public List<SupportedNodeType> getSupportedNodeTypes() {
								return this.supportedNodeTypes;
							}

							public void setSupportedNodeTypes(List<SupportedNodeType> supportedNodeTypes) {
								this.supportedNodeTypes = supportedNodeTypes;
							}

							public static class SupportedNodeType {

								private String nodeType;

								private List<SupportedPackageType> supportedPackageTypes;

								public String getNodeType() {
									return this.nodeType;
								}

								public void setNodeType(String nodeType) {
									this.nodeType = nodeType;
								}

								public List<SupportedPackageType> getSupportedPackageTypes() {
									return this.supportedPackageTypes;
								}

								public void setSupportedPackageTypes(List<SupportedPackageType> supportedPackageTypes) {
									this.supportedPackageTypes = supportedPackageTypes;
								}

								public static class SupportedPackageType {

									private String packageType;

									private List<AvailableResource> availableResources;

									public String getPackageType() {
										return this.packageType;
									}

									public void setPackageType(String packageType) {
										this.packageType = packageType;
									}

									public List<AvailableResource> getAvailableResources() {
										return this.availableResources;
									}

									public void setAvailableResources(List<AvailableResource> availableResources) {
										this.availableResources = availableResources;
									}

									public static class AvailableResource {

										private String instanceClass;

										public String getInstanceClass() {
											return this.instanceClass;
										}

										public void setInstanceClass(String instanceClass) {
											this.instanceClass = instanceClass;
										}
									}
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
