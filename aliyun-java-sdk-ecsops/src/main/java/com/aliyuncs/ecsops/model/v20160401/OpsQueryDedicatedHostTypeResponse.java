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
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryDedicatedHostTypeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryDedicatedHostTypeResponse extends AcsResponse {

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

		private Integer hostType;

		private String status;

		private String generation;

		private String supportInstanceTypeFamily;

		private Integer sockets;

		private Integer cores;

		private Integer physicalCores;

		private Integer mem;

		private Integer diskNum;

		private Long diskSize;

		private String dataDiskCategory;

		private Integer flag;

		private Integer physicalGpus;

		private String gpuSpec;

		private Integer vgpus;

		private Integer maxInstanceCount;

		private List<String> supportInstanceTypesList;

		public Integer getHostType() {
			return this.hostType;
		}

		public void setHostType(Integer hostType) {
			this.hostType = hostType;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getGeneration() {
			return this.generation;
		}

		public void setGeneration(String generation) {
			this.generation = generation;
		}

		public String getSupportInstanceTypeFamily() {
			return this.supportInstanceTypeFamily;
		}

		public void setSupportInstanceTypeFamily(String supportInstanceTypeFamily) {
			this.supportInstanceTypeFamily = supportInstanceTypeFamily;
		}

		public Integer getSockets() {
			return this.sockets;
		}

		public void setSockets(Integer sockets) {
			this.sockets = sockets;
		}

		public Integer getCores() {
			return this.cores;
		}

		public void setCores(Integer cores) {
			this.cores = cores;
		}

		public Integer getPhysicalCores() {
			return this.physicalCores;
		}

		public void setPhysicalCores(Integer physicalCores) {
			this.physicalCores = physicalCores;
		}

		public Integer getMem() {
			return this.mem;
		}

		public void setMem(Integer mem) {
			this.mem = mem;
		}

		public Integer getDiskNum() {
			return this.diskNum;
		}

		public void setDiskNum(Integer diskNum) {
			this.diskNum = diskNum;
		}

		public Long getDiskSize() {
			return this.diskSize;
		}

		public void setDiskSize(Long diskSize) {
			this.diskSize = diskSize;
		}

		public String getDataDiskCategory() {
			return this.dataDiskCategory;
		}

		public void setDataDiskCategory(String dataDiskCategory) {
			this.dataDiskCategory = dataDiskCategory;
		}

		public Integer getFlag() {
			return this.flag;
		}

		public void setFlag(Integer flag) {
			this.flag = flag;
		}

		public Integer getPhysicalGpus() {
			return this.physicalGpus;
		}

		public void setPhysicalGpus(Integer physicalGpus) {
			this.physicalGpus = physicalGpus;
		}

		public String getGpuSpec() {
			return this.gpuSpec;
		}

		public void setGpuSpec(String gpuSpec) {
			this.gpuSpec = gpuSpec;
		}

		public Integer getVgpus() {
			return this.vgpus;
		}

		public void setVgpus(Integer vgpus) {
			this.vgpus = vgpus;
		}

		public Integer getMaxInstanceCount() {
			return this.maxInstanceCount;
		}

		public void setMaxInstanceCount(Integer maxInstanceCount) {
			this.maxInstanceCount = maxInstanceCount;
		}

		public List<String> getSupportInstanceTypesList() {
			return this.supportInstanceTypesList;
		}

		public void setSupportInstanceTypesList(List<String> supportInstanceTypesList) {
			this.supportInstanceTypesList = supportInstanceTypesList;
		}
	}

	@Override
	public OpsQueryDedicatedHostTypeResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryDedicatedHostTypeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
