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

package com.aliyuncs.cr.model.v20181201;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cr.transform.v20181201.GetRepoBuildRecordResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetRepoBuildRecordResponse extends AcsResponse {

	private Boolean isSuccess;

	private String code;

	private String requestId;

	private String buildRecordId;

	private Long startTime;

	private Long endTime;

	private String status;

	private Image image;

	public Boolean getIsSuccess() {
		return this.isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getBuildRecordId() {
		return this.buildRecordId;
	}

	public void setBuildRecordId(String buildRecordId) {
		this.buildRecordId = buildRecordId;
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

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Image getImage() {
		return this.image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public static class Image {

		private String repoNamespaceName;

		private String repoName;

		private String imageTag;

		public String getRepoNamespaceName() {
			return this.repoNamespaceName;
		}

		public void setRepoNamespaceName(String repoNamespaceName) {
			this.repoNamespaceName = repoNamespaceName;
		}

		public String getRepoName() {
			return this.repoName;
		}

		public void setRepoName(String repoName) {
			this.repoName = repoName;
		}

		public String getImageTag() {
			return this.imageTag;
		}

		public void setImageTag(String imageTag) {
			this.imageTag = imageTag;
		}
	}

	@Override
	public GetRepoBuildRecordResponse getInstance(UnmarshallerContext context) {
		return	GetRepoBuildRecordResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
