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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeVmTypeSpecResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeVmTypeSpecResponse extends AcsResponse {

	private String requestId;

	private List<VmInstanceType> vmInstanceTypes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<VmInstanceType> getVmInstanceTypes() {
		return this.vmInstanceTypes;
	}

	public void setVmInstanceTypes(List<VmInstanceType> vmInstanceTypes) {
		this.vmInstanceTypes = vmInstanceTypes;
	}

	public static class VmInstanceType {

		private Integer cores;

		private Long sessionEstablishRate;

		private Integer diskSize;

		private Integer nvmNum;

		private String instanceType;

		private Integer diskNum;

		private Long flag;

		private Integer gpuAmount;

		private String gpuSpec;

		private Long sessionQuota;

		private Long nvmSize;

		private String instanceTypeFamily;

		private String memorySize;

		private String localStorageCategory;

		private Long vmPpsTx;

		private Long vmPpsRx;

		private Long vmBandwidthTx;

		private Long vmBandwidthRx;

		private Long privateRxPps;

		private Long privateTxPps;

		private Long publicRxPps;

		private Long publicTxPps;

		private Integer baselineCredit;

		private Integer eniQuantity;

		private Integer eniPrivateIpAddressQuantity;

		private Integer eniIpv6AddressQuantity;

		private Boolean enableEniHotPlug;

		private Boolean eniTrunkSupported;

		private Integer eniTotalQuantity;

		public Integer getCores() {
			return this.cores;
		}

		public void setCores(Integer cores) {
			this.cores = cores;
		}

		public Long getSessionEstablishRate() {
			return this.sessionEstablishRate;
		}

		public void setSessionEstablishRate(Long sessionEstablishRate) {
			this.sessionEstablishRate = sessionEstablishRate;
		}

		public Integer getDiskSize() {
			return this.diskSize;
		}

		public void setDiskSize(Integer diskSize) {
			this.diskSize = diskSize;
		}

		public Integer getNvmNum() {
			return this.nvmNum;
		}

		public void setNvmNum(Integer nvmNum) {
			this.nvmNum = nvmNum;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public Integer getDiskNum() {
			return this.diskNum;
		}

		public void setDiskNum(Integer diskNum) {
			this.diskNum = diskNum;
		}

		public Long getFlag() {
			return this.flag;
		}

		public void setFlag(Long flag) {
			this.flag = flag;
		}

		public Integer getGpuAmount() {
			return this.gpuAmount;
		}

		public void setGpuAmount(Integer gpuAmount) {
			this.gpuAmount = gpuAmount;
		}

		public String getGpuSpec() {
			return this.gpuSpec;
		}

		public void setGpuSpec(String gpuSpec) {
			this.gpuSpec = gpuSpec;
		}

		public Long getSessionQuota() {
			return this.sessionQuota;
		}

		public void setSessionQuota(Long sessionQuota) {
			this.sessionQuota = sessionQuota;
		}

		public Long getNvmSize() {
			return this.nvmSize;
		}

		public void setNvmSize(Long nvmSize) {
			this.nvmSize = nvmSize;
		}

		public String getInstanceTypeFamily() {
			return this.instanceTypeFamily;
		}

		public void setInstanceTypeFamily(String instanceTypeFamily) {
			this.instanceTypeFamily = instanceTypeFamily;
		}

		public String getMemorySize() {
			return this.memorySize;
		}

		public void setMemorySize(String memorySize) {
			this.memorySize = memorySize;
		}

		public String getLocalStorageCategory() {
			return this.localStorageCategory;
		}

		public void setLocalStorageCategory(String localStorageCategory) {
			this.localStorageCategory = localStorageCategory;
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

		public Long getVmBandwidthTx() {
			return this.vmBandwidthTx;
		}

		public void setVmBandwidthTx(Long vmBandwidthTx) {
			this.vmBandwidthTx = vmBandwidthTx;
		}

		public Long getVmBandwidthRx() {
			return this.vmBandwidthRx;
		}

		public void setVmBandwidthRx(Long vmBandwidthRx) {
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

		public Boolean getEnableEniHotPlug() {
			return this.enableEniHotPlug;
		}

		public void setEnableEniHotPlug(Boolean enableEniHotPlug) {
			this.enableEniHotPlug = enableEniHotPlug;
		}

		public Boolean getEniTrunkSupported() {
			return this.eniTrunkSupported;
		}

		public void setEniTrunkSupported(Boolean eniTrunkSupported) {
			this.eniTrunkSupported = eniTrunkSupported;
		}

		public Integer getEniTotalQuantity() {
			return this.eniTotalQuantity;
		}

		public void setEniTotalQuantity(Integer eniTotalQuantity) {
			this.eniTotalQuantity = eniTotalQuantity;
		}
	}

	@Override
	public OpsDescribeVmTypeSpecResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeVmTypeSpecResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
