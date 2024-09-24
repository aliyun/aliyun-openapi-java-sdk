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
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyApplicationSpecRequest extends RpcAcsRequest<ModifyApplicationSpecResponse> {
	   

	@SerializedName("instanceSpec")
	private List<InstanceSpec> instanceSpec;

	private String applicationId;
	public ModifyApplicationSpecRequest() {
		super("BPStudio", "2021-09-31", "ModifyApplicationSpec", "bpstudio");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public List<InstanceSpec> getInstanceSpec() {
		return this.instanceSpec;
	}

	public void setInstanceSpec(List<InstanceSpec> instanceSpec) {
		this.instanceSpec = instanceSpec;	
		if (instanceSpec != null) {
			putBodyParameter("InstanceSpec" , new Gson().toJson(instanceSpec));
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

	public static class InstanceSpec {

		@SerializedName("InstanceId")
		private String instanceId;

		@SerializedName("Configuration")
		private Map<String,Object> configuration;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Map<String,Object> getConfiguration() {
			return this.configuration;
		}

		public void setConfiguration(Map<String,Object> configuration) {
			this.configuration = configuration;
		}
	}

	@Override
	public Class<ModifyApplicationSpecResponse> getResponseClass() {
		return ModifyApplicationSpecResponse.class;
	}

}
