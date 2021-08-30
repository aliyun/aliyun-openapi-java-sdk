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

package com.aliyuncs.mpaas.model.v20201028;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mpaas.transform.v20201028.ListMcubeWhitelistsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMcubeWhitelistsResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private ListWhitelistResult listWhitelistResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public ListWhitelistResult getListWhitelistResult() {
		return this.listWhitelistResult;
	}

	public void setListWhitelistResult(ListWhitelistResult listWhitelistResult) {
		this.listWhitelistResult = listWhitelistResult;
	}

	public static class ListWhitelistResult {

		private String resultMsg;

		private Boolean success;

		private List<WhitelistsItem> whitelists;

		public String getResultMsg() {
			return this.resultMsg;
		}

		public void setResultMsg(String resultMsg) {
			this.resultMsg = resultMsg;
		}

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}

		public List<WhitelistsItem> getWhitelists() {
			return this.whitelists;
		}

		public void setWhitelists(List<WhitelistsItem> whitelists) {
			this.whitelists = whitelists;
		}

		public static class WhitelistsItem {

			private String appCode;

			private String gmtCreate;

			private String gmtModified;

			private Long id;

			private String whitelistType;

			private Long whiteListCount;

			private String whiteListName;

			public String getAppCode() {
				return this.appCode;
			}

			public void setAppCode(String appCode) {
				this.appCode = appCode;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getWhitelistType() {
				return this.whitelistType;
			}

			public void setWhitelistType(String whitelistType) {
				this.whitelistType = whitelistType;
			}

			public Long getWhiteListCount() {
				return this.whiteListCount;
			}

			public void setWhiteListCount(Long whiteListCount) {
				this.whiteListCount = whiteListCount;
			}

			public String getWhiteListName() {
				return this.whiteListName;
			}

			public void setWhiteListName(String whiteListName) {
				this.whiteListName = whiteListName;
			}
		}
	}

	@Override
	public ListMcubeWhitelistsResponse getInstance(UnmarshallerContext context) {
		return	ListMcubeWhitelistsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
