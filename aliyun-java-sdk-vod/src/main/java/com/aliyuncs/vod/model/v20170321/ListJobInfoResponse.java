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

package com.aliyuncs.vod.model.v20170321;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.ListJobInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListJobInfoResponse extends AcsResponse {

	private String requestId;

	private String mediaId;

	private String jobType;

	private List<JobInfoDO> jobInfoList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMediaId() {
		return this.mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	public String getJobType() {
		return this.jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public List<JobInfoDO> getJobInfoList() {
		return this.jobInfoList;
	}

	public void setJobInfoList(List<JobInfoDO> jobInfoList) {
		this.jobInfoList = jobInfoList;
	}

	public static class JobInfoDO {

		private String jobId;

		private String status;

		private Long userId;

		private String createTime;

		private String completeTime;

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getUserId() {
			return this.userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getCompleteTime() {
			return this.completeTime;
		}

		public void setCompleteTime(String completeTime) {
			this.completeTime = completeTime;
		}
	}

	@Override
	public ListJobInfoResponse getInstance(UnmarshallerContext context) {
		return	ListJobInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
