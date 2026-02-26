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

package com.aliyuncs.ros.model.v20190910;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ros.transform.v20190910.PreviewStackResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PreviewStackResponse extends AcsResponse {

	private String requestId;

	private Stack stack;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Stack getStack() {
		return this.stack;
	}

	public void setStack(Stack stack) {
		this.stack = stack;
	}

	public static class Stack {

		private String templateDescription;

		private String description;

		private Boolean disableRollback;

		private String stackName;

		private Integer timeoutInMinutes;

		private Map<Object,Object> stackPolicyBody;

		private String regionId;

		private List<Parameter> parameters;

		private List<Resource> resources;

		private Log log;

		public String getTemplateDescription() {
			return this.templateDescription;
		}

		public void setTemplateDescription(String templateDescription) {
			this.templateDescription = templateDescription;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Boolean getDisableRollback() {
			return this.disableRollback;
		}

		public void setDisableRollback(Boolean disableRollback) {
			this.disableRollback = disableRollback;
		}

		public String getStackName() {
			return this.stackName;
		}

		public void setStackName(String stackName) {
			this.stackName = stackName;
		}

		public Integer getTimeoutInMinutes() {
			return this.timeoutInMinutes;
		}

		public void setTimeoutInMinutes(Integer timeoutInMinutes) {
			this.timeoutInMinutes = timeoutInMinutes;
		}

		public Map<Object,Object> getStackPolicyBody() {
			return this.stackPolicyBody;
		}

		public void setStackPolicyBody(Map<Object,Object> stackPolicyBody) {
			this.stackPolicyBody = stackPolicyBody;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public List<Parameter> getParameters() {
			return this.parameters;
		}

		public void setParameters(List<Parameter> parameters) {
			this.parameters = parameters;
		}

		public List<Resource> getResources() {
			return this.resources;
		}

		public void setResources(List<Resource> resources) {
			this.resources = resources;
		}

		public Log getLog() {
			return this.log;
		}

		public void setLog(Log log) {
			this.log = log;
		}

		public static class Parameter {

			private String parameterKey;

			private String parameterValue;

			public String getParameterKey() {
				return this.parameterKey;
			}

			public void setParameterKey(String parameterKey) {
				this.parameterKey = parameterKey;
			}

			public String getParameterValue() {
				return this.parameterValue;
			}

			public void setParameterValue(String parameterValue) {
				this.parameterValue = parameterValue;
			}
		}

		public static class Resource {

			private String logicalResourceId;

			private String acsResourceType;

			private String resourceType;

			private String description;

			private Map<Object,Object> stack;

			private Map<Object,Object> properties;

			private String action;

			private String replacement;

			private String physicalResourceId;

			private List<String> requiredBy;

			public String getLogicalResourceId() {
				return this.logicalResourceId;
			}

			public void setLogicalResourceId(String logicalResourceId) {
				this.logicalResourceId = logicalResourceId;
			}

			public String getAcsResourceType() {
				return this.acsResourceType;
			}

			public void setAcsResourceType(String acsResourceType) {
				this.acsResourceType = acsResourceType;
			}

			public String getResourceType() {
				return this.resourceType;
			}

			public void setResourceType(String resourceType) {
				this.resourceType = resourceType;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Map<Object,Object> getStack() {
				return this.stack;
			}

			public void setStack(Map<Object,Object> stack) {
				this.stack = stack;
			}

			public Map<Object,Object> getProperties() {
				return this.properties;
			}

			public void setProperties(Map<Object,Object> properties) {
				this.properties = properties;
			}

			public String getAction() {
				return this.action;
			}

			public void setAction(String action) {
				this.action = action;
			}

			public String getReplacement() {
				return this.replacement;
			}

			public void setReplacement(String replacement) {
				this.replacement = replacement;
			}

			public String getPhysicalResourceId() {
				return this.physicalResourceId;
			}

			public void setPhysicalResourceId(String physicalResourceId) {
				this.physicalResourceId = physicalResourceId;
			}

			public List<String> getRequiredBy() {
				return this.requiredBy;
			}

			public void setRequiredBy(List<String> requiredBy) {
				this.requiredBy = requiredBy;
			}
		}

		public static class Log {

			private List<TerraformLog> terraformLogs;

			public List<TerraformLog> getTerraformLogs() {
				return this.terraformLogs;
			}

			public void setTerraformLogs(List<TerraformLog> terraformLogs) {
				this.terraformLogs = terraformLogs;
			}

			public static class TerraformLog {

				private String command;

				private String stream;

				private String content;

				public String getCommand() {
					return this.command;
				}

				public void setCommand(String command) {
					this.command = command;
				}

				public String getStream() {
					return this.stream;
				}

				public void setStream(String stream) {
					this.stream = stream;
				}

				public String getContent() {
					return this.content;
				}

				public void setContent(String content) {
					this.content = content;
				}
			}
		}
	}

	@Override
	public PreviewStackResponse getInstance(UnmarshallerContext context) {
		return	PreviewStackResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
