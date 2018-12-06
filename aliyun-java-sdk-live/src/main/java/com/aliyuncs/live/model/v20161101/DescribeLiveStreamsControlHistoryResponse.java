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

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeLiveStreamsControlHistoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveStreamsControlHistoryResponse extends AcsResponse {

	private String requestId;

	private List<LiveStreamControlInfo> controlInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<LiveStreamControlInfo> getControlInfo() {
		return this.controlInfo;
	}

	public void setControlInfo(List<LiveStreamControlInfo> controlInfo) {
		this.controlInfo = controlInfo;
	}

	public static class LiveStreamControlInfo {

		private String streamName;

		private String clientIP;

		private String action;

		private String timeStamp;

		public String getStreamName() {
			return this.streamName;
		}

		public void setStreamName(String streamName) {
			this.streamName = streamName;
		}

		public String getClientIP() {
			return this.clientIP;
		}

		public void setClientIP(String clientIP) {
			this.clientIP = clientIP;
		}

		public String getAction() {
			return this.action;
		}

		public void setAction(String action) {
			this.action = action;
		}

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}
	}

	@Override
	public DescribeLiveStreamsControlHistoryResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveStreamsControlHistoryResponseUnmarshaller.unmarshall(this, context);
	}
}
