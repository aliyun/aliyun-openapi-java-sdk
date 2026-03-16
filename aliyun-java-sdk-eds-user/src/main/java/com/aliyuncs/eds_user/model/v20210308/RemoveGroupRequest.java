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

package com.aliyuncs.eds_user.model.v20210308;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.eds_user.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RemoveGroupRequest extends RpcAcsRequest<RemoveGroupResponse> {
	   

	private String businessChannel;

	private String groupId;

	private List<String> groupIds;
	public RemoveGroupRequest() {
		super("eds-user", "2021-03-08", "RemoveGroup", "eds-user");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getBusinessChannel() {
		return this.businessChannel;
	}

	public void setBusinessChannel(String businessChannel) {
		this.businessChannel = businessChannel;
		if(businessChannel != null){
			putQueryParameter("BusinessChannel", businessChannel);
		}
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
		}
	}

	public List<String> getGroupIds() {
		return this.groupIds;
	}

	public void setGroupIds(List<String> groupIds) {
		this.groupIds = groupIds;	
		if (groupIds != null) {
			for (int depth1 = 0; depth1 < groupIds.size(); depth1++) {
				putQueryParameter("GroupIds." + (depth1 + 1) , groupIds.get(depth1));
			}
		}	
	}

	@Override
	public Class<RemoveGroupResponse> getResponseClass() {
		return RemoveGroupResponse.class;
	}

}
