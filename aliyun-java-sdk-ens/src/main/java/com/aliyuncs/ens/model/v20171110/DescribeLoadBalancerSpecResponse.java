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

package com.aliyuncs.ens.model.v20171110;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ens.transform.v20171110.DescribeLoadBalancerSpecResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLoadBalancerSpecResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<LoadBalancerSpecsItem> loadBalancerSpecs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<LoadBalancerSpecsItem> getLoadBalancerSpecs() {
		return this.loadBalancerSpecs;
	}

	public void setLoadBalancerSpecs(List<LoadBalancerSpecsItem> loadBalancerSpecs) {
		this.loadBalancerSpecs = loadBalancerSpecs;
	}

	public static class LoadBalancerSpecsItem {

		private String displayName;

		private String loadBalancerSpec;

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getLoadBalancerSpec() {
			return this.loadBalancerSpec;
		}

		public void setLoadBalancerSpec(String loadBalancerSpec) {
			this.loadBalancerSpec = loadBalancerSpec;
		}
	}

	@Override
	public DescribeLoadBalancerSpecResponse getInstance(UnmarshallerContext context) {
		return	DescribeLoadBalancerSpecResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
