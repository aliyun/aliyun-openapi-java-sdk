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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyLiveMessageGroupBandRequest extends RpcAcsRequest<ModifyLiveMessageGroupBandResponse> {
	   

	private Boolean bannedAll;

	private String groupId;

	private List<String> exceptUsers;

	private String dataCenter;

	private String appId;

	private List<String> bannnedUsers;
	public ModifyLiveMessageGroupBandRequest() {
		super("live", "2016-11-01", "ModifyLiveMessageGroupBand", "live");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getBannedAll() {
		return this.bannedAll;
	}

	public void setBannedAll(Boolean bannedAll) {
		this.bannedAll = bannedAll;
		if(bannedAll != null){
			putQueryParameter("BannedAll", bannedAll.toString());
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

	public List<String> getExceptUsers() {
		return this.exceptUsers;
	}

	public void setExceptUsers(List<String> exceptUsers) {
		this.exceptUsers = exceptUsers;	
		if (exceptUsers != null) {
			String exceptUsersArrVal = "";
			for(int depth1 = 0; depth1 < exceptUsers.size(); depth1++) {
				exceptUsersArrVal += exceptUsers.get(depth1) + ",";
			}
			if (exceptUsersArrVal.length() > 0) {
				exceptUsersArrVal = exceptUsersArrVal.substring(0, exceptUsersArrVal.length() - 1);
			}
			putQueryParameter("ExceptUsers" , exceptUsersArrVal);
		}	
	}

	public String getDataCenter() {
		return this.dataCenter;
	}

	public void setDataCenter(String dataCenter) {
		this.dataCenter = dataCenter;
		if(dataCenter != null){
			putQueryParameter("DataCenter", dataCenter);
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	public List<String> getBannnedUsers() {
		return this.bannnedUsers;
	}

	public void setBannnedUsers(List<String> bannnedUsers) {
		this.bannnedUsers = bannnedUsers;	
		if (bannnedUsers != null) {
			String bannnedUsersArrVal = "";
			for(int depth1 = 0; depth1 < bannnedUsers.size(); depth1++) {
				bannnedUsersArrVal += bannnedUsers.get(depth1) + ",";
			}
			if (bannnedUsersArrVal.length() > 0) {
				bannnedUsersArrVal = bannnedUsersArrVal.substring(0, bannnedUsersArrVal.length() - 1);
			}
			putQueryParameter("BannnedUsers" , bannnedUsersArrVal);
		}	
	}

	@Override
	public Class<ModifyLiveMessageGroupBandResponse> getResponseClass() {
		return ModifyLiveMessageGroupBandResponse.class;
	}

}
