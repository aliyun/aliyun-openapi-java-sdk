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

package com.aliyuncs.iot.model.v20180120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20180120.QueryConsumerGroupStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryConsumerGroupStatusResponse extends AcsResponse {

	private Integer consumerSpeed;

	private String errorMessage;

	private String requestId;

	private Integer accumulatedConsumeCountPerMinute;

	private String lastConsumerTime;

	private Boolean success;

	private Integer realTimeConsumeCountPerMinute;

	private String code;

	private Integer accumulationCount;

	private List<ConsumerGroupClientConnectionInfo> clientConnectionStatusList;

	public Integer getConsumerSpeed() {
		return this.consumerSpeed;
	}

	public void setConsumerSpeed(Integer consumerSpeed) {
		this.consumerSpeed = consumerSpeed;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getAccumulatedConsumeCountPerMinute() {
		return this.accumulatedConsumeCountPerMinute;
	}

	public void setAccumulatedConsumeCountPerMinute(Integer accumulatedConsumeCountPerMinute) {
		this.accumulatedConsumeCountPerMinute = accumulatedConsumeCountPerMinute;
	}

	public String getLastConsumerTime() {
		return this.lastConsumerTime;
	}

	public void setLastConsumerTime(String lastConsumerTime) {
		this.lastConsumerTime = lastConsumerTime;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getRealTimeConsumeCountPerMinute() {
		return this.realTimeConsumeCountPerMinute;
	}

	public void setRealTimeConsumeCountPerMinute(Integer realTimeConsumeCountPerMinute) {
		this.realTimeConsumeCountPerMinute = realTimeConsumeCountPerMinute;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getAccumulationCount() {
		return this.accumulationCount;
	}

	public void setAccumulationCount(Integer accumulationCount) {
		this.accumulationCount = accumulationCount;
	}

	public List<ConsumerGroupClientConnectionInfo> getClientConnectionStatusList() {
		return this.clientConnectionStatusList;
	}

	public void setClientConnectionStatusList(List<ConsumerGroupClientConnectionInfo> clientConnectionStatusList) {
		this.clientConnectionStatusList = clientConnectionStatusList;
	}

	public static class ConsumerGroupClientConnectionInfo {

		private Long onlineTime;

		private Integer accumulatedConsumeCountPerMinute;

		private Integer realTimeConsumeCountPerMinute;

		private String clientIpPort;

		private String clientId;

		public Long getOnlineTime() {
			return this.onlineTime;
		}

		public void setOnlineTime(Long onlineTime) {
			this.onlineTime = onlineTime;
		}

		public Integer getAccumulatedConsumeCountPerMinute() {
			return this.accumulatedConsumeCountPerMinute;
		}

		public void setAccumulatedConsumeCountPerMinute(Integer accumulatedConsumeCountPerMinute) {
			this.accumulatedConsumeCountPerMinute = accumulatedConsumeCountPerMinute;
		}

		public Integer getRealTimeConsumeCountPerMinute() {
			return this.realTimeConsumeCountPerMinute;
		}

		public void setRealTimeConsumeCountPerMinute(Integer realTimeConsumeCountPerMinute) {
			this.realTimeConsumeCountPerMinute = realTimeConsumeCountPerMinute;
		}

		public String getClientIpPort() {
			return this.clientIpPort;
		}

		public void setClientIpPort(String clientIpPort) {
			this.clientIpPort = clientIpPort;
		}

		public String getClientId() {
			return this.clientId;
		}

		public void setClientId(String clientId) {
			this.clientId = clientId;
		}
	}

	@Override
	public QueryConsumerGroupStatusResponse getInstance(UnmarshallerContext context) {
		return	QueryConsumerGroupStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
