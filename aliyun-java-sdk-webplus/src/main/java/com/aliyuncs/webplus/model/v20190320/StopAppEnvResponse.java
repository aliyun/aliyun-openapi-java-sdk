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

package com.aliyuncs.webplus.model.v20190320;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.webplus.transform.v20190320.StopAppEnvResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class StopAppEnvResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private EnvChange envChange;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

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

	public EnvChange getEnvChange() {
		return this.envChange;
	}

	public void setEnvChange(EnvChange envChange) {
		this.envChange = envChange;
	}

	public static class EnvChange {

		private String envId;

		private String changeId;

		private String startTime;

		public String getEnvId() {
			return this.envId;
		}

		public void setEnvId(String envId) {
			this.envId = envId;
		}

		public String getChangeId() {
			return this.changeId;
		}

		public void setChangeId(String changeId) {
			this.changeId = changeId;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}
	}

	@Override
	public StopAppEnvResponse getInstance(UnmarshallerContext context) {
		return	StopAppEnvResponseUnmarshaller.unmarshall(this, context);
	}
}
