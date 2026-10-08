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
public class CheckDataSourceConnectivityOnResourceGroupRequest extends RpcAcsRequest<CheckDataSourceConnectivityOnResourceGroupResponse> {
	   

	private Long opTenantId;

	private String opUserId;

	@SerializedName("checkCommand")
	private CheckCommand checkCommand;
	public CheckDataSourceConnectivityOnResourceGroupRequest() {
		super("dataphin-public", "2023-06-30", "CheckDataSourceConnectivityOnResourceGroup", "1111");
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

	public CheckCommand getCheckCommand() {
		return this.checkCommand;
	}

	public void setCheckCommand(CheckCommand checkCommand) {
		this.checkCommand = checkCommand;	
		if (checkCommand != null) {
			putBodyParameter("CheckCommand" , new Gson().toJson(checkCommand));
		}	
	}

	public static class CheckCommand {

		@SerializedName("ResourceGroupId")
		private String resourceGroupId;

		@SerializedName("ConfigItemList")
		private List<ConfigItemListItem> configItemList;

		@SerializedName("DataSourceId")
		private String dataSourceId;

		@SerializedName("Type")
		private String type;

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public List<ConfigItemListItem> getConfigItemList() {
			return this.configItemList;
		}

		public void setConfigItemList(List<ConfigItemListItem> configItemList) {
			this.configItemList = configItemList;
		}

		public String getDataSourceId() {
			return this.dataSourceId;
		}

		public void setDataSourceId(String dataSourceId) {
			this.dataSourceId = dataSourceId;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public static class ConfigItemListItem {

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
	public Class<CheckDataSourceConnectivityOnResourceGroupResponse> getResponseClass() {
		return CheckDataSourceConnectivityOnResourceGroupResponse.class;
	}

}
