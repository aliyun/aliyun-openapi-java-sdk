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

package com.aliyuncs.retailcloud.model.v20180313;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.retailcloud.transform.v20180313.DescribeSlbAPDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSlbAPDetailResponse extends AcsResponse {

	private Integer code;

	private String errMsg;

	private String requestId;

	private Boolean success;

	private Result result;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getErrMsg() {
		return this.errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
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

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String slbId;

		private String sslCertId;

		private String protocol;

		private Integer listenerPort;

		private Integer realServerPort;

		private String slbIp;

		private Long slbAPId;

		private String networkMode;

		private Integer establishedTimeout;

		private Long appId;

		private Integer cookieTimeout;

		private Long envId;

		private Integer stickySession;

		private String name;

		public String getSlbId() {
			return this.slbId;
		}

		public void setSlbId(String slbId) {
			this.slbId = slbId;
		}

		public String getSslCertId() {
			return this.sslCertId;
		}

		public void setSslCertId(String sslCertId) {
			this.sslCertId = sslCertId;
		}

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		public Integer getListenerPort() {
			return this.listenerPort;
		}

		public void setListenerPort(Integer listenerPort) {
			this.listenerPort = listenerPort;
		}

		public Integer getRealServerPort() {
			return this.realServerPort;
		}

		public void setRealServerPort(Integer realServerPort) {
			this.realServerPort = realServerPort;
		}

		public String getSlbIp() {
			return this.slbIp;
		}

		public void setSlbIp(String slbIp) {
			this.slbIp = slbIp;
		}

		public Long getSlbAPId() {
			return this.slbAPId;
		}

		public void setSlbAPId(Long slbAPId) {
			this.slbAPId = slbAPId;
		}

		public String getNetworkMode() {
			return this.networkMode;
		}

		public void setNetworkMode(String networkMode) {
			this.networkMode = networkMode;
		}

		public Integer getEstablishedTimeout() {
			return this.establishedTimeout;
		}

		public void setEstablishedTimeout(Integer establishedTimeout) {
			this.establishedTimeout = establishedTimeout;
		}

		public Long getAppId() {
			return this.appId;
		}

		public void setAppId(Long appId) {
			this.appId = appId;
		}

		public Integer getCookieTimeout() {
			return this.cookieTimeout;
		}

		public void setCookieTimeout(Integer cookieTimeout) {
			this.cookieTimeout = cookieTimeout;
		}

		public Long getEnvId() {
			return this.envId;
		}

		public void setEnvId(Long envId) {
			this.envId = envId;
		}

		public Integer getStickySession() {
			return this.stickySession;
		}

		public void setStickySession(Integer stickySession) {
			this.stickySession = stickySession;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	@Override
	public DescribeSlbAPDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeSlbAPDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
