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
import com.aliyuncs.eflo.transform.v20220530.GetErResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetErResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private String accessDeniedDetail;

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

	public String getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(String accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
	}

	public Content getContent() {
		return this.content;
	}

	public void setContent(Content content) {
		this.content = content;
	}

	public static class Content {

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

		private String resourceGroupId;

		private List<ErAttachment> erAttachments;

		private List<ErRouteMap> erRouteMaps;

		private List<ErRouteEntry> erRouteEntrys;

		private List<Tag> tags;

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

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public List<ErAttachment> getErAttachments() {
			return this.erAttachments;
		}

		public void setErAttachments(List<ErAttachment> erAttachments) {
			this.erAttachments = erAttachments;
		}

		public List<ErRouteMap> getErRouteMaps() {
			return this.erRouteMaps;
		}

		public void setErRouteMaps(List<ErRouteMap> erRouteMaps) {
			this.erRouteMaps = erRouteMaps;
		}

		public List<ErRouteEntry> getErRouteEntrys() {
			return this.erRouteEntrys;
		}

		public void setErRouteEntrys(List<ErRouteEntry> erRouteEntrys) {
			this.erRouteEntrys = erRouteEntrys;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public static class ErAttachment {

			private String status;

			private String message;

			private String resourceGroupId;

			private String instanceId;

			private String createTime;

			private String gmtModified;

			private String erId;

			private Boolean across;

			private String instanceName;

			private String tenantId;

			private String resourceTenantId;

			private Boolean autoReceiveAllRoute;

			private String erAttachmentName;

			private String erAttachmentId;

			private String regionId;

			private String instanceType;

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

			public String getResourceGroupId() {
				return this.resourceGroupId;
			}

			public void setResourceGroupId(String resourceGroupId) {
				this.resourceGroupId = resourceGroupId;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
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

			public String getErId() {
				return this.erId;
			}

			public void setErId(String erId) {
				this.erId = erId;
			}

			public Boolean getAcross() {
				return this.across;
			}

			public void setAcross(Boolean across) {
				this.across = across;
			}

			public String getInstanceName() {
				return this.instanceName;
			}

			public void setInstanceName(String instanceName) {
				this.instanceName = instanceName;
			}

			public String getTenantId() {
				return this.tenantId;
			}

			public void setTenantId(String tenantId) {
				this.tenantId = tenantId;
			}

			public String getResourceTenantId() {
				return this.resourceTenantId;
			}

			public void setResourceTenantId(String resourceTenantId) {
				this.resourceTenantId = resourceTenantId;
			}

			public Boolean getAutoReceiveAllRoute() {
				return this.autoReceiveAllRoute;
			}

			public void setAutoReceiveAllRoute(Boolean autoReceiveAllRoute) {
				this.autoReceiveAllRoute = autoReceiveAllRoute;
			}

			public String getErAttachmentName() {
				return this.erAttachmentName;
			}

			public void setErAttachmentName(String erAttachmentName) {
				this.erAttachmentName = erAttachmentName;
			}

			public String getErAttachmentId() {
				return this.erAttachmentId;
			}

			public void setErAttachmentId(String erAttachmentId) {
				this.erAttachmentId = erAttachmentId;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}
		}

		public static class ErRouteMap {

			private String status;

			private String transmissionInstanceType;

			private String action;

			private String description;

			private String receptionInstanceType;

			private String message;

			private String erRouteMapName;

			private String receptionInstanceId;

			private String resourceGroupId;

			private String createTime;

			private String gmtModified;

			private String erId;

			private String transmissionInstanceName;

			private String destinationCidrBlock;

			private String receptionInstanceOwner;

			private String tenantId;

			private String receptionInstanceName;

			private String erRouteMapId;

			private String transmissionInstanceOwner;

			private String regionId;

			private String transmissionInstanceId;

			private Integer routeMapNum;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getTransmissionInstanceType() {
				return this.transmissionInstanceType;
			}

			public void setTransmissionInstanceType(String transmissionInstanceType) {
				this.transmissionInstanceType = transmissionInstanceType;
			}

			public String getAction() {
				return this.action;
			}

			public void setAction(String action) {
				this.action = action;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getReceptionInstanceType() {
				return this.receptionInstanceType;
			}

			public void setReceptionInstanceType(String receptionInstanceType) {
				this.receptionInstanceType = receptionInstanceType;
			}

			public String getMessage() {
				return this.message;
			}

			public void setMessage(String message) {
				this.message = message;
			}

			public String getErRouteMapName() {
				return this.erRouteMapName;
			}

			public void setErRouteMapName(String erRouteMapName) {
				this.erRouteMapName = erRouteMapName;
			}

			public String getReceptionInstanceId() {
				return this.receptionInstanceId;
			}

			public void setReceptionInstanceId(String receptionInstanceId) {
				this.receptionInstanceId = receptionInstanceId;
			}

			public String getResourceGroupId() {
				return this.resourceGroupId;
			}

			public void setResourceGroupId(String resourceGroupId) {
				this.resourceGroupId = resourceGroupId;
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

			public String getErId() {
				return this.erId;
			}

			public void setErId(String erId) {
				this.erId = erId;
			}

			public String getTransmissionInstanceName() {
				return this.transmissionInstanceName;
			}

			public void setTransmissionInstanceName(String transmissionInstanceName) {
				this.transmissionInstanceName = transmissionInstanceName;
			}

			public String getDestinationCidrBlock() {
				return this.destinationCidrBlock;
			}

			public void setDestinationCidrBlock(String destinationCidrBlock) {
				this.destinationCidrBlock = destinationCidrBlock;
			}

			public String getReceptionInstanceOwner() {
				return this.receptionInstanceOwner;
			}

			public void setReceptionInstanceOwner(String receptionInstanceOwner) {
				this.receptionInstanceOwner = receptionInstanceOwner;
			}

			public String getTenantId() {
				return this.tenantId;
			}

			public void setTenantId(String tenantId) {
				this.tenantId = tenantId;
			}

			public String getReceptionInstanceName() {
				return this.receptionInstanceName;
			}

			public void setReceptionInstanceName(String receptionInstanceName) {
				this.receptionInstanceName = receptionInstanceName;
			}

			public String getErRouteMapId() {
				return this.erRouteMapId;
			}

			public void setErRouteMapId(String erRouteMapId) {
				this.erRouteMapId = erRouteMapId;
			}

			public String getTransmissionInstanceOwner() {
				return this.transmissionInstanceOwner;
			}

			public void setTransmissionInstanceOwner(String transmissionInstanceOwner) {
				this.transmissionInstanceOwner = transmissionInstanceOwner;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getTransmissionInstanceId() {
				return this.transmissionInstanceId;
			}

			public void setTransmissionInstanceId(String transmissionInstanceId) {
				this.transmissionInstanceId = transmissionInstanceId;
			}

			public Integer getRouteMapNum() {
				return this.routeMapNum;
			}

			public void setRouteMapNum(Integer routeMapNum) {
				this.routeMapNum = routeMapNum;
			}
		}

		public static class ErRouteEntry {

			private String status;

			private String nextHopType;

			private String tenantId;

			private String resourceTenantId;

			private String routeType;

			private String erRouteEntryId;

			private String resourceGroupId;

			private String nextHopId;

			private String gmtModified;

			private String erId;

			private String regionId;

			private String destinationCidrBlock;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getNextHopType() {
				return this.nextHopType;
			}

			public void setNextHopType(String nextHopType) {
				this.nextHopType = nextHopType;
			}

			public String getTenantId() {
				return this.tenantId;
			}

			public void setTenantId(String tenantId) {
				this.tenantId = tenantId;
			}

			public String getResourceTenantId() {
				return this.resourceTenantId;
			}

			public void setResourceTenantId(String resourceTenantId) {
				this.resourceTenantId = resourceTenantId;
			}

			public String getRouteType() {
				return this.routeType;
			}

			public void setRouteType(String routeType) {
				this.routeType = routeType;
			}

			public String getErRouteEntryId() {
				return this.erRouteEntryId;
			}

			public void setErRouteEntryId(String erRouteEntryId) {
				this.erRouteEntryId = erRouteEntryId;
			}

			public String getResourceGroupId() {
				return this.resourceGroupId;
			}

			public void setResourceGroupId(String resourceGroupId) {
				this.resourceGroupId = resourceGroupId;
			}

			public String getNextHopId() {
				return this.nextHopId;
			}

			public void setNextHopId(String nextHopId) {
				this.nextHopId = nextHopId;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
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

			public String getDestinationCidrBlock() {
				return this.destinationCidrBlock;
			}

			public void setDestinationCidrBlock(String destinationCidrBlock) {
				this.destinationCidrBlock = destinationCidrBlock;
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

	@Override
	public GetErResponse getInstance(UnmarshallerContext context) {
		return	GetErResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
