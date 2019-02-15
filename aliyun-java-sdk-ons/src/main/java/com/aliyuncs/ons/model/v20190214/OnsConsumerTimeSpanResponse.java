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

package com.aliyuncs.ons.model.v20190214;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ons.transform.v20190214.OnsConsumerTimeSpanResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OnsConsumerTimeSpanResponse extends AcsResponse {

	private String requestId;

	private String helpUrl;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getHelpUrl() {
		return this.helpUrl;
	}

	public void setHelpUrl(String helpUrl) {
		this.helpUrl = helpUrl;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String topic;

		private Long minTimeStamp;

		private Long maxTimeStamp;

		private Long consumeTimeStamp;

		private String instanceId;

		public String getTopic() {
			return this.topic;
		}

		public void setTopic(String topic) {
			this.topic = topic;
		}

		public Long getMinTimeStamp() {
			return this.minTimeStamp;
		}

		public void setMinTimeStamp(Long minTimeStamp) {
			this.minTimeStamp = minTimeStamp;
		}

		public Long getMaxTimeStamp() {
			return this.maxTimeStamp;
		}

		public void setMaxTimeStamp(Long maxTimeStamp) {
			this.maxTimeStamp = maxTimeStamp;
		}

		public Long getConsumeTimeStamp() {
			return this.consumeTimeStamp;
		}

		public void setConsumeTimeStamp(Long consumeTimeStamp) {
			this.consumeTimeStamp = consumeTimeStamp;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}
	}

	@Override
	public OnsConsumerTimeSpanResponse getInstance(UnmarshallerContext context) {
		return	OnsConsumerTimeSpanResponseUnmarshaller.unmarshall(this, context);
	}
}
