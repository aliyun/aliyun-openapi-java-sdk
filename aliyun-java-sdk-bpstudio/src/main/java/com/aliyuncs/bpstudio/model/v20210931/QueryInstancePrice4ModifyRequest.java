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

package com.aliyuncs.bpstudio.model.v20210931;

import com.aliyuncs.RpcAcsRequest;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QueryInstancePrice4ModifyRequest extends RpcAcsRequest<QueryInstancePrice4ModifyResponse> {
	   

	@SerializedName("configuration")
	private Map<String,Object> configuration;

	private String instanceId;

	private String applicationId;
	public QueryInstancePrice4ModifyRequest() {
		super("BPStudio", "2021-09-31", "QueryInstancePrice4Modify", "bpstudio");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Map<String,Object> getConfiguration() {
		return this.configuration;
	}

	public void setConfiguration(Map<String,Object> configuration) {
		this.configuration = configuration;	
		if (configuration != null) {
			putBodyParameter("Configuration" , new Gson().toJson(configuration));
		}	
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public String getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
		if(applicationId != null){
			putBodyParameter("ApplicationId", applicationId);
		}
	}

	@Override
	public Class<QueryInstancePrice4ModifyResponse> getResponseClass() {
		return QueryInstancePrice4ModifyResponse.class;
	}

}
