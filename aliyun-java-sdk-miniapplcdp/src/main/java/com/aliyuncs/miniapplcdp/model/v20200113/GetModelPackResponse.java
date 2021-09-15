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

package com.aliyuncs.miniapplcdp.model.v20200113;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.miniapplcdp.transform.v20200113.GetModelPackResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetModelPackResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<DataModelsItem> dataModels;

		private List<PageModelsItem> pageModels;

		private List<LogicModelsItem> logicModels;

		private AppModel appModel;

		public List<DataModelsItem> getDataModels() {
			return this.dataModels;
		}

		public void setDataModels(List<DataModelsItem> dataModels) {
			this.dataModels = dataModels;
		}

		public List<PageModelsItem> getPageModels() {
			return this.pageModels;
		}

		public void setPageModels(List<PageModelsItem> pageModels) {
			this.pageModels = pageModels;
		}

		public List<LogicModelsItem> getLogicModels() {
			return this.logicModels;
		}

		public void setLogicModels(List<LogicModelsItem> logicModels) {
			this.logicModels = logicModels;
		}

		public AppModel getAppModel() {
			return this.appModel;
		}

		public void setAppModel(AppModel appModel) {
			this.appModel = appModel;
		}

		public static class DataModelsItem {

			private String createTime;

			private String modelType;

			private String subType;

			private Integer revision;

			private String modifiedTime;

			private String description;

			private String schemaVersion;

			private String appId;

			private Map<Object,Object> props;

			private String modelStatus;

			private String modelName;

			private Map<Object,Object> content;

			private String modelId;

			private List<Map<Object,Object>> attributes;

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getModelType() {
				return this.modelType;
			}

			public void setModelType(String modelType) {
				this.modelType = modelType;
			}

			public String getSubType() {
				return this.subType;
			}

			public void setSubType(String subType) {
				this.subType = subType;
			}

			public Integer getRevision() {
				return this.revision;
			}

			public void setRevision(Integer revision) {
				this.revision = revision;
			}

			public String getModifiedTime() {
				return this.modifiedTime;
			}

			public void setModifiedTime(String modifiedTime) {
				this.modifiedTime = modifiedTime;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getSchemaVersion() {
				return this.schemaVersion;
			}

			public void setSchemaVersion(String schemaVersion) {
				this.schemaVersion = schemaVersion;
			}

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public Map<Object,Object> getProps() {
				return this.props;
			}

			public void setProps(Map<Object,Object> props) {
				this.props = props;
			}

			public String getModelStatus() {
				return this.modelStatus;
			}

			public void setModelStatus(String modelStatus) {
				this.modelStatus = modelStatus;
			}

			public String getModelName() {
				return this.modelName;
			}

			public void setModelName(String modelName) {
				this.modelName = modelName;
			}

			public Map<Object,Object> getContent() {
				return this.content;
			}

			public void setContent(Map<Object,Object> content) {
				this.content = content;
			}

			public String getModelId() {
				return this.modelId;
			}

			public void setModelId(String modelId) {
				this.modelId = modelId;
			}

			public List<Map<Object,Object>> getAttributes() {
				return this.attributes;
			}

			public void setAttributes(List<Map<Object,Object>> attributes) {
				this.attributes = attributes;
			}
		}

		public static class PageModelsItem {

			private String createTime;

			private String modelType;

			private String subType;

			private Integer revision;

			private String modifiedTime;

			private String description;

			private String schemaVersion;

			private String appId;

			private Map<Object,Object> props;

			private String modelStatus;

			private String modelName;

			private Map<Object,Object> content;

			private String modelId;

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getModelType() {
				return this.modelType;
			}

			public void setModelType(String modelType) {
				this.modelType = modelType;
			}

			public String getSubType() {
				return this.subType;
			}

			public void setSubType(String subType) {
				this.subType = subType;
			}

			public Integer getRevision() {
				return this.revision;
			}

			public void setRevision(Integer revision) {
				this.revision = revision;
			}

			public String getModifiedTime() {
				return this.modifiedTime;
			}

			public void setModifiedTime(String modifiedTime) {
				this.modifiedTime = modifiedTime;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getSchemaVersion() {
				return this.schemaVersion;
			}

			public void setSchemaVersion(String schemaVersion) {
				this.schemaVersion = schemaVersion;
			}

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public Map<Object,Object> getProps() {
				return this.props;
			}

			public void setProps(Map<Object,Object> props) {
				this.props = props;
			}

			public String getModelStatus() {
				return this.modelStatus;
			}

			public void setModelStatus(String modelStatus) {
				this.modelStatus = modelStatus;
			}

			public String getModelName() {
				return this.modelName;
			}

			public void setModelName(String modelName) {
				this.modelName = modelName;
			}

			public Map<Object,Object> getContent() {
				return this.content;
			}

			public void setContent(Map<Object,Object> content) {
				this.content = content;
			}

			public String getModelId() {
				return this.modelId;
			}

			public void setModelId(String modelId) {
				this.modelId = modelId;
			}
		}

		public static class LogicModelsItem {

			private String createTime;

			private String modelType;

			private String subType;

			private Integer revision;

			private String modifiedTime;

			private String description;

			private String schemaVersion;

			private String appId;

			private Map<Object,Object> props;

			private String modelStatus;

			private String modelName;

			private Map<Object,Object> content;

			private String modelId;

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getModelType() {
				return this.modelType;
			}

			public void setModelType(String modelType) {
				this.modelType = modelType;
			}

			public String getSubType() {
				return this.subType;
			}

			public void setSubType(String subType) {
				this.subType = subType;
			}

			public Integer getRevision() {
				return this.revision;
			}

			public void setRevision(Integer revision) {
				this.revision = revision;
			}

			public String getModifiedTime() {
				return this.modifiedTime;
			}

			public void setModifiedTime(String modifiedTime) {
				this.modifiedTime = modifiedTime;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getSchemaVersion() {
				return this.schemaVersion;
			}

			public void setSchemaVersion(String schemaVersion) {
				this.schemaVersion = schemaVersion;
			}

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public Map<Object,Object> getProps() {
				return this.props;
			}

			public void setProps(Map<Object,Object> props) {
				this.props = props;
			}

			public String getModelStatus() {
				return this.modelStatus;
			}

			public void setModelStatus(String modelStatus) {
				this.modelStatus = modelStatus;
			}

			public String getModelName() {
				return this.modelName;
			}

			public void setModelName(String modelName) {
				this.modelName = modelName;
			}

			public Map<Object,Object> getContent() {
				return this.content;
			}

			public void setContent(Map<Object,Object> content) {
				this.content = content;
			}

			public String getModelId() {
				return this.modelId;
			}

			public void setModelId(String modelId) {
				this.modelId = modelId;
			}
		}

		public static class AppModel {

			private String createTime;

			private String modelType;

			private String subType;

			private Integer revision;

			private String modifiedTime;

			private String description;

			private String schemaVersion;

			private String appId;

			private Map<Object,Object> props;

			private String modelStatus;

			private String modelName;

			private Map<Object,Object> content;

			private String modelId;

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getModelType() {
				return this.modelType;
			}

			public void setModelType(String modelType) {
				this.modelType = modelType;
			}

			public String getSubType() {
				return this.subType;
			}

			public void setSubType(String subType) {
				this.subType = subType;
			}

			public Integer getRevision() {
				return this.revision;
			}

			public void setRevision(Integer revision) {
				this.revision = revision;
			}

			public String getModifiedTime() {
				return this.modifiedTime;
			}

			public void setModifiedTime(String modifiedTime) {
				this.modifiedTime = modifiedTime;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getSchemaVersion() {
				return this.schemaVersion;
			}

			public void setSchemaVersion(String schemaVersion) {
				this.schemaVersion = schemaVersion;
			}

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public Map<Object,Object> getProps() {
				return this.props;
			}

			public void setProps(Map<Object,Object> props) {
				this.props = props;
			}

			public String getModelStatus() {
				return this.modelStatus;
			}

			public void setModelStatus(String modelStatus) {
				this.modelStatus = modelStatus;
			}

			public String getModelName() {
				return this.modelName;
			}

			public void setModelName(String modelName) {
				this.modelName = modelName;
			}

			public Map<Object,Object> getContent() {
				return this.content;
			}

			public void setContent(Map<Object,Object> content) {
				this.content = content;
			}

			public String getModelId() {
				return this.modelId;
			}

			public void setModelId(String modelId) {
				this.modelId = modelId;
			}
		}
	}

	@Override
	public GetModelPackResponse getInstance(UnmarshallerContext context) {
		return	GetModelPackResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
