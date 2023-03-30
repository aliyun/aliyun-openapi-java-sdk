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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eflo.transform.v20220530.ListVpdsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListVpdsResponse extends AcsResponse {

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

			private String vpdId;

			private String vpdName;

			private String cidr;

			private String serviceCidr;

			private String status;

			private String message;

			private Integer ncCount;

			private Integer subnetCount;

			private String createTime;

			private String gmtModified;

			private Map<Object,Object> dependence;

			private String resourceGroupId;

			private List<ErInfo> erInfos;

			private List<Tag> tags;

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

			public String getServiceCidr() {
				return this.serviceCidr;
			}

			public void setServiceCidr(String serviceCidr) {
				this.serviceCidr = serviceCidr;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getMessage() {
				return this.message;
			}

			public void setMessage(String message) {
				this.message = message;
			}

			public Integer getNcCount() {
				return this.ncCount;
			}

			public void setNcCount(Integer ncCount) {
				this.ncCount = ncCount;
			}

			public Integer getSubnetCount() {
				return this.subnetCount;
			}

			public void setSubnetCount(Integer subnetCount) {
				this.subnetCount = subnetCount;
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

			public Map<Object,Object> getDependence() {
				return this.dependence;
			}

			public void setDependence(Map<Object,Object> dependence) {
				this.dependence = dependence;
			}

			public String getResourceGroupId() {
				return this.resourceGroupId;
			}

			public void setResourceGroupId(String resourceGroupId) {
				this.resourceGroupId = resourceGroupId;
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
		}
	}

	@Override
	public ListVpdsResponse getInstance(UnmarshallerContext context) {
		return	ListVpdsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
