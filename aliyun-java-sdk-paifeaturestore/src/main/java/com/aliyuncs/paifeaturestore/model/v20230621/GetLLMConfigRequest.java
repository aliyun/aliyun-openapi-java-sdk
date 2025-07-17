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

package com.aliyuncs.paifeaturestore.model.v20230621;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetLLMConfigRequest extends RoaAcsRequest<GetLLMConfigResponse> {
	   

	private String lLMConfigId;

	private String instanceId;
	public GetLLMConfigRequest() {
		super("PaiFeatureStore", "2023-06-21", "GetLLMConfig");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/api/v1/instances/[InstanceId]/llmconfigs/[LLMConfigId]");
		setMethod(MethodType.GET);
	}

	public String getLLMConfigId() {
		return this.lLMConfigId;
	}

	public void setLLMConfigId(String lLMConfigId) {
		this.lLMConfigId = lLMConfigId;
		if(lLMConfigId != null){
			putPathParameter("LLMConfigId", lLMConfigId);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putPathParameter("InstanceId", instanceId);
		}
	}

	@Override
	public Class<GetLLMConfigResponse> getResponseClass() {
		return GetLLMConfigResponse.class;
	}

}
