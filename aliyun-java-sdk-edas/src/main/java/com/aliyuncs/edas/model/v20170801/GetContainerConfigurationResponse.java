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
import com.aliyuncs.edas.transform.v20170801.GetContainerConfigurationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetContainerConfigurationResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private ContainerConfiguration containerConfiguration;

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

	public ContainerConfiguration getContainerConfiguration() {
		return this.containerConfiguration;
	}

	public void setContainerConfiguration(ContainerConfiguration containerConfiguration) {
		this.containerConfiguration = containerConfiguration;
	}

	public static class ContainerConfiguration {

		private String contextPath;

		private Integer httpPort;

		private Integer maxThreads;

		private String uRIEncoding;

		private Boolean useBodyEncoding;

		public String getContextPath() {
			return this.contextPath;
		}

		public void setContextPath(String contextPath) {
			this.contextPath = contextPath;
		}

		public Integer getHttpPort() {
			return this.httpPort;
		}

		public void setHttpPort(Integer httpPort) {
			this.httpPort = httpPort;
		}

		public Integer getMaxThreads() {
			return this.maxThreads;
		}

		public void setMaxThreads(Integer maxThreads) {
			this.maxThreads = maxThreads;
		}

		public String getURIEncoding() {
			return this.uRIEncoding;
		}

		public void setURIEncoding(String uRIEncoding) {
			this.uRIEncoding = uRIEncoding;
		}

		public Boolean getUseBodyEncoding() {
			return this.useBodyEncoding;
		}

		public void setUseBodyEncoding(Boolean useBodyEncoding) {
			this.useBodyEncoding = useBodyEncoding;
		}
	}

	@Override
	public GetContainerConfigurationResponse getInstance(UnmarshallerContext context) {
		return	GetContainerConfigurationResponseUnmarshaller.unmarshall(this, context);
	}
}
