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
import com.aliyuncs.eflo_controller.transform.v20221215.DescribeNodeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeNodeResponse extends AcsResponse {

	private String requestId;

	private String nodeGroupName;

	private String clusterId;

	private String clusterName;

	private String zoneId;

	private String createTime;

	private String nodeGroupId;

	private String hostname;

	private String imageId;

	private String machineType;

	private String nodeId;

	private String sn;

	private String operatingState;

	private String expiredTime;

	private List<NetworksItem> networks;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNodeGroupName() {
		return this.nodeGroupName;
	}

	public void setNodeGroupName(String nodeGroupName) {
		this.nodeGroupName = nodeGroupName;
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}

	public String getClusterName() {
		return this.clusterName;
	}

	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getNodeGroupId() {
		return this.nodeGroupId;
	}

	public void setNodeGroupId(String nodeGroupId) {
		this.nodeGroupId = nodeGroupId;
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

	public String getNodeId() {
		return this.nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	public String getSn() {
		return this.sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getOperatingState() {
		return this.operatingState;
	}

	public void setOperatingState(String operatingState) {
		this.operatingState = operatingState;
	}

	public String getExpiredTime() {
		return this.expiredTime;
	}

	public void setExpiredTime(String expiredTime) {
		this.expiredTime = expiredTime;
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

	@Override
	public DescribeNodeResponse getInstance(UnmarshallerContext context) {
		return	DescribeNodeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
