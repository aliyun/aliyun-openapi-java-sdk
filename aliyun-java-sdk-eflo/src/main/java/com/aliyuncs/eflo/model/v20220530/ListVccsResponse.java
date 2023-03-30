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

package com.aliyuncs.eflo.model.v20220530;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eflo.transform.v20220530.ListVccsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListVccsResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Content content;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Content getContent() {
		return this.content;
	}

	public void setContent(Content content) {
		this.content = content;
	}

	public static class Content {

		private Long total;

		private List<DataItem> data;

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public List<DataItem> getData() {
			return this.data;
		}

		public void setData(List<DataItem> data) {
			this.data = data;
		}

		public static class DataItem {

			private String tenantId;

			private String regionId;

			private String zoneId;

			private String vccId;

			private String vpdId;

			private String vpcId;

			private String cenId;

			private String vccName;

			private String accessPointId;

			private String lineOperator;

			private String spec;

			private String portType;

			private String status;

			private String currentNode;

			private String message;

			private String createTime;

			private String gmtModified;

			private String taskId;

			private Double rate;

			private String bandwidthStr;

			private String commodityCode;

			private String bgpCidr;

			private String expirationDate;

			private String resourceGroupId;

			private String connectionType;

			private List<ErInfo> erInfos;

			private List<Tag> tags;

			private VpdBaseInfo vpdBaseInfo;

			public String getTenantId() {
				return this.tenantId;
			}

			public void setTenantId(String tenantId) {
				this.tenantId = tenantId;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}

			public String getVccId() {
				return this.vccId;
			}

			public void setVccId(String vccId) {
				this.vccId = vccId;
			}

			public String getVpdId() {
				return this.vpdId;
			}

			public void setVpdId(String vpdId) {
				this.vpdId = vpdId;
			}

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
			}

			public String getCenId() {
				return this.cenId;
			}

			public void setCenId(String cenId) {
				this.cenId = cenId;
			}

			public String getVccName() {
				return this.vccName;
			}

			public void setVccName(String vccName) {
				this.vccName = vccName;
			}

			public String getAccessPointId() {
				return this.accessPointId;
			}

			public void setAccessPointId(String accessPointId) {
				this.accessPointId = accessPointId;
			}

			public String getLineOperator() {
				return this.lineOperator;
			}

			public void setLineOperator(String lineOperator) {
				this.lineOperator = lineOperator;
			}

			public String getSpec() {
				return this.spec;
			}

			public void setSpec(String spec) {
				this.spec = spec;
			}

			public String getPortType() {
				return this.portType;
			}

			public void setPortType(String portType) {
				this.portType = portType;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getCurrentNode() {
				return this.currentNode;
			}

			public void setCurrentNode(String currentNode) {
				this.currentNode = currentNode;
			}

			public String getMessage() {
				return this.message;
			}

			public void setMessage(String message) {
				this.message = message;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getTaskId() {
				return this.taskId;
			}

			public void setTaskId(String taskId) {
				this.taskId = taskId;
			}

			public Double getRate() {
				return this.rate;
			}

			public void setRate(Double rate) {
				this.rate = rate;
			}

			public String getBandwidthStr() {
				return this.bandwidthStr;
			}

			public void setBandwidthStr(String bandwidthStr) {
				this.bandwidthStr = bandwidthStr;
			}

			public String getCommodityCode() {
				return this.commodityCode;
			}

			public void setCommodityCode(String commodityCode) {
				this.commodityCode = commodityCode;
			}

			public String getBgpCidr() {
				return this.bgpCidr;
			}

			public void setBgpCidr(String bgpCidr) {
				this.bgpCidr = bgpCidr;
			}

			public String getExpirationDate() {
				return this.expirationDate;
			}

			public void setExpirationDate(String expirationDate) {
				this.expirationDate = expirationDate;
			}

			public String getResourceGroupId() {
				return this.resourceGroupId;
			}

			public void setResourceGroupId(String resourceGroupId) {
				this.resourceGroupId = resourceGroupId;
			}

			public String getConnectionType() {
				return this.connectionType;
			}

			public void setConnectionType(String connectionType) {
				this.connectionType = connectionType;
			}

			public List<ErInfo> getErInfos() {
				return this.erInfos;
			}

			public void setErInfos(List<ErInfo> erInfos) {
				this.erInfos = erInfos;
			}

			public List<Tag> getTags() {
				return this.tags;
			}

			public void setTags(List<Tag> tags) {
				this.tags = tags;
			}

			public VpdBaseInfo getVpdBaseInfo() {
				return this.vpdBaseInfo;
			}

			public void setVpdBaseInfo(VpdBaseInfo vpdBaseInfo) {
				this.vpdBaseInfo = vpdBaseInfo;
			}

			public static class ErInfo {

				private String createTime;

				private String gmtModified;

				private String message;

				private String erId;

				private String regionId;

				private String tenantId;

				private String status;

				private String erName;

				private String masterZoneId;

				private String description;

				private Long connections;

				private Long routeMaps;

				public String getCreateTime() {
					return this.createTime;
				}

				public void setCreateTime(String createTime) {
					this.createTime = createTime;
				}

				public String getGmtModified() {
					return this.gmtModified;
				}

				public void setGmtModified(String gmtModified) {
					this.gmtModified = gmtModified;
				}

				public String getMessage() {
					return this.message;
				}

				public void setMessage(String message) {
					this.message = message;
				}

				public String getErId() {
					return this.erId;
				}

				public void setErId(String erId) {
					this.erId = erId;
				}

				public String getRegionId() {
					return this.regionId;
				}

				public void setRegionId(String regionId) {
					this.regionId = regionId;
				}

				public String getTenantId() {
					return this.tenantId;
				}

				public void setTenantId(String tenantId) {
					this.tenantId = tenantId;
				}

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public String getErName() {
					return this.erName;
				}

				public void setErName(String erName) {
					this.erName = erName;
				}

				public String getMasterZoneId() {
					return this.masterZoneId;
				}

				public void setMasterZoneId(String masterZoneId) {
					this.masterZoneId = masterZoneId;
				}

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public Long getConnections() {
					return this.connections;
				}

				public void setConnections(Long connections) {
					this.connections = connections;
				}

				public Long getRouteMaps() {
					return this.routeMaps;
				}

				public void setRouteMaps(Long routeMaps) {
					this.routeMaps = routeMaps;
				}
			}

			public static class Tag {

				private String tagKey;

				private String tagValue;

				public String getTagKey() {
					return this.tagKey;
				}

				public void setTagKey(String tagKey) {
					this.tagKey = tagKey;
				}

				public String getTagValue() {
					return this.tagValue;
				}

				public void setTagValue(String tagValue) {
					this.tagValue = tagValue;
				}
			}

			public static class VpdBaseInfo {

				private String vpdId;

				private String vpdName;

				private String cidr;

				private String createTime;

				public String getVpdId() {
					return this.vpdId;
				}

				public void setVpdId(String vpdId) {
					this.vpdId = vpdId;
				}

				public String getVpdName() {
					return this.vpdName;
				}

				public void setVpdName(String vpdName) {
					this.vpdName = vpdName;
				}

				public String getCidr() {
					return this.cidr;
				}

				public void setCidr(String cidr) {
					this.cidr = cidr;
				}

				public String getCreateTime() {
					return this.createTime;
				}

				public void setCreateTime(String createTime) {
					this.createTime = createTime;
				}
			}
		}
	}

	@Override
	public ListVccsResponse getInstance(UnmarshallerContext context) {
		return	ListVccsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
