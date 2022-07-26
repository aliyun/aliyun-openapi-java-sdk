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

package com.aliyuncs.oos.model.v20190601;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.oos.transform.v20190601.UpdateStateConfigurationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateStateConfigurationResponse extends AcsResponse {

	private String requestId;

	private List<StateConfigurationItem> stateConfiguration;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<StateConfigurationItem> getStateConfiguration() {
		return this.stateConfiguration;
	}

	public void setStateConfiguration(List<StateConfigurationItem> stateConfiguration) {
		this.stateConfiguration = stateConfiguration;
	}

	public static class StateConfigurationItem {

		private String updateTime;

		private String createTime;

		private String targets;

		private Map<Object,Object> tags;

		private String stateConfigurationId;

		private String scheduleExpression;

		private String templateName;

		private String templateVersion;

		private String configureMode;

		private String scheduleType;

		private String parameters;

		private String description;

		private String resourceGroupId;

		private String templateId;

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getTargets() {
			return this.targets;
		}

		public void setTargets(String targets) {
			this.targets = targets;
		}

		public Map<Object,Object> getTags() {
			return this.tags;
		}

		public void setTags(Map<Object,Object> tags) {
			this.tags = tags;
		}

		public String getStateConfigurationId() {
			return this.stateConfigurationId;
		}

		public void setStateConfigurationId(String stateConfigurationId) {
			this.stateConfigurationId = stateConfigurationId;
		}

		public String getScheduleExpression() {
			return this.scheduleExpression;
		}

		public void setScheduleExpression(String scheduleExpression) {
			this.scheduleExpression = scheduleExpression;
		}

		public String getTemplateName() {
			return this.templateName;
		}

		public void setTemplateName(String templateName) {
			this.templateName = templateName;
		}

		public String getTemplateVersion() {
			return this.templateVersion;
		}

		public void setTemplateVersion(String templateVersion) {
			this.templateVersion = templateVersion;
		}

		public String getConfigureMode() {
			return this.configureMode;
		}

		public void setConfigureMode(String configureMode) {
			this.configureMode = configureMode;
		}

		public String getScheduleType() {
			return this.scheduleType;
		}

		public void setScheduleType(String scheduleType) {
			this.scheduleType = scheduleType;
		}

		public String getParameters() {
			return this.parameters;
		}

		public void setParameters(String parameters) {
			this.parameters = parameters;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(String templateId) {
			this.templateId = templateId;
		}
	}

	@Override
	public UpdateStateConfigurationResponse getInstance(UnmarshallerContext context) {
		return	UpdateStateConfigurationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
