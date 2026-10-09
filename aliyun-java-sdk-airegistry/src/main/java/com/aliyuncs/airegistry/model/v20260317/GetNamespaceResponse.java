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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.airegistry.transform.v20260317.GetNamespaceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetNamespaceResponse extends AcsResponse {

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

		private String description;

		private Integer promptCount;

		private String createdTime;

		private Integer skillCount;

		private String source;

		private String name;

		private String publicDomain;

		private Integer sourceIndex;

		private String ipWhitelist;

		private String scanPolicy;

		private Boolean publicAccessEnabled;

		private String namespaceId;

		private String tags;

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getPromptCount() {
			return this.promptCount;
		}

		public void setPromptCount(Integer promptCount) {
			this.promptCount = promptCount;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

		public Integer getSkillCount() {
			return this.skillCount;
		}

		public void setSkillCount(Integer skillCount) {
			this.skillCount = skillCount;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPublicDomain() {
			return this.publicDomain;
		}

		public void setPublicDomain(String publicDomain) {
			this.publicDomain = publicDomain;
		}

		public Integer getSourceIndex() {
			return this.sourceIndex;
		}

		public void setSourceIndex(Integer sourceIndex) {
			this.sourceIndex = sourceIndex;
		}

		public String getIpWhitelist() {
			return this.ipWhitelist;
		}

		public void setIpWhitelist(String ipWhitelist) {
			this.ipWhitelist = ipWhitelist;
		}

		public String getScanPolicy() {
			return this.scanPolicy;
		}

		public void setScanPolicy(String scanPolicy) {
			this.scanPolicy = scanPolicy;
		}

		public Boolean getPublicAccessEnabled() {
			return this.publicAccessEnabled;
		}

		public void setPublicAccessEnabled(Boolean publicAccessEnabled) {
			this.publicAccessEnabled = publicAccessEnabled;
		}

		public String getNamespaceId() {
			return this.namespaceId;
		}

		public void setNamespaceId(String namespaceId) {
			this.namespaceId = namespaceId;
		}

		public String getTags() {
			return this.tags;
		}

		public void setTags(String tags) {
			this.tags = tags;
		}
	}

	@Override
	public GetNamespaceResponse getInstance(UnmarshallerContext context) {
		return	GetNamespaceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
