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

package com.aliyuncs.mpaas.model.v20200415;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mpaas.transform.v20200415.QueryMcubeWhitelistContentResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMcubeWhitelistContentResponse extends AcsResponse {

	private String resultMessage;

	private String resultCode;

	private String requestId;

	private QueryWhitelistContentResult queryWhitelistContentResult;

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public QueryWhitelistContentResult getQueryWhitelistContentResult() {
		return this.queryWhitelistContentResult;
	}

	public void setQueryWhitelistContentResult(QueryWhitelistContentResult queryWhitelistContentResult) {
		this.queryWhitelistContentResult = queryWhitelistContentResult;
	}

	public static class QueryWhitelistContentResult {

		private Boolean success;

		private String resultMsg;

		private WhitelistContent whitelistContent;

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}

		public String getResultMsg() {
			return this.resultMsg;
		}

		public void setResultMsg(String resultMsg) {
			this.resultMsg = resultMsg;
		}

		public WhitelistContent getWhitelistContent() {
			return this.whitelistContent;
		}

		public void setWhitelistContent(WhitelistContent whitelistContent) {
			this.whitelistContent = whitelistContent;
		}

		public static class WhitelistContent {

			private String workspaceId;

			private String appId;

			private Long whitelistId;

			private String whitelistName;

			private Boolean hasMore;

			private String whitelistType;

			private List<String> responseData;

			public String getWorkspaceId() {
				return this.workspaceId;
			}

			public void setWorkspaceId(String workspaceId) {
				this.workspaceId = workspaceId;
			}

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public Long getWhitelistId() {
				return this.whitelistId;
			}

			public void setWhitelistId(Long whitelistId) {
				this.whitelistId = whitelistId;
			}

			public String getWhitelistName() {
				return this.whitelistName;
			}

			public void setWhitelistName(String whitelistName) {
				this.whitelistName = whitelistName;
			}

			public Boolean getHasMore() {
				return this.hasMore;
			}

			public void setHasMore(Boolean hasMore) {
				this.hasMore = hasMore;
			}

			public String getWhitelistType() {
				return this.whitelistType;
			}

			public void setWhitelistType(String whitelistType) {
				this.whitelistType = whitelistType;
			}

			public List<String> getResponseData() {
				return this.responseData;
			}

			public void setResponseData(List<String> responseData) {
				this.responseData = responseData;
			}
		}
	}

	@Override
	public QueryMcubeWhitelistContentResponse getInstance(UnmarshallerContext context) {
		return	QueryMcubeWhitelistContentResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
