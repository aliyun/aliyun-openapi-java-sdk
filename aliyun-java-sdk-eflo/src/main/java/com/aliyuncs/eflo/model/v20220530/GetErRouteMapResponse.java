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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.eflo.transform.v20220530.GetErRouteMapResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetErRouteMapResponse extends AcsResponse {

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

		private String regionId;

		private String tenantId;

		private String gmtCreate;

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

	@Override
	public GetErRouteMapResponse getInstance(UnmarshallerContext context) {
		return	GetErRouteMapResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
