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
public class CreateSecurityClassifyRequest extends RpcAcsRequest<CreateSecurityClassifyResponse> {
	   

	private Long opTenantId;

	@SerializedName("createCommand")
	private CreateCommand createCommand;
	public CreateSecurityClassifyRequest() {
		super("dataphin-public", "2023-06-30", "CreateSecurityClassify");
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

		@SerializedName("FeatureNameList")
		private List<String> featureNameList;

		@SerializedName("AdvancedConditionList")
		private List<AdvancedConditionListItem> advancedConditionList;

		@SerializedName("Name")
		private String name;

		@SerializedName("ParentPath")
		private String parentPath;

		@SerializedName("Description")
		private String description;

		@SerializedName("Abbreviation")
		private String abbreviation;

		@SerializedName("LevelName")
		private String levelName;

		@SerializedName("Priority")
		private Integer priority;

		@SerializedName("Status")
		private String status;

		public List<String> getFeatureNameList() {
			return this.featureNameList;
		}

		public void setFeatureNameList(List<String> featureNameList) {
			this.featureNameList = featureNameList;
		}

		public List<AdvancedConditionListItem> getAdvancedConditionList() {
			return this.advancedConditionList;
		}

		public void setAdvancedConditionList(List<AdvancedConditionListItem> advancedConditionList) {
			this.advancedConditionList = advancedConditionList;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getParentPath() {
			return this.parentPath;
		}

		public void setParentPath(String parentPath) {
			this.parentPath = parentPath;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getAbbreviation() {
			return this.abbreviation;
		}

		public void setAbbreviation(String abbreviation) {
			this.abbreviation = abbreviation;
		}

		public String getLevelName() {
			return this.levelName;
		}

		public void setLevelName(String levelName) {
			this.levelName = levelName;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public static class AdvancedConditionListItem {

			@SerializedName("Operate")
			private String operate;

			@SerializedName("Property")
			private String property;

			@SerializedName("ValueList")
			private List<String> valueList;

			@SerializedName("OptionList")
			private List<OptionListItem> optionList;

			@SerializedName("Id")
			private String id;

			@SerializedName("ParentId")
			private String parentId;

			@SerializedName("Relation")
			private String relation;

			public String getOperate() {
				return this.operate;
			}

			public void setOperate(String operate) {
				this.operate = operate;
			}

			public String getProperty() {
				return this.property;
			}

			public void setProperty(String property) {
				this.property = property;
			}

			public List<String> getValueList() {
				return this.valueList;
			}

			public void setValueList(List<String> valueList) {
				this.valueList = valueList;
			}

			public List<OptionListItem> getOptionList() {
				return this.optionList;
			}

			public void setOptionList(List<OptionListItem> optionList) {
				this.optionList = optionList;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getParentId() {
				return this.parentId;
			}

			public void setParentId(String parentId) {
				this.parentId = parentId;
			}

			public String getRelation() {
				return this.relation;
			}

			public void setRelation(String relation) {
				this.relation = relation;
			}

			public static class OptionListItem {

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

	@Override
	public Class<CreateSecurityClassifyResponse> getResponseClass() {
		return CreateSecurityClassifyResponse.class;
	}

}
