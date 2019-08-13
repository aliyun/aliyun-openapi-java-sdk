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
import com.aliyuncs.emr.transform.v20160408.GetQueueSubmissionStatisticInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetQueueSubmissionStatisticInfoResponse extends AcsResponse {

	private String requestId;

	private List<ClusterStatQueueSubmission> queueSubmissionList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ClusterStatQueueSubmission> getQueueSubmissionList() {
		return this.queueSubmissionList;
	}

	public void setQueueSubmissionList(List<ClusterStatQueueSubmission> queueSubmissionList) {
		this.queueSubmissionList = queueSubmissionList;
	}

	public static class ClusterStatQueueSubmission {

		private String queue;

		private Long submission;

		public String getQueue() {
			return this.queue;
		}

		public void setQueue(String queue) {
			this.queue = queue;
		}

		public Long getSubmission() {
			return this.submission;
		}

		public void setSubmission(Long submission) {
			this.submission = submission;
		}
	}

	@Override
	public GetQueueSubmissionStatisticInfoResponse getInstance(UnmarshallerContext context) {
		return	GetQueueSubmissionStatisticInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
