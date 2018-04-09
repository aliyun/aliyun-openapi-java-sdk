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

package com.aliyuncs.cms.model.v20180308;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class UpdateMyGroupInstancesRequest extends RpcAcsRequest<UpdateMyGroupInstancesResponse> {
	
	public UpdateMyGroupInstancesRequest() {
		super("Cms", "2018-03-08", "UpdateMyGroupInstances", "cms");
	}

	private String instances;

	private Long groupId;

	public String getInstances() {
		return this.instances;
	}

	public void setInstances(String instances) {
		this.instances = instances;
		if(instances != null){
			putQueryParameter("Instances", instances);
		}
	}

	public Long getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId.toString());
		}
	}

	@Override
	public Class<UpdateMyGroupInstancesResponse> getResponseClass() {
		return UpdateMyGroupInstancesResponse.class;
	}

}
