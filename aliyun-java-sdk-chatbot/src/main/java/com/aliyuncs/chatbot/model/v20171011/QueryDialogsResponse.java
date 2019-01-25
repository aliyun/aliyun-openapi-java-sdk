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

package com.aliyuncs.chatbot.model.v20171011;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.chatbot.transform.v20171011.QueryDialogsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryDialogsResponse extends AcsResponse {

	private String requestId;

	private Integer pageSize;

	private Integer pageNumber;

	private Integer totalCount;

	private List<Dialog> dialogs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Dialog> getDialogs() {
		return this.dialogs;
	}

	public void setDialogs(List<Dialog> dialogs) {
		this.dialogs = dialogs;
	}

	public static class Dialog {

		private Long dialogId;

		private String dialogName;

		private String description;

		private String createTime;

		private String modifyTime;

		private String createUserId;

		private String createUserName;

		private String modifyUserId;

		private String modifyUserName;

		private Boolean isSampleDialog;

		private Integer status;

		private Boolean isOnline;

		public Long getDialogId() {
			return this.dialogId;
		}

		public void setDialogId(Long dialogId) {
			this.dialogId = dialogId;
		}

		public String getDialogName() {
			return this.dialogName;
		}

		public void setDialogName(String dialogName) {
			this.dialogName = dialogName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}

		public String getCreateUserId() {
			return this.createUserId;
		}

		public void setCreateUserId(String createUserId) {
			this.createUserId = createUserId;
		}

		public String getCreateUserName() {
			return this.createUserName;
		}

		public void setCreateUserName(String createUserName) {
			this.createUserName = createUserName;
		}

		public String getModifyUserId() {
			return this.modifyUserId;
		}

		public void setModifyUserId(String modifyUserId) {
			this.modifyUserId = modifyUserId;
		}

		public String getModifyUserName() {
			return this.modifyUserName;
		}

		public void setModifyUserName(String modifyUserName) {
			this.modifyUserName = modifyUserName;
		}

		public Boolean getIsSampleDialog() {
			return this.isSampleDialog;
		}

		public void setIsSampleDialog(Boolean isSampleDialog) {
			this.isSampleDialog = isSampleDialog;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Boolean getIsOnline() {
			return this.isOnline;
		}

		public void setIsOnline(Boolean isOnline) {
			this.isOnline = isOnline;
		}
	}

	@Override
	public QueryDialogsResponse getInstance(UnmarshallerContext context) {
		return	QueryDialogsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
