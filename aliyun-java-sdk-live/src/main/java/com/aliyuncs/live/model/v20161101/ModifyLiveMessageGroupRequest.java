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
public class ModifyLiveMessageGroupRequest extends RpcAcsRequest<ModifyLiveMessageGroupResponse> {
	   

	private String groupId;

	private String groupInfo;

	private String dataCenter;

	private Boolean modifyInfo;

	private List<String> adminList;

	private String appId;

	private Boolean modifyAdmin;
	public ModifyLiveMessageGroupRequest() {
		super("live", "2016-11-01", "ModifyLiveMessageGroup", "live");
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

	public String getGroupInfo() {
		return this.groupInfo;
	}

	public void setGroupInfo(String groupInfo) {
		this.groupInfo = groupInfo;
		if(groupInfo != null){
			putQueryParameter("GroupInfo", groupInfo);
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

	public Boolean getModifyInfo() {
		return this.modifyInfo;
	}

	public void setModifyInfo(Boolean modifyInfo) {
		this.modifyInfo = modifyInfo;
		if(modifyInfo != null){
			putQueryParameter("ModifyInfo", modifyInfo.toString());
		}
	}

	public List<String> getAdminList() {
		return this.adminList;
	}

	public void setAdminList(List<String> adminList) {
		this.adminList = adminList;	
		if (adminList != null) {
			String adminListArrVal = "";
			for(int depth1 = 0; depth1 < adminList.size(); depth1++) {
				adminListArrVal += adminList.get(depth1) + ",";
			}
			if (adminListArrVal.length() > 0) {
				adminListArrVal = adminListArrVal.substring(0, adminListArrVal.length() - 1);
			}
			putQueryParameter("AdminList" , adminListArrVal);
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

	public Boolean getModifyAdmin() {
		return this.modifyAdmin;
	}

	public void setModifyAdmin(Boolean modifyAdmin) {
		this.modifyAdmin = modifyAdmin;
		if(modifyAdmin != null){
			putQueryParameter("ModifyAdmin", modifyAdmin.toString());
		}
	}

	@Override
	public Class<ModifyLiveMessageGroupResponse> getResponseClass() {
		return ModifyLiveMessageGroupResponse.class;
	}

}
