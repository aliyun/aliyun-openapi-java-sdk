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

package com.aliyuncs.quickbi_public.model.v20220101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.quickbi_public.transform.v20220101.QueryAiproEmbedConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryAiproEmbedConfigResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private List<Data> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<Data> getResult() {
		return this.result;
	}

	public void setResult(List<Data> result) {
		this.result = result;
	}

	public static class Data {

		private Integer status;

		private Integer chatHistoryStatus;

		private String nextToken;

		private String config;

		private Integer memoryEnabled;

		private Integer maxResults;

		private Integer uploadEnabled;

		private String agentName;

		private String showName;

		private String aiProId;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Integer getChatHistoryStatus() {
			return this.chatHistoryStatus;
		}

		public void setChatHistoryStatus(Integer chatHistoryStatus) {
			this.chatHistoryStatus = chatHistoryStatus;
		}

		public String getNextToken() {
			return this.nextToken;
		}

		public void setNextToken(String nextToken) {
			this.nextToken = nextToken;
		}

		public String getConfig() {
			return this.config;
		}

		public void setConfig(String config) {
			this.config = config;
		}

		public Integer getMemoryEnabled() {
			return this.memoryEnabled;
		}

		public void setMemoryEnabled(Integer memoryEnabled) {
			this.memoryEnabled = memoryEnabled;
		}

		public Integer getMaxResults() {
			return this.maxResults;
		}

		public void setMaxResults(Integer maxResults) {
			this.maxResults = maxResults;
		}

		public Integer getUploadEnabled() {
			return this.uploadEnabled;
		}

		public void setUploadEnabled(Integer uploadEnabled) {
			this.uploadEnabled = uploadEnabled;
		}

		public String getAgentName() {
			return this.agentName;
		}

		public void setAgentName(String agentName) {
			this.agentName = agentName;
		}

		public String getShowName() {
			return this.showName;
		}

		public void setShowName(String showName) {
			this.showName = showName;
		}

		public String getAiProId() {
			return this.aiProId;
		}

		public void setAiProId(String aiProId) {
			this.aiProId = aiProId;
		}
	}

	@Override
	public QueryAiproEmbedConfigResponse getInstance(UnmarshallerContext context) {
		return	QueryAiproEmbedConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
