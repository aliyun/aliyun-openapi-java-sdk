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
public class RemoveLiveMessageGroupBandRequest extends RpcAcsRequest<RemoveLiveMessageGroupBandResponse> {
	   

	private String groupId;

	private String dataCenter;

	private List<String> unbannedUsers;

	private String appId;
	public RemoveLiveMessageGroupBandRequest() {
		super("live", "2016-11-01", "RemoveLiveMessageGroupBand", "live");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getDataCenter() {
		return this.dataCenter;
	}

	public void setDataCenter(String dataCenter) {
		this.dataCenter = dataCenter;
		if(dataCenter != null){
			putQueryParameter("DataCenter", dataCenter);
		}
	}

	public List<String> getUnbannedUsers() {
		return this.unbannedUsers;
	}

	public void setUnbannedUsers(List<String> unbannedUsers) {
		this.unbannedUsers = unbannedUsers;	
		if (unbannedUsers != null) {
			String unbannedUsersArrVal = "";
			for(int depth1 = 0; depth1 < unbannedUsers.size(); depth1++) {
				unbannedUsersArrVal += unbannedUsers.get(depth1) + ",";
			}
			if (unbannedUsersArrVal.length() > 0) {
				unbannedUsersArrVal = unbannedUsersArrVal.substring(0, unbannedUsersArrVal.length() - 1);
			}
			putQueryParameter("UnbannedUsers" , unbannedUsersArrVal);
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

	@Override
	public Class<RemoveLiveMessageGroupBandResponse> getResponseClass() {
		return RemoveLiveMessageGroupBandResponse.class;
	}

}
