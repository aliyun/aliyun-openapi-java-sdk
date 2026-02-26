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
public class CancelMuteGroupUserRequest extends RpcAcsRequest<CancelMuteGroupUserResponse> {
	   

	private List<String> cancelMuteUserList;

	private String operatorUserId;

	private Integer broadCastType;

	private String groupId;

	private String appId;
	public CancelMuteGroupUserRequest() {
		super("live", "2016-11-01", "CancelMuteGroupUser", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getCancelMuteUserList() {
		return this.cancelMuteUserList;
	}

	public void setCancelMuteUserList(List<String> cancelMuteUserList) {
		this.cancelMuteUserList = cancelMuteUserList;	
		if (cancelMuteUserList != null) {
			String cancelMuteUserListArrVal = "";
			for(int depth1 = 0; depth1 < cancelMuteUserList.size(); depth1++) {
				cancelMuteUserListArrVal += cancelMuteUserList.get(depth1) + ",";
			}
			if (cancelMuteUserListArrVal.length() > 0) {
				cancelMuteUserListArrVal = cancelMuteUserListArrVal.substring(0, cancelMuteUserListArrVal.length() - 1);
			}
			putBodyParameter("CancelMuteUserList" , cancelMuteUserListArrVal);
		}	
	}

	public String getOperatorUserId() {
		return this.operatorUserId;
	}

	public void setOperatorUserId(String operatorUserId) {
		this.operatorUserId = operatorUserId;
		if(operatorUserId != null){
			putBodyParameter("OperatorUserId", operatorUserId);
		}
	}

	public Integer getBroadCastType() {
		return this.broadCastType;
	}

	public void setBroadCastType(Integer broadCastType) {
		this.broadCastType = broadCastType;
		if(broadCastType != null){
			putBodyParameter("BroadCastType", broadCastType.toString());
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
	public Class<CancelMuteGroupUserResponse> getResponseClass() {
		return CancelMuteGroupUserResponse.class;
	}

}
