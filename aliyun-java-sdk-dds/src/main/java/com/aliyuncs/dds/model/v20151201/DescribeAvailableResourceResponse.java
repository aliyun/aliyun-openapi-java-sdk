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

package com.aliyuncs.dds.model.v20151201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dds.transform.v20151201.DescribeAvailableResourceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAvailableResourceResponse extends AcsResponse {

	private String requestId;

	private List<SupportedDBType> supportedDBTypes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SupportedDBType> getSupportedDBTypes() {
		return this.supportedDBTypes;
	}

	public void setSupportedDBTypes(List<SupportedDBType> supportedDBTypes) {
		this.supportedDBTypes = supportedDBTypes;
	}

	public static class SupportedDBType {

		private String dbType;

		private List<AvailableZone> availableZones;

		public String getDbType() {
			return this.dbType;
		}

		public void setDbType(String dbType) {
			this.dbType = dbType;
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

			private List<SupportedEngineVersion> supportedEngineVersions;

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

			public List<SupportedEngineVersion> getSupportedEngineVersions() {
				return this.supportedEngineVersions;
			}

			public void setSupportedEngineVersions(List<SupportedEngineVersion> supportedEngineVersions) {
				this.supportedEngineVersions = supportedEngineVersions;
			}

			public static class SupportedEngineVersion {

				private String version;

				private List<SupportedEngine> supportedEngines;

				public String getVersion() {
					return this.version;
				}

				public void setVersion(String version) {
					this.version = version;
				}

				public List<SupportedEngine> getSupportedEngines() {
					return this.supportedEngines;
				}

				public void setSupportedEngines(List<SupportedEngine> supportedEngines) {
					this.supportedEngines = supportedEngines;
				}

				public static class SupportedEngine {

					private String engine;

					private List<SupportedNodeType> supportedNodeTypes;

					public String getEngine() {
						return this.engine;
					}

					public void setEngine(String engine) {
						this.engine = engine;
					}

					public List<SupportedNodeType> getSupportedNodeTypes() {
						return this.supportedNodeTypes;
					}

					public void setSupportedNodeTypes(List<SupportedNodeType> supportedNodeTypes) {
						this.supportedNodeTypes = supportedNodeTypes;
					}

					public static class SupportedNodeType {

						private String nodeType;

						private String networkTypes;

						private List<AvailableResource> availableResources;

						public String getNodeType() {
							return this.nodeType;
						}

						public void setNodeType(String nodeType) {
							this.nodeType = nodeType;
						}

						public String getNetworkTypes() {
							return this.networkTypes;
						}

						public void setNetworkTypes(String networkTypes) {
							this.networkTypes = networkTypes;
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

	@Override
	public DescribeAvailableResourceResponse getInstance(UnmarshallerContext context) {
		return	DescribeAvailableResourceResponseUnmarshaller.unmarshall(this, context);
	}
}
