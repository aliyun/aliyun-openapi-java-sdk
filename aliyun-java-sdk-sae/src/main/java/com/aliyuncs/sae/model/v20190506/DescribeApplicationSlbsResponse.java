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
import com.aliyuncs.sae.transform.v20190506.DescribeApplicationSlbsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeApplicationSlbsResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String traceId;

	private String errorCode;

	private String code;

	private Boolean success;

	private Data data;

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

	public String getTraceId() {
		return this.traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

		private String internetIp;

		private String internetSlbId;

		private String intranetSlbId;

		private String intranetIp;

		private Boolean internetSlbExpired;

		private Boolean intranetSlbExpired;

		private String internetSlbChargeType;

		private String intranetSlbChargeType;

		private List<IntranetItem> intranet;

		private List<InternetItem> internet;

		public String getInternetIp() {
			return this.internetIp;
		}

		public void setInternetIp(String internetIp) {
			this.internetIp = internetIp;
		}

		public String getInternetSlbId() {
			return this.internetSlbId;
		}

		public void setInternetSlbId(String internetSlbId) {
			this.internetSlbId = internetSlbId;
		}

		public String getIntranetSlbId() {
			return this.intranetSlbId;
		}

		public void setIntranetSlbId(String intranetSlbId) {
			this.intranetSlbId = intranetSlbId;
		}

		public String getIntranetIp() {
			return this.intranetIp;
		}

		public void setIntranetIp(String intranetIp) {
			this.intranetIp = intranetIp;
		}

		public Boolean getInternetSlbExpired() {
			return this.internetSlbExpired;
		}

		public void setInternetSlbExpired(Boolean internetSlbExpired) {
			this.internetSlbExpired = internetSlbExpired;
		}

		public Boolean getIntranetSlbExpired() {
			return this.intranetSlbExpired;
		}

		public void setIntranetSlbExpired(Boolean intranetSlbExpired) {
			this.intranetSlbExpired = intranetSlbExpired;
		}

		public String getInternetSlbChargeType() {
			return this.internetSlbChargeType;
		}

		public void setInternetSlbChargeType(String internetSlbChargeType) {
			this.internetSlbChargeType = internetSlbChargeType;
		}

		public String getIntranetSlbChargeType() {
			return this.intranetSlbChargeType;
		}

		public void setIntranetSlbChargeType(String intranetSlbChargeType) {
			this.intranetSlbChargeType = intranetSlbChargeType;
		}

		public List<IntranetItem> getIntranet() {
			return this.intranet;
		}

		public void setIntranet(List<IntranetItem> intranet) {
			this.intranet = intranet;
		}

		public List<InternetItem> getInternet() {
			return this.internet;
		}

		public void setInternet(List<InternetItem> internet) {
			this.internet = internet;
		}

		public static class IntranetItem {

			private String httpsCertId;

			private String protocol;

			private Integer targetPort;

			private Integer port;

			private String httpsCaCertId;

			private Boolean stickySession;

			private String stickySessionType;

			private Integer cookieTimeout;

			private String cookie;

			public String getHttpsCertId() {
				return this.httpsCertId;
			}

			public void setHttpsCertId(String httpsCertId) {
				this.httpsCertId = httpsCertId;
			}

			public String getBizProtocol() {
				return this.protocol;
			}

			public void setBizProtocol(String protocol) {
				this.protocol = protocol;
			}

			public Integer getTargetPort() {
				return this.targetPort;
			}

			public void setTargetPort(Integer targetPort) {
				this.targetPort = targetPort;
			}

			public Integer getPort() {
				return this.port;
			}

			public void setPort(Integer port) {
				this.port = port;
			}

			public String getHttpsCaCertId() {
				return this.httpsCaCertId;
			}

			public void setHttpsCaCertId(String httpsCaCertId) {
				this.httpsCaCertId = httpsCaCertId;
			}

			public Boolean getStickySession() {
				return this.stickySession;
			}

			public void setStickySession(Boolean stickySession) {
				this.stickySession = stickySession;
			}

			public String getStickySessionType() {
				return this.stickySessionType;
			}

			public void setStickySessionType(String stickySessionType) {
				this.stickySessionType = stickySessionType;
			}

			public Integer getCookieTimeout() {
				return this.cookieTimeout;
			}

			public void setCookieTimeout(Integer cookieTimeout) {
				this.cookieTimeout = cookieTimeout;
			}

			public String getCookie() {
				return this.cookie;
			}

			public void setCookie(String cookie) {
				this.cookie = cookie;
			}
		}

		public static class InternetItem {

			private String httpsCertId;

			private String protocol;

			private Integer targetPort;

			private Integer port;

			private String httpsCaCertId;

			private Boolean stickySession;

			private String stickySessionType;

			private Integer cookieTimeout;

			private String cookie;

			public String getHttpsCertId() {
				return this.httpsCertId;
			}

			public void setHttpsCertId(String httpsCertId) {
				this.httpsCertId = httpsCertId;
			}

			public String getBizProtocol() {
				return this.protocol;
			}

			public void setBizProtocol(String protocol) {
				this.protocol = protocol;
			}

			public Integer getTargetPort() {
				return this.targetPort;
			}

			public void setTargetPort(Integer targetPort) {
				this.targetPort = targetPort;
			}

			public Integer getPort() {
				return this.port;
			}

			public void setPort(Integer port) {
				this.port = port;
			}

			public String getHttpsCaCertId() {
				return this.httpsCaCertId;
			}

			public void setHttpsCaCertId(String httpsCaCertId) {
				this.httpsCaCertId = httpsCaCertId;
			}

			public Boolean getStickySession() {
				return this.stickySession;
			}

			public void setStickySession(Boolean stickySession) {
				this.stickySession = stickySession;
			}

			public String getStickySessionType() {
				return this.stickySessionType;
			}

			public void setStickySessionType(String stickySessionType) {
				this.stickySessionType = stickySessionType;
			}

			public Integer getCookieTimeout() {
				return this.cookieTimeout;
			}

			public void setCookieTimeout(Integer cookieTimeout) {
				this.cookieTimeout = cookieTimeout;
			}

			public String getCookie() {
				return this.cookie;
			}

			public void setCookie(String cookie) {
				this.cookie = cookie;
			}
		}
	}

	@Override
	public DescribeApplicationSlbsResponse getInstance(UnmarshallerContext context) {
		return	DescribeApplicationSlbsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
