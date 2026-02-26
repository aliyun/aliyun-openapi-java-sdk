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
public class CheckDataSourceConnectivityRequest extends RpcAcsRequest<CheckDataSourceConnectivityResponse> {
	   

	private Long opTenantId;

	@SerializedName("checkCommand")
	private CheckCommand checkCommand;
	public CheckDataSourceConnectivityRequest() {
		super("dataphin-public", "2023-06-30", "CheckDataSourceConnectivity");
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

		@SerializedName("ConfigItemList")
		private List<ConfigItemListItem> configItemList;

		@SerializedName("Type")
		private String type;

		public List<ConfigItemListItem> getConfigItemList() {
			return this.configItemList;
		}

		public void setConfigItemList(List<ConfigItemListItem> configItemList) {
			this.configItemList = configItemList;
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
	public Class<CheckDataSourceConnectivityResponse> getResponseClass() {
		return CheckDataSourceConnectivityResponse.class;
	}

}
