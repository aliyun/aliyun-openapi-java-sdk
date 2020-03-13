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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddRmsAlarmBlacklistRequest extends RpcAcsRequest<AddRmsAlarmBlacklistResponse> {
	   

	private List<Data> datas;

	private String envJsonStr;
	public AddRmsAlarmBlacklistRequest() {
		super("SOFA", "2019-08-15", "AddRmsAlarmBlacklist", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Data> getDatas() {
		return this.datas;
	}

	public void setDatas(List<Data> datas) {
		this.datas = datas;	
		if (datas != null) {
			for (int depth1 = 0; depth1 < datas.size(); depth1++) {
				putBodyParameter("Data." + (depth1 + 1) + ".ValidStartTime" , datas.get(depth1).getValidStartTime());
				putBodyParameter("Data." + (depth1 + 1) + ".ValidEndTime" , datas.get(depth1).getValidEndTime());
				putBodyParameter("Data." + (depth1 + 1) + ".RuleType" , datas.get(depth1).getRuleType());
				putBodyParameter("Data." + (depth1 + 1) + ".ResName" , datas.get(depth1).getResName());
				putBodyParameter("Data." + (depth1 + 1) + ".ResId" , datas.get(depth1).getResId());
				putBodyParameter("Data." + (depth1 + 1) + ".UserId" , datas.get(depth1).getUserId());
				putBodyParameter("Data." + (depth1 + 1) + ".ResType" , datas.get(depth1).getResType());
				putBodyParameter("Data." + (depth1 + 1) + ".UtcCreated" , datas.get(depth1).getUtcCreated());
				putBodyParameter("Data." + (depth1 + 1) + ".ApplyTargetId" , datas.get(depth1).getApplyTargetId());
				putBodyParameter("Data." + (depth1 + 1) + ".TenantId" , datas.get(depth1).getTenantId());
				putBodyParameter("Data." + (depth1 + 1) + ".Id" , datas.get(depth1).getId());
				putBodyParameter("Data." + (depth1 + 1) + ".UtcModified" , datas.get(depth1).getUtcModified());
				putBodyParameter("Data." + (depth1 + 1) + ".UserName" , datas.get(depth1).getUserName());
				putBodyParameter("Data." + (depth1 + 1) + ".WorkspaceId" , datas.get(depth1).getWorkspaceId());
			}
		}	
	}

	public String getEnvJsonStr() {
		return this.envJsonStr;
	}

	public void setEnvJsonStr(String envJsonStr) {
		this.envJsonStr = envJsonStr;
		if(envJsonStr != null){
			putBodyParameter("EnvJsonStr", envJsonStr);
		}
	}

	public static class Data {

		private String validStartTime;

		private String validEndTime;

		private String ruleType;

		private String resName;

		private String resId;

		private String userId;

		private String resType;

		private String utcCreated;

		private String applyTargetId;

		private String tenantId;

		private String id;

		private String utcModified;

		private String userName;

		private String workspaceId;

		public String getValidStartTime() {
			return this.validStartTime;
		}

		public void setValidStartTime(String validStartTime) {
			this.validStartTime = validStartTime;
		}

		public String getValidEndTime() {
			return this.validEndTime;
		}

		public void setValidEndTime(String validEndTime) {
			this.validEndTime = validEndTime;
		}

		public String getRuleType() {
			return this.ruleType;
		}

		public void setRuleType(String ruleType) {
			this.ruleType = ruleType;
		}

		public String getResName() {
			return this.resName;
		}

		public void setResName(String resName) {
			this.resName = resName;
		}

		public String getResId() {
			return this.resId;
		}

		public void setResId(String resId) {
			this.resId = resId;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getResType() {
			return this.resType;
		}

		public void setResType(String resType) {
			this.resType = resType;
		}

		public String getUtcCreated() {
			return this.utcCreated;
		}

		public void setUtcCreated(String utcCreated) {
			this.utcCreated = utcCreated;
		}

		public String getApplyTargetId() {
			return this.applyTargetId;
		}

		public void setApplyTargetId(String applyTargetId) {
			this.applyTargetId = applyTargetId;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getUtcModified() {
			return this.utcModified;
		}

		public void setUtcModified(String utcModified) {
			this.utcModified = utcModified;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getWorkspaceId() {
			return this.workspaceId;
		}

		public void setWorkspaceId(String workspaceId) {
			this.workspaceId = workspaceId;
		}
	}

	@Override
	public Class<AddRmsAlarmBlacklistResponse> getResponseClass() {
		return AddRmsAlarmBlacklistResponse.class;
	}

}
