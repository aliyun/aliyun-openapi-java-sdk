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

package com.aliyuncs.retailcloud.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.retailcloud.transform.v20180313.DescribeJobLogResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeJobLogResponse extends AcsResponse {

	private Integer code;

	private String requestId;

	private String errMsg;

	private Result result;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrMsg() {
		return this.errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Long appId;

		private Long envId;

		private String podName;

		private String jobLog;

		private List<Event> events;

		public Long getAppId() {
			return this.appId;
		}

		public void setAppId(Long appId) {
			this.appId = appId;
		}

		public Long getEnvId() {
			return this.envId;
		}

		public void setEnvId(Long envId) {
			this.envId = envId;
		}

		public String getPodName() {
			return this.podName;
		}

		public void setPodName(String podName) {
			this.podName = podName;
		}

		public String getJobLog() {
			return this.jobLog;
		}

		public void setJobLog(String jobLog) {
			this.jobLog = jobLog;
		}

		public List<Event> getEvents() {
			return this.events;
		}

		public void setEvents(List<Event> events) {
			this.events = events;
		}

		public static class Event {

			private String action;

			private Integer count;

			private String eventTime;

			private String firstTimestamp;

			private String lastTimestamp;

			private String mesage;

			private String reason;

			private String type;

			public String getAction() {
				return this.action;
			}

			public void setAction(String action) {
				this.action = action;
			}

			public Integer getCount() {
				return this.count;
			}

			public void setCount(Integer count) {
				this.count = count;
			}

			public String getEventTime() {
				return this.eventTime;
			}

			public void setEventTime(String eventTime) {
				this.eventTime = eventTime;
			}

			public String getFirstTimestamp() {
				return this.firstTimestamp;
			}

			public void setFirstTimestamp(String firstTimestamp) {
				this.firstTimestamp = firstTimestamp;
			}

			public String getLastTimestamp() {
				return this.lastTimestamp;
			}

			public void setLastTimestamp(String lastTimestamp) {
				this.lastTimestamp = lastTimestamp;
			}

			public String getMesage() {
				return this.mesage;
			}

			public void setMesage(String mesage) {
				this.mesage = mesage;
			}

			public String getReason() {
				return this.reason;
			}

			public void setReason(String reason) {
				this.reason = reason;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}
		}
	}

	@Override
	public DescribeJobLogResponse getInstance(UnmarshallerContext context) {
		return	DescribeJobLogResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
