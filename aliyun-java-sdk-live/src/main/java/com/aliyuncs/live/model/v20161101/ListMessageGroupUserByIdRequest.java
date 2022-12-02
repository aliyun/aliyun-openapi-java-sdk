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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListMessageGroupUserByIdRequest extends RpcAcsRequest<ListMessageGroupUserByIdResponse> {
	   

	private List<String> userIdList;

	private String groupId;

	private String appId;
	public ListMessageGroupUserByIdRequest() {
		super("live", "2016-11-01", "ListMessageGroupUserById", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getUserIdList() {
		return this.userIdList;
	}

	public void setUserIdList(List<String> userIdList) {
		this.userIdList = userIdList;	
		if (userIdList != null) {
			String userIdListArrVal = "";
			for(int depth1 = 0; depth1 < userIdList.size(); depth1++) {
				userIdListArrVal += userIdList.get(depth1) + ",";
			}
			if (userIdListArrVal.length() > 0) {
				userIdListArrVal = userIdListArrVal.substring(0, userIdListArrVal.length() - 1);
			}
			putBodyParameter("UserIdList" , userIdListArrVal);
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

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putBodyParameter("AppId", appId);
		}
	}

	@Override
	public Class<ListMessageGroupUserByIdResponse> getResponseClass() {
		return ListMessageGroupUserByIdResponse.class;
	}

}
