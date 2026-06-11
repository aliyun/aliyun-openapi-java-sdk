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
import com.aliyuncs.airegistry.transform.v20260317.GetSkillDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSkillDetailResponse extends AcsResponse {

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

		private Boolean writeable;

		private Long updateTime;

		private Boolean enable;

		private String bizTags;

		private String from;

		private String scope;

		private Map<Object,Object> labels;

		private String editingVersion;

		private String reviewingVersion;

		private Integer onlineCnt;

		private Long downloadCount;

		private String namespaceId;

		private String name;

		private String description;

		private String owner;

		private List<Version> versions;

		public Boolean getWriteable() {
			return this.writeable;
		}

		public void setWriteable(Boolean writeable) {
			this.writeable = writeable;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public Boolean getEnable() {
			return this.enable;
		}

		public void setEnable(Boolean enable) {
			this.enable = enable;
		}

		public String getBizTags() {
			return this.bizTags;
		}

		public void setBizTags(String bizTags) {
			this.bizTags = bizTags;
		}

		public String getFrom() {
			return this.from;
		}

		public void setFrom(String from) {
			this.from = from;
		}

		public String getScope() {
			return this.scope;
		}

		public void setScope(String scope) {
			this.scope = scope;
		}

		public Map<Object,Object> getLabels() {
			return this.labels;
		}

		public void setLabels(Map<Object,Object> labels) {
			this.labels = labels;
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

		public Long getDownloadCount() {
			return this.downloadCount;
		}

		public void setDownloadCount(Long downloadCount) {
			this.downloadCount = downloadCount;
		}

		public String getNamespaceId() {
			return this.namespaceId;
		}

		public void setNamespaceId(String namespaceId) {
			this.namespaceId = namespaceId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public List<Version> getVersions() {
			return this.versions;
		}

		public void setVersions(List<Version> versions) {
			this.versions = versions;
		}

		public static class Version {

			private String version;

			private String status;

			private String author;

			private String description;

			private Long createTime;

			private Long updateTime;

			private String publishPipelineInfo;

			private Long downloadCount;

			private String commitMsg;

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

			public String getAuthor() {
				return this.author;
			}

			public void setAuthor(String author) {
				this.author = author;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Long getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(Long createTime) {
				this.createTime = createTime;
			}

			public Long getUpdateTime() {
				return this.updateTime;
			}

			public void setUpdateTime(Long updateTime) {
				this.updateTime = updateTime;
			}

			public String getPublishPipelineInfo() {
				return this.publishPipelineInfo;
			}

			public void setPublishPipelineInfo(String publishPipelineInfo) {
				this.publishPipelineInfo = publishPipelineInfo;
			}

			public Long getDownloadCount() {
				return this.downloadCount;
			}

			public void setDownloadCount(Long downloadCount) {
				this.downloadCount = downloadCount;
			}

			public String getCommitMsg() {
				return this.commitMsg;
			}

			public void setCommitMsg(String commitMsg) {
				this.commitMsg = commitMsg;
			}
		}
	}

	@Override
	public GetSkillDetailResponse getInstance(UnmarshallerContext context) {
		return	GetSkillDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
