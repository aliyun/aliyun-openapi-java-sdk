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

package com.aliyuncs.pvtz.model.v20180101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.pvtz.transform.v20180101.DescribeStatisticSummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeStatisticSummaryResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private List<ZoneRequestTop> zoneRequestTops;

	private List<VpcRequestTop> vpcRequestTops;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<ZoneRequestTop> getZoneRequestTops() {
		return this.zoneRequestTops;
	}

	public void setZoneRequestTops(List<ZoneRequestTop> zoneRequestTops) {
		this.zoneRequestTops = zoneRequestTops;
	}

	public List<VpcRequestTop> getVpcRequestTops() {
		return this.vpcRequestTops;
	}

	public void setVpcRequestTops(List<VpcRequestTop> vpcRequestTops) {
		this.vpcRequestTops = vpcRequestTops;
	}

	public static class ZoneRequestTop {

		private String zoneName;

		private Long requestCount;

		public String getZoneName() {
			return this.zoneName;
		}

		public void setZoneName(String zoneName) {
			this.zoneName = zoneName;
		}

		public Long getRequestCount() {
			return this.requestCount;
		}

		public void setRequestCount(Long requestCount) {
			this.requestCount = requestCount;
		}
	}

	public static class VpcRequestTop {

		private String regionId;

		private String vpcId;

		private String tunnelId;

		private Long requestCount;

		private String regionName;

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getTunnelId() {
			return this.tunnelId;
		}

		public void setTunnelId(String tunnelId) {
			this.tunnelId = tunnelId;
		}

		public Long getRequestCount() {
			return this.requestCount;
		}

		public void setRequestCount(Long requestCount) {
			this.requestCount = requestCount;
		}

		public String getRegionName() {
			return this.regionName;
		}

		public void setRegionName(String regionName) {
			this.regionName = regionName;
		}
	}

	@Override
	public DescribeStatisticSummaryResponse getInstance(UnmarshallerContext context) {
		return	DescribeStatisticSummaryResponseUnmarshaller.unmarshall(this, context);
	}
}
