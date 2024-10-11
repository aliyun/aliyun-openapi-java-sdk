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
public class CreateDataSourceRequest extends RpcAcsRequest<CreateDataSourceResponse> {
	   

	private Long opTenantId;

	@SerializedName("createCommand")
	private CreateCommand createCommand;
	public CreateDataSourceRequest() {
		super("dataphin-public", "2023-06-30", "CreateDataSource");
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

	public CreateCommand getCreateCommand() {
		return this.createCommand;
	}

	public void setCreateCommand(CreateCommand createCommand) {
		this.createCommand = createCommand;	
		if (createCommand != null) {
			putBodyParameter("CreateCommand" , new Gson().toJson(createCommand));
		}	
	}

	public static class CreateCommand {

		@SerializedName("ProdDataSourceCreate")
		private ProdDataSourceCreate prodDataSourceCreate;

		@SerializedName("DevDataSourceCreate")
		private DevDataSourceCreate devDataSourceCreate;

		public ProdDataSourceCreate getProdDataSourceCreate() {
			return this.prodDataSourceCreate;
		}

		public void setProdDataSourceCreate(ProdDataSourceCreate prodDataSourceCreate) {
			this.prodDataSourceCreate = prodDataSourceCreate;
		}

		public DevDataSourceCreate getDevDataSourceCreate() {
			return this.devDataSourceCreate;
		}

		public void setDevDataSourceCreate(DevDataSourceCreate devDataSourceCreate) {
			this.devDataSourceCreate = devDataSourceCreate;
		}

		public static class ProdDataSourceCreate {

			@SerializedName("Name")
			private String name;

			@SerializedName("ConfigItemList")
			private List<ConfigItemListItem> configItemList;

			@SerializedName("Description")
			private String description;

			@SerializedName("CheckActivity")
			private Boolean checkActivity;

			@SerializedName("Type")
			private String type;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public List<ConfigItemListItem> getConfigItemList() {
				return this.configItemList;
			}

			public void setConfigItemList(List<ConfigItemListItem> configItemList) {
				this.configItemList = configItemList;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Boolean getCheckActivity() {
				return this.checkActivity;
			}

			public void setCheckActivity(Boolean checkActivity) {
				this.checkActivity = checkActivity;
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

		public static class DevDataSourceCreate {

			@SerializedName("ProdDataSourceId")
			private Long prodDataSourceId;

			@SerializedName("DataSourceCreate")
			private DataSourceCreate dataSourceCreate;

			public Long getProdDataSourceId() {
				return this.prodDataSourceId;
			}

			public void setProdDataSourceId(Long prodDataSourceId) {
				this.prodDataSourceId = prodDataSourceId;
			}

			public DataSourceCreate getDataSourceCreate() {
				return this.dataSourceCreate;
			}

			public void setDataSourceCreate(DataSourceCreate dataSourceCreate) {
				this.dataSourceCreate = dataSourceCreate;
			}

			public static class DataSourceCreate {

				@SerializedName("Name")
				private String name;

				@SerializedName("ConfigItemList")
				private List<ConfigItemListItem> configItemList;

				@SerializedName("Description")
				private String description;

				@SerializedName("CheckActivity")
				private Boolean checkActivity;

				@SerializedName("Type")
				private String type;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public List<ConfigItemListItem> getConfigItemList() {
					return this.configItemList;
				}

				public void setConfigItemList(List<ConfigItemListItem> configItemList) {
					this.configItemList = configItemList;
				}

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public Boolean getCheckActivity() {
					return this.checkActivity;
				}

				public void setCheckActivity(Boolean checkActivity) {
					this.checkActivity = checkActivity;
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
		}
	}

	@Override
	public Class<CreateDataSourceResponse> getResponseClass() {
		return CreateDataSourceResponse.class;
	}

}
