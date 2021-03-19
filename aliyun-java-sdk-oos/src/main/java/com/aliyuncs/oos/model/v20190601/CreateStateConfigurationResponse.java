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

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.oos.transform.v20190601.CreateStateConfigurationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateStateConfigurationResponse extends AcsResponse {

	private String requestId;

	private StateConfiguration stateConfiguration;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public StateConfiguration getStateConfiguration() {
		return this.stateConfiguration;
	}

	public void setStateConfiguration(StateConfiguration stateConfiguration) {
		this.stateConfiguration = stateConfiguration;
	}

	public static class StateConfiguration {

		private String createTime;

		private String description;

		private String stateConfigurationId;

		private String templateId;

		private String templateName;

		private String templateVersion;

		private Map<Object,Object> parameters;

		private String configureMode;

		private String scheduleType;

		private String scheduleExpression;

		private String targets;

		private Map<Object,Object> tags;

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

		public String getStateConfigurationId() {
			return this.stateConfigurationId;
		}

		public void setStateConfigurationId(String stateConfigurationId) {
			this.stateConfigurationId = stateConfigurationId;
		}

		public String getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(String templateId) {
			this.templateId = templateId;
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

		public Map<Object,Object> getParameters() {
			return this.parameters;
		}

		public void setParameters(Map<Object,Object> parameters) {
			this.parameters = parameters;
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

		public String getScheduleExpression() {
			return this.scheduleExpression;
		}

		public void setScheduleExpression(String scheduleExpression) {
			this.scheduleExpression = scheduleExpression;
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
	}

	@Override
	public CreateStateConfigurationResponse getInstance(UnmarshallerContext context) {
		return	CreateStateConfigurationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
