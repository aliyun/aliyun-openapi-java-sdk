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
import com.aliyuncs.ehpc.transform.v20180412.ListJobsWithFiltersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListJobsWithFiltersResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private Long pageSize;

	private Long pageNumber;

	private Boolean success;

	private List<JobInfo> jobs;

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

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<JobInfo> getJobs() {
		return this.jobs;
	}

	public void setJobs(List<JobInfo> jobs) {
		this.jobs = jobs;
	}

	public static class JobInfo {

		private String owner;

		private String comment;

		private String state;

		private String stderr;

		private String priority;

		private String shellPath;

		private String stdout;

		private String arrayRequest;

		private String startTime;

		private String lastModifyTime;

		private String nodeList;

		private String name;

		private String id;

		private String submitTime;

		private String queue;

		private Boolean rerunable;

		private String variableList;

		private Resources resources;

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getStderr() {
			return this.stderr;
		}

		public void setStderr(String stderr) {
			this.stderr = stderr;
		}

		public String getPriority() {
			return this.priority;
		}

		public void setPriority(String priority) {
			this.priority = priority;
		}

		public String getShellPath() {
			return this.shellPath;
		}

		public void setShellPath(String shellPath) {
			this.shellPath = shellPath;
		}

		public String getStdout() {
			return this.stdout;
		}

		public void setStdout(String stdout) {
			this.stdout = stdout;
		}

		public String getArrayRequest() {
			return this.arrayRequest;
		}

		public void setArrayRequest(String arrayRequest) {
			this.arrayRequest = arrayRequest;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getLastModifyTime() {
			return this.lastModifyTime;
		}

		public void setLastModifyTime(String lastModifyTime) {
			this.lastModifyTime = lastModifyTime;
		}

		public String getNodeList() {
			return this.nodeList;
		}

		public void setNodeList(String nodeList) {
			this.nodeList = nodeList;
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

		public String getSubmitTime() {
			return this.submitTime;
		}

		public void setSubmitTime(String submitTime) {
			this.submitTime = submitTime;
		}

		public String getQueue() {
			return this.queue;
		}

		public void setQueue(String queue) {
			this.queue = queue;
		}

		public Boolean getRerunable() {
			return this.rerunable;
		}

		public void setRerunable(Boolean rerunable) {
			this.rerunable = rerunable;
		}

		public String getVariableList() {
			return this.variableList;
		}

		public void setVariableList(String variableList) {
			this.variableList = variableList;
		}

		public Resources getResources() {
			return this.resources;
		}

		public void setResources(Resources resources) {
			this.resources = resources;
		}

		public static class Resources {

			private Long nodes;

			private Long cores;

			public Long getNodes() {
				return this.nodes;
			}

			public void setNodes(Long nodes) {
				this.nodes = nodes;
			}

			public Long getCores() {
				return this.cores;
			}

			public void setCores(Long cores) {
				this.cores = cores;
			}
		}
	}

	@Override
	public ListJobsWithFiltersResponse getInstance(UnmarshallerContext context) {
		return	ListJobsWithFiltersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
