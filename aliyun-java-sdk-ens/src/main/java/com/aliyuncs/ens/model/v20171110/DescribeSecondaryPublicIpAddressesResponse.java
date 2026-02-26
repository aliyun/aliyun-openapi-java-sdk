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
import com.aliyuncs.ens.transform.v20171110.DescribeSecondaryPublicIpAddressesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSecondaryPublicIpAddressesResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<Ip> secondaryPublicIpAddresses;

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

	public List<Ip> getSecondaryPublicIpAddresses() {
		return this.secondaryPublicIpAddresses;
	}

	public void setSecondaryPublicIpAddresses(List<Ip> secondaryPublicIpAddresses) {
		this.secondaryPublicIpAddresses = secondaryPublicIpAddresses;
	}

	public static class Ip {

		private Integer cidrMask;

		private String gateway;

		private String secondaryPublicIpAddress;

		private String isp;

		private String secondaryPublicIpId;

		private String ensRegionId;

		private String creationTime;

		private String ipVersion;

		public Integer getCidrMask() {
			return this.cidrMask;
		}

		public void setCidrMask(Integer cidrMask) {
			this.cidrMask = cidrMask;
		}

		public String getGateway() {
			return this.gateway;
		}

		public void setGateway(String gateway) {
			this.gateway = gateway;
		}

		public String getSecondaryPublicIpAddress() {
			return this.secondaryPublicIpAddress;
		}

		public void setSecondaryPublicIpAddress(String secondaryPublicIpAddress) {
			this.secondaryPublicIpAddress = secondaryPublicIpAddress;
		}

		public String getIsp() {
			return this.isp;
		}

		public void setIsp(String isp) {
			this.isp = isp;
		}

		public String getSecondaryPublicIpId() {
			return this.secondaryPublicIpId;
		}

		public void setSecondaryPublicIpId(String secondaryPublicIpId) {
			this.secondaryPublicIpId = secondaryPublicIpId;
		}

		public String getEnsRegionId() {
			return this.ensRegionId;
		}

		public void setEnsRegionId(String ensRegionId) {
			this.ensRegionId = ensRegionId;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getIpVersion() {
			return this.ipVersion;
		}

		public void setIpVersion(String ipVersion) {
			this.ipVersion = ipVersion;
		}
	}

	@Override
	public DescribeSecondaryPublicIpAddressesResponse getInstance(UnmarshallerContext context) {
		return	DescribeSecondaryPublicIpAddressesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
