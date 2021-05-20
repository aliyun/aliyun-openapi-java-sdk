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

package com.aliyuncs.mpaas.model.v20200710;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.mpaas.transform.v20200710.QueryMcubeMiniTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMcubeMiniTaskResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private QueryMiniTaskResult queryMiniTaskResult;

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

	public QueryMiniTaskResult getQueryMiniTaskResult() {
		return this.queryMiniTaskResult;
	}

	public void setQueryMiniTaskResult(QueryMiniTaskResult queryMiniTaskResult) {
		this.queryMiniTaskResult = queryMiniTaskResult;
	}

	public static class QueryMiniTaskResult {

		private String resultMsg;

		private Boolean success;

		private MiniTaskInfo miniTaskInfo;

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

		public MiniTaskInfo getMiniTaskInfo() {
			return this.miniTaskInfo;
		}

		public void setMiniTaskInfo(MiniTaskInfo miniTaskInfo) {
			this.miniTaskInfo = miniTaskInfo;
		}

		public static class MiniTaskInfo {

			private String appCode;

			private String gmtCreate;

			private String gmtModified;

			private String greyConfigInfo;

			private String greyEndtime;

			private String greyEndtimeData;

			private Long greyNum;

			private Long id;

			private String memo;

			private Long packageId;

			private String platform;

			private String productVersion;

			private Long publishMode;

			private Long publishType;

			private String status;

			private Long taskStatus;

			private String whitelistIds;

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

			public String getGreyConfigInfo() {
				return this.greyConfigInfo;
			}

			public void setGreyConfigInfo(String greyConfigInfo) {
				this.greyConfigInfo = greyConfigInfo;
			}

			public String getGreyEndtime() {
				return this.greyEndtime;
			}

			public void setGreyEndtime(String greyEndtime) {
				this.greyEndtime = greyEndtime;
			}

			public String getGreyEndtimeData() {
				return this.greyEndtimeData;
			}

			public void setGreyEndtimeData(String greyEndtimeData) {
				this.greyEndtimeData = greyEndtimeData;
			}

			public Long getGreyNum() {
				return this.greyNum;
			}

			public void setGreyNum(Long greyNum) {
				this.greyNum = greyNum;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getMemo() {
				return this.memo;
			}

			public void setMemo(String memo) {
				this.memo = memo;
			}

			public Long getPackageId() {
				return this.packageId;
			}

			public void setPackageId(Long packageId) {
				this.packageId = packageId;
			}

			public String getPlatform() {
				return this.platform;
			}

			public void setPlatform(String platform) {
				this.platform = platform;
			}

			public String getProductVersion() {
				return this.productVersion;
			}

			public void setProductVersion(String productVersion) {
				this.productVersion = productVersion;
			}

			public Long getPublishMode() {
				return this.publishMode;
			}

			public void setPublishMode(Long publishMode) {
				this.publishMode = publishMode;
			}

			public Long getPublishType() {
				return this.publishType;
			}

			public void setPublishType(Long publishType) {
				this.publishType = publishType;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Long getTaskStatus() {
				return this.taskStatus;
			}

			public void setTaskStatus(Long taskStatus) {
				this.taskStatus = taskStatus;
			}

			public String getWhitelistIds() {
				return this.whitelistIds;
			}

			public void setWhitelistIds(String whitelistIds) {
				this.whitelistIds = whitelistIds;
			}
		}
	}

	@Override
	public QueryMcubeMiniTaskResponse getInstance(UnmarshallerContext context) {
		return	QueryMcubeMiniTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
