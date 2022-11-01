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

/**
 * @author auto create
 * @version 
 */
public class CreateTenantRequest extends RpcAcsRequest<CreateTenantResponse> {
	   

	private String charset;

	private String tenantMode;

	private Integer memory;

	private String timeZone;

	private String description;

	private String userVSwitchId;

	private String userVpcId;

	private Integer cpu;

	private Integer unitNum;

	private String instanceId;

	private String primaryZone;

	private String tenantName;
	public CreateTenantRequest() {
		super("OceanBasePro", "2019-09-01", "CreateTenant");
		setMethod(MethodType.POST);
	}

	public String getCharset() {
		return this.charset;
	}

	public void setCharset(String charset) {
		this.charset = charset;
		if(charset != null){
			putBodyParameter("Charset", charset);
		}
	}

	public String getTenantMode() {
		return this.tenantMode;
	}

	public void setTenantMode(String tenantMode) {
		this.tenantMode = tenantMode;
		if(tenantMode != null){
			putBodyParameter("TenantMode", tenantMode);
		}
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

	public String getTimeZone() {
		return this.timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
		if(timeZone != null){
			putBodyParameter("TimeZone", timeZone);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getUserVSwitchId() {
		return this.userVSwitchId;
	}

	public void setUserVSwitchId(String userVSwitchId) {
		this.userVSwitchId = userVSwitchId;
		if(userVSwitchId != null){
			putBodyParameter("UserVSwitchId", userVSwitchId);
		}
	}

	public String getUserVpcId() {
		return this.userVpcId;
	}

	public void setUserVpcId(String userVpcId) {
		this.userVpcId = userVpcId;
		if(userVpcId != null){
			putBodyParameter("UserVpcId", userVpcId);
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

	public Integer getUnitNum() {
		return this.unitNum;
	}

	public void setUnitNum(Integer unitNum) {
		this.unitNum = unitNum;
		if(unitNum != null){
			putBodyParameter("UnitNum", unitNum.toString());
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

	public String getPrimaryZone() {
		return this.primaryZone;
	}

	public void setPrimaryZone(String primaryZone) {
		this.primaryZone = primaryZone;
		if(primaryZone != null){
			putBodyParameter("PrimaryZone", primaryZone);
		}
	}

	public String getTenantName() {
		return this.tenantName;
	}

	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
		if(tenantName != null){
			putBodyParameter("TenantName", tenantName);
		}
	}

	@Override
	public Class<CreateTenantResponse> getResponseClass() {
		return CreateTenantResponse.class;
	}

}
