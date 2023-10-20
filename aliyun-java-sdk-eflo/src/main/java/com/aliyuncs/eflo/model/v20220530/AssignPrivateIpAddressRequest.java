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

package com.aliyuncs.eflo.model.v20220530;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AssignPrivateIpAddressRequest extends RpcAcsRequest<AssignPrivateIpAddressResponse> {
	   

	private String clientToken;

	private String description;

	private Boolean assignMac;

	private String subnetId;

	private Boolean skipConfig;

	private String privateIpAddress;

	private String networkInterfaceId;
	public AssignPrivateIpAddressRequest() {
		super("eflo", "2022-05-30", "AssignPrivateIpAddress", "eflo");
		setMethod(MethodType.POST);
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putBodyParameter("ClientToken", clientToken);
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

	public Boolean getAssignMac() {
		return this.assignMac;
	}

	public void setAssignMac(Boolean assignMac) {
		this.assignMac = assignMac;
		if(assignMac != null){
			putBodyParameter("AssignMac", assignMac.toString());
		}
	}

	public String getSubnetId() {
		return this.subnetId;
	}

	public void setSubnetId(String subnetId) {
		this.subnetId = subnetId;
		if(subnetId != null){
			putBodyParameter("SubnetId", subnetId);
		}
	}

	public Boolean getSkipConfig() {
		return this.skipConfig;
	}

	public void setSkipConfig(Boolean skipConfig) {
		this.skipConfig = skipConfig;
		if(skipConfig != null){
			putBodyParameter("SkipConfig", skipConfig.toString());
		}
	}

	public String getPrivateIpAddress() {
		return this.privateIpAddress;
	}

	public void setPrivateIpAddress(String privateIpAddress) {
		this.privateIpAddress = privateIpAddress;
		if(privateIpAddress != null){
			putBodyParameter("PrivateIpAddress", privateIpAddress);
		}
	}

	public String getNetworkInterfaceId() {
		return this.networkInterfaceId;
	}

	public void setNetworkInterfaceId(String networkInterfaceId) {
		this.networkInterfaceId = networkInterfaceId;
		if(networkInterfaceId != null){
			putBodyParameter("NetworkInterfaceId", networkInterfaceId);
		}
	}

	@Override
	public Class<AssignPrivateIpAddressResponse> getResponseClass() {
		return AssignPrivateIpAddressResponse.class;
	}

}
