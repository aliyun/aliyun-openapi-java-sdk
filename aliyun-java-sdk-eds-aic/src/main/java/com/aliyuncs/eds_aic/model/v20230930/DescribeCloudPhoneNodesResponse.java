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

package com.aliyuncs.eds_aic.model.v20230930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eds_aic.transform.v20230930.DescribeCloudPhoneNodesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCloudPhoneNodesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private String nextToken;

	private Integer maxResults;

	private List<Data> nodeModel;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<Data> getNodeModel() {
		return this.nodeModel;
	}

	public void setNodeModel(List<Data> nodeModel) {
		this.nodeModel = nodeModel;
	}

	public static class Data {

		private String serverType;

		private Integer resolutionWidth;

		private String nodeName;

		private Integer memory;

		private String gmtModified;

		private String cpu;

		private String networkType;

		private String bandwidthPackageId;

		private String instanceType;

		private String status;

		private String vSwitchId;

		private Integer resolutionHeight;

		private String networkId;

		private String bandwidthPackageType;

		private String gmtExpired;

		private Integer phoneCount;

		private String nodePoolId;

		private String gmtCreate;

		private String chargeType;

		private String nodeId;

		private String regionId;

		private Integer shareDataVolume;

		private List<BizTagsItem> bizTags;

		private List<NetworkInfosItem> networkInfos;

		private PhoneDataInfo phoneDataInfo;

		public String getServerType() {
			return this.serverType;
		}

		public void setServerType(String serverType) {
			this.serverType = serverType;
		}

		public Integer getResolutionWidth() {
			return this.resolutionWidth;
		}

		public void setResolutionWidth(Integer resolutionWidth) {
			this.resolutionWidth = resolutionWidth;
		}

		public String getNodeName() {
			return this.nodeName;
		}

		public void setNodeName(String nodeName) {
			this.nodeName = nodeName;
		}

		public Integer getMemory() {
			return this.memory;
		}

		public void setMemory(Integer memory) {
			this.memory = memory;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getCpu() {
			return this.cpu;
		}

		public void setCpu(String cpu) {
			this.cpu = cpu;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public String getBandwidthPackageId() {
			return this.bandwidthPackageId;
		}

		public void setBandwidthPackageId(String bandwidthPackageId) {
			this.bandwidthPackageId = bandwidthPackageId;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public Integer getResolutionHeight() {
			return this.resolutionHeight;
		}

		public void setResolutionHeight(Integer resolutionHeight) {
			this.resolutionHeight = resolutionHeight;
		}

		public String getNetworkId() {
			return this.networkId;
		}

		public void setNetworkId(String networkId) {
			this.networkId = networkId;
		}

		public String getBandwidthPackageType() {
			return this.bandwidthPackageType;
		}

		public void setBandwidthPackageType(String bandwidthPackageType) {
			this.bandwidthPackageType = bandwidthPackageType;
		}

		public String getGmtExpired() {
			return this.gmtExpired;
		}

		public void setGmtExpired(String gmtExpired) {
			this.gmtExpired = gmtExpired;
		}

		public Integer getPhoneCount() {
			return this.phoneCount;
		}

		public void setPhoneCount(Integer phoneCount) {
			this.phoneCount = phoneCount;
		}

		public String getNodePoolId() {
			return this.nodePoolId;
		}

		public void setNodePoolId(String nodePoolId) {
			this.nodePoolId = nodePoolId;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(String nodeId) {
			this.nodeId = nodeId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Integer getShareDataVolume() {
			return this.shareDataVolume;
		}

		public void setShareDataVolume(Integer shareDataVolume) {
			this.shareDataVolume = shareDataVolume;
		}

		public List<BizTagsItem> getBizTags() {
			return this.bizTags;
		}

		public void setBizTags(List<BizTagsItem> bizTags) {
			this.bizTags = bizTags;
		}

		public List<NetworkInfosItem> getNetworkInfos() {
			return this.networkInfos;
		}

		public void setNetworkInfos(List<NetworkInfosItem> networkInfos) {
			this.networkInfos = networkInfos;
		}

		public PhoneDataInfo getPhoneDataInfo() {
			return this.phoneDataInfo;
		}

		public void setPhoneDataInfo(PhoneDataInfo phoneDataInfo) {
			this.phoneDataInfo = phoneDataInfo;
		}

		public static class BizTagsItem {

			private String value;

			private String key;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}
		}

		public static class NetworkInfosItem {

			private String networkType;

			private String vSwitchId;

			private String bandwidthPackageId;

			private String networkId;

			private String bandwidthPackageType;

			public String getNetworkType() {
				return this.networkType;
			}

			public void setNetworkType(String networkType) {
				this.networkType = networkType;
			}

			public String getVSwitchId() {
				return this.vSwitchId;
			}

			public void setVSwitchId(String vSwitchId) {
				this.vSwitchId = vSwitchId;
			}

			public String getBandwidthPackageId() {
				return this.bandwidthPackageId;
			}

			public void setBandwidthPackageId(String bandwidthPackageId) {
				this.bandwidthPackageId = bandwidthPackageId;
			}

			public String getNetworkId() {
				return this.networkId;
			}

			public void setNetworkId(String networkId) {
				this.networkId = networkId;
			}

			public String getBandwidthPackageType() {
				return this.bandwidthPackageType;
			}

			public void setBandwidthPackageType(String bandwidthPackageType) {
				this.bandwidthPackageType = bandwidthPackageType;
			}
		}

		public static class PhoneDataInfo {

			private String phoneDataId;

			private Integer phoneDataVolume;

			public String getPhoneDataId() {
				return this.phoneDataId;
			}

			public void setPhoneDataId(String phoneDataId) {
				this.phoneDataId = phoneDataId;
			}

			public Integer getPhoneDataVolume() {
				return this.phoneDataVolume;
			}

			public void setPhoneDataVolume(Integer phoneDataVolume) {
				this.phoneDataVolume = phoneDataVolume;
			}
		}
	}

	@Override
	public DescribeCloudPhoneNodesResponse getInstance(UnmarshallerContext context) {
		return	DescribeCloudPhoneNodesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
