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

package com.aliyuncs.cbn.model.v20170912;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cbn.transform.v20170912.DescribeFlowlogsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeFlowlogsResponse extends AcsResponse {

	private String requestId;

	private String success;

	private String totalCount;

	private String pageNumber;

	private String pageSize;

	private List<FlowLog> flowLogs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public List<FlowLog> getFlowLogs() {
		return this.flowLogs;
	}

	public void setFlowLogs(List<FlowLog> flowLogs) {
		this.flowLogs = flowLogs;
	}

	public static class FlowLog {

		private String flowLogId;

		private String flowLogName;

		private String description;

		private String creationTime;

		private String cenId;

		private String projectName;

		private String logStoreName;

		private String status;

		private String regionId;

		public String getFlowLogId() {
			return this.flowLogId;
		}

		public void setFlowLogId(String flowLogId) {
			this.flowLogId = flowLogId;
		}

		public String getFlowLogName() {
			return this.flowLogName;
		}

		public void setFlowLogName(String flowLogName) {
			this.flowLogName = flowLogName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getCenId() {
			return this.cenId;
		}

		public void setCenId(String cenId) {
			this.cenId = cenId;
		}

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public String getLogStoreName() {
			return this.logStoreName;
		}

		public void setLogStoreName(String logStoreName) {
			this.logStoreName = logStoreName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}
	}

	@Override
	public DescribeFlowlogsResponse getInstance(UnmarshallerContext context) {
		return	DescribeFlowlogsResponseUnmarshaller.unmarshall(this, context);
	}
}
