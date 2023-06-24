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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateAgentlessScanTaskRequest extends RpcAcsRequest<CreateAgentlessScanTaskResponse> {
	   

	private Integer targetType;

	private List<String> uuidLists;

	private Integer autoDeleteDays;
	public CreateAgentlessScanTaskRequest() {
		super("Sas", "2018-12-03", "CreateAgentlessScanTask", "sas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getTargetType() {
		return this.targetType;
	}

	public void setTargetType(Integer targetType) {
		this.targetType = targetType;
		if(targetType != null){
			putQueryParameter("TargetType", targetType.toString());
		}
	}

	public List<String> getUuidLists() {
		return this.uuidLists;
	}

	public void setUuidLists(List<String> uuidLists) {
		this.uuidLists = uuidLists;	
		if (uuidLists != null) {
			for (int i = 0; i < uuidLists.size(); i++) {
				putQueryParameter("UuidList." + (i + 1) , uuidLists.get(i));
			}
		}	
	}

	public Integer getAutoDeleteDays() {
		return this.autoDeleteDays;
	}

	public void setAutoDeleteDays(Integer autoDeleteDays) {
		this.autoDeleteDays = autoDeleteDays;
		if(autoDeleteDays != null){
			putQueryParameter("AutoDeleteDays", autoDeleteDays.toString());
		}
	}

	@Override
	public Class<CreateAgentlessScanTaskResponse> getResponseClass() {
		return CreateAgentlessScanTaskResponse.class;
	}

}
