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
import com.aliyuncs.cbn.transform.v20170912.DescribeCenPrivateZoneRoutesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCenPrivateZoneRoutesResponse extends AcsResponse {

	private String requestId;

	private String cenId;

	private String privateZoneDnsServers;

	private Integer pageNumber;

	private Integer totalCount;

	private Integer pageSize;

	private List<PrivateZoneInfo> privateZoneInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCenId() {
		return this.cenId;
	}

	public void setCenId(String cenId) {
		this.cenId = cenId;
	}

	public String getPrivateZoneDnsServers() {
		return this.privateZoneDnsServers;
	}

	public void setPrivateZoneDnsServers(String privateZoneDnsServers) {
		this.privateZoneDnsServers = privateZoneDnsServers;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<PrivateZoneInfo> getPrivateZoneInfos() {
		return this.privateZoneInfos;
	}

	public void setPrivateZoneInfos(List<PrivateZoneInfo> privateZoneInfos) {
		this.privateZoneInfos = privateZoneInfos;
	}

	public static class PrivateZoneInfo {

		private String accessRegionId;

		private String hostRegionId;

		private String hostVpcId;

		private String status;

		public String getAccessRegionId() {
			return this.accessRegionId;
		}

		public void setAccessRegionId(String accessRegionId) {
			this.accessRegionId = accessRegionId;
		}

		public String getHostRegionId() {
			return this.hostRegionId;
		}

		public void setHostRegionId(String hostRegionId) {
			this.hostRegionId = hostRegionId;
		}

		public String getHostVpcId() {
			return this.hostVpcId;
		}

		public void setHostVpcId(String hostVpcId) {
			this.hostVpcId = hostVpcId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public DescribeCenPrivateZoneRoutesResponse getInstance(UnmarshallerContext context) {
		return	DescribeCenPrivateZoneRoutesResponseUnmarshaller.unmarshall(this, context);
	}
}
