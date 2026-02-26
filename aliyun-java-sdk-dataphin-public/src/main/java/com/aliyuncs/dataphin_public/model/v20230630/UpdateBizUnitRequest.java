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
public class UpdateBizUnitRequest extends RpcAcsRequest<UpdateBizUnitResponse> {
	   

	private Long opTenantId;

	@SerializedName("updateCommand")
	private UpdateCommand updateCommand;
	public UpdateBizUnitRequest() {
		super("dataphin-public", "2023-06-30", "UpdateBizUnit");
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

	public UpdateCommand getUpdateCommand() {
		return this.updateCommand;
	}

	public void setUpdateCommand(UpdateCommand updateCommand) {
		this.updateCommand = updateCommand;	
		if (updateCommand != null) {
			putBodyParameter("UpdateCommand" , new Gson().toJson(updateCommand));
		}	
	}

	public static class UpdateCommand {

		@SerializedName("BizUnitAccountList")
		private List<BizUnitAccountListItem> bizUnitAccountList;

		@SerializedName("DisplayName")
		private String displayName;

		@SerializedName("Name")
		private String name;

		@SerializedName("Icon")
		private String icon;

		@SerializedName("Description")
		private String description;

		@SerializedName("BizUnitId")
		private Long bizUnitId;

		public List<BizUnitAccountListItem> getBizUnitAccountList() {
			return this.bizUnitAccountList;
		}

		public void setBizUnitAccountList(List<BizUnitAccountListItem> bizUnitAccountList) {
			this.bizUnitAccountList = bizUnitAccountList;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getIcon() {
			return this.icon;
		}

		public void setIcon(String icon) {
			this.icon = icon;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getBizUnitId() {
			return this.bizUnitId;
		}

		public void setBizUnitId(Long bizUnitId) {
			this.bizUnitId = bizUnitId;
		}

		public static class BizUnitAccountListItem {

			@SerializedName("UserId")
			private String userId;

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}
		}
	}

	@Override
	public Class<UpdateBizUnitResponse> getResponseClass() {
		return UpdateBizUnitResponse.class;
	}

}
