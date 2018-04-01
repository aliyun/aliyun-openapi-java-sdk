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
import com.aliyuncs.vod.transform.v20170321.ListAIVideoCensorJobResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAIVideoCensorJobResponse extends AcsResponse {

	private String requestId;

	private List<AIVideoCensorJob> aIVideoCensorJobList;

	private List<String> nonExistAIVideoCensorJobIds;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<AIVideoCensorJob> getAIVideoCensorJobList() {
		return this.aIVideoCensorJobList;
	}

	public void setAIVideoCensorJobList(List<AIVideoCensorJob> aIVideoCensorJobList) {
		this.aIVideoCensorJobList = aIVideoCensorJobList;
	}

	public List<String> getNonExistAIVideoCensorJobIds() {
		return this.nonExistAIVideoCensorJobIds;
	}

	public void setNonExistAIVideoCensorJobIds(List<String> nonExistAIVideoCensorJobIds) {
		this.nonExistAIVideoCensorJobIds = nonExistAIVideoCensorJobIds;
	}

	public static class AIVideoCensorJob {

		private String jobId;

		private String mediaId;

		private String status;

		private String code;

		private String message;

		private String creationTime;

		private String data;

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getMediaId() {
			return this.mediaId;
		}

		public void setMediaId(String mediaId) {
			this.mediaId = mediaId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getData() {
			return this.data;
		}

		public void setData(String data) {
			this.data = data;
		}
	}

	@Override
	public ListAIVideoCensorJobResponse getInstance(UnmarshallerContext context) {
		return	ListAIVideoCensorJobResponseUnmarshaller.unmarshall(this, context);
	}
}
