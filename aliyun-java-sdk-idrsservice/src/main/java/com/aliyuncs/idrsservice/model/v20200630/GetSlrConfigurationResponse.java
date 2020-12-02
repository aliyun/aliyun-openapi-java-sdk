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

package com.aliyuncs.idrsservice.model.v20200630;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.idrsservice.transform.v20200630.GetSlrConfigurationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSlrConfigurationResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Boolean mqSubscribe;

		private String mqEndpoint;

		private String mqInstanceId;

		private String mqTopic;

		private String mqGroupId;

		private List<String> mqEventList;

		public Boolean getMqSubscribe() {
			return this.mqSubscribe;
		}

		public void setMqSubscribe(Boolean mqSubscribe) {
			this.mqSubscribe = mqSubscribe;
		}

		public String getMqEndpoint() {
			return this.mqEndpoint;
		}

		public void setMqEndpoint(String mqEndpoint) {
			this.mqEndpoint = mqEndpoint;
		}

		public String getMqInstanceId() {
			return this.mqInstanceId;
		}

		public void setMqInstanceId(String mqInstanceId) {
			this.mqInstanceId = mqInstanceId;
		}

		public String getMqTopic() {
			return this.mqTopic;
		}

		public void setMqTopic(String mqTopic) {
			this.mqTopic = mqTopic;
		}

		public String getMqGroupId() {
			return this.mqGroupId;
		}

		public void setMqGroupId(String mqGroupId) {
			this.mqGroupId = mqGroupId;
		}

		public List<String> getMqEventList() {
			return this.mqEventList;
		}

		public void setMqEventList(List<String> mqEventList) {
			this.mqEventList = mqEventList;
		}
	}

	@Override
	public GetSlrConfigurationResponse getInstance(UnmarshallerContext context) {
		return	GetSlrConfigurationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
