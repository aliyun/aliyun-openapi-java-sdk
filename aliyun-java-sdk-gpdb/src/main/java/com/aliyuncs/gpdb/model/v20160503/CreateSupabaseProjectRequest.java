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

package com.aliyuncs.gpdb.model.v20160503;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.gpdb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateSupabaseProjectRequest extends RpcAcsRequest<CreateSupabaseProjectResponse> {
	   

	private String clientToken;

	private Long storageSize;

	private String projectSpec;

	private String projectName;

	private String diskPerformanceLevel;

	private String securityIPList;

	private String vSwitchId;

	private String accountPassword;

	private String vpcId;

	private String zoneId;
	public CreateSupabaseProjectRequest() {
		super("gpdb", "2016-05-03", "CreateSupabaseProject", "gpdb");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public Long getStorageSize() {
		return this.storageSize;
	}

	public void setStorageSize(Long storageSize) {
		this.storageSize = storageSize;
		if(storageSize != null){
			putQueryParameter("StorageSize", storageSize.toString());
		}
	}

	public String getProjectSpec() {
		return this.projectSpec;
	}

	public void setProjectSpec(String projectSpec) {
		this.projectSpec = projectSpec;
		if(projectSpec != null){
			putQueryParameter("ProjectSpec", projectSpec);
		}
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putQueryParameter("ProjectName", projectName);
		}
	}

	public String getDiskPerformanceLevel() {
		return this.diskPerformanceLevel;
	}

	public void setDiskPerformanceLevel(String diskPerformanceLevel) {
		this.diskPerformanceLevel = diskPerformanceLevel;
		if(diskPerformanceLevel != null){
			putQueryParameter("DiskPerformanceLevel", diskPerformanceLevel);
		}
	}

	public String getSecurityIPList() {
		return this.securityIPList;
	}

	public void setSecurityIPList(String securityIPList) {
		this.securityIPList = securityIPList;
		if(securityIPList != null){
			putQueryParameter("SecurityIPList", securityIPList);
		}
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putQueryParameter("VSwitchId", vSwitchId);
		}
	}

	public String getAccountPassword() {
		return this.accountPassword;
	}

	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
		if(accountPassword != null){
			putQueryParameter("AccountPassword", accountPassword);
		}
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putQueryParameter("VpcId", vpcId);
		}
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
		}
	}

	@Override
	public Class<CreateSupabaseProjectResponse> getResponseClass() {
		return CreateSupabaseProjectResponse.class;
	}

}
