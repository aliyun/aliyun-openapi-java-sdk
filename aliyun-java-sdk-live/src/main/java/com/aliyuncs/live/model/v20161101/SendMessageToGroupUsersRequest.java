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

package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SendMessageToGroupUsersRequest extends RpcAcsRequest<SendMessageToGroupUsersResponse> {
	   

	@SerializedName("receiverIdList")
	private List<String> receiverIdList;

	private String groupIdcopy;

	private String groupId;

	private Integer type;
	public SendMessageToGroupUsersRequest() {
		super("live", "2016-11-01", "SendMessageToGroupUsers", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getReceiverIdList() {
		return this.receiverIdList;
	}

	public void setReceiverIdList(List<String> receiverIdList) {
		this.receiverIdList = receiverIdList;	
		if (receiverIdList != null) {
			putBodyParameter("ReceiverIdList" , new Gson().toJson(receiverIdList));
		}	
	}

	public String getGroupIdcopy() {
		return this.groupIdcopy;
	}

	public void setGroupIdcopy(String groupIdcopy) {
		this.groupIdcopy = groupIdcopy;
		if(groupIdcopy != null){
			putBodyParameter("GroupId-copy", groupIdcopy);
		}
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putBodyParameter("GroupId", groupId);
		}
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type.toString());
		}
	}

	@Override
	public Class<SendMessageToGroupUsersResponse> getResponseClass() {
		return SendMessageToGroupUsersResponse.class;
	}

}
