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

package com.aliyuncs.smartag_inner.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag_inner.transform.v20180313.InnerListCcnRouteEntriesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerListCcnRouteEntriesResponse extends AcsResponse {

	private String requestId;

	private Integer total;

	private Integer pageNumber;

	private Integer pageSize;

	private List<RouteEntry> routeEnties;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<RouteEntry> getRouteEnties() {
		return this.routeEnties;
	}

	public void setRouteEnties(List<RouteEntry> routeEnties) {
		this.routeEnties = routeEnties;
	}

	public static class RouteEntry {

		private String routeTableId;

		private String sourceInstanceId;

		private String sourceInstanceType;

		private String dstCidr;

		private String tunnelId;

		private String nextHop;

		private String nextHopRegion;

		private String rateLimitId;

		public String getRouteTableId() {
			return this.routeTableId;
		}

		public void setRouteTableId(String routeTableId) {
			this.routeTableId = routeTableId;
		}

		public String getSourceInstanceId() {
			return this.sourceInstanceId;
		}

		public void setSourceInstanceId(String sourceInstanceId) {
			this.sourceInstanceId = sourceInstanceId;
		}

		public String getSourceInstanceType() {
			return this.sourceInstanceType;
		}

		public void setSourceInstanceType(String sourceInstanceType) {
			this.sourceInstanceType = sourceInstanceType;
		}

		public String getDstCidr() {
			return this.dstCidr;
		}

		public void setDstCidr(String dstCidr) {
			this.dstCidr = dstCidr;
		}

		public String getTunnelId() {
			return this.tunnelId;
		}

		public void setTunnelId(String tunnelId) {
			this.tunnelId = tunnelId;
		}

		public String getNextHop() {
			return this.nextHop;
		}

		public void setNextHop(String nextHop) {
			this.nextHop = nextHop;
		}

		public String getNextHopRegion() {
			return this.nextHopRegion;
		}

		public void setNextHopRegion(String nextHopRegion) {
			this.nextHopRegion = nextHopRegion;
		}

		public String getRateLimitId() {
			return this.rateLimitId;
		}

		public void setRateLimitId(String rateLimitId) {
			this.rateLimitId = rateLimitId;
		}
	}

	@Override
	public InnerListCcnRouteEntriesResponse getInstance(UnmarshallerContext context) {
		return	InnerListCcnRouteEntriesResponseUnmarshaller.unmarshall(this, context);
	}
}
