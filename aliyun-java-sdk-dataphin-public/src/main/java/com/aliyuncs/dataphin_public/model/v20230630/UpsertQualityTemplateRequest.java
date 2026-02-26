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
public class UpsertQualityTemplateRequest extends RpcAcsRequest<UpsertQualityTemplateResponse> {
	   

	private Long opTenantId;

	@SerializedName("upsertCommand")
	private UpsertCommand upsertCommand;
	public UpsertQualityTemplateRequest() {
		super("dataphin-public", "2023-06-30", "UpsertQualityTemplate");
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

	public UpsertCommand getUpsertCommand() {
		return this.upsertCommand;
	}

	public void setUpsertCommand(UpsertCommand upsertCommand) {
		this.upsertCommand = upsertCommand;	
		if (upsertCommand != null) {
			putBodyParameter("UpsertCommand" , new Gson().toJson(upsertCommand));
		}	
	}

	public static class UpsertCommand {

		@SerializedName("Owner")
		private String owner;

		@SerializedName("FormPropertyList")
		private List<FormPropertyListItem> formPropertyList;

		@SerializedName("Catalog")
		private String catalog;

		@SerializedName("Name")
		private String name;

		@SerializedName("Description")
		private String description;

		@SerializedName("SupportDataSourceTypeList")
		private List<String> supportDataSourceTypeList;

		@SerializedName("Id")
		private Long id;

		@SerializedName("Type")
		private String type;

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public List<FormPropertyListItem> getFormPropertyList() {
			return this.formPropertyList;
		}

		public void setFormPropertyList(List<FormPropertyListItem> formPropertyList) {
			this.formPropertyList = formPropertyList;
		}

		public String getCatalog() {
			return this.catalog;
		}

		public void setCatalog(String catalog) {
			this.catalog = catalog;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public List<String> getSupportDataSourceTypeList() {
			return this.supportDataSourceTypeList;
		}

		public void setSupportDataSourceTypeList(List<String> supportDataSourceTypeList) {
			this.supportDataSourceTypeList = supportDataSourceTypeList;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public static class FormPropertyListItem {

			@SerializedName("ComponentType")
			private String componentType;

			@SerializedName("Name")
			private String name;

			@SerializedName("Value")
			private String value;

			public String getComponentType() {
				return this.componentType;
			}

			public void setComponentType(String componentType) {
				this.componentType = componentType;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public Class<UpsertQualityTemplateResponse> getResponseClass() {
		return UpsertQualityTemplateResponse.class;
	}

}
