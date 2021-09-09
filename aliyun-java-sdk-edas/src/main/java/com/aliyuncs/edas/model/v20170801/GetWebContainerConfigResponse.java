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
import com.aliyuncs.edas.transform.v20170801.GetWebContainerConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetWebContainerConfigResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Integer code;

	private WebContainerConfig webContainerConfig;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public WebContainerConfig getWebContainerConfig() {
		return this.webContainerConfig;
	}

	public void setWebContainerConfig(WebContainerConfig webContainerConfig) {
		this.webContainerConfig = webContainerConfig;
	}

	public static class WebContainerConfig {

		private String contextInputType;

		private String contextPath;

		private Integer httpPort;

		private Integer maxThreads;

		private String serverXml;

		private String uriEncoding;

		private Boolean useAdvancedServerXml;

		private Boolean useBodyEncoding;

		private Boolean useDefaultConfig;

		public String getContextInputType() {
			return this.contextInputType;
		}

		public void setContextInputType(String contextInputType) {
			this.contextInputType = contextInputType;
		}

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

		public String getServerXml() {
			return this.serverXml;
		}

		public void setServerXml(String serverXml) {
			this.serverXml = serverXml;
		}

		public String getUriEncoding() {
			return this.uriEncoding;
		}

		public void setUriEncoding(String uriEncoding) {
			this.uriEncoding = uriEncoding;
		}

		public Boolean getUseAdvancedServerXml() {
			return this.useAdvancedServerXml;
		}

		public void setUseAdvancedServerXml(Boolean useAdvancedServerXml) {
			this.useAdvancedServerXml = useAdvancedServerXml;
		}

		public Boolean getUseBodyEncoding() {
			return this.useBodyEncoding;
		}

		public void setUseBodyEncoding(Boolean useBodyEncoding) {
			this.useBodyEncoding = useBodyEncoding;
		}

		public Boolean getUseDefaultConfig() {
			return this.useDefaultConfig;
		}

		public void setUseDefaultConfig(Boolean useDefaultConfig) {
			this.useDefaultConfig = useDefaultConfig;
		}
	}

	@Override
	public GetWebContainerConfigResponse getInstance(UnmarshallerContext context) {
		return	GetWebContainerConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
