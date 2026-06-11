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

package com.aliyuncs.airegistry.model.v20260317;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.airegistry.transform.v20260317.GetPromptResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPromptResponse extends AcsResponse {

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

		private Integer schemaVersion;

		private String promptKey;

		private String description;

		private String latestVersion;

		private Long gmtModified;

		private String editingVersion;

		private String reviewingVersion;

		private Integer onlineCnt;

		private Map<Object,Object> labels;

		private List<VersionDetail> versionDetails;

		private List<String> bizTags;

		private List<String> versions;

		public Integer getSchemaVersion() {
			return this.schemaVersion;
		}

		public void setSchemaVersion(Integer schemaVersion) {
			this.schemaVersion = schemaVersion;
		}

		public String getPromptKey() {
			return this.promptKey;
		}

		public void setPromptKey(String promptKey) {
			this.promptKey = promptKey;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getLatestVersion() {
			return this.latestVersion;
		}

		public void setLatestVersion(String latestVersion) {
			this.latestVersion = latestVersion;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getEditingVersion() {
			return this.editingVersion;
		}

		public void setEditingVersion(String editingVersion) {
			this.editingVersion = editingVersion;
		}

		public String getReviewingVersion() {
			return this.reviewingVersion;
		}

		public void setReviewingVersion(String reviewingVersion) {
			this.reviewingVersion = reviewingVersion;
		}

		public Integer getOnlineCnt() {
			return this.onlineCnt;
		}

		public void setOnlineCnt(Integer onlineCnt) {
			this.onlineCnt = onlineCnt;
		}

		public Map<Object,Object> getLabels() {
			return this.labels;
		}

		public void setLabels(Map<Object,Object> labels) {
			this.labels = labels;
		}

		public List<VersionDetail> getVersionDetails() {
			return this.versionDetails;
		}

		public void setVersionDetails(List<VersionDetail> versionDetails) {
			this.versionDetails = versionDetails;
		}

		public List<String> getBizTags() {
			return this.bizTags;
		}

		public void setBizTags(List<String> bizTags) {
			this.bizTags = bizTags;
		}

		public List<String> getVersions() {
			return this.versions;
		}

		public void setVersions(List<String> versions) {
			this.versions = versions;
		}

		public static class VersionDetail {

			private String promptKey;

			private String version;

			private String status;

			private String commitMsg;

			private String srcUser;

			private Long gmtModified;

			public String getPromptKey() {
				return this.promptKey;
			}

			public void setPromptKey(String promptKey) {
				this.promptKey = promptKey;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getCommitMsg() {
				return this.commitMsg;
			}

			public void setCommitMsg(String commitMsg) {
				this.commitMsg = commitMsg;
			}

			public String getSrcUser() {
				return this.srcUser;
			}

			public void setSrcUser(String srcUser) {
				this.srcUser = srcUser;
			}

			public Long getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(Long gmtModified) {
				this.gmtModified = gmtModified;
			}
		}
	}

	@Override
	public GetPromptResponse getInstance(UnmarshallerContext context) {
		return	GetPromptResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
