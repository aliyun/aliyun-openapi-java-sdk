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
import com.aliyuncs.sofa.transform.v20190815.QueryMqSofamqConsumerAccumulateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMqSofamqConsumerAccumulateResponse extends AcsResponse {

	private String resultMessage;

	private String resultCode;

	private String requestId;

	private Data data;

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String consumeTps;

		private Long totalDiff;

		private Long lastTimestamp;

		private Long delayTime;

		private Boolean online;

		private List<DetailInTopicListItem> detailInTopicList;

		public String getConsumeTps() {
			return this.consumeTps;
		}

		public void setConsumeTps(String consumeTps) {
			this.consumeTps = consumeTps;
		}

		public Long getTotalDiff() {
			return this.totalDiff;
		}

		public void setTotalDiff(Long totalDiff) {
			this.totalDiff = totalDiff;
		}

		public Long getLastTimestamp() {
			return this.lastTimestamp;
		}

		public void setLastTimestamp(Long lastTimestamp) {
			this.lastTimestamp = lastTimestamp;
		}

		public Long getDelayTime() {
			return this.delayTime;
		}

		public void setDelayTime(Long delayTime) {
			this.delayTime = delayTime;
		}

		public Boolean getOnline() {
			return this.online;
		}

		public void setOnline(Boolean online) {
			this.online = online;
		}

		public List<DetailInTopicListItem> getDetailInTopicList() {
			return this.detailInTopicList;
		}

		public void setDetailInTopicList(List<DetailInTopicListItem> detailInTopicList) {
			this.detailInTopicList = detailInTopicList;
		}

		public static class DetailInTopicListItem {

			private Long totalDiff;

			private Long delayTime;

			private Long lastTimestamp;

			private String topic;

			public Long getTotalDiff() {
				return this.totalDiff;
			}

			public void setTotalDiff(Long totalDiff) {
				this.totalDiff = totalDiff;
			}

			public Long getDelayTime() {
				return this.delayTime;
			}

			public void setDelayTime(Long delayTime) {
				this.delayTime = delayTime;
			}

			public Long getLastTimestamp() {
				return this.lastTimestamp;
			}

			public void setLastTimestamp(Long lastTimestamp) {
				this.lastTimestamp = lastTimestamp;
			}

			public String getTopic() {
				return this.topic;
			}

			public void setTopic(String topic) {
				this.topic = topic;
			}
		}
	}

	@Override
	public QueryMqSofamqConsumerAccumulateResponse getInstance(UnmarshallerContext context) {
		return	QueryMqSofamqConsumerAccumulateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
