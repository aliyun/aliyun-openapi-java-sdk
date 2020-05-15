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

package com.aliyuncs.cassandra.model.v20190101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cassandra.transform.v20190101.DescribeNodeToolExecutionHistoriesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeNodeToolExecutionHistoriesResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Long totalCount;

	private List<History> histories;

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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<History> getHistories() {
		return this.histories;
	}

	public void setHistories(List<History> histories) {
		this.histories = histories;
	}

	public static class History {

		private String jobId;

		private String command;

		private String nodes;

		private Long modifyTime;

		private Long createTime;

		private String regionId;

		private Boolean isEnded;

		private String arguments;

		private String errorMessage;

		private String dataCenterId;

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getCommand() {
			return this.command;
		}

		public void setCommand(String command) {
			this.command = command;
		}

		public String getNodes() {
			return this.nodes;
		}

		public void setNodes(String nodes) {
			this.nodes = nodes;
		}

		public Long getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(Long modifyTime) {
			this.modifyTime = modifyTime;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Boolean getIsEnded() {
			return this.isEnded;
		}

		public void setIsEnded(Boolean isEnded) {
			this.isEnded = isEnded;
		}

		public String getArguments() {
			return this.arguments;
		}

		public void setArguments(String arguments) {
			this.arguments = arguments;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public String getDataCenterId() {
			return this.dataCenterId;
		}

		public void setDataCenterId(String dataCenterId) {
			this.dataCenterId = dataCenterId;
		}
	}

	@Override
	public DescribeNodeToolExecutionHistoriesResponse getInstance(UnmarshallerContext context) {
		return	DescribeNodeToolExecutionHistoriesResponseUnmarshaller.unmarshall(this, context);
	}
}
