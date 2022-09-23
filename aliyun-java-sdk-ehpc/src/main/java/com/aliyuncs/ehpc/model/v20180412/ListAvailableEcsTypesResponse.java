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

package com.aliyuncs.ehpc.model.v20180412;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ehpc.transform.v20180412.ListAvailableEcsTypesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAvailableEcsTypesResponse extends AcsResponse {

	private Boolean supportSpotInstance;

	private String requestId;

	private List<InstanceTypeFamilyInfo> instanceTypeFamilies;

	public Boolean getSupportSpotInstance() {
		return this.supportSpotInstance;
	}

	public void setSupportSpotInstance(Boolean supportSpotInstance) {
		this.supportSpotInstance = supportSpotInstance;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<InstanceTypeFamilyInfo> getInstanceTypeFamilies() {
		return this.instanceTypeFamilies;
	}

	public void setInstanceTypeFamilies(List<InstanceTypeFamilyInfo> instanceTypeFamilies) {
		this.instanceTypeFamilies = instanceTypeFamilies;
	}

	public static class InstanceTypeFamilyInfo {

		private String generation;

		private String instanceTypeFamilyId;

		private List<TypesInfo> types;

		public String getGeneration() {
			return this.generation;
		}

		public void setGeneration(String generation) {
			this.generation = generation;
		}

		public String getInstanceTypeFamilyId() {
			return this.instanceTypeFamilyId;
		}

		public void setInstanceTypeFamilyId(String instanceTypeFamilyId) {
			this.instanceTypeFamilyId = instanceTypeFamilyId;
		}

		public List<TypesInfo> getTypes() {
			return this.types;
		}

		public void setTypes(List<TypesInfo> types) {
			this.types = types;
		}

		public static class TypesInfo {

			private String status;

			private String instanceTypeId;

			private Integer instanceBandwidthRx;

			private String gPUSpec;

			private Integer instanceBandwidthTx;

			private Integer instancePpsRx;

			private Integer instancePpsTx;

			private Integer gPUAmount;

			private Integer cpuCoreCount;

			private Integer memorySize;

			private Integer eniQuantity;

			private List<String> zoneIds;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getInstanceTypeId() {
				return this.instanceTypeId;
			}

			public void setInstanceTypeId(String instanceTypeId) {
				this.instanceTypeId = instanceTypeId;
			}

			public Integer getInstanceBandwidthRx() {
				return this.instanceBandwidthRx;
			}

			public void setInstanceBandwidthRx(Integer instanceBandwidthRx) {
				this.instanceBandwidthRx = instanceBandwidthRx;
			}

			public String getGPUSpec() {
				return this.gPUSpec;
			}

			public void setGPUSpec(String gPUSpec) {
				this.gPUSpec = gPUSpec;
			}

			public Integer getInstanceBandwidthTx() {
				return this.instanceBandwidthTx;
			}

			public void setInstanceBandwidthTx(Integer instanceBandwidthTx) {
				this.instanceBandwidthTx = instanceBandwidthTx;
			}

			public Integer getInstancePpsRx() {
				return this.instancePpsRx;
			}

			public void setInstancePpsRx(Integer instancePpsRx) {
				this.instancePpsRx = instancePpsRx;
			}

			public Integer getInstancePpsTx() {
				return this.instancePpsTx;
			}

			public void setInstancePpsTx(Integer instancePpsTx) {
				this.instancePpsTx = instancePpsTx;
			}

			public Integer getGPUAmount() {
				return this.gPUAmount;
			}

			public void setGPUAmount(Integer gPUAmount) {
				this.gPUAmount = gPUAmount;
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

			public Integer getEniQuantity() {
				return this.eniQuantity;
			}

			public void setEniQuantity(Integer eniQuantity) {
				this.eniQuantity = eniQuantity;
			}

			public List<String> getZoneIds() {
				return this.zoneIds;
			}

			public void setZoneIds(List<String> zoneIds) {
				this.zoneIds = zoneIds;
			}
		}
	}

	@Override
	public ListAvailableEcsTypesResponse getInstance(UnmarshallerContext context) {
		return	ListAvailableEcsTypesResponseUnmarshaller.unmarshall(this, context);
	}
}
