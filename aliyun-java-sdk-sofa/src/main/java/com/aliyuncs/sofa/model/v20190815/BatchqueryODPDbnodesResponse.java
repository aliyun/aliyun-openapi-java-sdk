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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.BatchqueryODPDbnodesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class BatchqueryODPDbnodesResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private Boolean checkDbStatus;

		private String dbType;

		private String description;

		private String envMode;

		private String envTenant;

		private String gmtCreate;

		private String gmtModified;

		private Long id;

		private String lastProbeTime;

		private String netMode;

		private String nodeId;

		private Boolean overMaxRetryCount;

		private String password;

		private String probeFailMsg;

		private String status;

		private String url;

		private String username;

		private String vpcId;

		private List<DatacenterVipMappingItem> datacenterVipMapping;

		public Boolean getCheckDbStatus() {
			return this.checkDbStatus;
		}

		public void setCheckDbStatus(Boolean checkDbStatus) {
			this.checkDbStatus = checkDbStatus;
		}

		public String getDbType() {
			return this.dbType;
		}

		public void setDbType(String dbType) {
			this.dbType = dbType;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getEnvMode() {
			return this.envMode;
		}

		public void setEnvMode(String envMode) {
			this.envMode = envMode;
		}

		public String getEnvTenant() {
			return this.envTenant;
		}

		public void setEnvTenant(String envTenant) {
			this.envTenant = envTenant;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getLastProbeTime() {
			return this.lastProbeTime;
		}

		public void setLastProbeTime(String lastProbeTime) {
			this.lastProbeTime = lastProbeTime;
		}

		public String getNetMode() {
			return this.netMode;
		}

		public void setNetMode(String netMode) {
			this.netMode = netMode;
		}

		public String getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(String nodeId) {
			this.nodeId = nodeId;
		}

		public Boolean getOverMaxRetryCount() {
			return this.overMaxRetryCount;
		}

		public void setOverMaxRetryCount(Boolean overMaxRetryCount) {
			this.overMaxRetryCount = overMaxRetryCount;
		}

		public String getPassword() {
			return this.password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getProbeFailMsg() {
			return this.probeFailMsg;
		}

		public void setProbeFailMsg(String probeFailMsg) {
			this.probeFailMsg = probeFailMsg;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getUsername() {
			return this.username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public List<DatacenterVipMappingItem> getDatacenterVipMapping() {
			return this.datacenterVipMapping;
		}

		public void setDatacenterVipMapping(List<DatacenterVipMappingItem> datacenterVipMapping) {
			this.datacenterVipMapping = datacenterVipMapping;
		}

		public static class DatacenterVipMappingItem {

			private String dataCenter;

			private String dbUrl;

			public String getDataCenter() {
				return this.dataCenter;
			}

			public void setDataCenter(String dataCenter) {
				this.dataCenter = dataCenter;
			}

			public String getDbUrl() {
				return this.dbUrl;
			}

			public void setDbUrl(String dbUrl) {
				this.dbUrl = dbUrl;
			}
		}
	}

	@Override
	public BatchqueryODPDbnodesResponse getInstance(UnmarshallerContext context) {
		return	BatchqueryODPDbnodesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
