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

package com.aliyuncs.smartag.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag.transform.v20180313.DescribeSagRouteListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSagRouteListResponse extends AcsResponse {

	private String requestId;

	private List<Route> routes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Route> getRoutes() {
		return this.routes;
	}

	public void setRoutes(List<Route> routes) {
		this.routes = routes;
	}

	public static class Route {

		private String portName;

		private String routeProtocol;

		private String destinationCidr;

		private String nextHop;

		private String cost;

		private List<String> conflictCidrs;

		public String getPortName() {
			return this.portName;
		}

		public void setPortName(String portName) {
			this.portName = portName;
		}

		public String getRouteProtocol() {
			return this.routeProtocol;
		}

		public void setRouteProtocol(String routeProtocol) {
			this.routeProtocol = routeProtocol;
		}

		public String getDestinationCidr() {
			return this.destinationCidr;
		}

		public void setDestinationCidr(String destinationCidr) {
			this.destinationCidr = destinationCidr;
		}

		public String getNextHop() {
			return this.nextHop;
		}

		public void setNextHop(String nextHop) {
			this.nextHop = nextHop;
		}

		public String getCost() {
			return this.cost;
		}

		public void setCost(String cost) {
			this.cost = cost;
		}

		public List<String> getConflictCidrs() {
			return this.conflictCidrs;
		}

		public void setConflictCidrs(List<String> conflictCidrs) {
			this.conflictCidrs = conflictCidrs;
		}
	}

	@Override
	public DescribeSagRouteListResponse getInstance(UnmarshallerContext context) {
		return	DescribeSagRouteListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
