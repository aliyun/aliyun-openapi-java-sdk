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
import com.aliyuncs.ecs.transform.v20140526.DescribeInstanceTypesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceTypesResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private List<InstanceType> instanceTypes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<InstanceType> getInstanceTypes() {
		return this.instanceTypes;
	}

	public void setInstanceTypes(List<InstanceType> instanceTypes) {
		this.instanceTypes = instanceTypes;
	}

	public static class InstanceType {

		private Integer eniTotalQuantity;

		private String localStorageCategory;

		private Integer primaryEniQueueNumber;

		private Float memorySize;

		private Long localStorageCapacity;

		private String instanceFamilyLevel;

		private Long instancePpsRx;

		private Integer eniIpv6AddressQuantity;

		private Integer maximumQueueNumberPerEni;

		private String instanceTypeId;

		private Integer instanceBandwidthRx;

		private Integer secondaryEniQueueNumber;

		private String gPUSpec;

		private Integer instanceBandwidthTx;

		private Integer queuePairNumber;

		private Integer eriQuantity;

		private Integer gPUAmount;

		private Integer totalEniQueueQuantity;

		private String nvmeSupport;

		private Integer diskQuantity;

		private Integer initialCredit;

		private Integer localStorageAmount;

		private Integer baselineCredit;

		private Long instancePpsTx;

		private Integer eniPrivateIpAddressQuantity;

		private Integer cpuCoreCount;

		private String instanceTypeFamily;

		private Integer eniQuantity;

		private Boolean eniTrunkSupported;

		public Integer getEniTotalQuantity() {
			return this.eniTotalQuantity;
		}

		public void setEniTotalQuantity(Integer eniTotalQuantity) {
			this.eniTotalQuantity = eniTotalQuantity;
		}

		public String getLocalStorageCategory() {
			return this.localStorageCategory;
		}

		public void setLocalStorageCategory(String localStorageCategory) {
			this.localStorageCategory = localStorageCategory;
		}

		public Integer getPrimaryEniQueueNumber() {
			return this.primaryEniQueueNumber;
		}

		public void setPrimaryEniQueueNumber(Integer primaryEniQueueNumber) {
			this.primaryEniQueueNumber = primaryEniQueueNumber;
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

		public String getInstanceFamilyLevel() {
			return this.instanceFamilyLevel;
		}

		public void setInstanceFamilyLevel(String instanceFamilyLevel) {
			this.instanceFamilyLevel = instanceFamilyLevel;
		}

		public Long getInstancePpsRx() {
			return this.instancePpsRx;
		}

		public void setInstancePpsRx(Long instancePpsRx) {
			this.instancePpsRx = instancePpsRx;
		}

		public Integer getEniIpv6AddressQuantity() {
			return this.eniIpv6AddressQuantity;
		}

		public void setEniIpv6AddressQuantity(Integer eniIpv6AddressQuantity) {
			this.eniIpv6AddressQuantity = eniIpv6AddressQuantity;
		}

		public Integer getMaximumQueueNumberPerEni() {
			return this.maximumQueueNumberPerEni;
		}

		public void setMaximumQueueNumberPerEni(Integer maximumQueueNumberPerEni) {
			this.maximumQueueNumberPerEni = maximumQueueNumberPerEni;
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

		public Integer getSecondaryEniQueueNumber() {
			return this.secondaryEniQueueNumber;
		}

		public void setSecondaryEniQueueNumber(Integer secondaryEniQueueNumber) {
			this.secondaryEniQueueNumber = secondaryEniQueueNumber;
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

		public Integer getQueuePairNumber() {
			return this.queuePairNumber;
		}

		public void setQueuePairNumber(Integer queuePairNumber) {
			this.queuePairNumber = queuePairNumber;
		}

		public Integer getEriQuantity() {
			return this.eriQuantity;
		}

		public void setEriQuantity(Integer eriQuantity) {
			this.eriQuantity = eriQuantity;
		}

		public Integer getGPUAmount() {
			return this.gPUAmount;
		}

		public void setGPUAmount(Integer gPUAmount) {
			this.gPUAmount = gPUAmount;
		}

		public Integer getTotalEniQueueQuantity() {
			return this.totalEniQueueQuantity;
		}

		public void setTotalEniQueueQuantity(Integer totalEniQueueQuantity) {
			this.totalEniQueueQuantity = totalEniQueueQuantity;
		}

		public String getNvmeSupport() {
			return this.nvmeSupport;
		}

		public void setNvmeSupport(String nvmeSupport) {
			this.nvmeSupport = nvmeSupport;
		}

		public Integer getDiskQuantity() {
			return this.diskQuantity;
		}

		public void setDiskQuantity(Integer diskQuantity) {
			this.diskQuantity = diskQuantity;
		}

		public Integer getInitialCredit() {
			return this.initialCredit;
		}

		public void setInitialCredit(Integer initialCredit) {
			this.initialCredit = initialCredit;
		}

		public Integer getLocalStorageAmount() {
			return this.localStorageAmount;
		}

		public void setLocalStorageAmount(Integer localStorageAmount) {
			this.localStorageAmount = localStorageAmount;
		}

		public Integer getBaselineCredit() {
			return this.baselineCredit;
		}

		public void setBaselineCredit(Integer baselineCredit) {
			this.baselineCredit = baselineCredit;
		}

		public Long getInstancePpsTx() {
			return this.instancePpsTx;
		}

		public void setInstancePpsTx(Long instancePpsTx) {
			this.instancePpsTx = instancePpsTx;
		}

		public Integer getEniPrivateIpAddressQuantity() {
			return this.eniPrivateIpAddressQuantity;
		}

		public void setEniPrivateIpAddressQuantity(Integer eniPrivateIpAddressQuantity) {
			this.eniPrivateIpAddressQuantity = eniPrivateIpAddressQuantity;
		}

		public Integer getCpuCoreCount() {
			return this.cpuCoreCount;
		}

		public void setCpuCoreCount(Integer cpuCoreCount) {
			this.cpuCoreCount = cpuCoreCount;
		}

		public String getInstanceTypeFamily() {
			return this.instanceTypeFamily;
		}

		public void setInstanceTypeFamily(String instanceTypeFamily) {
			this.instanceTypeFamily = instanceTypeFamily;
		}

		public Integer getEniQuantity() {
			return this.eniQuantity;
		}

		public void setEniQuantity(Integer eniQuantity) {
			this.eniQuantity = eniQuantity;
		}

		public Boolean getEniTrunkSupported() {
			return this.eniTrunkSupported;
		}

		public void setEniTrunkSupported(Boolean eniTrunkSupported) {
			this.eniTrunkSupported = eniTrunkSupported;
		}
	}

	@Override
	public DescribeInstanceTypesResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceTypesResponseUnmarshaller.unmarshall(this, context);
	}
}
