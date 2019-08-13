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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.ListClusterOperationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListClusterOperationResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<ClusterOperation> clusterOperationList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
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

	public List<ClusterOperation> getClusterOperationList() {
		return this.clusterOperationList;
	}

	public void setClusterOperationList(List<ClusterOperation> clusterOperationList) {
		this.clusterOperationList = clusterOperationList;
	}

	public static class ClusterOperation {

		private String operationId;

		private String operationName;

		private String startTime;

		private String duration;

		private String status;

		private String percentage;

		private String comment;

		public String getOperationId() {
			return this.operationId;
		}

		public void setOperationId(String operationId) {
			this.operationId = operationId;
		}

		public String getOperationName() {
			return this.operationName;
		}

		public void setOperationName(String operationName) {
			this.operationName = operationName;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getDuration() {
			return this.duration;
		}

		public void setDuration(String duration) {
			this.duration = duration;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getPercentage() {
			return this.percentage;
		}

		public void setPercentage(String percentage) {
			this.percentage = percentage;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}
	}

	@Override
	public ListClusterOperationResponse getInstance(UnmarshallerContext context) {
		return	ListClusterOperationResponseUnmarshaller.unmarshall(this, context);
	}
}
