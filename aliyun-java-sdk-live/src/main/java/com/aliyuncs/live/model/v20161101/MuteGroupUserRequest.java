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
public class MuteGroupUserRequest extends RpcAcsRequest<MuteGroupUserResponse> {
	   

	private List<String> muteUserList;

	private String operatorUserId;

	private Integer broadCastType;

	private String groupId;

	private Integer muteTime;

	private String appId;
	public MuteGroupUserRequest() {
		super("live", "2016-11-01", "MuteGroupUser", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getMuteUserList() {
		return this.muteUserList;
	}

	public void setMuteUserList(List<String> muteUserList) {
		this.muteUserList = muteUserList;	
		if (muteUserList != null) {
			String muteUserListArrVal = "";
			for(int depth1 = 0; depth1 < muteUserList.size(); depth1++) {
				muteUserListArrVal += muteUserList.get(depth1) + ",";
			}
			if (muteUserListArrVal.length() > 0) {
				muteUserListArrVal = muteUserListArrVal.substring(0, muteUserListArrVal.length() - 1);
			}
			putBodyParameter("MuteUserList" , muteUserListArrVal);
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

	public Integer getMuteTime() {
		return this.muteTime;
	}

	public void setMuteTime(Integer muteTime) {
		this.muteTime = muteTime;
		if(muteTime != null){
			putBodyParameter("MuteTime", muteTime.toString());
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
	public Class<MuteGroupUserResponse> getResponseClass() {
		return MuteGroupUserResponse.class;
	}

}
