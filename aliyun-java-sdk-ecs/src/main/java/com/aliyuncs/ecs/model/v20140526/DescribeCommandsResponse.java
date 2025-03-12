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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeCommandsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCommandsResponse extends AcsResponse {

	private Long pageSize;

	private String requestId;

	private Long pageNumber;

	private Long totalCount;

	private String nextToken;

	private List<Command> commands;

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<Command> getCommands() {
		return this.commands;
	}

	public void setCommands(List<Command> commands) {
		this.commands = commands;
	}

	public static class Command {

		private String creationTime;

		private String type;

		private Long timeout;

		private Integer invokeTimes;

		private String commandId;

		private String workingDir;

		private String description;

		private Integer version;

		private String provider;

		private String commandContent;

		private String category;

		private Boolean latest;

		private String name;

		private Boolean enableParameter;

		private String resourceGroupId;

		private String launcher;

		private List<ParameterDefinition> parameterDefinitions;

		private List<Tag> tags;

		private List<String> parameterNames;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Long getTimeout() {
			return this.timeout;
		}

		public void setTimeout(Long timeout) {
			this.timeout = timeout;
		}

		public Integer getInvokeTimes() {
			return this.invokeTimes;
		}

		public void setInvokeTimes(Integer invokeTimes) {
			this.invokeTimes = invokeTimes;
		}

		public String getCommandId() {
			return this.commandId;
		}

		public void setCommandId(String commandId) {
			this.commandId = commandId;
		}

		public String getWorkingDir() {
			return this.workingDir;
		}

		public void setWorkingDir(String workingDir) {
			this.workingDir = workingDir;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getVersion() {
			return this.version;
		}

		public void setVersion(Integer version) {
			this.version = version;
		}

		public String getProvider() {
			return this.provider;
		}

		public void setProvider(String provider) {
			this.provider = provider;
		}

		public String getCommandContent() {
			return this.commandContent;
		}

		public void setCommandContent(String commandContent) {
			this.commandContent = commandContent;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public Boolean getLatest() {
			return this.latest;
		}

		public void setLatest(Boolean latest) {
			this.latest = latest;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Boolean getEnableParameter() {
			return this.enableParameter;
		}

		public void setEnableParameter(Boolean enableParameter) {
			this.enableParameter = enableParameter;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getLauncher() {
			return this.launcher;
		}

		public void setLauncher(String launcher) {
			this.launcher = launcher;
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

			private Boolean required;

			private String description;

			private String defaultValue;

			private String parameterName;

			private String patternRegex;

			private List<String> possibleValues;

			public Boolean getRequired() {
				return this.required;
			}

			public void setRequired(Boolean required) {
				this.required = required;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getDefaultValue() {
				return this.defaultValue;
			}

			public void setDefaultValue(String defaultValue) {
				this.defaultValue = defaultValue;
			}

			public String getParameterName() {
				return this.parameterName;
			}

			public void setParameterName(String parameterName) {
				this.parameterName = parameterName;
			}

			public String getPatternRegex() {
				return this.patternRegex;
			}

			public void setPatternRegex(String patternRegex) {
				this.patternRegex = patternRegex;
			}

			public List<String> getPossibleValues() {
				return this.possibleValues;
			}

			public void setPossibleValues(List<String> possibleValues) {
				this.possibleValues = possibleValues;
			}
		}

		public static class Tag {

			private String tagKey;

			private String tagValue;

			public String getTagKey() {
				return this.tagKey;
			}

			public void setTagKey(String tagKey) {
				this.tagKey = tagKey;
			}

			public String getTagValue() {
				return this.tagValue;
			}

			public void setTagValue(String tagValue) {
				this.tagValue = tagValue;
			}
		}
	}

	@Override
	public DescribeCommandsResponse getInstance(UnmarshallerContext context) {
		return	DescribeCommandsResponseUnmarshaller.unmarshall(this, context);
	}
}
