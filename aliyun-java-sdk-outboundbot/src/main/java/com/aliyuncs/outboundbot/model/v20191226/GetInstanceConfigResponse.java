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

package com.aliyuncs.outboundbot.model.v20191226;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.outboundbot.transform.v20191226.GetInstanceConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetInstanceConfigResponse extends AcsResponse {

	private String requestId;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private InstanceConfig instanceConfig;

		public InstanceConfig getInstanceConfig() {
			return this.instanceConfig;
		}

		public void setInstanceConfig(InstanceConfig instanceConfig) {
			this.instanceConfig = instanceConfig;
		}

		public static class InstanceConfig {

			private Boolean miniPlaybackSystemSwitch;

			private Boolean newBargeInSystemSwitch;

			private Boolean searchTaskFunctionSwitch;

			public Boolean getMiniPlaybackSystemSwitch() {
				return this.miniPlaybackSystemSwitch;
			}

			public void setMiniPlaybackSystemSwitch(Boolean miniPlaybackSystemSwitch) {
				this.miniPlaybackSystemSwitch = miniPlaybackSystemSwitch;
			}

			public Boolean getNewBargeInSystemSwitch() {
				return this.newBargeInSystemSwitch;
			}

			public void setNewBargeInSystemSwitch(Boolean newBargeInSystemSwitch) {
				this.newBargeInSystemSwitch = newBargeInSystemSwitch;
			}

			public Boolean getSearchTaskFunctionSwitch() {
				return this.searchTaskFunctionSwitch;
			}

			public void setSearchTaskFunctionSwitch(Boolean searchTaskFunctionSwitch) {
				this.searchTaskFunctionSwitch = searchTaskFunctionSwitch;
			}
		}
	}

	@Override
	public GetInstanceConfigResponse getInstance(UnmarshallerContext context) {
		return	GetInstanceConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
