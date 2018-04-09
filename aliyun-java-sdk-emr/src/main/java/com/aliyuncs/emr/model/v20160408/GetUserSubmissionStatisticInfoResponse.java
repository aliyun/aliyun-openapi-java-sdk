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
import com.aliyuncs.emr.transform.v20160408.GetUserSubmissionStatisticInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetUserSubmissionStatisticInfoResponse extends AcsResponse {

	private String requestId;

	private List<ClusterStatUserSubmission> userSubmissionList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ClusterStatUserSubmission> getUserSubmissionList() {
		return this.userSubmissionList;
	}

	public void setUserSubmissionList(List<ClusterStatUserSubmission> userSubmissionList) {
		this.userSubmissionList = userSubmissionList;
	}

	public static class ClusterStatUserSubmission {

		private String user;

		private Long submission;

		public String getUser() {
			return this.user;
		}

		public void setUser(String user) {
			this.user = user;
		}

		public Long getSubmission() {
			return this.submission;
		}

		public void setSubmission(Long submission) {
			this.submission = submission;
		}
	}

	@Override
	public GetUserSubmissionStatisticInfoResponse getInstance(UnmarshallerContext context) {
		return	GetUserSubmissionStatisticInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
