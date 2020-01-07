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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.retailcloud.transform.v20180313.ListSlbAPsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSlbAPsResponse extends AcsResponse {

	private Integer code;

	private String errorMsg;

	private Integer pageNumber;

	private Integer pageSize;

	private String requestId;

	private Long totalCount;

	private List<SlbAPInstance> data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<SlbAPInstance> getData() {
		return this.data;
	}

	public void setData(List<SlbAPInstance> data) {
		this.data = data;
	}

	public static class SlbAPInstance {

		private Long appId;

		private Integer cookieTimeout;

		private Long envId;

		private Integer establishedTimeout;

		private Integer listenerPort;

		private String name;

		private String networkMode;

		private String protocol;

		private Integer realServerPort;

		private Long slbAPId;

		private String slbId;

		private String slbIp;

		private String sslCertId;

		private Integer stickySession;

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

		public Integer getEstablishedTimeout() {
			return this.establishedTimeout;
		}

		public void setEstablishedTimeout(Integer establishedTimeout) {
			this.establishedTimeout = establishedTimeout;
		}

		public Integer getListenerPort() {
			return this.listenerPort;
		}

		public void setListenerPort(Integer listenerPort) {
			this.listenerPort = listenerPort;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getNetworkMode() {
			return this.networkMode;
		}

		public void setNetworkMode(String networkMode) {
			this.networkMode = networkMode;
		}

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		public Integer getRealServerPort() {
			return this.realServerPort;
		}

		public void setRealServerPort(Integer realServerPort) {
			this.realServerPort = realServerPort;
		}

		public Long getSlbAPId() {
			return this.slbAPId;
		}

		public void setSlbAPId(Long slbAPId) {
			this.slbAPId = slbAPId;
		}

		public String getSlbId() {
			return this.slbId;
		}

		public void setSlbId(String slbId) {
			this.slbId = slbId;
		}

		public String getSlbIp() {
			return this.slbIp;
		}

		public void setSlbIp(String slbIp) {
			this.slbIp = slbIp;
		}

		public String getSslCertId() {
			return this.sslCertId;
		}

		public void setSslCertId(String sslCertId) {
			this.sslCertId = sslCertId;
		}

		public Integer getStickySession() {
			return this.stickySession;
		}

		public void setStickySession(Integer stickySession) {
			this.stickySession = stickySession;
		}
	}

	@Override
	public ListSlbAPsResponse getInstance(UnmarshallerContext context) {
		return	ListSlbAPsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
