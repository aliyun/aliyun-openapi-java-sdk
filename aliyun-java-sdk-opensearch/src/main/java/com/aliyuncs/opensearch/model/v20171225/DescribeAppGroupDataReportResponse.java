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

package com.aliyuncs.opensearch.model.v20171225;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.opensearch.transform.v20171225.DescribeAppGroupDataReportResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAppGroupDataReportResponse extends AcsResponse {

	private String requestId;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Integer receivedCount;

		private List<ReceivedSampleItem> receivedSample;

		public Integer getReceivedCount() {
			return this.receivedCount;
		}

		public void setReceivedCount(Integer receivedCount) {
			this.receivedCount = receivedCount;
		}

		public List<ReceivedSampleItem> getReceivedSample() {
			return this.receivedSample;
		}

		public void setReceivedSample(List<ReceivedSampleItem> receivedSample) {
			this.receivedSample = receivedSample;
		}

		public static class ReceivedSampleItem {

			private Long receivedTimeMs;

			private Message message;

			public Long getReceivedTimeMs() {
				return this.receivedTimeMs;
			}

			public void setReceivedTimeMs(Long receivedTimeMs) {
				this.receivedTimeMs = receivedTimeMs;
			}

			public Message getMessage() {
				return this.message;
			}

			public void setMessage(Message message) {
				this.message = message;
			}

			public static class Message {

				private String clientIp;

				private String arg3;

				private String userId;

				private String args;

				private String arg1;

				private String sdkType;

				private String sessionId;

				private Integer eventId;

				private String sdkVersion;

				private String page;

				public String getClientIp() {
					return this.clientIp;
				}

				public void setClientIp(String clientIp) {
					this.clientIp = clientIp;
				}

				public String getArg3() {
					return this.arg3;
				}

				public void setArg3(String arg3) {
					this.arg3 = arg3;
				}

				public String getUserId() {
					return this.userId;
				}

				public void setUserId(String userId) {
					this.userId = userId;
				}

				public String getArgs() {
					return this.args;
				}

				public void setArgs(String args) {
					this.args = args;
				}

				public String getArg1() {
					return this.arg1;
				}

				public void setArg1(String arg1) {
					this.arg1 = arg1;
				}

				public String getSdkType() {
					return this.sdkType;
				}

				public void setSdkType(String sdkType) {
					this.sdkType = sdkType;
				}

				public String getSessionId() {
					return this.sessionId;
				}

				public void setSessionId(String sessionId) {
					this.sessionId = sessionId;
				}

				public Integer getEventId() {
					return this.eventId;
				}

				public void setEventId(Integer eventId) {
					this.eventId = eventId;
				}

				public String getSdkVersion() {
					return this.sdkVersion;
				}

				public void setSdkVersion(String sdkVersion) {
					this.sdkVersion = sdkVersion;
				}

				public String getPage() {
					return this.page;
				}

				public void setPage(String page) {
					this.page = page;
				}
			}
		}
	}

	@Override
	public DescribeAppGroupDataReportResponse getInstance(UnmarshallerContext context) {
		return	DescribeAppGroupDataReportResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
