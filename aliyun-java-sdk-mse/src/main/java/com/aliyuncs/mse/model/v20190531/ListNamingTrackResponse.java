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
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mse.transform.v20190531.ListNamingTrackResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListNamingTrackResponse extends AcsResponse {

	private String httpCode;

	private Long pageSize;

	private Long pageNumber;

	private Long totalCount;

	private String requestId;

	private String message;

	private String errorCode;

	private Boolean success;

	private List<Trace> traces;

	public String getHttpCode() {
		return this.httpCode;
	}

	public void setHttpCode(String httpCode) {
		this.httpCode = httpCode;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

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

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<Trace> getTraces() {
		return this.traces;
	}

	public void setTraces(List<Trace> traces) {
		this.traces = traces;
	}

	public static class Trace {

		private String pushTime;

		private String nodeName;

		private String clientIp;

		private String serverName;

		private String group;

		private String instanceSize;

		private String pushTimeAll;

		private String pushTimeNetwork;

		private String slaTime;

		public String getPushTime() {
			return this.pushTime;
		}

		public void setPushTime(String pushTime) {
			this.pushTime = pushTime;
		}

		public String getNodeName() {
			return this.nodeName;
		}

		public void setNodeName(String nodeName) {
			this.nodeName = nodeName;
		}

		public String getClientIp() {
			return this.clientIp;
		}

		public void setClientIp(String clientIp) {
			this.clientIp = clientIp;
		}

		public String getServerName() {
			return this.serverName;
		}

		public void setServerName(String serverName) {
			this.serverName = serverName;
		}

		public String getGroup() {
			return this.group;
		}

		public void setGroup(String group) {
			this.group = group;
		}

		public String getInstanceSize() {
			return this.instanceSize;
		}

		public void setInstanceSize(String instanceSize) {
			this.instanceSize = instanceSize;
		}

		public String getPushTimeAll() {
			return this.pushTimeAll;
		}

		public void setPushTimeAll(String pushTimeAll) {
			this.pushTimeAll = pushTimeAll;
		}

		public String getPushTimeNetwork() {
			return this.pushTimeNetwork;
		}

		public void setPushTimeNetwork(String pushTimeNetwork) {
			this.pushTimeNetwork = pushTimeNetwork;
		}

		public String getSlaTime() {
			return this.slaTime;
		}

		public void setSlaTime(String slaTime) {
			this.slaTime = slaTime;
		}
	}

	@Override
	public ListNamingTrackResponse getInstance(UnmarshallerContext context) {
		return	ListNamingTrackResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
