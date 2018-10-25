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

package com.aliyuncs.alikafka.model.v20181015;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alikafka.transform.v20181015.GetTopicStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTopicStatusResponse extends AcsResponse {

	private Boolean success;

	private String requestId;

	private Integer code;

	private String message;

	private TopicStatus topicStatus;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

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

	public TopicStatus getTopicStatus() {
		return this.topicStatus;
	}

	public void setTopicStatus(TopicStatus topicStatus) {
		this.topicStatus = topicStatus;
	}

	public static class TopicStatus {

		private Long totalCount;

		private Long lastTimeStamp;

		private List<OffsetTableItem> offsetTable;

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public Long getLastTimeStamp() {
			return this.lastTimeStamp;
		}

		public void setLastTimeStamp(Long lastTimeStamp) {
			this.lastTimeStamp = lastTimeStamp;
		}

		public List<OffsetTableItem> getOffsetTable() {
			return this.offsetTable;
		}

		public void setOffsetTable(List<OffsetTableItem> offsetTable) {
			this.offsetTable = offsetTable;
		}

		public static class OffsetTableItem {

			private Long minOffset;

			private Long maxOffset;

			private Long lastUpdateTimestamp;

			private String topic;

			private Integer partition;

			public Long getMinOffset() {
				return this.minOffset;
			}

			public void setMinOffset(Long minOffset) {
				this.minOffset = minOffset;
			}

			public Long getMaxOffset() {
				return this.maxOffset;
			}

			public void setMaxOffset(Long maxOffset) {
				this.maxOffset = maxOffset;
			}

			public Long getLastUpdateTimestamp() {
				return this.lastUpdateTimestamp;
			}

			public void setLastUpdateTimestamp(Long lastUpdateTimestamp) {
				this.lastUpdateTimestamp = lastUpdateTimestamp;
			}

			public String getTopic() {
				return this.topic;
			}

			public void setTopic(String topic) {
				this.topic = topic;
			}

			public Integer getPartition() {
				return this.partition;
			}

			public void setPartition(Integer partition) {
				this.partition = partition;
			}
		}
	}

	@Override
	public GetTopicStatusResponse getInstance(UnmarshallerContext context) {
		return	GetTopicStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
