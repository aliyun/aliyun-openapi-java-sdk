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
public class JoinTSJobGroupsRequest extends RpcAcsRequest<JoinTSJobGroupsResponse> {
	   

	private List<Long> jobIdLists;

	private Long groupId;

	private String instanceId;
	public JoinTSJobGroupsRequest() {
		super("SOFA", "2019-08-15", "JoinTSJobGroups", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Long> getJobIdLists() {
		return this.jobIdLists;
	}

	public void setJobIdLists(List<Long> jobIdLists) {
		this.jobIdLists = jobIdLists;	
		if (jobIdLists != null) {
			for (int i = 0; i < jobIdLists.size(); i++) {
				putBodyParameter("JobIdList." + (i + 1) , jobIdLists.get(i));
			}
		}	
	}

	public Long getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putBodyParameter("GroupId", groupId.toString());
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
	public Class<JoinTSJobGroupsResponse> getResponseClass() {
		return JoinTSJobGroupsResponse.class;
	}

}
