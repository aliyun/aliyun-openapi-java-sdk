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
import com.aliyuncs.nas.transform.v20170626.GetAgenticSpaceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAgenticSpaceResponse extends AcsResponse {

	private String requestId;

	private AgenticSpace agenticSpace;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public AgenticSpace getAgenticSpace() {
		return this.agenticSpace;
	}

	public void setAgenticSpace(AgenticSpace agenticSpace) {
		this.agenticSpace = agenticSpace;
	}

	public static class AgenticSpace {

		private String fileSystemPath;

		private String azone;

		private String status;

		private String description;

		private Long spaceUsage;

		private String fileSystemId;

		private String agenticSpaceId;

		private String updateTimeUtc;

		private String createTimeUtc;

		private Long fileCountUsage;

		private Quota quota;

		public String getFileSystemPath() {
			return this.fileSystemPath;
		}

		public void setFileSystemPath(String fileSystemPath) {
			this.fileSystemPath = fileSystemPath;
		}

		public String getAzone() {
			return this.azone;
		}

		public void setAzone(String azone) {
			this.azone = azone;
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

		public String getFileSystemId() {
			return this.fileSystemId;
		}

		public void setFileSystemId(String fileSystemId) {
			this.fileSystemId = fileSystemId;
		}

		public String getAgenticSpaceId() {
			return this.agenticSpaceId;
		}

		public void setAgenticSpaceId(String agenticSpaceId) {
			this.agenticSpaceId = agenticSpaceId;
		}

		public String getUpdateTimeUtc() {
			return this.updateTimeUtc;
		}

		public void setUpdateTimeUtc(String updateTimeUtc) {
			this.updateTimeUtc = updateTimeUtc;
		}

		public String getCreateTimeUtc() {
			return this.createTimeUtc;
		}

		public void setCreateTimeUtc(String createTimeUtc) {
			this.createTimeUtc = createTimeUtc;
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
	public GetAgenticSpaceResponse getInstance(UnmarshallerContext context) {
		return	GetAgenticSpaceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
