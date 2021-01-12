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

package com.aliyuncs.edas.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.edas.transform.v20170801.UpdateHookConfigurationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateHookConfigurationResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private String message;

	private List<Configuration> hooksConfiguration;

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

	public List<Configuration> getHooksConfiguration() {
		return this.hooksConfiguration;
	}

	public void setHooksConfiguration(List<Configuration> hooksConfiguration) {
		this.hooksConfiguration = hooksConfiguration;
	}

	public static class Configuration {

		private String name;

		private String script;

		private Boolean ignoreFail;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getScript() {
			return this.script;
		}

		public void setScript(String script) {
			this.script = script;
		}

		public Boolean getIgnoreFail() {
			return this.ignoreFail;
		}

		public void setIgnoreFail(Boolean ignoreFail) {
			this.ignoreFail = ignoreFail;
		}
	}

	@Override
	public UpdateHookConfigurationResponse getInstance(UnmarshallerContext context) {
		return	UpdateHookConfigurationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
