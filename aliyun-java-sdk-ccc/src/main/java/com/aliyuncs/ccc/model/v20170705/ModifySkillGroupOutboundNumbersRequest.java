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

package com.aliyuncs.ccc.model.v20170705;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ccc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifySkillGroupOutboundNumbersRequest extends RpcAcsRequest<ModifySkillGroupOutboundNumbersResponse> {
	   

	private Integer operationType;

	private String instanceId;

	private List<String> outboundPhoneNumberIds;

	private String skillGroupId;
	public ModifySkillGroupOutboundNumbersRequest() {
		super("CCC", "2017-07-05", "ModifySkillGroupOutboundNumbers", "CCC");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getOperationType() {
		return this.operationType;
	}

	public void setOperationType(Integer operationType) {
		this.operationType = operationType;
		if(operationType != null){
			putQueryParameter("OperationType", operationType.toString());
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public List<String> getOutboundPhoneNumberIds() {
		return this.outboundPhoneNumberIds;
	}

	public void setOutboundPhoneNumberIds(List<String> outboundPhoneNumberIds) {
		this.outboundPhoneNumberIds = outboundPhoneNumberIds;	
		if (outboundPhoneNumberIds != null) {
			for (int i = 0; i < outboundPhoneNumberIds.size(); i++) {
				putQueryParameter("OutboundPhoneNumberId." + (i + 1) , outboundPhoneNumberIds.get(i));
			}
		}	
	}

	public String getSkillGroupId() {
		return this.skillGroupId;
	}

	public void setSkillGroupId(String skillGroupId) {
		this.skillGroupId = skillGroupId;
		if(skillGroupId != null){
			putQueryParameter("SkillGroupId", skillGroupId);
		}
	}

	@Override
	public Class<ModifySkillGroupOutboundNumbersResponse> getResponseClass() {
		return ModifySkillGroupOutboundNumbersResponse.class;
	}

}
