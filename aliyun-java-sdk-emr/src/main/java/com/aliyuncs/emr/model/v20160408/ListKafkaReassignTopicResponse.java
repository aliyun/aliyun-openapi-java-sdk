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
import com.aliyuncs.emr.transform.v20160408.ListKafkaReassignTopicResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListKafkaReassignTopicResponse extends AcsResponse {

	private String requestId;

	private Integer total;

	private Integer pageSize;

	private Integer pageNumber;

	private List<ReassignTopic> reassignTopicList;

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

	public List<ReassignTopic> getReassignTopicList() {
		return this.reassignTopicList;
	}

	public void setReassignTopicList(List<ReassignTopic> reassignTopicList) {
		this.reassignTopicList = reassignTopicList;
	}

	public static class ReassignTopic {

		private String topicId;

		private String topicName;

		private Integer numPartition;

		private Integer finishedPartition;

		private String process;

		private String status;

		public String getTopicId() {
			return this.topicId;
		}

		public void setTopicId(String topicId) {
			this.topicId = topicId;
		}

		public String getTopicName() {
			return this.topicName;
		}

		public void setTopicName(String topicName) {
			this.topicName = topicName;
		}

		public Integer getNumPartition() {
			return this.numPartition;
		}

		public void setNumPartition(Integer numPartition) {
			this.numPartition = numPartition;
		}

		public Integer getFinishedPartition() {
			return this.finishedPartition;
		}

		public void setFinishedPartition(Integer finishedPartition) {
			this.finishedPartition = finishedPartition;
		}

		public String getProcess() {
			return this.process;
		}

		public void setProcess(String process) {
			this.process = process;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public ListKafkaReassignTopicResponse getInstance(UnmarshallerContext context) {
		return	ListKafkaReassignTopicResponseUnmarshaller.unmarshall(this, context);
	}
}
