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

package com.aliyuncs.ehpc.model.v20180412;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ehpc.transform.v20180412.ListJobTemplatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListJobTemplatesResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer totalCount;

	private List<JobTemplates> templates;

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<JobTemplates> getTemplates() {
		return this.templates;
	}

	public void setTemplates(List<JobTemplates> templates) {
		this.templates = templates;
	}

	public static class JobTemplates {

		private Integer task;

		private String variables;

		private String commandLine;

		private String queue;

		private Integer priority;

		private String mem;

		private Integer thread;

		private String arrayRequest;

		private String stderrRedirectPath;

		private Integer node;

		private String stdoutRedirectPath;

		private Integer gpu;

		private String packagePath;

		private String clockTime;

		private Boolean reRunable;

		private String name;

		private String id;

		private String runasUser;

		private String inputFileUrl;

		private Boolean withUnzipCmd;

		private String unzipCmd;

		public Integer getTask() {
			return this.task;
		}

		public void setTask(Integer task) {
			this.task = task;
		}

		public String getVariables() {
			return this.variables;
		}

		public void setVariables(String variables) {
			this.variables = variables;
		}

		public String getCommandLine() {
			return this.commandLine;
		}

		public void setCommandLine(String commandLine) {
			this.commandLine = commandLine;
		}

		public String getQueue() {
			return this.queue;
		}

		public void setQueue(String queue) {
			this.queue = queue;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public String getMem() {
			return this.mem;
		}

		public void setMem(String mem) {
			this.mem = mem;
		}

		public Integer getThread() {
			return this.thread;
		}

		public void setThread(Integer thread) {
			this.thread = thread;
		}

		public String getArrayRequest() {
			return this.arrayRequest;
		}

		public void setArrayRequest(String arrayRequest) {
			this.arrayRequest = arrayRequest;
		}

		public String getStderrRedirectPath() {
			return this.stderrRedirectPath;
		}

		public void setStderrRedirectPath(String stderrRedirectPath) {
			this.stderrRedirectPath = stderrRedirectPath;
		}

		public Integer getNode() {
			return this.node;
		}

		public void setNode(Integer node) {
			this.node = node;
		}

		public String getStdoutRedirectPath() {
			return this.stdoutRedirectPath;
		}

		public void setStdoutRedirectPath(String stdoutRedirectPath) {
			this.stdoutRedirectPath = stdoutRedirectPath;
		}

		public Integer getGpu() {
			return this.gpu;
		}

		public void setGpu(Integer gpu) {
			this.gpu = gpu;
		}

		public String getPackagePath() {
			return this.packagePath;
		}

		public void setPackagePath(String packagePath) {
			this.packagePath = packagePath;
		}

		public String getClockTime() {
			return this.clockTime;
		}

		public void setClockTime(String clockTime) {
			this.clockTime = clockTime;
		}

		public Boolean getReRunable() {
			return this.reRunable;
		}

		public void setReRunable(Boolean reRunable) {
			this.reRunable = reRunable;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getRunasUser() {
			return this.runasUser;
		}

		public void setRunasUser(String runasUser) {
			this.runasUser = runasUser;
		}

		public String getInputFileUrl() {
			return this.inputFileUrl;
		}

		public void setInputFileUrl(String inputFileUrl) {
			this.inputFileUrl = inputFileUrl;
		}

		public Boolean getWithUnzipCmd() {
			return this.withUnzipCmd;
		}

		public void setWithUnzipCmd(Boolean withUnzipCmd) {
			this.withUnzipCmd = withUnzipCmd;
		}

		public String getUnzipCmd() {
			return this.unzipCmd;
		}

		public void setUnzipCmd(String unzipCmd) {
			this.unzipCmd = unzipCmd;
		}
	}

	@Override
	public ListJobTemplatesResponse getInstance(UnmarshallerContext context) {
		return	ListJobTemplatesResponseUnmarshaller.unmarshall(this, context);
	}
}
