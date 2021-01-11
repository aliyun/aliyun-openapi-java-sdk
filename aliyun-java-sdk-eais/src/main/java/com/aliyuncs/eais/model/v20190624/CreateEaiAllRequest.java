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

package com.aliyuncs.eais.model.v20190624;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.eais.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateEaiAllRequest extends RpcAcsRequest<CreateEaiAllResponse> {
	   

	private String clientImageId;

	private String clientSystemDiskCategory;

	private Integer clientInternetMaxBandwidthOut;

	private String clientToken;

	private String clientInstanceName;

	private Integer clientInternetMaxBandwidthIn;

	private Integer clientSystemDiskSize;

	private String clientVSwitchId;

	private String clientPassword;

	private String clientInstanceType;

	private String clientSecurityGroupId;

	private String eaiInstanceType;

	private String clientZoneId;

	private String instanceName;
	public CreateEaiAllRequest() {
		super("eais", "2019-06-24", "CreateEaiAll", "eais");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientImageId() {
		return this.clientImageId;
	}

	public void setClientImageId(String clientImageId) {
		this.clientImageId = clientImageId;
		if(clientImageId != null){
			putQueryParameter("ClientImageId", clientImageId);
		}
	}

	public String getClientSystemDiskCategory() {
		return this.clientSystemDiskCategory;
	}

	public void setClientSystemDiskCategory(String clientSystemDiskCategory) {
		this.clientSystemDiskCategory = clientSystemDiskCategory;
		if(clientSystemDiskCategory != null){
			putQueryParameter("ClientSystemDiskCategory", clientSystemDiskCategory);
		}
	}

	public Integer getClientInternetMaxBandwidthOut() {
		return this.clientInternetMaxBandwidthOut;
	}

	public void setClientInternetMaxBandwidthOut(Integer clientInternetMaxBandwidthOut) {
		this.clientInternetMaxBandwidthOut = clientInternetMaxBandwidthOut;
		if(clientInternetMaxBandwidthOut != null){
			putQueryParameter("ClientInternetMaxBandwidthOut", clientInternetMaxBandwidthOut.toString());
		}
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

	public String getClientInstanceName() {
		return this.clientInstanceName;
	}

	public void setClientInstanceName(String clientInstanceName) {
		this.clientInstanceName = clientInstanceName;
		if(clientInstanceName != null){
			putQueryParameter("ClientInstanceName", clientInstanceName);
		}
	}

	public Integer getClientInternetMaxBandwidthIn() {
		return this.clientInternetMaxBandwidthIn;
	}

	public void setClientInternetMaxBandwidthIn(Integer clientInternetMaxBandwidthIn) {
		this.clientInternetMaxBandwidthIn = clientInternetMaxBandwidthIn;
		if(clientInternetMaxBandwidthIn != null){
			putQueryParameter("ClientInternetMaxBandwidthIn", clientInternetMaxBandwidthIn.toString());
		}
	}

	public Integer getClientSystemDiskSize() {
		return this.clientSystemDiskSize;
	}

	public void setClientSystemDiskSize(Integer clientSystemDiskSize) {
		this.clientSystemDiskSize = clientSystemDiskSize;
		if(clientSystemDiskSize != null){
			putQueryParameter("ClientSystemDiskSize", clientSystemDiskSize.toString());
		}
	}

	public String getClientVSwitchId() {
		return this.clientVSwitchId;
	}

	public void setClientVSwitchId(String clientVSwitchId) {
		this.clientVSwitchId = clientVSwitchId;
		if(clientVSwitchId != null){
			putQueryParameter("ClientVSwitchId", clientVSwitchId);
		}
	}

	public String getClientPassword() {
		return this.clientPassword;
	}

	public void setClientPassword(String clientPassword) {
		this.clientPassword = clientPassword;
		if(clientPassword != null){
			putQueryParameter("ClientPassword", clientPassword);
		}
	}

	public String getClientInstanceType() {
		return this.clientInstanceType;
	}

	public void setClientInstanceType(String clientInstanceType) {
		this.clientInstanceType = clientInstanceType;
		if(clientInstanceType != null){
			putQueryParameter("ClientInstanceType", clientInstanceType);
		}
	}

	public String getClientSecurityGroupId() {
		return this.clientSecurityGroupId;
	}

	public void setClientSecurityGroupId(String clientSecurityGroupId) {
		this.clientSecurityGroupId = clientSecurityGroupId;
		if(clientSecurityGroupId != null){
			putQueryParameter("ClientSecurityGroupId", clientSecurityGroupId);
		}
	}

	public String getEaiInstanceType() {
		return this.eaiInstanceType;
	}

	public void setEaiInstanceType(String eaiInstanceType) {
		this.eaiInstanceType = eaiInstanceType;
		if(eaiInstanceType != null){
			putQueryParameter("EaiInstanceType", eaiInstanceType);
		}
	}

	public String getClientZoneId() {
		return this.clientZoneId;
	}

	public void setClientZoneId(String clientZoneId) {
		this.clientZoneId = clientZoneId;
		if(clientZoneId != null){
			putQueryParameter("ClientZoneId", clientZoneId);
		}
	}

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
		if(instanceName != null){
			putQueryParameter("InstanceName", instanceName);
		}
	}

	@Override
	public Class<CreateEaiAllResponse> getResponseClass() {
		return CreateEaiAllResponse.class;
	}

}
