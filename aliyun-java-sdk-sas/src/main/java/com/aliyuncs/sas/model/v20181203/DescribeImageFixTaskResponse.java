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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeImageFixTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeImageFixTaskResponse extends AcsResponse {

	private String requestId;

	private List<BuildTask> buildTasks;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<BuildTask> getBuildTasks() {
		return this.buildTasks;
	}

	public void setBuildTasks(List<BuildTask> buildTasks) {
		this.buildTasks = buildTasks;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class BuildTask {

		private String buildTaskId;

		private String taskType;

		private String repoNamespace;

		private String repoName;

		private String regionId;

		private String oldTag;

		private String oldUuid;

		private String newTag;

		private String newUuid;

		private String fixTime;

		private String finishTime;

		private Integer status;

		public String getBuildTaskId() {
			return this.buildTaskId;
		}

		public void setBuildTaskId(String buildTaskId) {
			this.buildTaskId = buildTaskId;
		}

		public String getTaskType() {
			return this.taskType;
		}

		public void setTaskType(String taskType) {
			this.taskType = taskType;
		}

		public String getRepoNamespace() {
			return this.repoNamespace;
		}

		public void setRepoNamespace(String repoNamespace) {
			this.repoNamespace = repoNamespace;
		}

		public String getRepoName() {
			return this.repoName;
		}

		public void setRepoName(String repoName) {
			this.repoName = repoName;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getOldTag() {
			return this.oldTag;
		}

		public void setOldTag(String oldTag) {
			this.oldTag = oldTag;
		}

		public String getOldUuid() {
			return this.oldUuid;
		}

		public void setOldUuid(String oldUuid) {
			this.oldUuid = oldUuid;
		}

		public String getNewTag() {
			return this.newTag;
		}

		public void setNewTag(String newTag) {
			this.newTag = newTag;
		}

		public String getNewUuid() {
			return this.newUuid;
		}

		public void setNewUuid(String newUuid) {
			this.newUuid = newUuid;
		}

		public String getFixTime() {
			return this.fixTime;
		}

		public void setFixTime(String fixTime) {
			this.fixTime = fixTime;
		}

		public String getFinishTime() {
			return this.finishTime;
		}

		public void setFinishTime(String finishTime) {
			this.finishTime = finishTime;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}
	}

	public static class PageInfo {

		private Integer currentPage;

		private Integer pageSize;

		private Integer totalCount;

		private Integer count;

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}
	}

	@Override
	public DescribeImageFixTaskResponse getInstance(UnmarshallerContext context) {
		return	DescribeImageFixTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
