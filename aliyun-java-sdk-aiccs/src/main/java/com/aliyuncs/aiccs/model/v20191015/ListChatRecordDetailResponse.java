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

package com.aliyuncs.aiccs.model.v20191015;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aiccs.transform.v20191015.ListChatRecordDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListChatRecordDetailResponse extends AcsResponse {

	private String message;

	private String requestId;

	private Integer httpStatusCode;

	private String code;

	private Boolean success;

	private ResultData resultData;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public ResultData getResultData() {
		return this.resultData;
	}

	public void setResultData(ResultData resultData) {
		this.resultData = resultData;
	}

	public static class ResultData {

		private Long currentPage;

		private Long totalResults;

		private Long totalPage;

		private Long onePageSize;

		private List<DataItem> data;

		public Long getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Long currentPage) {
			this.currentPage = currentPage;
		}

		public Long getTotalResults() {
			return this.totalResults;
		}

		public void setTotalResults(Long totalResults) {
			this.totalResults = totalResults;
		}

		public Long getTotalPage() {
			return this.totalPage;
		}

		public void setTotalPage(Long totalPage) {
			this.totalPage = totalPage;
		}

		public Long getOnePageSize() {
			return this.onePageSize;
		}

		public void setOnePageSize(Long onePageSize) {
			this.onePageSize = onePageSize;
		}

		public List<DataItem> getData() {
			return this.data;
		}

		public void setData(List<DataItem> data) {
			this.data = data;
		}

		public static class DataItem {

			private String servicerName;

			private Long startTime;

			private Long endTime;

			private List<MessageListItem> messageList;

			public String getServicerName() {
				return this.servicerName;
			}

			public void setServicerName(String servicerName) {
				this.servicerName = servicerName;
			}

			public Long getStartTime() {
				return this.startTime;
			}

			public void setStartTime(Long startTime) {
				this.startTime = startTime;
			}

			public Long getEndTime() {
				return this.endTime;
			}

			public void setEndTime(Long endTime) {
				this.endTime = endTime;
			}

			public List<MessageListItem> getMessageList() {
				return this.messageList;
			}

			public void setMessageList(List<MessageListItem> messageList) {
				this.messageList = messageList;
			}

			public static class MessageListItem {

				private String senderName;

				private String content;

				private Long senderType;

				private Long createTime;

				private String msgType;

				public String getSenderName() {
					return this.senderName;
				}

				public void setSenderName(String senderName) {
					this.senderName = senderName;
				}

				public String getContent() {
					return this.content;
				}

				public void setContent(String content) {
					this.content = content;
				}

				public Long getSenderType() {
					return this.senderType;
				}

				public void setSenderType(Long senderType) {
					this.senderType = senderType;
				}

				public Long getCreateTime() {
					return this.createTime;
				}

				public void setCreateTime(Long createTime) {
					this.createTime = createTime;
				}

				public String getMsgType() {
					return this.msgType;
				}

				public void setMsgType(String msgType) {
					this.msgType = msgType;
				}
			}
		}
	}

	@Override
	public ListChatRecordDetailResponse getInstance(UnmarshallerContext context) {
		return	ListChatRecordDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
