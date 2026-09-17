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

package com.aliyuncs.swas_open.model.v20200601;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.swas_open.transform.v20200601.DescribeCommandsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCommandsResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private Integer pageSize;

	private Integer pageNumber;

	private List<Command> commands;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<Command> getCommands() {
		return this.commands;
	}

	public void setCommands(List<Command> commands) {
		this.commands = commands;
	}

	public static class Command {

		private String description;

		private String resourceGroupId;

		private Long timeout;

		private String name;

		private String provider;

		private String workingDir;

		private String commandContent;

		private String type;

		private String creationTime;

		private Boolean enableParameter;

		private String commandId;

		private List<ParameterDefinition> parameterDefinitions;

		private List<Tag> tags;

		private List<String> parameterNames;

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

		public Long getTimeout() {
			return this.timeout;
		}

		public void setTimeout(Long timeout) {
			this.timeout = timeout;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getProvider() {
			return this.provider;
		}

		public void setProvider(String provider) {
			this.provider = provider;
		}

		public String getWorkingDir() {
			return this.workingDir;
		}

		public void setWorkingDir(String workingDir) {
			this.workingDir = workingDir;
		}

		public String getCommandContent() {
			return this.commandContent;
		}

		public void setCommandContent(String commandContent) {
			this.commandContent = commandContent;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public Boolean getEnableParameter() {
			return this.enableParameter;
		}

		public void setEnableParameter(Boolean enableParameter) {
			this.enableParameter = enableParameter;
		}

		public String getCommandId() {
			return this.commandId;
		}

		public void setCommandId(String commandId) {
			this.commandId = commandId;
		}

		public List<ParameterDefinition> getParameterDefinitions() {
			return this.parameterDefinitions;
		}

		public void setParameterDefinitions(List<ParameterDefinition> parameterDefinitions) {
			this.parameterDefinitions = parameterDefinitions;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<String> getParameterNames() {
			return this.parameterNames;
		}

		public void setParameterNames(List<String> parameterNames) {
			this.parameterNames = parameterNames;
		}

		public static class ParameterDefinition {

			private String defaultValue;

			private String description;

			private Boolean required;

			private String parameterName;

			private List<String> possibleValues;

			public String getDefaultValue() {
				return this.defaultValue;
			}

			public void setDefaultValue(String defaultValue) {
				this.defaultValue = defaultValue;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Boolean getRequired() {
				return this.required;
			}

			public void setRequired(Boolean required) {
				this.required = required;
			}

			public String getParameterName() {
				return this.parameterName;
			}

			public void setParameterName(String parameterName) {
				this.parameterName = parameterName;
			}

			public List<String> getPossibleValues() {
				return this.possibleValues;
			}

			public void setPossibleValues(List<String> possibleValues) {
				this.possibleValues = possibleValues;
			}
		}

		public static class Tag {

			private String value;

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

	@Override
	public DescribeCommandsResponse getInstance(UnmarshallerContext context) {
		return	DescribeCommandsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
