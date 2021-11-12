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
import com.aliyuncs.uisplus.transform.v20200707.DescribeVnetsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVnetsResponse extends AcsResponse {

	private String requestId;

	private Integer pageSize;

	private Integer pageNumber;

	private Integer totalCount;

	private List<VnetsItem> vnets;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
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

	public List<VnetsItem> getVnets() {
		return this.vnets;
	}

	public void setVnets(List<VnetsItem> vnets) {
		this.vnets = vnets;
	}

	public static class VnetsItem {

		private String uisId;

		private Integer kppsQuota;

		private String wildcardDomainState;

		private String cidrs;

		private String state;

		private Integer flowQuota;

		private Integer mbpsQuota;

		private String vnetId;

		private String name;

		public String getUisId() {
			return this.uisId;
		}

		public void setUisId(String uisId) {
			this.uisId = uisId;
		}

		public Integer getKppsQuota() {
			return this.kppsQuota;
		}

		public void setKppsQuota(Integer kppsQuota) {
			this.kppsQuota = kppsQuota;
		}

		public String getWildcardDomainState() {
			return this.wildcardDomainState;
		}

		public void setWildcardDomainState(String wildcardDomainState) {
			this.wildcardDomainState = wildcardDomainState;
		}

		public String getCidrs() {
			return this.cidrs;
		}

		public void setCidrs(String cidrs) {
			this.cidrs = cidrs;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public Integer getFlowQuota() {
			return this.flowQuota;
		}

		public void setFlowQuota(Integer flowQuota) {
			this.flowQuota = flowQuota;
		}

		public Integer getMbpsQuota() {
			return this.mbpsQuota;
		}

		public void setMbpsQuota(Integer mbpsQuota) {
			this.mbpsQuota = mbpsQuota;
		}

		public String getVnetId() {
			return this.vnetId;
		}

		public void setVnetId(String vnetId) {
			this.vnetId = vnetId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	@Override
	public DescribeVnetsResponse getInstance(UnmarshallerContext context) {
		return	DescribeVnetsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
