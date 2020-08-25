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
import com.aliyuncs.sofa.transform.v20190815.ListMqSofamqWarnResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMqSofamqWarnResponse extends AcsResponse {

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

			private String alertTime;

			private String attribute;

			private Long blockTime;

			private String contacts;

			private Long delayTime;

			private Long frequency;

			private Long gmtCreate;

			private Long gmtModified;

			private String groupId;

			private Long id;

			private String instanceId;

			private String operator;

			private Long threshold;

			private String topic;

			private Long warnLevel;

			private Long warnStatus;

			private Long warnType;

			public String getAlertTime() {
				return this.alertTime;
			}

			public void setAlertTime(String alertTime) {
				this.alertTime = alertTime;
			}

			public String getAttribute() {
				return this.attribute;
			}

			public void setAttribute(String attribute) {
				this.attribute = attribute;
			}

			public Long getBlockTime() {
				return this.blockTime;
			}

			public void setBlockTime(Long blockTime) {
				this.blockTime = blockTime;
			}

			public String getContacts() {
				return this.contacts;
			}

			public void setContacts(String contacts) {
				this.contacts = contacts;
			}

			public Long getDelayTime() {
				return this.delayTime;
			}

			public void setDelayTime(Long delayTime) {
				this.delayTime = delayTime;
			}

			public Long getFrequency() {
				return this.frequency;
			}

			public void setFrequency(Long frequency) {
				this.frequency = frequency;
			}

			public Long getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(Long gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public Long getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(Long gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getGroupId() {
				return this.groupId;
			}

			public void setGroupId(String groupId) {
				this.groupId = groupId;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getOperator() {
				return this.operator;
			}

			public void setOperator(String operator) {
				this.operator = operator;
			}

			public Long getThreshold() {
				return this.threshold;
			}

			public void setThreshold(Long threshold) {
				this.threshold = threshold;
			}

			public String getTopic() {
				return this.topic;
			}

			public void setTopic(String topic) {
				this.topic = topic;
			}

			public Long getWarnLevel() {
				return this.warnLevel;
			}

			public void setWarnLevel(Long warnLevel) {
				this.warnLevel = warnLevel;
			}

			public Long getWarnStatus() {
				return this.warnStatus;
			}

			public void setWarnStatus(Long warnStatus) {
				this.warnStatus = warnStatus;
			}

			public Long getWarnType() {
				return this.warnType;
			}

			public void setWarnType(Long warnType) {
				this.warnType = warnType;
			}
		}
	}

	@Override
	public ListMqSofamqWarnResponse getInstance(UnmarshallerContext context) {
		return	ListMqSofamqWarnResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
