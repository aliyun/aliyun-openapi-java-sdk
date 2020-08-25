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
public class CreateDTXBiztypeRelationRequest extends RpcAcsRequest<CreateDTXBiztypeRelationResponse> {
	   

	private String appName;

	private String state;

	private List<String> actionArrayRepeatLists;

	private String bizType;

	private String instanceId;

	private String desc;
	public CreateDTXBiztypeRelationRequest() {
		super("SOFA", "2019-08-15", "CreateDTXBiztypeRelation", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putBodyParameter("AppName", appName);
		}
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
		if(state != null){
			putBodyParameter("State", state);
		}
	}

	public List<String> getActionArrayRepeatLists() {
		return this.actionArrayRepeatLists;
	}

	public void setActionArrayRepeatLists(List<String> actionArrayRepeatLists) {
		this.actionArrayRepeatLists = actionArrayRepeatLists;	
		if (actionArrayRepeatLists != null) {
			for (int i = 0; i < actionArrayRepeatLists.size(); i++) {
				putBodyParameter("ActionArrayRepeatList." + (i + 1) , actionArrayRepeatLists.get(i));
			}
		}	
	}

	public String getBizType() {
		return this.bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
		if(bizType != null){
			putBodyParameter("BizType", bizType);
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

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
		if(desc != null){
			putBodyParameter("Desc", desc);
		}
	}

	@Override
	public Class<CreateDTXBiztypeRelationResponse> getResponseClass() {
		return CreateDTXBiztypeRelationResponse.class;
	}

}
