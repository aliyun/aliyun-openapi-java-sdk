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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeCommandResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeCommandResponse extends AcsResponse {

	private String requestId;

	private Integer total;

	private Integer pageNo;

	private Integer pageSize;

	private List<Command> commandList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<Command> getCommandList() {
		return this.commandList;
	}

	public void setCommandList(List<Command> commandList) {
		this.commandList = commandList;
	}

	public static class Command {

		private String commandId;

		private String name;

		private String type;

		private Boolean latest;

		private Integer version;

		private String shareStatus;

		private String description;

		private String commandContent;

		private String workingDir;

		private Long timeOut;

		private String creationTime;

		private String publishTime;

		private Integer invokeTimes;

		private Boolean enableParameter;

		private List<String> parameterNames;

		private List<String> modifiers;

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

		public Boolean getLatest() {
			return this.latest;
		}

		public void setLatest(Boolean latest) {
			this.latest = latest;
		}

		public Integer getVersion() {
			return this.version;
		}

		public void setVersion(Integer version) {
			this.version = version;
		}

		public String getShareStatus() {
			return this.shareStatus;
		}

		public void setShareStatus(String shareStatus) {
			this.shareStatus = shareStatus;
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

		public Long getTimeOut() {
			return this.timeOut;
		}

		public void setTimeOut(Long timeOut) {
			this.timeOut = timeOut;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getPublishTime() {
			return this.publishTime;
		}

		public void setPublishTime(String publishTime) {
			this.publishTime = publishTime;
		}

		public Integer getInvokeTimes() {
			return this.invokeTimes;
		}

		public void setInvokeTimes(Integer invokeTimes) {
			this.invokeTimes = invokeTimes;
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

		public List<String> getModifiers() {
			return this.modifiers;
		}

		public void setModifiers(List<String> modifiers) {
			this.modifiers = modifiers;
		}
	}

	@Override
	public OpsDescribeCommandResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeCommandResponseUnmarshaller.unmarshall(this, context);
	}
}
