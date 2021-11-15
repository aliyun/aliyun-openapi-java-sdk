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

package com.aliyuncs.uisplus.model.v20200707;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.uisplus.transform.v20200707.DescribeUissResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUissResponse extends AcsResponse {

	private String requestId;

	private Long pageSize;

	private Long page;

	private List<UissItem> uiss;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPage() {
		return this.page;
	}

	public void setPage(Long page) {
		this.page = page;
	}

	public List<UissItem> getUiss() {
		return this.uiss;
	}

	public void setUiss(List<UissItem> uiss) {
		this.uiss = uiss;
	}

	public static class UissItem {

		private String uisId;

		private String networkMode;

		private String wildcardDomainState;

		private String description;

		private String spec;

		private String state;

		private Long createTime;

		private String resourceGroupId;

		private String uisName;

		private String regionId;

		private Long mbpsQuota;

		private Long kppsQuota;

		private Long flowQuota;

		private Long usedMBpsQuota;

		private Long usedKPpsQuota;

		private Long usedFlowQuota;

		public String getUisId() {
			return this.uisId;
		}

		public void setUisId(String uisId) {
			this.uisId = uisId;
		}

		public String getNetworkMode() {
			return this.networkMode;
		}

		public void setNetworkMode(String networkMode) {
			this.networkMode = networkMode;
		}

		public String getWildcardDomainState() {
			return this.wildcardDomainState;
		}

		public void setWildcardDomainState(String wildcardDomainState) {
			this.wildcardDomainState = wildcardDomainState;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getSpec() {
			return this.spec;
		}

		public void setSpec(String spec) {
			this.spec = spec;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getUisName() {
			return this.uisName;
		}

		public void setUisName(String uisName) {
			this.uisName = uisName;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Long getMbpsQuota() {
			return this.mbpsQuota;
		}

		public void setMbpsQuota(Long mbpsQuota) {
			this.mbpsQuota = mbpsQuota;
		}

		public Long getKppsQuota() {
			return this.kppsQuota;
		}

		public void setKppsQuota(Long kppsQuota) {
			this.kppsQuota = kppsQuota;
		}

		public Long getFlowQuota() {
			return this.flowQuota;
		}

		public void setFlowQuota(Long flowQuota) {
			this.flowQuota = flowQuota;
		}

		public Long getUsedMBpsQuota() {
			return this.usedMBpsQuota;
		}

		public void setUsedMBpsQuota(Long usedMBpsQuota) {
			this.usedMBpsQuota = usedMBpsQuota;
		}

		public Long getUsedKPpsQuota() {
			return this.usedKPpsQuota;
		}

		public void setUsedKPpsQuota(Long usedKPpsQuota) {
			this.usedKPpsQuota = usedKPpsQuota;
		}

		public Long getUsedFlowQuota() {
			return this.usedFlowQuota;
		}

		public void setUsedFlowQuota(Long usedFlowQuota) {
			this.usedFlowQuota = usedFlowQuota;
		}
	}

	@Override
	public DescribeUissResponse getInstance(UnmarshallerContext context) {
		return	DescribeUissResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
