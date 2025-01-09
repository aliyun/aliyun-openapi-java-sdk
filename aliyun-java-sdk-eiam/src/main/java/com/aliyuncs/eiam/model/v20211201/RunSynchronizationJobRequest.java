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

package com.aliyuncs.eiam.model.v20211201;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class RunSynchronizationJobRequest extends RpcAcsRequest<RunSynchronizationJobResponse> {
	   

	private String targetId;

	private String targetType;

	private String description;

	private SynchronizationScopeConfig synchronizationScopeConfig;

	private String instanceId;

	private Boolean passwordInitialization;

	private List<String> userIdentityTypes;
	public RunSynchronizationJobRequest() {
		super("Eiam", "2021-12-01", "RunSynchronizationJob", "eiam");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getTargetId() {
		return this.targetId;
	}

	public void setTargetId(String targetId) {
		this.targetId = targetId;
		if(targetId != null){
			putQueryParameter("TargetId", targetId);
		}
	}

	public String getTargetType() {
		return this.targetType;
	}

	public void setTargetType(String targetType) {
		this.targetType = targetType;
		if(targetType != null){
			putQueryParameter("TargetType", targetType);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public SynchronizationScopeConfig getSynchronizationScopeConfig() {
		return this.synchronizationScopeConfig;
	}

	public void setSynchronizationScopeConfig(SynchronizationScopeConfig synchronizationScopeConfig) {
		this.synchronizationScopeConfig = synchronizationScopeConfig;	
		if (synchronizationScopeConfig != null) {
			
				if (synchronizationScopeConfig.getOrganizationalUnitIds() != null) {
					for (int depth1 = 0; depth1 < synchronizationScopeConfig.getOrganizationalUnitIds().size(); depth1++) {
						putQueryParameter("SynchronizationScopeConfig.OrganizationalUnitIds." + (depth1 + 1) , synchronizationScopeConfig.getOrganizationalUnitIds().get(depth1));
					}
				}
				if (synchronizationScopeConfig.getUserIds() != null) {
					for (int depth1 = 0; depth1 < synchronizationScopeConfig.getUserIds().size(); depth1++) {
						putQueryParameter("SynchronizationScopeConfig.UserIds." + (depth1 + 1) , synchronizationScopeConfig.getUserIds().get(depth1));
					}
				}
				if (synchronizationScopeConfig.getGroupIds() != null) {
					for (int depth1 = 0; depth1 < synchronizationScopeConfig.getGroupIds().size(); depth1++) {
						putQueryParameter("SynchronizationScopeConfig.GroupIds." + (depth1 + 1) , synchronizationScopeConfig.getGroupIds().get(depth1));
					}
				}
		}	
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public Boolean getPasswordInitialization() {
		return this.passwordInitialization;
	}

	public void setPasswordInitialization(Boolean passwordInitialization) {
		this.passwordInitialization = passwordInitialization;
		if(passwordInitialization != null){
			putQueryParameter("PasswordInitialization", passwordInitialization.toString());
		}
	}

	public List<String> getUserIdentityTypes() {
		return this.userIdentityTypes;
	}

	public void setUserIdentityTypes(List<String> userIdentityTypes) {
		this.userIdentityTypes = userIdentityTypes;	
		if (userIdentityTypes != null) {
			for (int depth1 = 0; depth1 < userIdentityTypes.size(); depth1++) {
				putQueryParameter("UserIdentityTypes." + (depth1 + 1) , userIdentityTypes.get(depth1));
			}
		}	
	}

	public static class SynchronizationScopeConfig {

		private List<String> organizationalUnitIds;

		private List<String> userIds;

		private List<String> groupIds;

		public List<String> getOrganizationalUnitIds() {
			return this.organizationalUnitIds;
		}

		public void setOrganizationalUnitIds(List<String> organizationalUnitIds) {
			this.organizationalUnitIds = organizationalUnitIds;
		}

		public List<String> getUserIds() {
			return this.userIds;
		}

		public void setUserIds(List<String> userIds) {
			this.userIds = userIds;
		}

		public List<String> getGroupIds() {
			return this.groupIds;
		}

		public void setGroupIds(List<String> groupIds) {
			this.groupIds = groupIds;
		}
	}

	@Override
	public Class<RunSynchronizationJobResponse> getResponseClass() {
		return RunSynchronizationJobResponse.class;
	}

}
