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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.ListClusterCnnfStatusDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListClusterCnnfStatusDetailResponse extends AcsResponse {

	private String requestId;

	private List<StatusDetail> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<StatusDetail> getData() {
		return this.data;
	}

	public void setData(List<StatusDetail> data) {
		this.data = data;
	}

	public static class StatusDetail {

		private String uuid;

		private String clusterId;

		private String instanceId;

		private String machineName;

		private String pluginName;

		private Boolean installed;

		private String status;

		private String internetIp;

		private String intranetIp;

		private Integer machineType;

		private String pluginVersion;

		private String instanceRole;

		private String invalidType;

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getMachineName() {
			return this.machineName;
		}

		public void setMachineName(String machineName) {
			this.machineName = machineName;
		}

		public String getPluginName() {
			return this.pluginName;
		}

		public void setPluginName(String pluginName) {
			this.pluginName = pluginName;
		}

		public Boolean getInstalled() {
			return this.installed;
		}

		public void setInstalled(Boolean installed) {
			this.installed = installed;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

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

		public Integer getMachineType() {
			return this.machineType;
		}

		public void setMachineType(Integer machineType) {
			this.machineType = machineType;
		}

		public String getPluginVersion() {
			return this.pluginVersion;
		}

		public void setPluginVersion(String pluginVersion) {
			this.pluginVersion = pluginVersion;
		}

		public String getInstanceRole() {
			return this.instanceRole;
		}

		public void setInstanceRole(String instanceRole) {
			this.instanceRole = instanceRole;
		}

		public String getInvalidType() {
			return this.invalidType;
		}

		public void setInvalidType(String invalidType) {
			this.invalidType = invalidType;
		}
	}

	@Override
	public ListClusterCnnfStatusDetailResponse getInstance(UnmarshallerContext context) {
		return	ListClusterCnnfStatusDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
