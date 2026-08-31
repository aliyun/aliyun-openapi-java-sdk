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

package com.aliyuncs.dataphin_public.model.v20230630;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateComputeClusterRequest extends RpcAcsRequest<UpdateComputeClusterResponse> {
	   

	private Long opTenantId;

	private String opUserId;

	@SerializedName("clusterConfig")
	private ClusterConfig clusterConfig;

	private Long id;
	public UpdateComputeClusterRequest() {
		super("dataphin-public", "2023-06-30", "UpdateComputeCluster", "Dataphin");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Long getOpTenantId() {
		return this.opTenantId;
	}

	public void setOpTenantId(Long opTenantId) {
		this.opTenantId = opTenantId;
		if(opTenantId != null){
			putQueryParameter("OpTenantId", opTenantId.toString());
		}
	}

	public String getOpUserId() {
		return this.opUserId;
	}

	public void setOpUserId(String opUserId) {
		this.opUserId = opUserId;
		if(opUserId != null){
			putQueryParameter("OpUserId", opUserId);
		}
	}

	public ClusterConfig getClusterConfig() {
		return this.clusterConfig;
	}

	public void setClusterConfig(ClusterConfig clusterConfig) {
		this.clusterConfig = clusterConfig;	
		if (clusterConfig != null) {
			putBodyParameter("ClusterConfig" , new Gson().toJson(clusterConfig));
		}	
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
		}
	}

	public static class ClusterConfig {

		@SerializedName("Des")
		private String des;

		@SerializedName("ClusterAdmins")
		private List<String> clusterAdmins;

		@SerializedName("Name")
		private String name;

		@SerializedName("ClusterSafetyControl")
		private ClusterSafetyControl clusterSafetyControl;

		@SerializedName("ConfigList")
		private List<ConfigListItem> configList;

		@SerializedName("Type")
		private String type;

		@SerializedName("TypeVersion")
		private String typeVersion;

		public String getDes() {
			return this.des;
		}

		public void setDes(String des) {
			this.des = des;
		}

		public List<String> getClusterAdmins() {
			return this.clusterAdmins;
		}

		public void setClusterAdmins(List<String> clusterAdmins) {
			this.clusterAdmins = clusterAdmins;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public ClusterSafetyControl getClusterSafetyControl() {
			return this.clusterSafetyControl;
		}

		public void setClusterSafetyControl(ClusterSafetyControl clusterSafetyControl) {
			this.clusterSafetyControl = clusterSafetyControl;
		}

		public List<ConfigListItem> getConfigList() {
			return this.configList;
		}

		public void setConfigList(List<ConfigListItem> configList) {
			this.configList = configList;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getTypeVersion() {
			return this.typeVersion;
		}

		public void setTypeVersion(String typeVersion) {
			this.typeVersion = typeVersion;
		}

		public static class ClusterSafetyControl {

			@SerializedName("UserIds")
			private List<String> userIds;

			@SerializedName("UserGroupIds")
			private List<String> userGroupIds;

			@SerializedName("ClusterSafetyAuthType")
			private String clusterSafetyAuthType;

			public List<String> getUserIds() {
				return this.userIds;
			}

			public void setUserIds(List<String> userIds) {
				this.userIds = userIds;
			}

			public List<String> getUserGroupIds() {
				return this.userGroupIds;
			}

			public void setUserGroupIds(List<String> userGroupIds) {
				this.userGroupIds = userGroupIds;
			}

			public String getClusterSafetyAuthType() {
				return this.clusterSafetyAuthType;
			}

			public void setClusterSafetyAuthType(String clusterSafetyAuthType) {
				this.clusterSafetyAuthType = clusterSafetyAuthType;
			}
		}

		public static class ConfigListItem {

			@SerializedName("Value")
			private String value;

			@SerializedName("Key")
			private String key;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}
		}
	}

	@Override
	public Class<UpdateComputeClusterResponse> getResponseClass() {
		return UpdateComputeClusterResponse.class;
	}

}
