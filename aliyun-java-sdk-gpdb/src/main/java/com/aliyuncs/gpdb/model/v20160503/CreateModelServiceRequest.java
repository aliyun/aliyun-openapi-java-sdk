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
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.gpdb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateModelServiceRequest extends RpcAcsRequest<CreateModelServiceResponse> {
	   

	private String clientToken;

	private String modelName;

	private String description;

	private String inferenceEngine;

	private String resourceGroupId;

	private String dBInstanceId;

	@SerializedName("aiNodes")
	private List<String> aiNodes;

	private Integer replicas;

	private String securityIPList;

	@SerializedName("modelParams")
	private Map<String,String> modelParams;

	private Boolean enablePublicConnection;
	public CreateModelServiceRequest() {
		super("gpdb", "2016-05-03", "CreateModelService", "GPDB");
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
			putBodyParameter("ClientToken", clientToken);
		}
	}

	public String getModelName() {
		return this.modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
		if(modelName != null){
			putQueryParameter("ModelName", modelName);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getInferenceEngine() {
		return this.inferenceEngine;
	}

	public void setInferenceEngine(String inferenceEngine) {
		this.inferenceEngine = inferenceEngine;
		if(inferenceEngine != null){
			putQueryParameter("InferenceEngine", inferenceEngine);
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putBodyParameter("ResourceGroupId", resourceGroupId);
		}
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

	public List<String> getAiNodes() {
		return this.aiNodes;
	}

	public void setAiNodes(List<String> aiNodes) {
		this.aiNodes = aiNodes;	
		if (aiNodes != null) {
			putQueryParameter("AiNodes" , new Gson().toJson(aiNodes));
		}	
	}

	public Integer getReplicas() {
		return this.replicas;
	}

	public void setReplicas(Integer replicas) {
		this.replicas = replicas;
		if(replicas != null){
			putQueryParameter("Replicas", replicas.toString());
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

	public Map<String,String> getModelParams() {
		return this.modelParams;
	}

	public void setModelParams(Map<String,String> modelParams) {
		this.modelParams = modelParams;	
		if (modelParams != null) {
			putQueryParameter("ModelParams" , new Gson().toJson(modelParams));
		}	
	}

	public Boolean getEnablePublicConnection() {
		return this.enablePublicConnection;
	}

	public void setEnablePublicConnection(Boolean enablePublicConnection) {
		this.enablePublicConnection = enablePublicConnection;
		if(enablePublicConnection != null){
			putQueryParameter("EnablePublicConnection", enablePublicConnection.toString());
		}
	}

	@Override
	public Class<CreateModelServiceResponse> getResponseClass() {
		return CreateModelServiceResponse.class;
	}

}
