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
import com.aliyuncs.ens.transform.v20171110.DescribeLoadBalancersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLoadBalancersResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<LoadBalancer> loadBalancers;

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

	public List<LoadBalancer> getLoadBalancers() {
		return this.loadBalancers;
	}

	public void setLoadBalancers(List<LoadBalancer> loadBalancers) {
		this.loadBalancers = loadBalancers;
	}

	public static class LoadBalancer {

		private String loadBalancerId;

		private String loadBalancerName;

		private String loadBalancerStatus;

		private String address;

		private String ensRegionId;

		private String networkId;

		private String vSwitchId;

		private String createTime;

		private String addressIPVersion;

		public String getLoadBalancerId() {
			return this.loadBalancerId;
		}

		public void setLoadBalancerId(String loadBalancerId) {
			this.loadBalancerId = loadBalancerId;
		}

		public String getLoadBalancerName() {
			return this.loadBalancerName;
		}

		public void setLoadBalancerName(String loadBalancerName) {
			this.loadBalancerName = loadBalancerName;
		}

		public String getLoadBalancerStatus() {
			return this.loadBalancerStatus;
		}

		public void setLoadBalancerStatus(String loadBalancerStatus) {
			this.loadBalancerStatus = loadBalancerStatus;
		}

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getEnsRegionId() {
			return this.ensRegionId;
		}

		public void setEnsRegionId(String ensRegionId) {
			this.ensRegionId = ensRegionId;
		}

		public String getNetworkId() {
			return this.networkId;
		}

		public void setNetworkId(String networkId) {
			this.networkId = networkId;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getAddressIPVersion() {
			return this.addressIPVersion;
		}

		public void setAddressIPVersion(String addressIPVersion) {
			this.addressIPVersion = addressIPVersion;
		}
	}

	@Override
	public DescribeLoadBalancersResponse getInstance(UnmarshallerContext context) {
		return	DescribeLoadBalancersResponseUnmarshaller.unmarshall(this, context);
	}
}
