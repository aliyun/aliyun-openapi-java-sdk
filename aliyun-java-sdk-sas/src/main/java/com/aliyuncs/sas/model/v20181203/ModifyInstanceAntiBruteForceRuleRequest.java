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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyInstanceAntiBruteForceRuleRequest extends RpcAcsRequest<ModifyInstanceAntiBruteForceRuleResponse> {
	   

	private Long resourceOwnerId;

	private String uuid;

	private String sourceIp;

	private Long newRuleId;
	public ModifyInstanceAntiBruteForceRuleRequest() {
		super("Sas", "2018-12-03", "ModifyInstanceAntiBruteForceRule");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
		if(uuid != null){
			putQueryParameter("Uuid", uuid);
		}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public Long getNewRuleId() {
		return this.newRuleId;
	}

	public void setNewRuleId(Long newRuleId) {
		this.newRuleId = newRuleId;
		if(newRuleId != null){
			putQueryParameter("NewRuleId", newRuleId.toString());
		}
	}

	@Override
	public Class<ModifyInstanceAntiBruteForceRuleResponse> getResponseClass() {
		return ModifyInstanceAntiBruteForceRuleResponse.class;
	}

}
