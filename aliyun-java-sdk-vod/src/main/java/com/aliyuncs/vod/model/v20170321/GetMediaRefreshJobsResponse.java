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
import com.aliyuncs.vod.transform.v20170321.GetMediaRefreshJobsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMediaRefreshJobsResponse extends AcsResponse {

	private String requestId;

	private List<MediaRefreshJob> mediaRefreshJobs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<MediaRefreshJob> getMediaRefreshJobs() {
		return this.mediaRefreshJobs;
	}

	public void setMediaRefreshJobs(List<MediaRefreshJob> mediaRefreshJobs) {
		this.mediaRefreshJobs = mediaRefreshJobs;
	}

	public static class MediaRefreshJob {

		private String mediaRefreshJobId;

		private String mediaId;

		private String taskType;

		private String filterPolicy;

		private String status;

		private String successPlayUrls;

		private String taskIds;

		private String errorCode;

		private String errorMessage;

		private String userData;

		private String gmtCreate;

		private String gmtModified;

		public String getMediaRefreshJobId() {
			return this.mediaRefreshJobId;
		}

		public void setMediaRefreshJobId(String mediaRefreshJobId) {
			this.mediaRefreshJobId = mediaRefreshJobId;
		}

		public String getMediaId() {
			return this.mediaId;
		}

		public void setMediaId(String mediaId) {
			this.mediaId = mediaId;
		}

		public String getTaskType() {
			return this.taskType;
		}

		public void setTaskType(String taskType) {
			this.taskType = taskType;
		}

		public String getFilterPolicy() {
			return this.filterPolicy;
		}

		public void setFilterPolicy(String filterPolicy) {
			this.filterPolicy = filterPolicy;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getSuccessPlayUrls() {
			return this.successPlayUrls;
		}

		public void setSuccessPlayUrls(String successPlayUrls) {
			this.successPlayUrls = successPlayUrls;
		}

		public String getTaskIds() {
			return this.taskIds;
		}

		public void setTaskIds(String taskIds) {
			this.taskIds = taskIds;
		}

		public String getErrorCode() {
			return this.errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public String getUserData() {
			return this.userData;
		}

		public void setUserData(String userData) {
			this.userData = userData;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}
	}

	@Override
	public GetMediaRefreshJobsResponse getInstance(UnmarshallerContext context) {
		return	GetMediaRefreshJobsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
