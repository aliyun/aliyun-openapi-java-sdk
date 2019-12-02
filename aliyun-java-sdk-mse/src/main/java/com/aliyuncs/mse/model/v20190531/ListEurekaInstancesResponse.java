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

package com.aliyuncs.mse.model.v20190531;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mse.transform.v20190531.ListEurekaInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListEurekaInstancesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String message;

	private String errorCode;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private String httpCode;

	private List<EurekaInstance> data;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getHttpCode() {
		return this.httpCode;
	}

	public void setHttpCode(String httpCode) {
		this.httpCode = httpCode;
	}

	public List<EurekaInstance> getData() {
		return this.data;
	}

	public void setData(List<EurekaInstance> data) {
		this.data = data;
	}

	public static class EurekaInstance {

		private Integer port;

		private Integer securePort;

		private Integer durationInSecs;

		private Integer renewalIntervalInSecs;

		private Long lastUpdatedTimestamp;

		private String app;

		private String ipAddr;

		private String status;

		private String homePageUrl;

		private String instanceId;

		private String vipAddress;

		private String hostName;

		private Map<Object,Object> metadata;

		private Long lastDirtyTimestamp;

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public Integer getSecurePort() {
			return this.securePort;
		}

		public void setSecurePort(Integer securePort) {
			this.securePort = securePort;
		}

		public Integer getDurationInSecs() {
			return this.durationInSecs;
		}

		public void setDurationInSecs(Integer durationInSecs) {
			this.durationInSecs = durationInSecs;
		}

		public Integer getRenewalIntervalInSecs() {
			return this.renewalIntervalInSecs;
		}

		public void setRenewalIntervalInSecs(Integer renewalIntervalInSecs) {
			this.renewalIntervalInSecs = renewalIntervalInSecs;
		}

		public Long getLastUpdatedTimestamp() {
			return this.lastUpdatedTimestamp;
		}

		public void setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
			this.lastUpdatedTimestamp = lastUpdatedTimestamp;
		}

		public String getApp() {
			return this.app;
		}

		public void setApp(String app) {
			this.app = app;
		}

		public String getIpAddr() {
			return this.ipAddr;
		}

		public void setIpAddr(String ipAddr) {
			this.ipAddr = ipAddr;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getHomePageUrl() {
			return this.homePageUrl;
		}

		public void setHomePageUrl(String homePageUrl) {
			this.homePageUrl = homePageUrl;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getVipAddress() {
			return this.vipAddress;
		}

		public void setVipAddress(String vipAddress) {
			this.vipAddress = vipAddress;
		}

		public String getHostName() {
			return this.hostName;
		}

		public void setHostName(String hostName) {
			this.hostName = hostName;
		}

		public Map<Object,Object> getMetadata() {
			return this.metadata;
		}

		public void setMetadata(Map<Object,Object> metadata) {
			this.metadata = metadata;
		}

		public Long getLastDirtyTimestamp() {
			return this.lastDirtyTimestamp;
		}

		public void setLastDirtyTimestamp(Long lastDirtyTimestamp) {
			this.lastDirtyTimestamp = lastDirtyTimestamp;
		}
	}

	@Override
	public ListEurekaInstancesResponse getInstance(UnmarshallerContext context) {
		return	ListEurekaInstancesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
