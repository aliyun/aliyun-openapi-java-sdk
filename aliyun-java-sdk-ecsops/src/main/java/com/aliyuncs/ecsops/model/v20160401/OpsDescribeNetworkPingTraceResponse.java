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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeNetworkPingTraceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeNetworkPingTraceResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer total;

	private Integer pageNo;

	private List<NetworkPingTrace> networkPingTraces;

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

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public List<NetworkPingTrace> getNetworkPingTraces() {
		return this.networkPingTraces;
	}

	public void setNetworkPingTraces(List<NetworkPingTrace> networkPingTraces) {
		this.networkPingTraces = networkPingTraces;
	}

	public static class NetworkPingTrace {

		private String status;

		private String targetResourceIp;

		private String targetResourceId;

		private String networkPingTraceId;

		private String gmtCreate;

		private String resourceIp;

		private String resourceId;

		private String ossFileName;

		private String message;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTargetResourceIp() {
			return this.targetResourceIp;
		}

		public void setTargetResourceIp(String targetResourceIp) {
			this.targetResourceIp = targetResourceIp;
		}

		public String getTargetResourceId() {
			return this.targetResourceId;
		}

		public void setTargetResourceId(String targetResourceId) {
			this.targetResourceId = targetResourceId;
		}

		public String getNetworkPingTraceId() {
			return this.networkPingTraceId;
		}

		public void setNetworkPingTraceId(String networkPingTraceId) {
			this.networkPingTraceId = networkPingTraceId;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getResourceIp() {
			return this.resourceIp;
		}

		public void setResourceIp(String resourceIp) {
			this.resourceIp = resourceIp;
		}

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getOssFileName() {
			return this.ossFileName;
		}

		public void setOssFileName(String ossFileName) {
			this.ossFileName = ossFileName;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
	}

	@Override
	public OpsDescribeNetworkPingTraceResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeNetworkPingTraceResponseUnmarshaller.unmarshall(this, context);
	}
}
