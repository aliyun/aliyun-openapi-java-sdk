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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class PushDTXWhitelistRequest extends RpcAcsRequest<PushDTXWhitelistResponse> {
	   

	private Long type;

	private Long refId;

	private List<String> pushTargetRepeatLists;

	private String instanceId;
	public PushDTXWhitelistRequest() {
		super("SOFA", "2019-08-15", "PushDTXWhitelist", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getType() {
		return this.type;
	}

	public void setType(Long type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type.toString());
		}
	}

	public Long getRefId() {
		return this.refId;
	}

	public void setRefId(Long refId) {
		this.refId = refId;
		if(refId != null){
			putBodyParameter("RefId", refId.toString());
		}
	}

	public List<String> getPushTargetRepeatLists() {
		return this.pushTargetRepeatLists;
	}

	public void setPushTargetRepeatLists(List<String> pushTargetRepeatLists) {
		this.pushTargetRepeatLists = pushTargetRepeatLists;	
		if (pushTargetRepeatLists != null) {
			for (int i = 0; i < pushTargetRepeatLists.size(); i++) {
				putBodyParameter("PushTargetRepeatList." + (i + 1) , pushTargetRepeatLists.get(i));
			}
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

	@Override
	public Class<PushDTXWhitelistResponse> getResponseClass() {
		return PushDTXWhitelistResponse.class;
	}

}
