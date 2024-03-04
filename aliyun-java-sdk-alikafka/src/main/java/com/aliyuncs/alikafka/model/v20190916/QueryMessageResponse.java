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

package com.aliyuncs.alikafka.model.v20190916;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alikafka.transform.v20190916.QueryMessageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMessageResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Boolean success;

	private List<MessageVO> messageList;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<MessageVO> getMessageList() {
		return this.messageList;
	}

	public void setMessageList(List<MessageVO> messageList) {
		this.messageList = messageList;
	}

	public static class MessageVO {

		private String topic;

		private Long partition;

		private Long offset;

		private Long timestamp;

		private String timestampType;

		private Long checksum;

		private Integer serializedKeySize;

		private Integer serializedValueSize;

		private String key;

		private String value;

		private Boolean keyTruncated;

		private Boolean valueTruncated;

		private Integer truncatedKeySize;

		private Integer truncatedValueSize;

		public String getTopic() {
			return this.topic;
		}

		public void setTopic(String topic) {
			this.topic = topic;
		}

		public Long getPartition() {
			return this.partition;
		}

		public void setPartition(Long partition) {
			this.partition = partition;
		}

		public Long getOffset() {
			return this.offset;
		}

		public void setOffset(Long offset) {
			this.offset = offset;
		}

		public Long getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(Long timestamp) {
			this.timestamp = timestamp;
		}

		public String getTimestampType() {
			return this.timestampType;
		}

		public void setTimestampType(String timestampType) {
			this.timestampType = timestampType;
		}

		public Long getChecksum() {
			return this.checksum;
		}

		public void setChecksum(Long checksum) {
			this.checksum = checksum;
		}

		public Integer getSerializedKeySize() {
			return this.serializedKeySize;
		}

		public void setSerializedKeySize(Integer serializedKeySize) {
			this.serializedKeySize = serializedKeySize;
		}

		public Integer getSerializedValueSize() {
			return this.serializedValueSize;
		}

		public void setSerializedValueSize(Integer serializedValueSize) {
			this.serializedValueSize = serializedValueSize;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public Boolean getKeyTruncated() {
			return this.keyTruncated;
		}

		public void setKeyTruncated(Boolean keyTruncated) {
			this.keyTruncated = keyTruncated;
		}

		public Boolean getValueTruncated() {
			return this.valueTruncated;
		}

		public void setValueTruncated(Boolean valueTruncated) {
			this.valueTruncated = valueTruncated;
		}

		public Integer getTruncatedKeySize() {
			return this.truncatedKeySize;
		}

		public void setTruncatedKeySize(Integer truncatedKeySize) {
			this.truncatedKeySize = truncatedKeySize;
		}

		public Integer getTruncatedValueSize() {
			return this.truncatedValueSize;
		}

		public void setTruncatedValueSize(Integer truncatedValueSize) {
			this.truncatedValueSize = truncatedValueSize;
		}
	}

	@Override
	public QueryMessageResponse getInstance(UnmarshallerContext context) {
		return	QueryMessageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
