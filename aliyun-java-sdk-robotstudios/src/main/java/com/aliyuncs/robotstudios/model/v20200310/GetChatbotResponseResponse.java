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

package com.aliyuncs.robotstudios.model.v20200310;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.robotstudios.transform.v20200310.GetChatbotResponseResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetChatbotResponseResponse extends AcsResponse {

	private String code;

	private String currentPage;

	private String errorCode;

	private String errorMessage;

	private String pageSize;

	private String requestId;

	private String success;

	private String totalNumber;

	private String totalPages;

	private List<DataItem> data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(String currentPage) {
		this.currentPage = currentPage;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getTotalNumber() {
		return this.totalNumber;
	}

	public void setTotalNumber(String totalNumber) {
		this.totalNumber = totalNumber;
	}

	public String getTotalPages() {
		return this.totalPages;
	}

	public void setTotalPages(String totalPages) {
		this.totalPages = totalPages;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String clientType;

		private String createTime;

		private String id;

		private String messageContent;

		private String modifiedTime;

		private String senderName;

		private String senderRole;

		public String getClientType() {
			return this.clientType;
		}

		public void setClientType(String clientType) {
			this.clientType = clientType;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getMessageContent() {
			return this.messageContent;
		}

		public void setMessageContent(String messageContent) {
			this.messageContent = messageContent;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public String getSenderName() {
			return this.senderName;
		}

		public void setSenderName(String senderName) {
			this.senderName = senderName;
		}

		public String getSenderRole() {
			return this.senderRole;
		}

		public void setSenderRole(String senderRole) {
			this.senderRole = senderRole;
		}
	}

	@Override
	public GetChatbotResponseResponse getInstance(UnmarshallerContext context) {
		return	GetChatbotResponseResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
