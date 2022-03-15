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
import com.aliyuncs.miniapplcdp.transform.v20200113.RestoreModelResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RestoreModelResponse extends AcsResponse {

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

		private String appId;

		private Map<Object,Object> content;

		private String createTime;

		private String description;

		private String id;

		private String linkModelId;

		private String linkModuleId;

		private Boolean linked;

		private String modelId;

		private String modifiedTime;

		private String moduleId;

		private String modelName;

		private Map<Object,Object> props;

		private Integer revision;

		private String schemaVersion;

		private String modelStatus;

		private String subType;

		private String modelType;

		private String visibility;

		private List<Map<Object,Object>> attributes;

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public Map<Object,Object> getContent() {
			return this.content;
		}

		public void setContent(Map<Object,Object> content) {
			this.content = content;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getLinkModelId() {
			return this.linkModelId;
		}

		public void setLinkModelId(String linkModelId) {
			this.linkModelId = linkModelId;
		}

		public String getLinkModuleId() {
			return this.linkModuleId;
		}

		public void setLinkModuleId(String linkModuleId) {
			this.linkModuleId = linkModuleId;
		}

		public Boolean getLinked() {
			return this.linked;
		}

		public void setLinked(Boolean linked) {
			this.linked = linked;
		}

		public String getModelId() {
			return this.modelId;
		}

		public void setModelId(String modelId) {
			this.modelId = modelId;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public String getModuleId() {
			return this.moduleId;
		}

		public void setModuleId(String moduleId) {
			this.moduleId = moduleId;
		}

		public String getModelName() {
			return this.modelName;
		}

		public void setModelName(String modelName) {
			this.modelName = modelName;
		}

		public Map<Object,Object> getProps() {
			return this.props;
		}

		public void setProps(Map<Object,Object> props) {
			this.props = props;
		}

		public Integer getRevision() {
			return this.revision;
		}

		public void setRevision(Integer revision) {
			this.revision = revision;
		}

		public String getSchemaVersion() {
			return this.schemaVersion;
		}

		public void setSchemaVersion(String schemaVersion) {
			this.schemaVersion = schemaVersion;
		}

		public String getModelStatus() {
			return this.modelStatus;
		}

		public void setModelStatus(String modelStatus) {
			this.modelStatus = modelStatus;
		}

		public String getSubType() {
			return this.subType;
		}

		public void setSubType(String subType) {
			this.subType = subType;
		}

		public String getModelType() {
			return this.modelType;
		}

		public void setModelType(String modelType) {
			this.modelType = modelType;
		}

		public String getVisibility() {
			return this.visibility;
		}

		public void setVisibility(String visibility) {
			this.visibility = visibility;
		}

		public List<Map<Object,Object>> getAttributes() {
			return this.attributes;
		}

		public void setAttributes(List<Map<Object,Object>> attributes) {
			this.attributes = attributes;
		}
	}

	@Override
	public RestoreModelResponse getInstance(UnmarshallerContext context) {
		return	RestoreModelResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
