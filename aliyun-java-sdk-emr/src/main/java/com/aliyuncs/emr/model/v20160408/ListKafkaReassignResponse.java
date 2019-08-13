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
import com.aliyuncs.emr.transform.v20160408.ListKafkaReassignResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListKafkaReassignResponse extends AcsResponse {

	private String requestId;

	private Integer total;

	private Integer pageSize;

	private Integer pageNumber;

	private List<Reassign> reassignList;

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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<Reassign> getReassignList() {
		return this.reassignList;
	}

	public void setReassignList(List<Reassign> reassignList) {
		this.reassignList = reassignList;
	}

	public static class Reassign {

		private String id;

		private String status;

		private Integer assignProcess;

		private Long startTime;

		private Long endTime;

		private Integer topicCount;

		private Integer partitionCount;

		private Long throttle;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Integer getAssignProcess() {
			return this.assignProcess;
		}

		public void setAssignProcess(Integer assignProcess) {
			this.assignProcess = assignProcess;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public Integer getTopicCount() {
			return this.topicCount;
		}

		public void setTopicCount(Integer topicCount) {
			this.topicCount = topicCount;
		}

		public Integer getPartitionCount() {
			return this.partitionCount;
		}

		public void setPartitionCount(Integer partitionCount) {
			this.partitionCount = partitionCount;
		}

		public Long getThrottle() {
			return this.throttle;
		}

		public void setThrottle(Long throttle) {
			this.throttle = throttle;
		}
	}

	@Override
	public ListKafkaReassignResponse getInstance(UnmarshallerContext context) {
		return	ListKafkaReassignResponseUnmarshaller.unmarshall(this, context);
	}
}
