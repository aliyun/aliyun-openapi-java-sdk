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
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.gpdb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyDBResourceGroupRequest extends RpcAcsRequest<ModifyDBResourceGroupResponse> {
	   

	private String dBInstanceId;

	@SerializedName("resourceGroupItems")
	private List<ResourceGroupItems> resourceGroupItems;

	private Long ownerId;
	public ModifyDBResourceGroupRequest() {
		super("gpdb", "2016-05-03", "ModifyDBResourceGroup", "gpdb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
		}
	}

	public List<ResourceGroupItems> getResourceGroupItems() {
		return this.resourceGroupItems;
	}

	public void setResourceGroupItems(List<ResourceGroupItems> resourceGroupItems) {
		this.resourceGroupItems = resourceGroupItems;	
		if (resourceGroupItems != null) {
			putQueryParameter("ResourceGroupItems" , new Gson().toJson(resourceGroupItems));
		}	
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public static class ResourceGroupItems {

		@SerializedName("ResourceGroupName")
		private String resourceGroupName;

		@SerializedName("ResourceGroupConfig")
		private String resourceGroupConfig;

		public String getResourceGroupName() {
			return this.resourceGroupName;
		}

		public void setResourceGroupName(String resourceGroupName) {
			this.resourceGroupName = resourceGroupName;
		}

		public String getResourceGroupConfig() {
			return this.resourceGroupConfig;
		}

		public void setResourceGroupConfig(String resourceGroupConfig) {
			this.resourceGroupConfig = resourceGroupConfig;
		}
	}

	@Override
	public Class<ModifyDBResourceGroupResponse> getResponseClass() {
		return ModifyDBResourceGroupResponse.class;
	}

}
