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
import com.aliyuncs.alikafka.transform.v20190916.GetTopicSubscribeStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTopicSubscribeStatusResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private Boolean success;

	private String message;

	private TopicSubscribeStatus topicSubscribeStatus;

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public TopicSubscribeStatus getTopicSubscribeStatus() {
		return this.topicSubscribeStatus;
	}

	public void setTopicSubscribeStatus(TopicSubscribeStatus topicSubscribeStatus) {
		this.topicSubscribeStatus = topicSubscribeStatus;
	}

	public static class TopicSubscribeStatus {

		private String topic;

		private List<String> consumerGroups;

		public String getTopic() {
			return this.topic;
		}

		public void setTopic(String topic) {
			this.topic = topic;
		}

		public List<String> getConsumerGroups() {
			return this.consumerGroups;
		}

		public void setConsumerGroups(List<String> consumerGroups) {
			this.consumerGroups = consumerGroups;
		}
	}

	@Override
	public GetTopicSubscribeStatusResponse getInstance(UnmarshallerContext context) {
		return	GetTopicSubscribeStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
