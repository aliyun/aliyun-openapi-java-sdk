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

package com.aliyuncs.adb.model.v20190315;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.adb.transform.v20190315.DescribeAvailableResourceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAvailableResourceResponse extends AcsResponse {

	private String regionId;

	private String requestId;

	private List<AvailableZone> availableZoneList;

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<AvailableZone> getAvailableZoneList() {
		return this.availableZoneList;
	}

	public void setAvailableZoneList(List<AvailableZone> availableZoneList) {
		this.availableZoneList = availableZoneList;
	}

	public static class AvailableZone {

		private String zoneId;

		private String zoneName;

		private List<SupportedModeItem> supportedMode;

		private List<String> supportedComputeResource;

		private List<String> supportedStorageResource;

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getZoneName() {
			return this.zoneName;
		}

		public void setZoneName(String zoneName) {
			this.zoneName = zoneName;
		}

		public List<SupportedModeItem> getSupportedMode() {
			return this.supportedMode;
		}

		public void setSupportedMode(List<SupportedModeItem> supportedMode) {
			this.supportedMode = supportedMode;
		}

		public List<String> getSupportedComputeResource() {
			return this.supportedComputeResource;
		}

		public void setSupportedComputeResource(List<String> supportedComputeResource) {
			this.supportedComputeResource = supportedComputeResource;
		}

		public List<String> getSupportedStorageResource() {
			return this.supportedStorageResource;
		}

		public void setSupportedStorageResource(List<String> supportedStorageResource) {
			this.supportedStorageResource = supportedStorageResource;
		}

		public static class SupportedModeItem {

			private String mode;

			private List<SupportedSerialListItem> supportedSerialList;

			public String getMode() {
				return this.mode;
			}

			public void setMode(String mode) {
				this.mode = mode;
			}

			public List<SupportedSerialListItem> getSupportedSerialList() {
				return this.supportedSerialList;
			}

			public void setSupportedSerialList(List<SupportedSerialListItem> supportedSerialList) {
				this.supportedSerialList = supportedSerialList;
			}

			public static class SupportedSerialListItem {

				private String serial;

				private List<SupportedFlexibleResourceItem> supportedFlexibleResource;

				private List<SupportedInstanceClass> supportedInstanceClassList;

				public String getSerial() {
					return this.serial;
				}

				public void setSerial(String serial) {
					this.serial = serial;
				}

				public List<SupportedFlexibleResourceItem> getSupportedFlexibleResource() {
					return this.supportedFlexibleResource;
				}

				public void setSupportedFlexibleResource(List<SupportedFlexibleResourceItem> supportedFlexibleResource) {
					this.supportedFlexibleResource = supportedFlexibleResource;
				}

				public List<SupportedInstanceClass> getSupportedInstanceClassList() {
					return this.supportedInstanceClassList;
				}

				public void setSupportedInstanceClassList(List<SupportedInstanceClass> supportedInstanceClassList) {
					this.supportedInstanceClassList = supportedInstanceClassList;
				}

				public static class SupportedFlexibleResourceItem {

					private String storageType;

					private List<String> supportedComputeResource1;

					private List<String> supportedStorageResource2;

					private SupportedElasticIOResource supportedElasticIOResource;

					public String getStorageType() {
						return this.storageType;
					}

					public void setStorageType(String storageType) {
						this.storageType = storageType;
					}

					public List<String> getSupportedComputeResource1() {
						return this.supportedComputeResource1;
					}

					public void setSupportedComputeResource1(List<String> supportedComputeResource1) {
						this.supportedComputeResource1 = supportedComputeResource1;
					}

					public List<String> getSupportedStorageResource2() {
						return this.supportedStorageResource2;
					}

					public void setSupportedStorageResource2(List<String> supportedStorageResource2) {
						this.supportedStorageResource2 = supportedStorageResource2;
					}

					public SupportedElasticIOResource getSupportedElasticIOResource() {
						return this.supportedElasticIOResource;
					}

					public void setSupportedElasticIOResource(SupportedElasticIOResource supportedElasticIOResource) {
						this.supportedElasticIOResource = supportedElasticIOResource;
					}

					public static class SupportedElasticIOResource {

						private String step;

						private String minCount;

						private String maxCount;

						public String getStep() {
							return this.step;
						}

						public void setStep(String step) {
							this.step = step;
						}

						public String getMinCount() {
							return this.minCount;
						}

						public void setMinCount(String minCount) {
							this.minCount = minCount;
						}

						public String getMaxCount() {
							return this.maxCount;
						}

						public void setMaxCount(String maxCount) {
							this.maxCount = maxCount;
						}
					}
				}

				public static class SupportedInstanceClass {

					private String instanceClass;

					private String tips;

					private List<SupportedNodeCount> supportedNodeCountList;

					private List<SupportedExecutor> supportedExecutorList;

					public String getInstanceClass() {
						return this.instanceClass;
					}

					public void setInstanceClass(String instanceClass) {
						this.instanceClass = instanceClass;
					}

					public String getTips() {
						return this.tips;
					}

					public void setTips(String tips) {
						this.tips = tips;
					}

					public List<SupportedNodeCount> getSupportedNodeCountList() {
						return this.supportedNodeCountList;
					}

					public void setSupportedNodeCountList(List<SupportedNodeCount> supportedNodeCountList) {
						this.supportedNodeCountList = supportedNodeCountList;
					}

					public List<SupportedExecutor> getSupportedExecutorList() {
						return this.supportedExecutorList;
					}

					public void setSupportedExecutorList(List<SupportedExecutor> supportedExecutorList) {
						this.supportedExecutorList = supportedExecutorList;
					}

					public static class SupportedNodeCount {

						private List<String> storageSize;

						private NodeCount nodeCount;

						public List<String> getStorageSize() {
							return this.storageSize;
						}

						public void setStorageSize(List<String> storageSize) {
							this.storageSize = storageSize;
						}

						public NodeCount getNodeCount() {
							return this.nodeCount;
						}

						public void setNodeCount(NodeCount nodeCount) {
							this.nodeCount = nodeCount;
						}

						public static class NodeCount {

							private String step;

							private String minCount;

							private String maxCount;

							public String getStep() {
								return this.step;
							}

							public void setStep(String step) {
								this.step = step;
							}

							public String getMinCount() {
								return this.minCount;
							}

							public void setMinCount(String minCount) {
								this.minCount = minCount;
							}

							public String getMaxCount() {
								return this.maxCount;
							}

							public void setMaxCount(String maxCount) {
								this.maxCount = maxCount;
							}
						}
					}

					public static class SupportedExecutor {

						private NodeCount3 nodeCount3;

						public NodeCount3 getNodeCount3() {
							return this.nodeCount3;
						}

						public void setNodeCount3(NodeCount3 nodeCount3) {
							this.nodeCount3 = nodeCount3;
						}

						public static class NodeCount3 {

							private String step;

							private String minCount;

							private String maxCount;

							public String getStep() {
								return this.step;
							}

							public void setStep(String step) {
								this.step = step;
							}

							public String getMinCount() {
								return this.minCount;
							}

							public void setMinCount(String minCount) {
								this.minCount = minCount;
							}

							public String getMaxCount() {
								return this.maxCount;
							}

							public void setMaxCount(String maxCount) {
								this.maxCount = maxCount;
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

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
