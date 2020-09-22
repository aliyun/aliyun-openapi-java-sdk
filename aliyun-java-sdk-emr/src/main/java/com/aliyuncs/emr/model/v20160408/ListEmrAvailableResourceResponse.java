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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.ListEmrAvailableResourceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListEmrAvailableResourceResponse extends AcsResponse {

	private String requestId;

	private String regionId;

	private List<EmrZoneInfo> emrZoneInfoList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public List<EmrZoneInfo> getEmrZoneInfoList() {
		return this.emrZoneInfoList;
	}

	public void setEmrZoneInfoList(List<EmrZoneInfo> emrZoneInfoList) {
		this.emrZoneInfoList = emrZoneInfoList;
	}

	public static class EmrZoneInfo {

		private String zoneId;

		private List<EmrResourceInfo> emrResourceInfoList;

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public List<EmrResourceInfo> getEmrResourceInfoList() {
			return this.emrResourceInfoList;
		}

		public void setEmrResourceInfoList(List<EmrResourceInfo> emrResourceInfoList) {
			this.emrResourceInfoList = emrResourceInfoList;
		}

		public static class EmrResourceInfo {

			private String type;

			private List<SupportedResource> supportedResourceList;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public List<SupportedResource> getSupportedResourceList() {
				return this.supportedResourceList;
			}

			public void setSupportedResourceList(List<SupportedResource> supportedResourceList) {
				this.supportedResourceList = supportedResourceList;
			}

			public static class SupportedResource {

				private String value;

				private Integer min;

				private Integer max;

				private String unit;

				private List<String> supportNodeTypeList;

				private EmrInstanceType emrInstanceType;

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
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

				public List<String> getSupportNodeTypeList() {
					return this.supportNodeTypeList;
				}

				public void setSupportNodeTypeList(List<String> supportNodeTypeList) {
					this.supportNodeTypeList = supportNodeTypeList;
				}

				public EmrInstanceType getEmrInstanceType() {
					return this.emrInstanceType;
				}

				public void setEmrInstanceType(EmrInstanceType emrInstanceType) {
					this.emrInstanceType = emrInstanceType;
				}

				public static class EmrInstanceType {

					private String instanceType;

					private Integer cpuCoreCount;

					private Integer memorySize;

					private String instanceTypeFamily;

					private Long localStorageCapacity;

					private Integer localStorageAmount;

					private String localStorageCategory;

					private Integer gPUAmount;

					private String gPUSpec;

					private Integer initialCredit;

					private Integer baselineCredit;

					private Integer eniQuantity;

					private Integer instanceBandwidthRx;

					private Integer instanceBandwidthTx;

					private Long instancePpsRx;

					private Long instancePpsTx;

					public String getInstanceType() {
						return this.instanceType;
					}

					public void setInstanceType(String instanceType) {
						this.instanceType = instanceType;
					}

					public Integer getCpuCoreCount() {
						return this.cpuCoreCount;
					}

					public void setCpuCoreCount(Integer cpuCoreCount) {
						this.cpuCoreCount = cpuCoreCount;
					}

					public Integer getMemorySize() {
						return this.memorySize;
					}

					public void setMemorySize(Integer memorySize) {
						this.memorySize = memorySize;
					}

					public String getInstanceTypeFamily() {
						return this.instanceTypeFamily;
					}

					public void setInstanceTypeFamily(String instanceTypeFamily) {
						this.instanceTypeFamily = instanceTypeFamily;
					}

					public Long getLocalStorageCapacity() {
						return this.localStorageCapacity;
					}

					public void setLocalStorageCapacity(Long localStorageCapacity) {
						this.localStorageCapacity = localStorageCapacity;
					}

					public Integer getLocalStorageAmount() {
						return this.localStorageAmount;
					}

					public void setLocalStorageAmount(Integer localStorageAmount) {
						this.localStorageAmount = localStorageAmount;
					}

					public String getLocalStorageCategory() {
						return this.localStorageCategory;
					}

					public void setLocalStorageCategory(String localStorageCategory) {
						this.localStorageCategory = localStorageCategory;
					}

					public Integer getGPUAmount() {
						return this.gPUAmount;
					}

					public void setGPUAmount(Integer gPUAmount) {
						this.gPUAmount = gPUAmount;
					}

					public String getGPUSpec() {
						return this.gPUSpec;
					}

					public void setGPUSpec(String gPUSpec) {
						this.gPUSpec = gPUSpec;
					}

					public Integer getInitialCredit() {
						return this.initialCredit;
					}

					public void setInitialCredit(Integer initialCredit) {
						this.initialCredit = initialCredit;
					}

					public Integer getBaselineCredit() {
						return this.baselineCredit;
					}

					public void setBaselineCredit(Integer baselineCredit) {
						this.baselineCredit = baselineCredit;
					}

					public Integer getEniQuantity() {
						return this.eniQuantity;
					}

					public void setEniQuantity(Integer eniQuantity) {
						this.eniQuantity = eniQuantity;
					}

					public Integer getInstanceBandwidthRx() {
						return this.instanceBandwidthRx;
					}

					public void setInstanceBandwidthRx(Integer instanceBandwidthRx) {
						this.instanceBandwidthRx = instanceBandwidthRx;
					}

					public Integer getInstanceBandwidthTx() {
						return this.instanceBandwidthTx;
					}

					public void setInstanceBandwidthTx(Integer instanceBandwidthTx) {
						this.instanceBandwidthTx = instanceBandwidthTx;
					}

					public Long getInstancePpsRx() {
						return this.instancePpsRx;
					}

					public void setInstancePpsRx(Long instancePpsRx) {
						this.instancePpsRx = instancePpsRx;
					}

					public Long getInstancePpsTx() {
						return this.instancePpsTx;
					}

					public void setInstancePpsTx(Long instancePpsTx) {
						this.instancePpsTx = instancePpsTx;
					}
				}
			}
		}
	}

	@Override
	public ListEmrAvailableResourceResponse getInstance(UnmarshallerContext context) {
		return	ListEmrAvailableResourceResponseUnmarshaller.unmarshall(this, context);
	}
}
