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

package com.aliyuncs.brain_industrial.model.v20200920;

import com.aliyuncs.RpcAcsRequest;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.brain_industrial.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AicsOpenApiInvokeRequest extends RpcAcsRequest<AicsOpenApiInvokeResponse> {
	   

	private String type;

	@SerializedName("param")
	private Map<String,String> param;

	private String serviceId;

	private String nodeId;
	public AicsOpenApiInvokeRequest() {
		super("brain-industrial", "2020-09-20", "AicsOpenApiInvoke", "aistudio");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public Map<String,String> getParam() {
		return this.param;
	}

	public void setParam(Map<String,String> param) {
		this.param = param;	
		if (param != null) {
			putBodyParameter("Param" , new Gson().toJson(param));
		}	
	}

	public String getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
		if(serviceId != null){
			putQueryParameter("ServiceId", serviceId);
		}
	}

	public String getNodeId() {
		return this.nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
		if(nodeId != null){
			putQueryParameter("NodeId", nodeId);
		}
	}

	@Override
	public Class<AicsOpenApiInvokeResponse> getResponseClass() {
		return AicsOpenApiInvokeResponse.class;
	}

}
