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
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteRegisterLineageRequest extends RpcAcsRequest<DeleteRegisterLineageResponse> {
	   

	private Long opTenantId;

	@SerializedName("deleteRegisterLineageCommand")
	private DeleteRegisterLineageCommand deleteRegisterLineageCommand;
	public DeleteRegisterLineageRequest() {
		super("dataphin-public", "2023-06-30", "DeleteRegisterLineage");
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

	public DeleteRegisterLineageCommand getDeleteRegisterLineageCommand() {
		return this.deleteRegisterLineageCommand;
	}

	public void setDeleteRegisterLineageCommand(DeleteRegisterLineageCommand deleteRegisterLineageCommand) {
		this.deleteRegisterLineageCommand = deleteRegisterLineageCommand;	
		if (deleteRegisterLineageCommand != null) {
			putBodyParameter("DeleteRegisterLineageCommand" , new Gson().toJson(deleteRegisterLineageCommand));
		}	
	}

	public static class DeleteRegisterLineageCommand {

		@SerializedName("DetailedLineages")
		private List<DetailedLineagesItem> detailedLineages;

		@SerializedName("TenantId")
		private Long tenantId;

		@SerializedName("Source")
		private Source source;

		@SerializedName("CascadeDeleteLineage")
		private Boolean cascadeDeleteLineage;

		@SerializedName("UserId")
		private String userId;

		@SerializedName("Target")
		private Target target;

		public List<DetailedLineagesItem> getDetailedLineages() {
			return this.detailedLineages;
		}

		public void setDetailedLineages(List<DetailedLineagesItem> detailedLineages) {
			this.detailedLineages = detailedLineages;
		}

		public Long getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(Long tenantId) {
			this.tenantId = tenantId;
		}

		public Source getSource() {
			return this.source;
		}

		public void setSource(Source source) {
			this.source = source;
		}

		public Boolean getCascadeDeleteLineage() {
			return this.cascadeDeleteLineage;
		}

		public void setCascadeDeleteLineage(Boolean cascadeDeleteLineage) {
			this.cascadeDeleteLineage = cascadeDeleteLineage;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public Target getTarget() {
			return this.target;
		}

		public void setTarget(Target target) {
			this.target = target;
		}

		public static class DetailedLineagesItem {

			@SerializedName("IsDirect")
			private Boolean isDirect;

			@SerializedName("Source")
			private Source source;

			@SerializedName("Target")
			private Target target;

			public Boolean getIsDirect() {
				return this.isDirect;
			}

			public void setIsDirect(Boolean isDirect) {
				this.isDirect = isDirect;
			}

			public Source getSource() {
				return this.source;
			}

			public void setSource(Source source) {
				this.source = source;
			}

			public Target getTarget() {
				return this.target;
			}

			public void setTarget(Target target) {
				this.target = target;
			}

			public static class Source {

				@SerializedName("ParentGuid")
				private String parentGuid;

				@SerializedName("Schema")
				private String schema;

				@SerializedName("ExtProperties")
				private Map<String,String> extProperties;

				@SerializedName("Catalog")
				private String catalog;

				@SerializedName("Name")
				private String name;

				@SerializedName("Guid")
				private String guid;

				@SerializedName("Env")
				private String env;

				@SerializedName("MetadataType")
				private String metadataType;

				@SerializedName("ReferenceType")
				private String referenceType;

				public String getParentGuid() {
					return this.parentGuid;
				}

				public void setParentGuid(String parentGuid) {
					this.parentGuid = parentGuid;
				}

				public String getSchema() {
					return this.schema;
				}

				public void setSchema(String schema) {
					this.schema = schema;
				}

				public Map<String,String> getExtProperties() {
					return this.extProperties;
				}

				public void setExtProperties(Map<String,String> extProperties) {
					this.extProperties = extProperties;
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

				public String getGuid() {
					return this.guid;
				}

				public void setGuid(String guid) {
					this.guid = guid;
				}

				public String getEnv() {
					return this.env;
				}

				public void setEnv(String env) {
					this.env = env;
				}

				public String getMetadataType() {
					return this.metadataType;
				}

				public void setMetadataType(String metadataType) {
					this.metadataType = metadataType;
				}

				public String getReferenceType() {
					return this.referenceType;
				}

				public void setReferenceType(String referenceType) {
					this.referenceType = referenceType;
				}
			}

			public static class Target {

				@SerializedName("ParentGuid")
				private String parentGuid;

				@SerializedName("Schema")
				private String schema;

				@SerializedName("ExtProperties")
				private Map<String,String> extProperties;

				@SerializedName("Catalog")
				private String catalog;

				@SerializedName("Name")
				private String name;

				@SerializedName("Guid")
				private String guid;

				@SerializedName("Env")
				private String env;

				@SerializedName("MetadataType")
				private String metadataType;

				@SerializedName("ReferenceType")
				private String referenceType;

				public String getParentGuid() {
					return this.parentGuid;
				}

				public void setParentGuid(String parentGuid) {
					this.parentGuid = parentGuid;
				}

				public String getSchema() {
					return this.schema;
				}

				public void setSchema(String schema) {
					this.schema = schema;
				}

				public Map<String,String> getExtProperties() {
					return this.extProperties;
				}

				public void setExtProperties(Map<String,String> extProperties) {
					this.extProperties = extProperties;
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

				public String getGuid() {
					return this.guid;
				}

				public void setGuid(String guid) {
					this.guid = guid;
				}

				public String getEnv() {
					return this.env;
				}

				public void setEnv(String env) {
					this.env = env;
				}

				public String getMetadataType() {
					return this.metadataType;
				}

				public void setMetadataType(String metadataType) {
					this.metadataType = metadataType;
				}

				public String getReferenceType() {
					return this.referenceType;
				}

				public void setReferenceType(String referenceType) {
					this.referenceType = referenceType;
				}
			}
		}

		public static class Source {

			@SerializedName("Schema")
			private String schema;

			@SerializedName("ExtProperties")
			private Map<String,String> extProperties;

			@SerializedName("MetadataSubType")
			private String metadataSubType;

			@SerializedName("Catalog")
			private String catalog;

			@SerializedName("Name")
			private String name;

			@SerializedName("Guid")
			private String guid;

			@SerializedName("Env")
			private String env;

			@SerializedName("MetadataType")
			private String metadataType;

			@SerializedName("ReferenceType")
			private String referenceType;

			public String getSchema() {
				return this.schema;
			}

			public void setSchema(String schema) {
				this.schema = schema;
			}

			public Map<String,String> getExtProperties() {
				return this.extProperties;
			}

			public void setExtProperties(Map<String,String> extProperties) {
				this.extProperties = extProperties;
			}

			public String getMetadataSubType() {
				return this.metadataSubType;
			}

			public void setMetadataSubType(String metadataSubType) {
				this.metadataSubType = metadataSubType;
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

			public String getGuid() {
				return this.guid;
			}

			public void setGuid(String guid) {
				this.guid = guid;
			}

			public String getEnv() {
				return this.env;
			}

			public void setEnv(String env) {
				this.env = env;
			}

			public String getMetadataType() {
				return this.metadataType;
			}

			public void setMetadataType(String metadataType) {
				this.metadataType = metadataType;
			}

			public String getReferenceType() {
				return this.referenceType;
			}

			public void setReferenceType(String referenceType) {
				this.referenceType = referenceType;
			}
		}

		public static class Target {

			@SerializedName("Schema")
			private String schema;

			@SerializedName("ExtProperties")
			private Map<String,String> extProperties;

			@SerializedName("MetadataSubType")
			private String metadataSubType;

			@SerializedName("Catalog")
			private String catalog;

			@SerializedName("Name")
			private String name;

			@SerializedName("Guid")
			private String guid;

			@SerializedName("Env")
			private String env;

			@SerializedName("MetadataType")
			private String metadataType;

			@SerializedName("ReferenceType")
			private String referenceType;

			public String getSchema() {
				return this.schema;
			}

			public void setSchema(String schema) {
				this.schema = schema;
			}

			public Map<String,String> getExtProperties() {
				return this.extProperties;
			}

			public void setExtProperties(Map<String,String> extProperties) {
				this.extProperties = extProperties;
			}

			public String getMetadataSubType() {
				return this.metadataSubType;
			}

			public void setMetadataSubType(String metadataSubType) {
				this.metadataSubType = metadataSubType;
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

			public String getGuid() {
				return this.guid;
			}

			public void setGuid(String guid) {
				this.guid = guid;
			}

			public String getEnv() {
				return this.env;
			}

			public void setEnv(String env) {
				this.env = env;
			}

			public String getMetadataType() {
				return this.metadataType;
			}

			public void setMetadataType(String metadataType) {
				this.metadataType = metadataType;
			}

			public String getReferenceType() {
				return this.referenceType;
			}

			public void setReferenceType(String referenceType) {
				this.referenceType = referenceType;
			}
		}
	}

	@Override
	public Class<DeleteRegisterLineageResponse> getResponseClass() {
		return DeleteRegisterLineageResponse.class;
	}

}
