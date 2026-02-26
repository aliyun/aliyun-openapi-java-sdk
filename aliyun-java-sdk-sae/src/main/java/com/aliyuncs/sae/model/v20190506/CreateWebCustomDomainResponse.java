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

package com.aliyuncs.sae.model.v20190506;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sae.transform.v20190506.CreateWebCustomDomainResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateWebCustomDomainResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Boolean success;

	private Data data;

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

		private String accountId;

		private String createdTime;

		private String defaultForwardingAppName;

		private String domainName;

		private String lastModifiedTime;

		private String namespaceId;

		private String protocol;

		private WebCertConfig webCertConfig;

		private WebTLSConfig webTLSConfig;

		private WebWAFConfig webWAFConfig;

		private RouteConfig routeConfig;

		public String getAccountId() {
			return this.accountId;
		}

		public void setAccountId(String accountId) {
			this.accountId = accountId;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

		public String getDefaultForwardingAppName() {
			return this.defaultForwardingAppName;
		}

		public void setDefaultForwardingAppName(String defaultForwardingAppName) {
			this.defaultForwardingAppName = defaultForwardingAppName;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getLastModifiedTime() {
			return this.lastModifiedTime;
		}

		public void setLastModifiedTime(String lastModifiedTime) {
			this.lastModifiedTime = lastModifiedTime;
		}

		public String getNamespaceId() {
			return this.namespaceId;
		}

		public void setNamespaceId(String namespaceId) {
			this.namespaceId = namespaceId;
		}

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		public WebCertConfig getWebCertConfig() {
			return this.webCertConfig;
		}

		public void setWebCertConfig(WebCertConfig webCertConfig) {
			this.webCertConfig = webCertConfig;
		}

		public WebTLSConfig getWebTLSConfig() {
			return this.webTLSConfig;
		}

		public void setWebTLSConfig(WebTLSConfig webTLSConfig) {
			this.webTLSConfig = webTLSConfig;
		}

		public WebWAFConfig getWebWAFConfig() {
			return this.webWAFConfig;
		}

		public void setWebWAFConfig(WebWAFConfig webWAFConfig) {
			this.webWAFConfig = webWAFConfig;
		}

		public RouteConfig getRouteConfig() {
			return this.routeConfig;
		}

		public void setRouteConfig(RouteConfig routeConfig) {
			this.routeConfig = routeConfig;
		}

		public static class WebCertConfig {

			private String certName;

			private String certificate;

			private String privateKey;

			public String getCertName() {
				return this.certName;
			}

			public void setCertName(String certName) {
				this.certName = certName;
			}

			public String getCertificate() {
				return this.certificate;
			}

			public void setCertificate(String certificate) {
				this.certificate = certificate;
			}

			public String getPrivateKey() {
				return this.privateKey;
			}

			public void setPrivateKey(String privateKey) {
				this.privateKey = privateKey;
			}
		}

		public static class WebTLSConfig {

			private String maxVersion;

			private String minVersion;

			private List<String> cipherSuites;

			public String getMaxVersion() {
				return this.maxVersion;
			}

			public void setMaxVersion(String maxVersion) {
				this.maxVersion = maxVersion;
			}

			public String getMinVersion() {
				return this.minVersion;
			}

			public void setMinVersion(String minVersion) {
				this.minVersion = minVersion;
			}

			public List<String> getCipherSuites() {
				return this.cipherSuites;
			}

			public void setCipherSuites(List<String> cipherSuites) {
				this.cipherSuites = cipherSuites;
			}
		}

		public static class WebWAFConfig {

			private Boolean enableWAF;

			public Boolean getEnableWAF() {
				return this.enableWAF;
			}

			public void setEnableWAF(Boolean enableWAF) {
				this.enableWAF = enableWAF;
			}
		}

		public static class RouteConfig {

			private List<RoutesItem> routes;

			public List<RoutesItem> getRoutes() {
				return this.routes;
			}

			public void setRoutes(List<RoutesItem> routes) {
				this.routes = routes;
			}

			public static class RoutesItem {

				private String path;

				private String applicationName;

				public String getPath() {
					return this.path;
				}

				public void setPath(String path) {
					this.path = path;
				}

				public String getApplicationName() {
					return this.applicationName;
				}

				public void setApplicationName(String applicationName) {
					this.applicationName = applicationName;
				}
			}
		}
	}

	@Override
	public CreateWebCustomDomainResponse getInstance(UnmarshallerContext context) {
		return	CreateWebCustomDomainResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
