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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.CreateEnvPodMonitorResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateEnvPodMonitorResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private String message;

	private Data data;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String matchedMsg;

		private String namespace;

		private String podMonitorName;

		private String matchedTargetCount;

		public String getMatchedMsg() {
			return this.matchedMsg;
		}

		public void setMatchedMsg(String matchedMsg) {
			this.matchedMsg = matchedMsg;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getPodMonitorName() {
			return this.podMonitorName;
		}

		public void setPodMonitorName(String podMonitorName) {
			this.podMonitorName = podMonitorName;
		}

		public String getMatchedTargetCount() {
			return this.matchedTargetCount;
		}

		public void setMatchedTargetCount(String matchedTargetCount) {
			this.matchedTargetCount = matchedTargetCount;
		}
	}

	@Override
	public CreateEnvPodMonitorResponse getInstance(UnmarshallerContext context) {
		return	CreateEnvPodMonitorResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
