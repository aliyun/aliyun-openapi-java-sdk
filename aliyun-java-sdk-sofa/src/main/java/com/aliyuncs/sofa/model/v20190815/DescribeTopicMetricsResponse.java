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
import com.aliyuncs.sofa.transform.v20190815.DescribeTopicMetricsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTopicMetricsResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Long endTime;

	private Long interval;

	private Long startTime;

	private String topic;

	private List<MetricsItem> metrics;

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

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}

	public Long getInterval() {
		return this.interval;
	}

	public void setInterval(Long interval) {
		this.interval = interval;
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

	public String getTopic() {
		return this.topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public List<MetricsItem> getMetrics() {
		return this.metrics;
	}

	public void setMetrics(List<MetricsItem> metrics) {
		this.metrics = metrics;
	}

	public static class MetricsItem {

		private Long recvCnt;

		private Long recvTraffic;

		private Long sendCnt;

		private Long sendTraffic;

		private Long timestamp;

		public Long getRecvCnt() {
			return this.recvCnt;
		}

		public void setRecvCnt(Long recvCnt) {
			this.recvCnt = recvCnt;
		}

		public Long getRecvTraffic() {
			return this.recvTraffic;
		}

		public void setRecvTraffic(Long recvTraffic) {
			this.recvTraffic = recvTraffic;
		}

		public Long getSendCnt() {
			return this.sendCnt;
		}

		public void setSendCnt(Long sendCnt) {
			this.sendCnt = sendCnt;
		}

		public Long getSendTraffic() {
			return this.sendTraffic;
		}

		public void setSendTraffic(Long sendTraffic) {
			this.sendTraffic = sendTraffic;
		}

		public Long getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(Long timestamp) {
			this.timestamp = timestamp;
		}
	}

	@Override
	public DescribeTopicMetricsResponse getInstance(UnmarshallerContext context) {
		return	DescribeTopicMetricsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
