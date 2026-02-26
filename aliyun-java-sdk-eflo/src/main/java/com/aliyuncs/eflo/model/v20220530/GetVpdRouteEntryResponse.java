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
import com.aliyuncs.eflo.transform.v20220530.GetVpdRouteEntryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetVpdRouteEntryResponse extends AcsResponse {

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

		private String vpdRouteEntryId;

		private String tenantId;

		private String vpdId;

		private String destinationCidrBlock;

		private String nextHopType;

		private String nextHopId;

		private String routeType;

		private String status;

		private String gmtModified;

		private String resourceGroupId;

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getVpdRouteEntryId() {
			return this.vpdRouteEntryId;
		}

		public void setVpdRouteEntryId(String vpdRouteEntryId) {
			this.vpdRouteEntryId = vpdRouteEntryId;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public String getVpdId() {
			return this.vpdId;
		}

		public void setVpdId(String vpdId) {
			this.vpdId = vpdId;
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

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}
	}

	@Override
	public GetVpdRouteEntryResponse getInstance(UnmarshallerContext context) {
		return	GetVpdRouteEntryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
