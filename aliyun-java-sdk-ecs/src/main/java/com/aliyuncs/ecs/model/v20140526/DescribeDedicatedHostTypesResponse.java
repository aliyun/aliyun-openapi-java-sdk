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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeDedicatedHostTypesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDedicatedHostTypesResponse extends AcsResponse {

	private String requestId;

	private List<DedicatedHostType> dedicatedHostTypes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DedicatedHostType> getDedicatedHostTypes() {
		return this.dedicatedHostTypes;
	}

	public void setDedicatedHostTypes(List<DedicatedHostType> dedicatedHostTypes) {
		this.dedicatedHostTypes = dedicatedHostTypes;
	}

	public static class DedicatedHostType {

		private String dedicatedHostType;

		private Integer sockets;

		private Integer totalVcpus;

		private Integer totalVgpus;

		private Integer cores;

		private Integer physicalGpus;

		private Float memorySize;

		private Long localStorageCapacity;

		private Integer localStorageAmount;

		private String localStorageCategory;

		private String gPUSpec;

		private List<String> supportedInstanceTypeFamilies;

		private List<String> supportedInstanceTypesList;

		public String getDedicatedHostType() {
			return this.dedicatedHostType;
		}

		public void setDedicatedHostType(String dedicatedHostType) {
			this.dedicatedHostType = dedicatedHostType;
		}

		public Integer getSockets() {
			return this.sockets;
		}

		public void setSockets(Integer sockets) {
			this.sockets = sockets;
		}

		public Integer getTotalVcpus() {
			return this.totalVcpus;
		}

		public void setTotalVcpus(Integer totalVcpus) {
			this.totalVcpus = totalVcpus;
		}

		public Integer getTotalVgpus() {
			return this.totalVgpus;
		}

		public void setTotalVgpus(Integer totalVgpus) {
			this.totalVgpus = totalVgpus;
		}

		public Integer getCores() {
			return this.cores;
		}

		public void setCores(Integer cores) {
			this.cores = cores;
		}

		public Integer getPhysicalGpus() {
			return this.physicalGpus;
		}

		public void setPhysicalGpus(Integer physicalGpus) {
			this.physicalGpus = physicalGpus;
		}

		public Float getMemorySize() {
			return this.memorySize;
		}

		public void setMemorySize(Float memorySize) {
			this.memorySize = memorySize;
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

		public String getGPUSpec() {
			return this.gPUSpec;
		}

		public void setGPUSpec(String gPUSpec) {
			this.gPUSpec = gPUSpec;
		}

		public List<String> getSupportedInstanceTypeFamilies() {
			return this.supportedInstanceTypeFamilies;
		}

		public void setSupportedInstanceTypeFamilies(List<String> supportedInstanceTypeFamilies) {
			this.supportedInstanceTypeFamilies = supportedInstanceTypeFamilies;
		}

		public List<String> getSupportedInstanceTypesList() {
			return this.supportedInstanceTypesList;
		}

		public void setSupportedInstanceTypesList(List<String> supportedInstanceTypesList) {
			this.supportedInstanceTypesList = supportedInstanceTypesList;
		}
	}

	@Override
	public DescribeDedicatedHostTypesResponse getInstance(UnmarshallerContext context) {
		return	DescribeDedicatedHostTypesResponseUnmarshaller.unmarshall(this, context);
	}
}
