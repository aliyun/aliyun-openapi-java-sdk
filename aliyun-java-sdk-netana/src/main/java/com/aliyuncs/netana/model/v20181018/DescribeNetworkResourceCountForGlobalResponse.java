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

package com.aliyuncs.netana.model.v20181018;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.netana.transform.v20181018.DescribeNetworkResourceCountForGlobalResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeNetworkResourceCountForGlobalResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private Integer totalInstancesExpireSoon;

	private String resourceType;

	private Integer totalInstancesExpire;

	private List<RegionSummary> regionSummaries;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalInstancesExpireSoon() {
		return this.totalInstancesExpireSoon;
	}

	public void setTotalInstancesExpireSoon(Integer totalInstancesExpireSoon) {
		this.totalInstancesExpireSoon = totalInstancesExpireSoon;
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public Integer getTotalInstancesExpire() {
		return this.totalInstancesExpire;
	}

	public void setTotalInstancesExpire(Integer totalInstancesExpire) {
		this.totalInstancesExpire = totalInstancesExpire;
	}

	public List<RegionSummary> getRegionSummaries() {
		return this.regionSummaries;
	}

	public void setRegionSummaries(List<RegionSummary> regionSummaries) {
		this.regionSummaries = regionSummaries;
	}

	public static class RegionSummary {

		private Integer instancesExpire;

		private Integer instancesExpireSoon;

		private Integer instances;

		private String regionId;

		public Integer getInstancesExpire() {
			return this.instancesExpire;
		}

		public void setInstancesExpire(Integer instancesExpire) {
			this.instancesExpire = instancesExpire;
		}

		public Integer getInstancesExpireSoon() {
			return this.instancesExpireSoon;
		}

		public void setInstancesExpireSoon(Integer instancesExpireSoon) {
			this.instancesExpireSoon = instancesExpireSoon;
		}

		public Integer getInstances() {
			return this.instances;
		}

		public void setInstances(Integer instances) {
			this.instances = instances;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}
	}

	@Override
	public DescribeNetworkResourceCountForGlobalResponse getInstance(UnmarshallerContext context) {
		return	DescribeNetworkResourceCountForGlobalResponseUnmarshaller.unmarshall(this, context);
	}
}
