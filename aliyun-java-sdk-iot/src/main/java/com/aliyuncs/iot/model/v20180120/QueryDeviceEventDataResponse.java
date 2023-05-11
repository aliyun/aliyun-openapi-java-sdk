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
import com.aliyuncs.iot.transform.v20180120.QueryDeviceEventDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryDeviceEventDataResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String errorMessage;

	private Data data;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long nextTime;

		private Boolean nextValid;

		private List<EventInfo> list;

		public Long getNextTime() {
			return this.nextTime;
		}

		public void setNextTime(Long nextTime) {
			this.nextTime = nextTime;
		}

		public Boolean getNextValid() {
			return this.nextValid;
		}

		public void setNextValid(Boolean nextValid) {
			this.nextValid = nextValid;
		}

		public List<EventInfo> getList() {
			return this.list;
		}

		public void setList(List<EventInfo> list) {
			this.list = list;
		}

		public static class EventInfo {

			private String time;

			private String identifier;

			private String name;

			private String eventType;

			private String outputData;

			public String getTime() {
				return this.time;
			}

			public void setTime(String time) {
				this.time = time;
			}

			public String getIdentifier() {
				return this.identifier;
			}

			public void setIdentifier(String identifier) {
				this.identifier = identifier;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getEventType() {
				return this.eventType;
			}

			public void setEventType(String eventType) {
				this.eventType = eventType;
			}

			public String getOutputData() {
				return this.outputData;
			}

			public void setOutputData(String outputData) {
				this.outputData = outputData;
			}
		}
	}

	@Override
	public QueryDeviceEventDataResponse getInstance(UnmarshallerContext context) {
		return	QueryDeviceEventDataResponseUnmarshaller.unmarshall(this, context);
	}
}
