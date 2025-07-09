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

package com.aliyuncs.oceanbasepro.model.v20190901;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.oceanbasepro.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyTenantResourceRequest extends RpcAcsRequest<ModifyTenantResourceResponse> {
	   

	private Integer memory;

	private Long logDisk;

	private Integer cpu;

	private String instanceId;

	private String tenantId;

	private String iops;

	private String readOnlyZoneList;
	public ModifyTenantResourceRequest() {
		super("OceanBasePro", "2019-09-01", "ModifyTenantResource", "oceanbase");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getMemory() {
		return this.memory;
	}

	public void setMemory(Integer memory) {
		this.memory = memory;
		if(memory != null){
			putBodyParameter("Memory", memory.toString());
		}
	}

	public Long getLogDisk() {
		return this.logDisk;
	}

	public void setLogDisk(Long logDisk) {
		this.logDisk = logDisk;
		if(logDisk != null){
			putBodyParameter("LogDisk", logDisk.toString());
		}
	}

	public Integer getCpu() {
		return this.cpu;
	}

	public void setCpu(Integer cpu) {
		this.cpu = cpu;
		if(cpu != null){
			putBodyParameter("Cpu", cpu.toString());
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId);
		}
	}

	public String getIops() {
		return this.iops;
	}

	public void setIops(String iops) {
		this.iops = iops;
		if(iops != null){
			putBodyParameter("Iops", iops);
		}
	}

	public String getReadOnlyZoneList() {
		return this.readOnlyZoneList;
	}

	public void setReadOnlyZoneList(String readOnlyZoneList) {
		this.readOnlyZoneList = readOnlyZoneList;
		if(readOnlyZoneList != null){
			putBodyParameter("ReadOnlyZoneList", readOnlyZoneList);
		}
	}

	@Override
	public Class<ModifyTenantResourceResponse> getResponseClass() {
		return ModifyTenantResourceResponse.class;
	}

}
