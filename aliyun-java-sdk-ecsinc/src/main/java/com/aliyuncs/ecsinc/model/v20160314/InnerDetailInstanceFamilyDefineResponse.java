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
import com.aliyuncs.ecsinc.transform.v20160314.InnerDetailInstanceFamilyDefineResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerDetailInstanceFamilyDefineResponse extends AcsResponse {

	private String requestId;

	private List<InstanceFamilyDefine> instanceFamilyDefines;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<InstanceFamilyDefine> getInstanceFamilyDefines() {
		return this.instanceFamilyDefines;
	}

	public void setInstanceFamilyDefines(List<InstanceFamilyDefine> instanceFamilyDefines) {
		this.instanceFamilyDefines = instanceFamilyDefines;
	}

	public static class InstanceFamilyDefine {

		private String instanceTypeFamily;

		private String cpuType;

		private String machineType;

		private Float cpuFrequency;

		private Float cpuTurboFrequency;

		private String memType;

		private String sysDiskType;

		private String dataDiskType;

		private String additionalDeviceType;

		private String otherTechnology;

		private String vcpuMemRate;

		private String description;

		private String benefitDesc;

		private String fitForDesc;

		private Long maxPps;

		private Long maxBps;

		private String supportIoOptimized;

		public String getInstanceTypeFamily() {
			return this.instanceTypeFamily;
		}

		public void setInstanceTypeFamily(String instanceTypeFamily) {
			this.instanceTypeFamily = instanceTypeFamily;
		}

		public String getCpuType() {
			return this.cpuType;
		}

		public void setCpuType(String cpuType) {
			this.cpuType = cpuType;
		}

		public String getMachineType() {
			return this.machineType;
		}

		public void setMachineType(String machineType) {
			this.machineType = machineType;
		}

		public Float getCpuFrequency() {
			return this.cpuFrequency;
		}

		public void setCpuFrequency(Float cpuFrequency) {
			this.cpuFrequency = cpuFrequency;
		}

		public Float getCpuTurboFrequency() {
			return this.cpuTurboFrequency;
		}

		public void setCpuTurboFrequency(Float cpuTurboFrequency) {
			this.cpuTurboFrequency = cpuTurboFrequency;
		}

		public String getMemType() {
			return this.memType;
		}

		public void setMemType(String memType) {
			this.memType = memType;
		}

		public String getSysDiskType() {
			return this.sysDiskType;
		}

		public void setSysDiskType(String sysDiskType) {
			this.sysDiskType = sysDiskType;
		}

		public String getDataDiskType() {
			return this.dataDiskType;
		}

		public void setDataDiskType(String dataDiskType) {
			this.dataDiskType = dataDiskType;
		}

		public String getAdditionalDeviceType() {
			return this.additionalDeviceType;
		}

		public void setAdditionalDeviceType(String additionalDeviceType) {
			this.additionalDeviceType = additionalDeviceType;
		}

		public String getOtherTechnology() {
			return this.otherTechnology;
		}

		public void setOtherTechnology(String otherTechnology) {
			this.otherTechnology = otherTechnology;
		}

		public String getVcpuMemRate() {
			return this.vcpuMemRate;
		}

		public void setVcpuMemRate(String vcpuMemRate) {
			this.vcpuMemRate = vcpuMemRate;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getBenefitDesc() {
			return this.benefitDesc;
		}

		public void setBenefitDesc(String benefitDesc) {
			this.benefitDesc = benefitDesc;
		}

		public String getFitForDesc() {
			return this.fitForDesc;
		}

		public void setFitForDesc(String fitForDesc) {
			this.fitForDesc = fitForDesc;
		}

		public Long getMaxPps() {
			return this.maxPps;
		}

		public void setMaxPps(Long maxPps) {
			this.maxPps = maxPps;
		}

		public Long getMaxBps() {
			return this.maxBps;
		}

		public void setMaxBps(Long maxBps) {
			this.maxBps = maxBps;
		}

		public String getSupportIoOptimized() {
			return this.supportIoOptimized;
		}

		public void setSupportIoOptimized(String supportIoOptimized) {
			this.supportIoOptimized = supportIoOptimized;
		}
	}

	@Override
	public InnerDetailInstanceFamilyDefineResponse getInstance(UnmarshallerContext context) {
		return	InnerDetailInstanceFamilyDefineResponseUnmarshaller.unmarshall(this, context);
	}
}
