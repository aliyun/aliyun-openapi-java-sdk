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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.QueryMqSofamqConsumerTimespanResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMqSofamqConsumerTimespanResponse extends AcsResponse {

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

		private Long consumeTimestamp;

		private String instanceId;

		private Long maxTimestamp;

		private Long minTimestamp;

		private String topic;

		public Long getConsumeTimestamp() {
			return this.consumeTimestamp;
		}

		public void setConsumeTimestamp(Long consumeTimestamp) {
			this.consumeTimestamp = consumeTimestamp;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Long getMaxTimestamp() {
			return this.maxTimestamp;
		}

		public void setMaxTimestamp(Long maxTimestamp) {
			this.maxTimestamp = maxTimestamp;
		}

		public Long getMinTimestamp() {
			return this.minTimestamp;
		}

		public void setMinTimestamp(Long minTimestamp) {
			this.minTimestamp = minTimestamp;
		}

		public String getTopic() {
			return this.topic;
		}

		public void setTopic(String topic) {
			this.topic = topic;
		}
	}

	@Override
	public QueryMqSofamqConsumerTimespanResponse getInstance(UnmarshallerContext context) {
		return	QueryMqSofamqConsumerTimespanResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
