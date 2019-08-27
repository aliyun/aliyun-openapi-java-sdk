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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.emr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyExecutionPlanJobInfoRequest extends RpcAcsRequest<ModifyExecutionPlanJobInfoResponse> {
	
	public ModifyExecutionPlanJobInfoRequest() {
		super("Emr", "2016-04-08", "ModifyExecutionPlanJobInfo", "emr");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Long resourceOwnerId;

	private String id;

	private List<String> jobIdLists;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id);
		}
	}

	public List<String> getJobIdLists() {
		return this.jobIdLists;
	}

	public void setJobIdLists(List<String> jobIdLists) {
		this.jobIdLists = jobIdLists;	
		if (jobIdLists != null) {
			for (int i = 0; i < jobIdLists.size(); i++) {
				putQueryParameter("JobIdList." + (i + 1) , jobIdLists.get(i));
			}
		}	
	}

	@Override
	public Class<ModifyExecutionPlanJobInfoResponse> getResponseClass() {
		return ModifyExecutionPlanJobInfoResponse.class;
	}

}
