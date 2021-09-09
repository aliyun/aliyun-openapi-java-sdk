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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.edas.transform.v20170801.GetJavaStartUpConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetJavaStartUpConfigResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private JavaStartUpConfig javaStartUpConfig;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public JavaStartUpConfig getJavaStartUpConfig() {
		return this.javaStartUpConfig;
	}

	public void setJavaStartUpConfig(JavaStartUpConfig javaStartUpConfig) {
		this.javaStartUpConfig = javaStartUpConfig;
	}

	public static class JavaStartUpConfig {

		private String originalConfigs;

		private String startUpArgs;

		public String getOriginalConfigs() {
			return this.originalConfigs;
		}

		public void setOriginalConfigs(String originalConfigs) {
			this.originalConfigs = originalConfigs;
		}

		public String getStartUpArgs() {
			return this.startUpArgs;
		}

		public void setStartUpArgs(String startUpArgs) {
			this.startUpArgs = startUpArgs;
		}
	}

	@Override
	public GetJavaStartUpConfigResponse getInstance(UnmarshallerContext context) {
		return	GetJavaStartUpConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
