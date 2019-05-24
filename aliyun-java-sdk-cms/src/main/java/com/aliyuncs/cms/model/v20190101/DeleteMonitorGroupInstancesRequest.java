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

package com.aliyuncs.cms.model.v20190101;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DeleteMonitorGroupInstancesRequest extends RpcAcsRequest<DeleteMonitorGroupInstancesResponse> {
	
	public DeleteMonitorGroupInstancesRequest() {
		super("Cms", "2019-01-01", "DeleteMonitorGroupInstances", "cms");
	}

	private String instanceIdList;

	private Long groupId;

	private String category;

	public String getInstanceIdList() {
		return this.instanceIdList;
	}

	public void setInstanceIdList(String instanceIdList) {
		this.instanceIdList = instanceIdList;
		if(instanceIdList != null){
			putQueryParameter("InstanceIdList", instanceIdList);
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

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
		if(category != null){
			putQueryParameter("Category", category);
		}
	}

	@Override
	public Class<DeleteMonitorGroupInstancesResponse> getResponseClass() {
		return DeleteMonitorGroupInstancesResponse.class;
	}

}
