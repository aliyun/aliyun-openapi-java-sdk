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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.DescribeCustomerGatewaysResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCustomerGatewaysResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<CustomerGateway> customerGateways;

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

	public List<CustomerGateway> getCustomerGateways() {
		return this.customerGateways;
	}

	public void setCustomerGateways(List<CustomerGateway> customerGateways) {
		this.customerGateways = customerGateways;
	}

	public static class CustomerGateway {

		private String customerGatewayId;

		private String name;

		private String ipAddress;

		private String description;

		private Long createTime;

		private Integer asn;

		public String getCustomerGatewayId() {
			return this.customerGatewayId;
		}

		public void setCustomerGatewayId(String customerGatewayId) {
			this.customerGatewayId = customerGatewayId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getIpAddress() {
			return this.ipAddress;
		}

		public void setIpAddress(String ipAddress) {
			this.ipAddress = ipAddress;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Integer getAsn() {
			return this.asn;
		}

		public void setAsn(Integer asn) {
			this.asn = asn;
		}
	}

	@Override
	public DescribeCustomerGatewaysResponse getInstance(UnmarshallerContext context) {
		return	DescribeCustomerGatewaysResponseUnmarshaller.unmarshall(this, context);
	}
}
