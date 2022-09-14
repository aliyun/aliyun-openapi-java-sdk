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

package com.aliyuncs.ehpc.model.v20170714;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ehpc.transform.v20170714.ListJobTemplatesResponseUnmarshaller;
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

		private String stdoutRedirectPath;

		private String variables;

		private String commandLine;

		private String packagePath;

		private Integer priority;

		private Boolean reRunable;

		private String name;

		private String arrayRequest;

		private String id;

		private String stderrRedirectPath;

		private String runasUser;

		public String getStdoutRedirectPath() {
			return this.stdoutRedirectPath;
		}

		public void setStdoutRedirectPath(String stdoutRedirectPath) {
			this.stdoutRedirectPath = stdoutRedirectPath;
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

		public String getPackagePath() {
			return this.packagePath;
		}

		public void setPackagePath(String packagePath) {
			this.packagePath = packagePath;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
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

		public String getArrayRequest() {
			return this.arrayRequest;
		}

		public void setArrayRequest(String arrayRequest) {
			this.arrayRequest = arrayRequest;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getStderrRedirectPath() {
			return this.stderrRedirectPath;
		}

		public void setStderrRedirectPath(String stderrRedirectPath) {
			this.stderrRedirectPath = stderrRedirectPath;
		}

		public String getRunasUser() {
			return this.runasUser;
		}

		public void setRunasUser(String runasUser) {
			this.runasUser = runasUser;
		}
	}

	@Override
	public ListJobTemplatesResponse getInstance(UnmarshallerContext context) {
		return	ListJobTemplatesResponseUnmarshaller.unmarshall(this, context);
	}
}
