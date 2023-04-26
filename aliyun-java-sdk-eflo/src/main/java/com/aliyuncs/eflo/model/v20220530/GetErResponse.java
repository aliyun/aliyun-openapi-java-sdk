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

		private List<ErAttachment> erAttachments;

		private List<ErRouteMap> erRouteMaps;

		private List<ErRouteEntry> erRouteEntrys;

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

		public static class ErAttachment {

			private String createTime;

			private String gmtModified;

			private String message;

			private String status;

			private String regionId;

			private String tenantId;

			private String erAttachmentName;

			private String erAttachmentId;

			private String erId;

			private String instanceType;

			private String instanceId;

			private String instanceName;

			private Boolean autoReceiveAllRoute;

			private Boolean across;

			private String resourceTenantId;

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

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
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

			public String getErId() {
				return this.erId;
			}

			public void setErId(String erId) {
				this.erId = erId;
			}

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getInstanceName() {
				return this.instanceName;
			}

			public void setInstanceName(String instanceName) {
				this.instanceName = instanceName;
			}

			public Boolean getAutoReceiveAllRoute() {
				return this.autoReceiveAllRoute;
			}

			public void setAutoReceiveAllRoute(Boolean autoReceiveAllRoute) {
				this.autoReceiveAllRoute = autoReceiveAllRoute;
			}

			public Boolean getAcross() {
				return this.across;
			}

			public void setAcross(Boolean across) {
				this.across = across;
			}

			public String getResourceTenantId() {
				return this.resourceTenantId;
			}

			public void setResourceTenantId(String resourceTenantId) {
				this.resourceTenantId = resourceTenantId;
			}
		}

		public static class ErRouteMap {

			private String regionId;

			private String tenantId;

			private String createTime;

			private String gmtModified;

			private String message;

			private String status;

			private String erRouteMapName;

			private String erRouteMapId;

			private String erId;

			private Integer routeMapNum;

			private String description;

			private String destinationCidrBlock;

			private String transmissionInstanceName;

			private String transmissionInstanceId;

			private String transmissionInstanceType;

			private String receptionInstanceName;

			private String receptionInstanceId;

			private String receptionInstanceType;

			private String action;

			private String transmissionInstanceOwner;

			private String receptionInstanceOwner;

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

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getErRouteMapName() {
				return this.erRouteMapName;
			}

			public void setErRouteMapName(String erRouteMapName) {
				this.erRouteMapName = erRouteMapName;
			}

			public String getErRouteMapId() {
				return this.erRouteMapId;
			}

			public void setErRouteMapId(String erRouteMapId) {
				this.erRouteMapId = erRouteMapId;
			}

			public String getErId() {
				return this.erId;
			}

			public void setErId(String erId) {
				this.erId = erId;
			}

			public Integer getRouteMapNum() {
				return this.routeMapNum;
			}

			public void setRouteMapNum(Integer routeMapNum) {
				this.routeMapNum = routeMapNum;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getDestinationCidrBlock() {
				return this.destinationCidrBlock;
			}

			public void setDestinationCidrBlock(String destinationCidrBlock) {
				this.destinationCidrBlock = destinationCidrBlock;
			}

			public String getTransmissionInstanceName() {
				return this.transmissionInstanceName;
			}

			public void setTransmissionInstanceName(String transmissionInstanceName) {
				this.transmissionInstanceName = transmissionInstanceName;
			}

			public String getTransmissionInstanceId() {
				return this.transmissionInstanceId;
			}

			public void setTransmissionInstanceId(String transmissionInstanceId) {
				this.transmissionInstanceId = transmissionInstanceId;
			}

			public String getTransmissionInstanceType() {
				return this.transmissionInstanceType;
			}

			public void setTransmissionInstanceType(String transmissionInstanceType) {
				this.transmissionInstanceType = transmissionInstanceType;
			}

			public String getReceptionInstanceName() {
				return this.receptionInstanceName;
			}

			public void setReceptionInstanceName(String receptionInstanceName) {
				this.receptionInstanceName = receptionInstanceName;
			}

			public String getReceptionInstanceId() {
				return this.receptionInstanceId;
			}

			public void setReceptionInstanceId(String receptionInstanceId) {
				this.receptionInstanceId = receptionInstanceId;
			}

			public String getReceptionInstanceType() {
				return this.receptionInstanceType;
			}

			public void setReceptionInstanceType(String receptionInstanceType) {
				this.receptionInstanceType = receptionInstanceType;
			}

			public String getAction() {
				return this.action;
			}

			public void setAction(String action) {
				this.action = action;
			}

			public String getTransmissionInstanceOwner() {
				return this.transmissionInstanceOwner;
			}

			public void setTransmissionInstanceOwner(String transmissionInstanceOwner) {
				this.transmissionInstanceOwner = transmissionInstanceOwner;
			}

			public String getReceptionInstanceOwner() {
				return this.receptionInstanceOwner;
			}

			public void setReceptionInstanceOwner(String receptionInstanceOwner) {
				this.receptionInstanceOwner = receptionInstanceOwner;
			}
		}

		public static class ErRouteEntry {

			private String erId;

			private String tenantId;

			private String resourceTenantId;

			private String regionId;

			private String erRouteEntryId;

			private String destinationCidrBlock;

			private String nextHopType;

			private String nextHopId;

			private String routeType;

			private String status;

			private String gmtModified;

			public String getErId() {
				return this.erId;
			}

			public void setErId(String erId) {
				this.erId = erId;
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

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getErRouteEntryId() {
				return this.erRouteEntryId;
			}

			public void setErRouteEntryId(String erRouteEntryId) {
				this.erRouteEntryId = erRouteEntryId;
			}

			public String getDestinationCidrBlock() {
				return this.destinationCidrBlock;
			}

			public void setDestinationCidrBlock(String destinationCidrBlock) {
				this.destinationCidrBlock = destinationCidrBlock;
			}

			public String getNextHopType() {
				return this.nextHopType;
			}

			public void setNextHopType(String nextHopType) {
				this.nextHopType = nextHopType;
			}

			public String getNextHopId() {
				return this.nextHopId;
			}

			public void setNextHopId(String nextHopId) {
				this.nextHopId = nextHopId;
			}

			public String getRouteType() {
				return this.routeType;
			}

			public void setRouteType(String routeType) {
				this.routeType = routeType;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
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
