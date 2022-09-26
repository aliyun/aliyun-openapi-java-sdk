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
public class SetDataShareInstanceRequest extends RpcAcsRequest<SetDataShareInstanceResponse> {
	   

	@SerializedName("instanceList")
	private List<String> instanceList;

	private String operationType;

	private Long ownerId;
	public SetDataShareInstanceRequest() {
		super("gpdb", "2016-05-03", "SetDataShareInstance");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getInstanceList() {
		return this.instanceList;
	}

	public void setInstanceList(List<String> instanceList) {
		this.instanceList = instanceList;	
		if (instanceList != null) {
			putQueryParameter("InstanceList" , new Gson().toJson(instanceList));
		}	
	}

	public String getOperationType() {
		return this.operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
		if(operationType != null){
			putQueryParameter("OperationType", operationType);
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

	@Override
	public Class<SetDataShareInstanceResponse> getResponseClass() {
		return SetDataShareInstanceResponse.class;
	}

}
