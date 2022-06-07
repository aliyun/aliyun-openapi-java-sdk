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

package com.aliyuncs.appstream_center.model.v20210901;

import com.aliyuncs.RpcAcsRequest;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyAppInstanceGroupAttributeRequest extends RpcAcsRequest<ModifyAppInstanceGroupAttributeResponse> {
	   

	@SerializedName("nodePool")
	private NodePool nodePool;

	private String productType;

	private String appInstanceGroupName;

	private Integer sessionTimeout;

	private String appInstanceGroupId;
	public ModifyAppInstanceGroupAttributeRequest() {
		super("appstream-center", "2021-09-01", "ModifyAppInstanceGroupAttribute");
		setMethod(MethodType.POST);
	}

	public NodePool getNodePool() {
		return this.nodePool;
	}

	public void setNodePool(NodePool nodePool) {
		this.nodePool = nodePool;	
		if (nodePool != null) {
			putQueryParameter("NodePool" , new Gson().toJson(nodePool));
		}	
	}

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
		if(productType != null){
			putQueryParameter("ProductType", productType);
		}
	}

	public String getAppInstanceGroupName() {
		return this.appInstanceGroupName;
	}

	public void setAppInstanceGroupName(String appInstanceGroupName) {
		this.appInstanceGroupName = appInstanceGroupName;
		if(appInstanceGroupName != null){
			putQueryParameter("AppInstanceGroupName", appInstanceGroupName);
		}
	}

	public Integer getSessionTimeout() {
		return this.sessionTimeout;
	}

	public void setSessionTimeout(Integer sessionTimeout) {
		this.sessionTimeout = sessionTimeout;
		if(sessionTimeout != null){
			putQueryParameter("SessionTimeout", sessionTimeout.toString());
		}
	}

	public String getAppInstanceGroupId() {
		return this.appInstanceGroupId;
	}

	public void setAppInstanceGroupId(String appInstanceGroupId) {
		this.appInstanceGroupId = appInstanceGroupId;
		if(appInstanceGroupId != null){
			putQueryParameter("AppInstanceGroupId", appInstanceGroupId);
		}
	}

	public static class NodePool {

		@SerializedName("NodePoolId")
		private String nodePoolId;

		@SerializedName("NodeCapacity")
		private Integer nodeCapacity;

		public String getNodePoolId() {
			return this.nodePoolId;
		}

		public void setNodePoolId(String nodePoolId) {
			this.nodePoolId = nodePoolId;
		}

		public Integer getNodeCapacity() {
			return this.nodeCapacity;
		}

		public void setNodeCapacity(Integer nodeCapacity) {
			this.nodeCapacity = nodeCapacity;
		}
	}

	@Override
	public Class<ModifyAppInstanceGroupAttributeResponse> getResponseClass() {
		return ModifyAppInstanceGroupAttributeResponse.class;
	}

}
