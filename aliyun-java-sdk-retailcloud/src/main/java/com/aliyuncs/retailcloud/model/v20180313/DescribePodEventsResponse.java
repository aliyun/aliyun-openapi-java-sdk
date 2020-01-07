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
import com.aliyuncs.retailcloud.transform.v20180313.DescribePodEventsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePodEventsResponse extends AcsResponse {

	private Integer code;

	private String errMsg;

	private String requestId;

	private Boolean success;

	private Result result;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getErrMsg() {
		return this.errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String deployOrderName;

		private List<PodEvent> podEvents;

		public String getDeployOrderName() {
			return this.deployOrderName;
		}

		public void setDeployOrderName(String deployOrderName) {
			this.deployOrderName = deployOrderName;
		}

		public List<PodEvent> getPodEvents() {
			return this.podEvents;
		}

		public void setPodEvents(List<PodEvent> podEvents) {
			this.podEvents = podEvents;
		}

		public static class PodEvent {

			private String action;

			private Integer count;

			private String eventTime;

			private String firstTimestamp;

			private String lastTimestamp;

			private String message;

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

			public String getMessage() {
				return this.message;
			}

			public void setMessage(String message) {
				this.message = message;
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
	public DescribePodEventsResponse getInstance(UnmarshallerContext context) {
		return	DescribePodEventsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
