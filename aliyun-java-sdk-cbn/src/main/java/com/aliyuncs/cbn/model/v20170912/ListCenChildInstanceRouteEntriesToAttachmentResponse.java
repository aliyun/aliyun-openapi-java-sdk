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

package com.aliyuncs.cbn.model.v20170912;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cbn.transform.v20170912.ListCenChildInstanceRouteEntriesToAttachmentResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCenChildInstanceRouteEntriesToAttachmentResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private List<TransitRouterAssociation> routeEntry;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<TransitRouterAssociation> getRouteEntry() {
		return this.routeEntry;
	}

	public void setRouteEntry(List<TransitRouterAssociation> routeEntry) {
		this.routeEntry = routeEntry;
	}

	public static class TransitRouterAssociation {

		private String cenId;

		private String transitRouterAttachmentId;

		private String status;

		private String serviceType;

		private String destinationCidrBlock;

		private String childInstanceRouteTableId;

		private String childInstanceId;

		private String childInstanceRouteNextHopType;

		private String childInstanceRouteNextHopInstanceId;

		public String getCenId() {
			return this.cenId;
		}

		public void setCenId(String cenId) {
			this.cenId = cenId;
		}

		public String getTransitRouterAttachmentId() {
			return this.transitRouterAttachmentId;
		}

		public void setTransitRouterAttachmentId(String transitRouterAttachmentId) {
			this.transitRouterAttachmentId = transitRouterAttachmentId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getServiceType() {
			return this.serviceType;
		}

		public void setServiceType(String serviceType) {
			this.serviceType = serviceType;
		}

		public String getDestinationCidrBlock() {
			return this.destinationCidrBlock;
		}

		public void setDestinationCidrBlock(String destinationCidrBlock) {
			this.destinationCidrBlock = destinationCidrBlock;
		}

		public String getChildInstanceRouteTableId() {
			return this.childInstanceRouteTableId;
		}

		public void setChildInstanceRouteTableId(String childInstanceRouteTableId) {
			this.childInstanceRouteTableId = childInstanceRouteTableId;
		}

		public String getChildInstanceId() {
			return this.childInstanceId;
		}

		public void setChildInstanceId(String childInstanceId) {
			this.childInstanceId = childInstanceId;
		}

		public String getChildInstanceRouteNextHopType() {
			return this.childInstanceRouteNextHopType;
		}

		public void setChildInstanceRouteNextHopType(String childInstanceRouteNextHopType) {
			this.childInstanceRouteNextHopType = childInstanceRouteNextHopType;
		}

		public String getChildInstanceRouteNextHopInstanceId() {
			return this.childInstanceRouteNextHopInstanceId;
		}

		public void setChildInstanceRouteNextHopInstanceId(String childInstanceRouteNextHopInstanceId) {
			this.childInstanceRouteNextHopInstanceId = childInstanceRouteNextHopInstanceId;
		}
	}

	@Override
	public ListCenChildInstanceRouteEntriesToAttachmentResponse getInstance(UnmarshallerContext context) {
		return	ListCenChildInstanceRouteEntriesToAttachmentResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
