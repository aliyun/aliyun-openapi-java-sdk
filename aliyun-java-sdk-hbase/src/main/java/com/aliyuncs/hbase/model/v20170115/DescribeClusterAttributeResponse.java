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

package com.aliyuncs.hbase.model.v20170115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hbase.transform.v20170115.DescribeClusterAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeClusterAttributeResponse extends AcsResponse {

	private String requestId;

	private String coreDiskType;

	private String coreDiskSize;

	private String clusterId;

	private String clusterName;

	private String mainVersion;

	private String status;

	private String clusterType;

	private String hasUser;

	private String lockMode;

	private String haType;

	private String masterInstanceType;

	private String masterDiskType;

	private Integer masterDiskSize;

	private String coreInstanceType;

	private Integer coreInstanceQuantity;

	private Integer coreDiskQuantity;

	private String payType;

	private String autoRenew;

	private String createTime;

	private String expireTime;

	private String regionId;

	private String zoneId;

	private String updateStatus;

	private String coldStorageStatus;

	private String minorVersion;

	private List<Node> nodeList;

	private ConnectionInfo connectionInfo;

	private NetInfo netInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCoreDiskType() {
		return this.coreDiskType;
	}

	public void setCoreDiskType(String coreDiskType) {
		this.coreDiskType = coreDiskType;
	}

	public String getCoreDiskSize() {
		return this.coreDiskSize;
	}

	public void setCoreDiskSize(String coreDiskSize) {
		this.coreDiskSize = coreDiskSize;
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

	public String getMainVersion() {
		return this.mainVersion;
	}

	public void setMainVersion(String mainVersion) {
		this.mainVersion = mainVersion;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getClusterType() {
		return this.clusterType;
	}

	public void setClusterType(String clusterType) {
		this.clusterType = clusterType;
	}

	public String getHasUser() {
		return this.hasUser;
	}

	public void setHasUser(String hasUser) {
		this.hasUser = hasUser;
	}

	public String getLockMode() {
		return this.lockMode;
	}

	public void setLockMode(String lockMode) {
		this.lockMode = lockMode;
	}

	public String getHaType() {
		return this.haType;
	}

	public void setHaType(String haType) {
		this.haType = haType;
	}

	public String getMasterInstanceType() {
		return this.masterInstanceType;
	}

	public void setMasterInstanceType(String masterInstanceType) {
		this.masterInstanceType = masterInstanceType;
	}

	public String getMasterDiskType() {
		return this.masterDiskType;
	}

	public void setMasterDiskType(String masterDiskType) {
		this.masterDiskType = masterDiskType;
	}

	public Integer getMasterDiskSize() {
		return this.masterDiskSize;
	}

	public void setMasterDiskSize(Integer masterDiskSize) {
		this.masterDiskSize = masterDiskSize;
	}

	public String getCoreInstanceType() {
		return this.coreInstanceType;
	}

	public void setCoreInstanceType(String coreInstanceType) {
		this.coreInstanceType = coreInstanceType;
	}

	public Integer getCoreInstanceQuantity() {
		return this.coreInstanceQuantity;
	}

	public void setCoreInstanceQuantity(Integer coreInstanceQuantity) {
		this.coreInstanceQuantity = coreInstanceQuantity;
	}

	public Integer getCoreDiskQuantity() {
		return this.coreDiskQuantity;
	}

	public void setCoreDiskQuantity(Integer coreDiskQuantity) {
		this.coreDiskQuantity = coreDiskQuantity;
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getAutoRenew() {
		return this.autoRenew;
	}

	public void setAutoRenew(String autoRenew) {
		this.autoRenew = autoRenew;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public String getBizRegionId() {
		return this.regionId;
	}

	public void setBizRegionId(String regionId) {
		this.regionId = regionId;
	}

	/**
	 * @deprecated use getBizRegionId instead of this.
	 */
	@Deprecated
	public String getRegionId() {
		return this.regionId;
	}

	/**
	 * @deprecated use setBizRegionId instead of this.
	 */
	@Deprecated
	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}

	public String getUpdateStatus() {
		return this.updateStatus;
	}

	public void setUpdateStatus(String updateStatus) {
		this.updateStatus = updateStatus;
	}

	public String getColdStorageStatus() {
		return this.coldStorageStatus;
	}

	public void setColdStorageStatus(String coldStorageStatus) {
		this.coldStorageStatus = coldStorageStatus;
	}

	public String getMinorVersion() {
		return this.minorVersion;
	}

	public void setMinorVersion(String minorVersion) {
		this.minorVersion = minorVersion;
	}

	public List<Node> getNodeList() {
		return this.nodeList;
	}

	public void setNodeList(List<Node> nodeList) {
		this.nodeList = nodeList;
	}

	public ConnectionInfo getConnectionInfo() {
		return this.connectionInfo;
	}

	public void setConnectionInfo(ConnectionInfo connectionInfo) {
		this.connectionInfo = connectionInfo;
	}

	public NetInfo getNetInfo() {
		return this.netInfo;
	}

	public void setNetInfo(NetInfo netInfo) {
		this.netInfo = netInfo;
	}

	public static class Node {

		private String nodeId;

		private String nodeType;

		private String serviceType;

		private String nodeStatus;

		private String regionQuantity;

		private String memStore;

		private String storeFile;

		private String nodeInstanceType;

		private String nodeDiskType;

		private String nodeDiskSize;

		private String nodeDiskQuantity;

		private List<Daemon> daemonList;

		public String getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(String nodeId) {
			this.nodeId = nodeId;
		}

		public String getNodeType() {
			return this.nodeType;
		}

		public void setNodeType(String nodeType) {
			this.nodeType = nodeType;
		}

		public String getServiceType() {
			return this.serviceType;
		}

		public void setServiceType(String serviceType) {
			this.serviceType = serviceType;
		}

		public String getNodeStatus() {
			return this.nodeStatus;
		}

		public void setNodeStatus(String nodeStatus) {
			this.nodeStatus = nodeStatus;
		}

		public String getRegionQuantity() {
			return this.regionQuantity;
		}

		public void setRegionQuantity(String regionQuantity) {
			this.regionQuantity = regionQuantity;
		}

		public String getMemStore() {
			return this.memStore;
		}

		public void setMemStore(String memStore) {
			this.memStore = memStore;
		}

		public String getStoreFile() {
			return this.storeFile;
		}

		public void setStoreFile(String storeFile) {
			this.storeFile = storeFile;
		}

		public String getNodeInstanceType() {
			return this.nodeInstanceType;
		}

		public void setNodeInstanceType(String nodeInstanceType) {
			this.nodeInstanceType = nodeInstanceType;
		}

		public String getNodeDiskType() {
			return this.nodeDiskType;
		}

		public void setNodeDiskType(String nodeDiskType) {
			this.nodeDiskType = nodeDiskType;
		}

		public String getNodeDiskSize() {
			return this.nodeDiskSize;
		}

		public void setNodeDiskSize(String nodeDiskSize) {
			this.nodeDiskSize = nodeDiskSize;
		}

		public String getNodeDiskQuantity() {
			return this.nodeDiskQuantity;
		}

		public void setNodeDiskQuantity(String nodeDiskQuantity) {
			this.nodeDiskQuantity = nodeDiskQuantity;
		}

		public List<Daemon> getDaemonList() {
			return this.daemonList;
		}

		public void setDaemonList(List<Daemon> daemonList) {
			this.daemonList = daemonList;
		}

		public static class Daemon {

			private String daemonName;

			private String daemonStatus;

			public String getDaemonName() {
				return this.daemonName;
			}

			public void setDaemonName(String daemonName) {
				this.daemonName = daemonName;
			}

			public String getDaemonStatus() {
				return this.daemonStatus;
			}

			public void setDaemonStatus(String daemonStatus) {
				this.daemonStatus = daemonStatus;
			}
		}
	}

	public static class ConnectionInfo {

		private String uIProxyConnectionString;

		private Integer zKPort;

		private String thriftConnectionString;

		private String thriftPort;

		private String haThriftConnectionString;

		private String haThriftPort;

		private String haRestConnectionString;

		private String haRestPort;

		private List<String> zKConnectionStringList;

		private List<String> zKPublicConnectionStringList;

		private List<String> zKInnerConnectionStringList;

		private List<String> zKClassicConnectionStringList;

		public String getUIProxyConnectionString() {
			return this.uIProxyConnectionString;
		}

		public void setUIProxyConnectionString(String uIProxyConnectionString) {
			this.uIProxyConnectionString = uIProxyConnectionString;
		}

		public Integer getZKPort() {
			return this.zKPort;
		}

		public void setZKPort(Integer zKPort) {
			this.zKPort = zKPort;
		}

		public String getThriftConnectionString() {
			return this.thriftConnectionString;
		}

		public void setThriftConnectionString(String thriftConnectionString) {
			this.thriftConnectionString = thriftConnectionString;
		}

		public String getThriftPort() {
			return this.thriftPort;
		}

		public void setThriftPort(String thriftPort) {
			this.thriftPort = thriftPort;
		}

		public String getHaThriftConnectionString() {
			return this.haThriftConnectionString;
		}

		public void setHaThriftConnectionString(String haThriftConnectionString) {
			this.haThriftConnectionString = haThriftConnectionString;
		}

		public String getHaThriftPort() {
			return this.haThriftPort;
		}

		public void setHaThriftPort(String haThriftPort) {
			this.haThriftPort = haThriftPort;
		}

		public String getHaRestConnectionString() {
			return this.haRestConnectionString;
		}

		public void setHaRestConnectionString(String haRestConnectionString) {
			this.haRestConnectionString = haRestConnectionString;
		}

		public String getHaRestPort() {
			return this.haRestPort;
		}

		public void setHaRestPort(String haRestPort) {
			this.haRestPort = haRestPort;
		}

		public List<String> getZKConnectionStringList() {
			return this.zKConnectionStringList;
		}

		public void setZKConnectionStringList(List<String> zKConnectionStringList) {
			this.zKConnectionStringList = zKConnectionStringList;
		}

		public List<String> getZKPublicConnectionStringList() {
			return this.zKPublicConnectionStringList;
		}

		public void setZKPublicConnectionStringList(List<String> zKPublicConnectionStringList) {
			this.zKPublicConnectionStringList = zKPublicConnectionStringList;
		}

		public List<String> getZKInnerConnectionStringList() {
			return this.zKInnerConnectionStringList;
		}

		public void setZKInnerConnectionStringList(List<String> zKInnerConnectionStringList) {
			this.zKInnerConnectionStringList = zKInnerConnectionStringList;
		}

		public List<String> getZKClassicConnectionStringList() {
			return this.zKClassicConnectionStringList;
		}

		public void setZKClassicConnectionStringList(List<String> zKClassicConnectionStringList) {
			this.zKClassicConnectionStringList = zKClassicConnectionStringList;
		}
	}

	public static class NetInfo {

		private String netType;

		private String innerIpAddress;

		private String publicIpAddress;

		private String vpcId;

		private String vSwitchId;

		private String securityIpList;

		public String getNetType() {
			return this.netType;
		}

		public void setNetType(String netType) {
			this.netType = netType;
		}

		public String getInnerIpAddress() {
			return this.innerIpAddress;
		}

		public void setInnerIpAddress(String innerIpAddress) {
			this.innerIpAddress = innerIpAddress;
		}

		public String getPublicIpAddress() {
			return this.publicIpAddress;
		}

		public void setPublicIpAddress(String publicIpAddress) {
			this.publicIpAddress = publicIpAddress;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getSecurityIpList() {
			return this.securityIpList;
		}

		public void setSecurityIpList(String securityIpList) {
			this.securityIpList = securityIpList;
		}
	}

	@Override
	public DescribeClusterAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeClusterAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
