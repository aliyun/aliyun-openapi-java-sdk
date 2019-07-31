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

	private String code;

	private String errorCode;

	private String message;

	private Boolean success;

	private String traceId;

	private String requestId;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
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

	public String getTraceId() {
		return this.traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
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

		private String internetIp;

		private String intranetIp;

		private List<InternetItem> internet;

		private List<IntranetItem> intranet;

		public String getInternetIp() {
			return this.internetIp;
		}

		public void setInternetIp(String internetIp) {
			this.internetIp = internetIp;
		}

		public String getIntranetIp() {
			return this.intranetIp;
		}

		public void setIntranetIp(String intranetIp) {
			this.intranetIp = intranetIp;
		}

		public List<InternetItem> getInternet() {
			return this.internet;
		}

		public void setInternet(List<InternetItem> internet) {
			this.internet = internet;
		}

		public List<IntranetItem> getIntranet() {
			return this.intranet;
		}

		public void setIntranet(List<IntranetItem> intranet) {
			this.intranet = intranet;
		}

		public static class InternetItem {

			private Integer port;

			private String protocol;

			private Integer targetPort;

			public Integer getPort() {
				return this.port;
			}

			public void setPort(Integer port) {
				this.port = port;
			}

			public String getBizProtocol() {
				return this.protocol;
			}

			public void setBizProtocol(String protocol) {
				this.protocol = protocol;
			}

			/**
			 * @deprecated use getBizProtocol instead of this.
			 */
			@Deprecated
			public String getProtocol() {
				return this.protocol;
			}

			/**
			 * @deprecated use setBizProtocol instead of this.
			 */
			@Deprecated
			public void setProtocol(String protocol) {
				this.protocol = protocol;
			}

			public Integer getTargetPort() {
				return this.targetPort;
			}

			public void setTargetPort(Integer targetPort) {
				this.targetPort = targetPort;
			}
		}

		public static class IntranetItem {

			private Integer port;

			private String protocol;

			private Integer targetPort;

			public Integer getPort() {
				return this.port;
			}

			public void setPort(Integer port) {
				this.port = port;
			}

			public String getBizProtocol() {
				return this.protocol;
			}

			public void setBizProtocol(String protocol) {
				this.protocol = protocol;
			}

			/**
			 * @deprecated use getBizProtocol instead of this.
			 */
			@Deprecated
			public String getProtocol() {
				return this.protocol;
			}

			/**
			 * @deprecated use setBizProtocol instead of this.
			 */
			@Deprecated
			public void setProtocol(String protocol) {
				this.protocol = protocol;
			}

			public Integer getTargetPort() {
				return this.targetPort;
			}

			public void setTargetPort(Integer targetPort) {
				this.targetPort = targetPort;
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
