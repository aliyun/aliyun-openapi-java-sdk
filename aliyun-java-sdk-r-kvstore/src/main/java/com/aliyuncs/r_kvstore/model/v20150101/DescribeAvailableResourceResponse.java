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

		private String zoneName;

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

		public String getZoneName() {
			return this.zoneName;
		}

		public void setZoneName(String zoneName) {
			this.zoneName = zoneName;
		}

		public List<SupportedEngine> getSupportedEngines() {
			return this.supportedEngines;
		}

		public void setSupportedEngines(List<SupportedEngine> supportedEngines) {
			this.supportedEngines = supportedEngines;
		}

		public static class SupportedEngine {

			private String engine;

			private List<SupportedEditionType> supportedEditionTypes;

			public String getEngine() {
				return this.engine;
			}

			public void setEngine(String engine) {
				this.engine = engine;
			}

			public List<SupportedEditionType> getSupportedEditionTypes() {
				return this.supportedEditionTypes;
			}

			public void setSupportedEditionTypes(List<SupportedEditionType> supportedEditionTypes) {
				this.supportedEditionTypes = supportedEditionTypes;
			}

			public static class SupportedEditionType {

				private String editionType;

				private List<SupportedSeriesType> supportedSeriesTypes;

				public String getEditionType() {
					return this.editionType;
				}

				public void setEditionType(String editionType) {
					this.editionType = editionType;
				}

				public List<SupportedSeriesType> getSupportedSeriesTypes() {
					return this.supportedSeriesTypes;
				}

				public void setSupportedSeriesTypes(List<SupportedSeriesType> supportedSeriesTypes) {
					this.supportedSeriesTypes = supportedSeriesTypes;
				}

				public static class SupportedSeriesType {

					private String seriesType;

					private List<SupportedEngineVersion> supportedEngineVersions;

					public String getSeriesType() {
						return this.seriesType;
					}

					public void setSeriesType(String seriesType) {
						this.seriesType = seriesType;
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

						public String getVersion() {
							return this.version;
						}

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

							private List<SupportedShardNumber> supportedShardNumbers;

							public String getArchitecture() {
								return this.architecture;
							}

							public void setArchitecture(String architecture) {
								this.architecture = architecture;
							}

							public List<SupportedShardNumber> getSupportedShardNumbers() {
								return this.supportedShardNumbers;
							}

							public void setSupportedShardNumbers(List<SupportedShardNumber> supportedShardNumbers) {
								this.supportedShardNumbers = supportedShardNumbers;
							}

							public static class SupportedShardNumber {

								private String shardNumber;

								private List<SupportedNodeType> supportedNodeTypes;

								public String getShardNumber() {
									return this.shardNumber;
								}

								public void setShardNumber(String shardNumber) {
									this.shardNumber = shardNumber;
								}

								public List<SupportedNodeType> getSupportedNodeTypes() {
									return this.supportedNodeTypes;
								}

								public void setSupportedNodeTypes(List<SupportedNodeType> supportedNodeTypes) {
									this.supportedNodeTypes = supportedNodeTypes;
								}

								public static class SupportedNodeType {

									private String supportedNodeType;

									private List<AvailableResource> availableResources;

									public String getSupportedNodeType() {
										return this.supportedNodeType;
									}

									public void setSupportedNodeType(String supportedNodeType) {
										this.supportedNodeType = supportedNodeType;
									}

									public List<AvailableResource> getAvailableResources() {
										return this.availableResources;
									}

									public void setAvailableResources(List<AvailableResource> availableResources) {
										this.availableResources = availableResources;
									}

									public static class AvailableResource {

										private String instanceClass;

										private String instanceClassRemark;

										public String getInstanceClass() {
											return this.instanceClass;
										}

										public void setInstanceClass(String instanceClass) {
											this.instanceClass = instanceClass;
										}

										public String getInstanceClassRemark() {
											return this.instanceClassRemark;
										}

										public void setInstanceClassRemark(String instanceClassRemark) {
											this.instanceClassRemark = instanceClassRemark;
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
