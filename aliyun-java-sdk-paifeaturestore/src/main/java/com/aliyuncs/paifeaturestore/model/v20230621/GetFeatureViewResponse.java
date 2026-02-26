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

package com.aliyuncs.paifeaturestore.model.v20230621;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.paifeaturestore.transform.v20230621.GetFeatureViewResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetFeatureViewResponse extends AcsResponse {

	private String requestId;

	private String projectId;

	private String projectName;

	private String featureEntityName;

	private String name;

	private String owner;

	private String type;

	private String gmtCreateTime;

	private String gmtModifiedTime;

	private String featureEntityId;

	private String joinId;

	private String writeMethod;

	private String registerTable;

	private String registerDatasourceId;

	private String registerDatasourceName;

	private Boolean writeToFeatureDB;

	private Boolean syncOnlineTable;

	private Integer tTL;

	private String config;

	private String gmtSyncTime;

	private String lastSyncConfig;

	private String publishTableScript;

	private String mockTableName;

	private List<FieldsItem> fields;

	private List<String> tags;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getFeatureEntityName() {
		return this.featureEntityName;
	}

	public void setFeatureEntityName(String featureEntityName) {
		this.featureEntityName = featureEntityName;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGmtCreateTime() {
		return this.gmtCreateTime;
	}

	public void setGmtCreateTime(String gmtCreateTime) {
		this.gmtCreateTime = gmtCreateTime;
	}

	public String getGmtModifiedTime() {
		return this.gmtModifiedTime;
	}

	public void setGmtModifiedTime(String gmtModifiedTime) {
		this.gmtModifiedTime = gmtModifiedTime;
	}

	public String getFeatureEntityId() {
		return this.featureEntityId;
	}

	public void setFeatureEntityId(String featureEntityId) {
		this.featureEntityId = featureEntityId;
	}

	public String getJoinId() {
		return this.joinId;
	}

	public void setJoinId(String joinId) {
		this.joinId = joinId;
	}

	public String getWriteMethod() {
		return this.writeMethod;
	}

	public void setWriteMethod(String writeMethod) {
		this.writeMethod = writeMethod;
	}

	public String getRegisterTable() {
		return this.registerTable;
	}

	public void setRegisterTable(String registerTable) {
		this.registerTable = registerTable;
	}

	public String getRegisterDatasourceId() {
		return this.registerDatasourceId;
	}

	public void setRegisterDatasourceId(String registerDatasourceId) {
		this.registerDatasourceId = registerDatasourceId;
	}

	public String getRegisterDatasourceName() {
		return this.registerDatasourceName;
	}

	public void setRegisterDatasourceName(String registerDatasourceName) {
		this.registerDatasourceName = registerDatasourceName;
	}

	public Boolean getWriteToFeatureDB() {
		return this.writeToFeatureDB;
	}

	public void setWriteToFeatureDB(Boolean writeToFeatureDB) {
		this.writeToFeatureDB = writeToFeatureDB;
	}

	public Boolean getSyncOnlineTable() {
		return this.syncOnlineTable;
	}

	public void setSyncOnlineTable(Boolean syncOnlineTable) {
		this.syncOnlineTable = syncOnlineTable;
	}

	public Integer getTTL() {
		return this.tTL;
	}

	public void setTTL(Integer tTL) {
		this.tTL = tTL;
	}

	public String getConfig() {
		return this.config;
	}

	public void setConfig(String config) {
		this.config = config;
	}

	public String getGmtSyncTime() {
		return this.gmtSyncTime;
	}

	public void setGmtSyncTime(String gmtSyncTime) {
		this.gmtSyncTime = gmtSyncTime;
	}

	public String getLastSyncConfig() {
		return this.lastSyncConfig;
	}

	public void setLastSyncConfig(String lastSyncConfig) {
		this.lastSyncConfig = lastSyncConfig;
	}

	public String getPublishTableScript() {
		return this.publishTableScript;
	}

	public void setPublishTableScript(String publishTableScript) {
		this.publishTableScript = publishTableScript;
	}

	public String getMockTableName() {
		return this.mockTableName;
	}

	public void setMockTableName(String mockTableName) {
		this.mockTableName = mockTableName;
	}

	public List<FieldsItem> getFields() {
		return this.fields;
	}

	public void setFields(List<FieldsItem> fields) {
		this.fields = fields;
	}

	public List<String> getTags() {
		return this.tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public static class FieldsItem {

		private String name;

		private String type;

		private List<TransformItem> transform;

		private List<String> attributes;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public List<TransformItem> getTransform() {
			return this.transform;
		}

		public void setTransform(List<TransformItem> transform) {
			this.transform = transform;
		}

		public List<String> getAttributes() {
			return this.attributes;
		}

		public void setAttributes(List<String> attributes) {
			this.attributes = attributes;
		}

		public static class TransformItem {

			private String type;

			private Integer lLMConfigId;

			private List<InputItem> input;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Integer getLLMConfigId() {
				return this.lLMConfigId;
			}

			public void setLLMConfigId(Integer lLMConfigId) {
				this.lLMConfigId = lLMConfigId;
			}

			public List<InputItem> getInput() {
				return this.input;
			}

			public void setInput(List<InputItem> input) {
				this.input = input;
			}

			public static class InputItem {

				private String name;

				private String type;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}
			}
		}
	}

	@Override
	public GetFeatureViewResponse getInstance(UnmarshallerContext context) {
		return	GetFeatureViewResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
