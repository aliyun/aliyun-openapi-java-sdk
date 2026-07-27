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
public class PublishKgSchemaRequest extends RpcAcsRequest<PublishKgSchemaResponse> {
	   

	private Long opTenantId;

	@SerializedName("publishCommand")
	private PublishCommand publishCommand;

	private String workspaceId;
	public PublishKgSchemaRequest() {
		super("dataphin-public", "2023-06-30", "PublishKgSchema");
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

	public PublishCommand getPublishCommand() {
		return this.publishCommand;
	}

	public void setPublishCommand(PublishCommand publishCommand) {
		this.publishCommand = publishCommand;	
		if (publishCommand != null) {
			putBodyParameter("PublishCommand" , new Gson().toJson(publishCommand));
		}	
	}

	public String getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
		if(workspaceId != null){
			putQueryParameter("WorkspaceId", workspaceId);
		}
	}

	public static class PublishCommand {

		@SerializedName("Description")
		private String description;

		@SerializedName("DataAdjustmentPolicies")
		private List<DataAdjustmentPoliciesItem> dataAdjustmentPolicies;

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public List<DataAdjustmentPoliciesItem> getDataAdjustmentPolicies() {
			return this.dataAdjustmentPolicies;
		}

		public void setDataAdjustmentPolicies(List<DataAdjustmentPoliciesItem> dataAdjustmentPolicies) {
			this.dataAdjustmentPolicies = dataAdjustmentPolicies;
		}

		public static class DataAdjustmentPoliciesItem {

			@SerializedName("TypeCode")
			private String typeCode;

			@SerializedName("PolicyType")
			private String policyType;

			@SerializedName("Type")
			private String type;

			@SerializedName("BackFillDefaultValuePolicy")
			private BackFillDefaultValuePolicy backFillDefaultValuePolicy;

			public String getTypeCode() {
				return this.typeCode;
			}

			public void setTypeCode(String typeCode) {
				this.typeCode = typeCode;
			}

			public String getPolicyType() {
				return this.policyType;
			}

			public void setPolicyType(String policyType) {
				this.policyType = policyType;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public BackFillDefaultValuePolicy getBackFillDefaultValuePolicy() {
				return this.backFillDefaultValuePolicy;
			}

			public void setBackFillDefaultValuePolicy(BackFillDefaultValuePolicy backFillDefaultValuePolicy) {
				this.backFillDefaultValuePolicy = backFillDefaultValuePolicy;
			}

			public static class BackFillDefaultValuePolicy {

				@SerializedName("DefaultValue")
				private String defaultValue;

				@SerializedName("PropertyCode")
				private String propertyCode;

				public String getDefaultValue() {
					return this.defaultValue;
				}

				public void setDefaultValue(String defaultValue) {
					this.defaultValue = defaultValue;
				}

				public String getPropertyCode() {
					return this.propertyCode;
				}

				public void setPropertyCode(String propertyCode) {
					this.propertyCode = propertyCode;
				}
			}
		}
	}

	@Override
	public Class<PublishKgSchemaResponse> getResponseClass() {
		return PublishKgSchemaResponse.class;
	}

}
