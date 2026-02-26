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

package com.aliyuncs.cc5g.model.v20220314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cc5g.transform.v20220314.ListIoTCloudConnectorBackhaulRouteResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListIoTCloudConnectorBackhaulRouteResponse extends AcsResponse {

	private String requestId;

	private String netLinkId;

	private List<RouteEntry> routes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNetLinkId() {
		return this.netLinkId;
	}

	public void setNetLinkId(String netLinkId) {
		this.netLinkId = netLinkId;
	}

	public List<RouteEntry> getRoutes() {
		return this.routes;
	}

	public void setRoutes(List<RouteEntry> routes) {
		this.routes = routes;
	}

	public static class RouteEntry {

		private String destinationCidrBlock;

		private String nextHopId;

		private String nextHopType;

		private String description;

		private String status;

		public String getDestinationCidrBlock() {
			return this.destinationCidrBlock;
		}

		public void setDestinationCidrBlock(String destinationCidrBlock) {
			this.destinationCidrBlock = destinationCidrBlock;
		}

		public String getNextHopId() {
			return this.nextHopId;
		}

		public void setNextHopId(String nextHopId) {
			this.nextHopId = nextHopId;
		}

		public String getNextHopType() {
			return this.nextHopType;
		}

		public void setNextHopType(String nextHopType) {
			this.nextHopType = nextHopType;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public ListIoTCloudConnectorBackhaulRouteResponse getInstance(UnmarshallerContext context) {
		return	ListIoTCloudConnectorBackhaulRouteResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
