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
import com.aliyuncs.cbn.transform.v20170912.DescribeRouteServicesInCenResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRouteServicesInCenResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<RouteServiceEntry> routeServiceEntries;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
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

	public List<RouteServiceEntry> getRouteServiceEntries() {
		return this.routeServiceEntries;
	}

	public void setRouteServiceEntries(List<RouteServiceEntry> routeServiceEntries) {
		this.routeServiceEntries = routeServiceEntries;
	}

	public static class RouteServiceEntry {

		private String cenId;

		private String host;

		private String hostRegionId;

		private String accessRegionId;

		private String updateInterval;

		private String status;

		private String hostVpcId;

		private String description;

		private List<String> cidrs;

		public String getCenId() {
			return this.cenId;
		}

		public void setCenId(String cenId) {
			this.cenId = cenId;
		}

		public String getHost() {
			return this.host;
		}

		public void setHost(String host) {
			this.host = host;
		}

		public String getHostRegionId() {
			return this.hostRegionId;
		}

		public void setHostRegionId(String hostRegionId) {
			this.hostRegionId = hostRegionId;
		}

		public String getAccessRegionId() {
			return this.accessRegionId;
		}

		public void setAccessRegionId(String accessRegionId) {
			this.accessRegionId = accessRegionId;
		}

		public String getUpdateInterval() {
			return this.updateInterval;
		}

		public void setUpdateInterval(String updateInterval) {
			this.updateInterval = updateInterval;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getHostVpcId() {
			return this.hostVpcId;
		}

		public void setHostVpcId(String hostVpcId) {
			this.hostVpcId = hostVpcId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public List<String> getCidrs() {
			return this.cidrs;
		}

		public void setCidrs(List<String> cidrs) {
			this.cidrs = cidrs;
		}
	}

	@Override
	public DescribeRouteServicesInCenResponse getInstance(UnmarshallerContext context) {
		return	DescribeRouteServicesInCenResponseUnmarshaller.unmarshall(this, context);
	}
}
