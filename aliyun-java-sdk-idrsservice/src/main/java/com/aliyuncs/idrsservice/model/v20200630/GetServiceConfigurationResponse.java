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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.idrsservice.transform.v20200630.GetServiceConfigurationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetServiceConfigurationResponse extends AcsResponse {

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

		private Integer clientQueueSize;

		private Boolean liveRecordAll;

		private Boolean liveRecordEveryOne;

		private Integer liveRecordLayout;

		private String liveRecordTaskProfile;

		private Integer taskItemQueueSize;

		public Integer getClientQueueSize() {
			return this.clientQueueSize;
		}

		public void setClientQueueSize(Integer clientQueueSize) {
			this.clientQueueSize = clientQueueSize;
		}

		public Boolean getLiveRecordAll() {
			return this.liveRecordAll;
		}

		public void setLiveRecordAll(Boolean liveRecordAll) {
			this.liveRecordAll = liveRecordAll;
		}

		public Boolean getLiveRecordEveryOne() {
			return this.liveRecordEveryOne;
		}

		public void setLiveRecordEveryOne(Boolean liveRecordEveryOne) {
			this.liveRecordEveryOne = liveRecordEveryOne;
		}

		public Integer getLiveRecordLayout() {
			return this.liveRecordLayout;
		}

		public void setLiveRecordLayout(Integer liveRecordLayout) {
			this.liveRecordLayout = liveRecordLayout;
		}

		public String getLiveRecordTaskProfile() {
			return this.liveRecordTaskProfile;
		}

		public void setLiveRecordTaskProfile(String liveRecordTaskProfile) {
			this.liveRecordTaskProfile = liveRecordTaskProfile;
		}

		public Integer getTaskItemQueueSize() {
			return this.taskItemQueueSize;
		}

		public void setTaskItemQueueSize(Integer taskItemQueueSize) {
			this.taskItemQueueSize = taskItemQueueSize;
		}
	}

	@Override
	public GetServiceConfigurationResponse getInstance(UnmarshallerContext context) {
		return	GetServiceConfigurationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
