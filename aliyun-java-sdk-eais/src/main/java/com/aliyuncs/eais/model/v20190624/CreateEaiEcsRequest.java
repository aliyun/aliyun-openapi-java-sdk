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
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.eais.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateEaiEcsRequest extends RpcAcsRequest<CreateEaiEcsResponse> {
	   

	private String clientToken;

	private String securityGroupId;

	private String eaisType;

	private String vSwitchId;

	private String resourceGroupId;

	@SerializedName("ecs")
	private Ecs ecs;

	private String eaisName;
	public CreateEaiEcsRequest() {
		super("eais", "2019-06-24", "CreateEaiEcs", "eais");
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

	public String getSecurityGroupId() {
		return this.securityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		this.securityGroupId = securityGroupId;
		if(securityGroupId != null){
			putQueryParameter("SecurityGroupId", securityGroupId);
		}
	}

	public String getEaisType() {
		return this.eaisType;
	}

	public void setEaisType(String eaisType) {
		this.eaisType = eaisType;
		if(eaisType != null){
			putQueryParameter("EaisType", eaisType);
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

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public Ecs getEcs() {
		return this.ecs;
	}

	public void setEcs(Ecs ecs) {
		this.ecs = ecs;	
		if (ecs != null) {
			putQueryParameter("Ecs" , new Gson().toJson(ecs));
		}	
	}

	public String getEaisName() {
		return this.eaisName;
	}

	public void setEaisName(String eaisName) {
		this.eaisName = eaisName;
		if(eaisName != null){
			putQueryParameter("EaisName", eaisName);
		}
	}

	public static class Ecs {

		@SerializedName("Password")
		private String password;

		@SerializedName("ImageId")
		private String imageId;

		@SerializedName("SystemDiskCategory")
		private String systemDiskCategory;

		@SerializedName("InternetMaxBandwidthOut")
		private String internetMaxBandwidthOut;

		@SerializedName("Name")
		private String name;

		@SerializedName("SystemDiskSize")
		private Long systemDiskSize;

		@SerializedName("ZoneId")
		private String zoneId;

		@SerializedName("Type")
		private String type;

		@SerializedName("InternetMaxBandwidthIn")
		private String internetMaxBandwidthIn;

		public String getPassword() {
			return this.password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getSystemDiskCategory() {
			return this.systemDiskCategory;
		}

		public void setSystemDiskCategory(String systemDiskCategory) {
			this.systemDiskCategory = systemDiskCategory;
		}

		public String getInternetMaxBandwidthOut() {
			return this.internetMaxBandwidthOut;
		}

		public void setInternetMaxBandwidthOut(String internetMaxBandwidthOut) {
			this.internetMaxBandwidthOut = internetMaxBandwidthOut;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getSystemDiskSize() {
			return this.systemDiskSize;
		}

		public void setSystemDiskSize(Long systemDiskSize) {
			this.systemDiskSize = systemDiskSize;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getInternetMaxBandwidthIn() {
			return this.internetMaxBandwidthIn;
		}

		public void setInternetMaxBandwidthIn(String internetMaxBandwidthIn) {
			this.internetMaxBandwidthIn = internetMaxBandwidthIn;
		}
	}

	@Override
	public Class<CreateEaiEcsResponse> getResponseClass() {
		return CreateEaiEcsResponse.class;
	}

}
