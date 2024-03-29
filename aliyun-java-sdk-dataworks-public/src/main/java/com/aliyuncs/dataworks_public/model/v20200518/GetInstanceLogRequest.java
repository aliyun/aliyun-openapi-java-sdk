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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetInstanceLogRequest extends RpcAcsRequest<GetInstanceLogResponse> {
	   

	private String projectEnv;

	private Long instanceId;

	private Long instanceHistoryId;
	public GetInstanceLogRequest() {
		super("dataworks-public", "2020-05-18", "GetInstanceLog");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProjectEnv() {
		return this.projectEnv;
	}

	public void setProjectEnv(String projectEnv) {
		this.projectEnv = projectEnv;
		if(projectEnv != null){
			putBodyParameter("ProjectEnv", projectEnv);
		}
	}

	public Long getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(Long instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId.toString());
		}
	}

	public Long getInstanceHistoryId() {
		return this.instanceHistoryId;
	}

	public void setInstanceHistoryId(Long instanceHistoryId) {
		this.instanceHistoryId = instanceHistoryId;
		if(instanceHistoryId != null){
			putBodyParameter("InstanceHistoryId", instanceHistoryId.toString());
		}
	}

	@Override
	public Class<GetInstanceLogResponse> getResponseClass() {
		return GetInstanceLogResponse.class;
	}

}
