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
public class UpdateAssetAttributesRequest extends RpcAcsRequest<UpdateAssetAttributesResponse> {
	   

	private Long opTenantId;

	private String opUserId;

	@SerializedName("updateCommand")
	private UpdateCommand updateCommand;
	public UpdateAssetAttributesRequest() {
		super("dataphin-public", "2023-06-30", "UpdateAssetAttributes", "Dataphin");
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

		@SerializedName("AssetAttributeUpdateList")
		private List<AssetAttributeUpdateListItem> assetAttributeUpdateList;

		public List<AssetAttributeUpdateListItem> getAssetAttributeUpdateList() {
			return this.assetAttributeUpdateList;
		}

		public void setAssetAttributeUpdateList(List<AssetAttributeUpdateListItem> assetAttributeUpdateList) {
			this.assetAttributeUpdateList = assetAttributeUpdateList;
		}

		public static class AssetAttributeUpdateListItem {

			@SerializedName("AttributeList")
			private List<AttributeListItem> attributeList;

			@SerializedName("Guid")
			private String guid;

			public List<AttributeListItem> getAttributeList() {
				return this.attributeList;
			}

			public void setAttributeList(List<AttributeListItem> attributeList) {
				this.attributeList = attributeList;
			}

			public String getGuid() {
				return this.guid;
			}

			public void setGuid(String guid) {
				this.guid = guid;
			}

			public static class AttributeListItem {

				@SerializedName("Values")
				private List<String> values;

				@SerializedName("AttributeCode")
				private String attributeCode;

				public List<String> getValues() {
					return this.values;
				}

				public void setValues(List<String> values) {
					this.values = values;
				}

				public String getAttributeCode() {
					return this.attributeCode;
				}

				public void setAttributeCode(String attributeCode) {
					this.attributeCode = attributeCode;
				}
			}
		}
	}

	@Override
	public Class<UpdateAssetAttributesResponse> getResponseClass() {
		return UpdateAssetAttributesResponse.class;
	}

}
