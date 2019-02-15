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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ons.transform.v20190214.OnsMessageTraceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OnsMessageTraceResponse extends AcsResponse {

	private String requestId;

	private String helpUrl;

	private List<MessageTrack> data;

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

	public List<MessageTrack> getData() {
		return this.data;
	}

	public void setData(List<MessageTrack> data) {
		this.data = data;
	}

	public static class MessageTrack {

		private String consumerGroup;

		private String trackType;

		private String exceptionDesc;

		private String instanceId;

		public String getConsumerGroup() {
			return this.consumerGroup;
		}

		public void setConsumerGroup(String consumerGroup) {
			this.consumerGroup = consumerGroup;
		}

		public String getTrackType() {
			return this.trackType;
		}

		public void setTrackType(String trackType) {
			this.trackType = trackType;
		}

		public String getExceptionDesc() {
			return this.exceptionDesc;
		}

		public void setExceptionDesc(String exceptionDesc) {
			this.exceptionDesc = exceptionDesc;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}
	}

	@Override
	public OnsMessageTraceResponse getInstance(UnmarshallerContext context) {
		return	OnsMessageTraceResponseUnmarshaller.unmarshall(this, context);
	}
}
