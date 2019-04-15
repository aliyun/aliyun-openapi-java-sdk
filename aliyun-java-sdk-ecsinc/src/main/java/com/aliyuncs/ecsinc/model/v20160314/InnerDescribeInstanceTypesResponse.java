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

package com.aliyuncs.ecsinc.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsinc.transform.v20160314.InnerDescribeInstanceTypesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerDescribeInstanceTypesResponse extends AcsResponse {

	private String requestId;

	private List<InstanceType> instanceTypes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<InstanceType> getInstanceTypes() {
		return this.instanceTypes;
	}

	public void setInstanceTypes(List<InstanceType> instanceTypes) {
		this.instanceTypes = instanceTypes;
	}

	public static class InstanceType {

		private String instanceTypeId;

		private Integer cpuCoreCount;

		private Float memorySize;

		private String instanceTypeFamily;

		private Long localStorageCapacity;

		private Integer localStorageAmount;

		private String localStorageCategory;

		private Integer gPUAmount;

		private String gPUSpec;

		private Long vmPpsTx;

		private Long vmPpsRx;

		private Integer vmBandwidthTx;

		private Integer vmBandwidthRx;

		private Long privateRxPps;

		private Long privateTxPps;

		private Long publicRxPps;

		private Long publicTxPps;

		private Integer flag;

		private Integer baselineCredit;

		private Long vmIOPS;

		private Long vmBPS;

		private Integer eniQuantity;

		private Integer eniPrivateIpAddressQuantity;

		private Integer eniIpv6AddressQuantity;

		private Float factor;

		public String getInstanceTypeId() {
			return this.instanceTypeId;
		}

		public void setInstanceTypeId(String instanceTypeId) {
			this.instanceTypeId = instanceTypeId;
		}

		public Integer getCpuCoreCount() {
			return this.cpuCoreCount;
		}

		public void setCpuCoreCount(Integer cpuCoreCount) {
			this.cpuCoreCount = cpuCoreCount;
		}

		public Float getMemorySize() {
			return this.memorySize;
		}

		public void setMemorySize(Float memorySize) {
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

		public Long getVmPpsTx() {
			return this.vmPpsTx;
		}

		public void setVmPpsTx(Long vmPpsTx) {
			this.vmPpsTx = vmPpsTx;
		}

		public Long getVmPpsRx() {
			return this.vmPpsRx;
		}

		public void setVmPpsRx(Long vmPpsRx) {
			this.vmPpsRx = vmPpsRx;
		}

		public Integer getVmBandwidthTx() {
			return this.vmBandwidthTx;
		}

		public void setVmBandwidthTx(Integer vmBandwidthTx) {
			this.vmBandwidthTx = vmBandwidthTx;
		}

		public Integer getVmBandwidthRx() {
			return this.vmBandwidthRx;
		}

		public void setVmBandwidthRx(Integer vmBandwidthRx) {
			this.vmBandwidthRx = vmBandwidthRx;
		}

		public Long getPrivateRxPps() {
			return this.privateRxPps;
		}

		public void setPrivateRxPps(Long privateRxPps) {
			this.privateRxPps = privateRxPps;
		}

		public Long getPrivateTxPps() {
			return this.privateTxPps;
		}

		public void setPrivateTxPps(Long privateTxPps) {
			this.privateTxPps = privateTxPps;
		}

		public Long getPublicRxPps() {
			return this.publicRxPps;
		}

		public void setPublicRxPps(Long publicRxPps) {
			this.publicRxPps = publicRxPps;
		}

		public Long getPublicTxPps() {
			return this.publicTxPps;
		}

		public void setPublicTxPps(Long publicTxPps) {
			this.publicTxPps = publicTxPps;
		}

		public Integer getFlag() {
			return this.flag;
		}

		public void setFlag(Integer flag) {
			this.flag = flag;
		}

		public Integer getBaselineCredit() {
			return this.baselineCredit;
		}

		public void setBaselineCredit(Integer baselineCredit) {
			this.baselineCredit = baselineCredit;
		}

		public Long getVmIOPS() {
			return this.vmIOPS;
		}

		public void setVmIOPS(Long vmIOPS) {
			this.vmIOPS = vmIOPS;
		}

		public Long getVmBPS() {
			return this.vmBPS;
		}

		public void setVmBPS(Long vmBPS) {
			this.vmBPS = vmBPS;
		}

		public Integer getEniQuantity() {
			return this.eniQuantity;
		}

		public void setEniQuantity(Integer eniQuantity) {
			this.eniQuantity = eniQuantity;
		}

		public Integer getEniPrivateIpAddressQuantity() {
			return this.eniPrivateIpAddressQuantity;
		}

		public void setEniPrivateIpAddressQuantity(Integer eniPrivateIpAddressQuantity) {
			this.eniPrivateIpAddressQuantity = eniPrivateIpAddressQuantity;
		}

		public Integer getEniIpv6AddressQuantity() {
			return this.eniIpv6AddressQuantity;
		}

		public void setEniIpv6AddressQuantity(Integer eniIpv6AddressQuantity) {
			this.eniIpv6AddressQuantity = eniIpv6AddressQuantity;
		}

		public Float getFactor() {
			return this.factor;
		}

		public void setFactor(Float factor) {
			this.factor = factor;
		}
	}

	@Override
	public InnerDescribeInstanceTypesResponse getInstance(UnmarshallerContext context) {
		return	InnerDescribeInstanceTypesResponseUnmarshaller.unmarshall(this, context);
	}
}
