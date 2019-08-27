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

	private String requestId;

	private Long totalCount;

	private Long pageNumber;

	private Long pageSize;

	private List<Command> commands;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public List<Command> getCommands() {
		return this.commands;
	}

	public void setCommands(List<Command> commands) {
		this.commands = commands;
	}

	public static class Command {

		private String commandId;

		private String name;

		private String type;

		private String description;

		private String commandContent;

		private String workingDir;

		private Long timeout;

		private String creationTime;

		private Boolean enableParameter;

		private List<String> parameterNames;

		public String getCommandId() {
			return this.commandId;
		}

		public void setCommandId(String commandId) {
			this.commandId = commandId;
		}

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

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCommandContent() {
			return this.commandContent;
		}

		public void setCommandContent(String commandContent) {
			this.commandContent = commandContent;
		}

		public String getWorkingDir() {
			return this.workingDir;
		}

		public void setWorkingDir(String workingDir) {
			this.workingDir = workingDir;
		}

		public Long getTimeout() {
			return this.timeout;
		}

		public void setTimeout(Long timeout) {
			this.timeout = timeout;
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

		public List<String> getParameterNames() {
			return this.parameterNames;
		}

		public void setParameterNames(List<String> parameterNames) {
			this.parameterNames = parameterNames;
		}
	}

	@Override
	public DescribeCommandsResponse getInstance(UnmarshallerContext context) {
		return	DescribeCommandsResponseUnmarshaller.unmarshall(this, context);
	}
}
