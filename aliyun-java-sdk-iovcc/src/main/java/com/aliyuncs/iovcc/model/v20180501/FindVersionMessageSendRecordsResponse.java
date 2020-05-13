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
import com.aliyuncs.iovcc.transform.v20180501.FindVersionMessageSendRecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class FindVersionMessageSendRecordsResponse extends AcsResponse {

	private String requestId;

	private MessageSendRecordList messageSendRecordList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public MessageSendRecordList getMessageSendRecordList() {
		return this.messageSendRecordList;
	}

	public void setMessageSendRecordList(MessageSendRecordList messageSendRecordList) {
		this.messageSendRecordList = messageSendRecordList;
	}

	public static class MessageSendRecordList {

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

			private String messageType;

			private String versionId;

			private String targetId;

			private String result;

			private String resultDesc;

			private String succeededCount;

			private String failedCount;

			private String skippedCount;

			private String gmtCreate;

			private Long gmtCreateTimestamp;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getMessageType() {
				return this.messageType;
			}

			public void setMessageType(String messageType) {
				this.messageType = messageType;
			}

			public String getVersionId() {
				return this.versionId;
			}

			public void setVersionId(String versionId) {
				this.versionId = versionId;
			}

			public String getTargetId() {
				return this.targetId;
			}

			public void setTargetId(String targetId) {
				this.targetId = targetId;
			}

			public String getResult() {
				return this.result;
			}

			public void setResult(String result) {
				this.result = result;
			}

			public String getResultDesc() {
				return this.resultDesc;
			}

			public void setResultDesc(String resultDesc) {
				this.resultDesc = resultDesc;
			}

			public String getSucceededCount() {
				return this.succeededCount;
			}

			public void setSucceededCount(String succeededCount) {
				this.succeededCount = succeededCount;
			}

			public String getFailedCount() {
				return this.failedCount;
			}

			public void setFailedCount(String failedCount) {
				this.failedCount = failedCount;
			}

			public String getSkippedCount() {
				return this.skippedCount;
			}

			public void setSkippedCount(String skippedCount) {
				this.skippedCount = skippedCount;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public Long getGmtCreateTimestamp() {
				return this.gmtCreateTimestamp;
			}

			public void setGmtCreateTimestamp(Long gmtCreateTimestamp) {
				this.gmtCreateTimestamp = gmtCreateTimestamp;
			}
		}
	}

	@Override
	public FindVersionMessageSendRecordsResponse getInstance(UnmarshallerContext context) {
		return	FindVersionMessageSendRecordsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
