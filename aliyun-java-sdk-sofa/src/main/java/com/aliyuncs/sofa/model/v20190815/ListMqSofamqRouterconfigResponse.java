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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.ListMqSofamqRouterconfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMqSofamqRouterconfigResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long pageNum;

		private Long pageSize;

		private Long total;

		private List<ContentItem> content;

		public Long getPageNum() {
			return this.pageNum;
		}

		public void setPageNum(Long pageNum) {
			this.pageNum = pageNum;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public List<ContentItem> getContent() {
			return this.content;
		}

		public void setContent(List<ContentItem> content) {
			this.content = content;
		}

		public static class ContentItem {

			private String consumerId;

			private String consumeFromType;

			private String consumeFromValue;

			private String consumeToType;

			private String consumeToValue;

			private String description;

			private String destinationCell;

			private String destinationNamespaceId;

			private String destinationTopic;

			private String disaster;

			private String gmtCreate;

			private String gmtModified;

			private Long id;

			private String sourceCell;

			private String sourceNamespaceId;

			private String sourceTopic;

			private String tag;

			private String taskStatus;

			public String getConsumerId() {
				return this.consumerId;
			}

			public void setConsumerId(String consumerId) {
				this.consumerId = consumerId;
			}

			public String getConsumeFromType() {
				return this.consumeFromType;
			}

			public void setConsumeFromType(String consumeFromType) {
				this.consumeFromType = consumeFromType;
			}

			public String getConsumeFromValue() {
				return this.consumeFromValue;
			}

			public void setConsumeFromValue(String consumeFromValue) {
				this.consumeFromValue = consumeFromValue;
			}

			public String getConsumeToType() {
				return this.consumeToType;
			}

			public void setConsumeToType(String consumeToType) {
				this.consumeToType = consumeToType;
			}

			public String getConsumeToValue() {
				return this.consumeToValue;
			}

			public void setConsumeToValue(String consumeToValue) {
				this.consumeToValue = consumeToValue;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getDestinationCell() {
				return this.destinationCell;
			}

			public void setDestinationCell(String destinationCell) {
				this.destinationCell = destinationCell;
			}

			public String getDestinationNamespaceId() {
				return this.destinationNamespaceId;
			}

			public void setDestinationNamespaceId(String destinationNamespaceId) {
				this.destinationNamespaceId = destinationNamespaceId;
			}

			public String getDestinationTopic() {
				return this.destinationTopic;
			}

			public void setDestinationTopic(String destinationTopic) {
				this.destinationTopic = destinationTopic;
			}

			public String getDisaster() {
				return this.disaster;
			}

			public void setDisaster(String disaster) {
				this.disaster = disaster;
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

			public String getSourceCell() {
				return this.sourceCell;
			}

			public void setSourceCell(String sourceCell) {
				this.sourceCell = sourceCell;
			}

			public String getSourceNamespaceId() {
				return this.sourceNamespaceId;
			}

			public void setSourceNamespaceId(String sourceNamespaceId) {
				this.sourceNamespaceId = sourceNamespaceId;
			}

			public String getSourceTopic() {
				return this.sourceTopic;
			}

			public void setSourceTopic(String sourceTopic) {
				this.sourceTopic = sourceTopic;
			}

			public String getTag() {
				return this.tag;
			}

			public void setTag(String tag) {
				this.tag = tag;
			}

			public String getTaskStatus() {
				return this.taskStatus;
			}

			public void setTaskStatus(String taskStatus) {
				this.taskStatus = taskStatus;
			}
		}
	}

	@Override
	public ListMqSofamqRouterconfigResponse getInstance(UnmarshallerContext context) {
		return	ListMqSofamqRouterconfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
