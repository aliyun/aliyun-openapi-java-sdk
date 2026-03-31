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

package com.aliyuncs.hbr.model.v20170908;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteAirEcsInstanceRequest extends RpcAcsRequest<DeleteAirEcsInstanceResponse> {
	   

	private String ecsInstanceId;

	@SerializedName("uninstallClientSourceTypes")
	private List<String> uninstallClientSourceTypes;
	public DeleteAirEcsInstanceRequest() {
		super("hbr", "2017-09-08", "DeleteAirEcsInstance", "hbr");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getEcsInstanceId() {
		return this.ecsInstanceId;
	}

	public void setEcsInstanceId(String ecsInstanceId) {
		this.ecsInstanceId = ecsInstanceId;
		if(ecsInstanceId != null){
			putQueryParameter("EcsInstanceId", ecsInstanceId);
		}
	}

	public List<String> getUninstallClientSourceTypes() {
		return this.uninstallClientSourceTypes;
	}

	public void setUninstallClientSourceTypes(List<String> uninstallClientSourceTypes) {
		this.uninstallClientSourceTypes = uninstallClientSourceTypes;	
		if (uninstallClientSourceTypes != null) {
			putQueryParameter("UninstallClientSourceTypes" , new Gson().toJson(uninstallClientSourceTypes));
		}	
	}

	@Override
	public Class<DeleteAirEcsInstanceResponse> getResponseClass() {
		return DeleteAirEcsInstanceResponse.class;
	}

}
