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

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsUpdateDedicatedHostTypeRequest extends RpcAcsRequest<OpsUpdateDedicatedHostTypeResponse> {
	   

	private String gpuSpec;

	private Integer flag;

	private String hostType;

	private String dataDiskCategory;

	private String supportInstanceTypeFamily;

	private Integer vgpus;

	private Integer cores;

	private Integer physicalCores;

	private Integer mem;

	private Integer sockets;

	private String generation;

	private Long diskSize;

	private Integer diskNum;

	private Integer maxInstanceCount;

	private String supportInstanceTypes;

	private Integer physicalGpus;

	private Integer status;

	private String auditParamStr;
	public OpsUpdateDedicatedHostTypeRequest() {
		super("Ecsops", "2016-04-01", "OpsUpdateDedicatedHostType", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getGpuSpec() {
		return this.gpuSpec;
	}

	public void setGpuSpec(String gpuSpec) {
		this.gpuSpec = gpuSpec;
		if(gpuSpec != null){
			putQueryParameter("GpuSpec", gpuSpec);
		}
	}

	public Integer getFlag() {
		return this.flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
		if(flag != null){
			putQueryParameter("Flag", flag.toString());
		}
	}

	public String getHostType() {
		return this.hostType;
	}

	public void setHostType(String hostType) {
		this.hostType = hostType;
		if(hostType != null){
			putQueryParameter("HostType", hostType);
		}
	}

	public String getDataDiskCategory() {
		return this.dataDiskCategory;
	}

	public void setDataDiskCategory(String dataDiskCategory) {
		this.dataDiskCategory = dataDiskCategory;
		if(dataDiskCategory != null){
			putQueryParameter("DataDiskCategory", dataDiskCategory);
		}
	}

	public String getSupportInstanceTypeFamily() {
		return this.supportInstanceTypeFamily;
	}

	public void setSupportInstanceTypeFamily(String supportInstanceTypeFamily) {
		this.supportInstanceTypeFamily = supportInstanceTypeFamily;
		if(supportInstanceTypeFamily != null){
			putQueryParameter("SupportInstanceTypeFamily", supportInstanceTypeFamily);
		}
	}

	public Integer getVgpus() {
		return this.vgpus;
	}

	public void setVgpus(Integer vgpus) {
		this.vgpus = vgpus;
		if(vgpus != null){
			putQueryParameter("Vgpus", vgpus.toString());
		}
	}

	public Integer getCores() {
		return this.cores;
	}

	public void setCores(Integer cores) {
		this.cores = cores;
		if(cores != null){
			putQueryParameter("Cores", cores.toString());
		}
	}

	public Integer getPhysicalCores() {
		return this.physicalCores;
	}

	public void setPhysicalCores(Integer physicalCores) {
		this.physicalCores = physicalCores;
		if(physicalCores != null){
			putQueryParameter("PhysicalCores", physicalCores.toString());
		}
	}

	public Integer getMem() {
		return this.mem;
	}

	public void setMem(Integer mem) {
		this.mem = mem;
		if(mem != null){
			putQueryParameter("Mem", mem.toString());
		}
	}

	public Integer getSockets() {
		return this.sockets;
	}

	public void setSockets(Integer sockets) {
		this.sockets = sockets;
		if(sockets != null){
			putQueryParameter("Sockets", sockets.toString());
		}
	}

	public String getGeneration() {
		return this.generation;
	}

	public void setGeneration(String generation) {
		this.generation = generation;
		if(generation != null){
			putQueryParameter("Generation", generation);
		}
	}

	public Long getDiskSize() {
		return this.diskSize;
	}

	public void setDiskSize(Long diskSize) {
		this.diskSize = diskSize;
		if(diskSize != null){
			putQueryParameter("DiskSize", diskSize.toString());
		}
	}

	public Integer getDiskNum() {
		return this.diskNum;
	}

	public void setDiskNum(Integer diskNum) {
		this.diskNum = diskNum;
		if(diskNum != null){
			putQueryParameter("DiskNum", diskNum.toString());
		}
	}

	public Integer getMaxInstanceCount() {
		return this.maxInstanceCount;
	}

	public void setMaxInstanceCount(Integer maxInstanceCount) {
		this.maxInstanceCount = maxInstanceCount;
		if(maxInstanceCount != null){
			putQueryParameter("MaxInstanceCount", maxInstanceCount.toString());
		}
	}

	public String getSupportInstanceTypes() {
		return this.supportInstanceTypes;
	}

	public void setSupportInstanceTypes(String supportInstanceTypes) {
		this.supportInstanceTypes = supportInstanceTypes;
		if(supportInstanceTypes != null){
			putQueryParameter("SupportInstanceTypes", supportInstanceTypes);
		}
	}

	public Integer getPhysicalGpus() {
		return this.physicalGpus;
	}

	public void setPhysicalGpus(Integer physicalGpus) {
		this.physicalGpus = physicalGpus;
		if(physicalGpus != null){
			putQueryParameter("PhysicalGpus", physicalGpus.toString());
		}
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status.toString());
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsUpdateDedicatedHostTypeResponse> getResponseClass() {
		return OpsUpdateDedicatedHostTypeResponse.class;
	}

}
