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

package com.aliyuncs.nas.model.v20170626;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.nas.transform.v20170626.GetFilesetResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetFilesetResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String fileSystemPath;

		private String fsetId;

		private String status;

		private String description;

		private Long spaceUsage;

		private String createTime;

		private String updateTime;

		private String fileSystemId;

		private Boolean deletionProtection;

		private Long fileCountUsage;

		private Quota quota;

		public String getFileSystemPath() {
			return this.fileSystemPath;
		}

		public void setFileSystemPath(String fileSystemPath) {
			this.fileSystemPath = fileSystemPath;
		}

		public String getFsetId() {
			return this.fsetId;
		}

		public void setFsetId(String fsetId) {
			this.fsetId = fsetId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getSpaceUsage() {
			return this.spaceUsage;
		}

		public void setSpaceUsage(Long spaceUsage) {
			this.spaceUsage = spaceUsage;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getFileSystemId() {
			return this.fileSystemId;
		}

		public void setFileSystemId(String fileSystemId) {
			this.fileSystemId = fileSystemId;
		}

		public Boolean getDeletionProtection() {
			return this.deletionProtection;
		}

		public void setDeletionProtection(Boolean deletionProtection) {
			this.deletionProtection = deletionProtection;
		}

		public Long getFileCountUsage() {
			return this.fileCountUsage;
		}

		public void setFileCountUsage(Long fileCountUsage) {
			this.fileCountUsage = fileCountUsage;
		}

		public Quota getQuota() {
			return this.quota;
		}

		public void setQuota(Quota quota) {
			this.quota = quota;
		}

		public static class Quota {

			private Long fileCountLimit;

			private Long sizeLimit;

			public Long getFileCountLimit() {
				return this.fileCountLimit;
			}

			public void setFileCountLimit(Long fileCountLimit) {
				this.fileCountLimit = fileCountLimit;
			}

			public Long getSizeLimit() {
				return this.sizeLimit;
			}

			public void setSizeLimit(Long sizeLimit) {
				this.sizeLimit = sizeLimit;
			}
		}
	}

	@Override
	public GetFilesetResponse getInstance(UnmarshallerContext context) {
		return	GetFilesetResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
