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

package com.aliyuncs.lrg.model.v20191010;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.lrg.transform.v20191010.QueryTagIpWithClusterNameResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryTagIpWithClusterNameResponse extends AcsResponse {

	private String requestId;

	private String status;

	private String details;

	private String reason;

	private String errorCode;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String clusterName;

		private List<ClusterNodeInfoItem> clusterNodeInfo;

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public List<ClusterNodeInfoItem> getClusterNodeInfo() {
			return this.clusterNodeInfo;
		}

		public void setClusterNodeInfo(List<ClusterNodeInfoItem> clusterNodeInfo) {
			this.clusterNodeInfo = clusterNodeInfo;
		}

		public static class ClusterNodeInfoItem {

			private String tagName;

			private List<HostItem> host;

			public String getTagName() {
				return this.tagName;
			}

			public void setTagName(String tagName) {
				this.tagName = tagName;
			}

			public List<HostItem> getHost() {
				return this.host;
			}

			public void setHost(List<HostItem> host) {
				this.host = host;
			}

			public static class HostItem {

				private String ip;

				private String hostName;

				public String getIp() {
					return this.ip;
				}

				public void setIp(String ip) {
					this.ip = ip;
				}

				public String getHostName() {
					return this.hostName;
				}

				public void setHostName(String hostName) {
					this.hostName = hostName;
				}
			}
		}
	}

	@Override
	public QueryTagIpWithClusterNameResponse getInstance(UnmarshallerContext context) {
		return	QueryTagIpWithClusterNameResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
