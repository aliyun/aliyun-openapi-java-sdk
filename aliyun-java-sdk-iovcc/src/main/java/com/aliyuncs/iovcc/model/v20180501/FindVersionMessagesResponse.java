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

package com.aliyuncs.iovcc.model.v20180501;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iovcc.transform.v20180501.FindVersionMessagesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class FindVersionMessagesResponse extends AcsResponse {

	private String requestId;

	private MessageList messageList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public MessageList getMessageList() {
		return this.messageList;
	}

	public void setMessageList(MessageList messageList) {
		this.messageList = messageList;
	}

	public static class MessageList {

		private Integer totalCount;

		private List<ItemsItem> items;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<ItemsItem> getItems() {
			return this.items;
		}

		public void setItems(List<ItemsItem> items) {
			this.items = items;
		}

		public static class ItemsItem {

			private Long id;

			private String messageId;

			private String versionId;

			private String testId;

			private String status;

			private String statusDesc;

			private String deviceId;

			private String gmtCreate;

			private String gmtModify;

			private Long gmtCreateTimestamp;

			private Long gmtModifyTimestamp;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getMessageId() {
				return this.messageId;
			}

			public void setMessageId(String messageId) {
				this.messageId = messageId;
			}

			public String getVersionId() {
				return this.versionId;
			}

			public void setVersionId(String versionId) {
				this.versionId = versionId;
			}

			public String getTestId() {
				return this.testId;
			}

			public void setTestId(String testId) {
				this.testId = testId;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getStatusDesc() {
				return this.statusDesc;
			}

			public void setStatusDesc(String statusDesc) {
				this.statusDesc = statusDesc;
			}

			public String getDeviceId() {
				return this.deviceId;
			}

			public void setDeviceId(String deviceId) {
				this.deviceId = deviceId;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getGmtModify() {
				return this.gmtModify;
			}

			public void setGmtModify(String gmtModify) {
				this.gmtModify = gmtModify;
			}

			public Long getGmtCreateTimestamp() {
				return this.gmtCreateTimestamp;
			}

			public void setGmtCreateTimestamp(Long gmtCreateTimestamp) {
				this.gmtCreateTimestamp = gmtCreateTimestamp;
			}

			public Long getGmtModifyTimestamp() {
				return this.gmtModifyTimestamp;
			}

			public void setGmtModifyTimestamp(Long gmtModifyTimestamp) {
				this.gmtModifyTimestamp = gmtModifyTimestamp;
			}
		}
	}

	@Override
	public FindVersionMessagesResponse getInstance(UnmarshallerContext context) {
		return	FindVersionMessagesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
