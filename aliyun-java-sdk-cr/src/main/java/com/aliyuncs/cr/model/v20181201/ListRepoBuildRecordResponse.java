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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cr.transform.v20181201.ListRepoBuildRecordResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRepoBuildRecordResponse extends AcsResponse {

	private Boolean isSuccess;

	private String code;

	private String requestId;

	private Integer pageNo;

	private Integer pageSize;

	private String totalCount;

	private List<BuildRecordsItem> buildRecords;

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

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public List<BuildRecordsItem> getBuildRecords() {
		return this.buildRecords;
	}

	public void setBuildRecords(List<BuildRecordsItem> buildRecords) {
		this.buildRecords = buildRecords;
	}

	public static class BuildRecordsItem {

		private String buildRecordId;

		private String startTime;

		private String endTime;

		private String buildStatus;

		private Image image;

		public String getBuildRecordId() {
			return this.buildRecordId;
		}

		public void setBuildRecordId(String buildRecordId) {
			this.buildRecordId = buildRecordId;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getBuildStatus() {
			return this.buildStatus;
		}

		public void setBuildStatus(String buildStatus) {
			this.buildStatus = buildStatus;
		}

		public Image getImage() {
			return this.image;
		}

		public void setImage(Image image) {
			this.image = image;
		}

		public static class Image {

			private String repoId;

			private String repoNamespaceName;

			private String repoName;

			private String imageTag;

			public String getRepoId() {
				return this.repoId;
			}

			public void setRepoId(String repoId) {
				this.repoId = repoId;
			}

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
	}

	@Override
	public ListRepoBuildRecordResponse getInstance(UnmarshallerContext context) {
		return	ListRepoBuildRecordResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
