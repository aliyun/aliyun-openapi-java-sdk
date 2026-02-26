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

package com.aliyuncs.eflo_controller.model.v20221215;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eflo_controller.transform.v20221215.ListClusterNodesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListClusterNodesResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private List<NodesItem> nodes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<NodesItem> getNodes() {
		return this.nodes;
	}

	public void setNodes(List<NodesItem> nodes) {
		this.nodes = nodes;
	}

	public static class NodesItem {

		private String createTime;

		private String expiredTime;

		private String hostname;

		private String imageId;

		private String machineType;

		private String nodeGroupId;

		private String nodeGroupName;

		private String nodeId;

		private String operatingState;

		private String sn;

		private String zoneId;

		private List<NetworksItem> networks;

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(String expiredTime) {
			this.expiredTime = expiredTime;
		}

		public String getHostname() {
			return this.hostname;
		}

		public void setHostname(String hostname) {
			this.hostname = hostname;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getMachineType() {
			return this.machineType;
		}

		public void setMachineType(String machineType) {
			this.machineType = machineType;
		}

		public String getNodeGroupId() {
			return this.nodeGroupId;
		}

		public void setNodeGroupId(String nodeGroupId) {
			this.nodeGroupId = nodeGroupId;
		}

		public String getNodeGroupName() {
			return this.nodeGroupName;
		}

		public void setNodeGroupName(String nodeGroupName) {
			this.nodeGroupName = nodeGroupName;
		}

		public String getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(String nodeId) {
			this.nodeId = nodeId;
		}

		public String getOperatingState() {
			return this.operatingState;
		}

		public void setOperatingState(String operatingState) {
			this.operatingState = operatingState;
		}

		public String getSn() {
			return this.sn;
		}

		public void setSn(String sn) {
			this.sn = sn;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public List<NetworksItem> getNetworks() {
			return this.networks;
		}

		public void setNetworks(List<NetworksItem> networks) {
			this.networks = networks;
		}

		public static class NetworksItem {

			private String bondName;

			private String ip;

			private String subnetId;

			private String vpdId;

			public String getBondName() {
				return this.bondName;
			}

			public void setBondName(String bondName) {
				this.bondName = bondName;
			}

			public String getIp() {
				return this.ip;
			}

			public void setIp(String ip) {
				this.ip = ip;
			}

			public String getSubnetId() {
				return this.subnetId;
			}

			public void setSubnetId(String subnetId) {
				this.subnetId = subnetId;
			}

			public String getVpdId() {
				return this.vpdId;
			}

			public void setVpdId(String vpdId) {
				this.vpdId = vpdId;
			}
		}
	}

	@Override
	public ListClusterNodesResponse getInstance(UnmarshallerContext context) {
		return	ListClusterNodesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
