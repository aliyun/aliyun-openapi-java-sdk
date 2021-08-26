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

package com.aliyuncs.ecd.model.v20200930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.DescribeNetworkPackagesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeNetworkPackagesResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private List<NetworkPackage> networkPackages;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<NetworkPackage> getNetworkPackages() {
		return this.networkPackages;
	}

	public void setNetworkPackages(List<NetworkPackage> networkPackages) {
		this.networkPackages = networkPackages;
	}

	public static class NetworkPackage {

		private String networkPackageId;

		private Integer bandwidth;

		private String expiredTime;

		private String createTime;

		private String officeSiteId;

		private String internetChargeType;

		private String networkPackageStatus;

		private String officeSiteName;

		private List<String> eipAddresses;

		public String getNetworkPackageId() {
			return this.networkPackageId;
		}

		public void setNetworkPackageId(String networkPackageId) {
			this.networkPackageId = networkPackageId;
		}

		public Integer getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Integer bandwidth) {
			this.bandwidth = bandwidth;
		}

		public String getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(String expiredTime) {
			this.expiredTime = expiredTime;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getOfficeSiteId() {
			return this.officeSiteId;
		}

		public void setOfficeSiteId(String officeSiteId) {
			this.officeSiteId = officeSiteId;
		}

		public String getInternetChargeType() {
			return this.internetChargeType;
		}

		public void setInternetChargeType(String internetChargeType) {
			this.internetChargeType = internetChargeType;
		}

		public String getNetworkPackageStatus() {
			return this.networkPackageStatus;
		}

		public void setNetworkPackageStatus(String networkPackageStatus) {
			this.networkPackageStatus = networkPackageStatus;
		}

		public String getOfficeSiteName() {
			return this.officeSiteName;
		}

		public void setOfficeSiteName(String officeSiteName) {
			this.officeSiteName = officeSiteName;
		}

		public List<String> getEipAddresses() {
			return this.eipAddresses;
		}

		public void setEipAddresses(List<String> eipAddresses) {
			this.eipAddresses = eipAddresses;
		}
	}

	@Override
	public DescribeNetworkPackagesResponse getInstance(UnmarshallerContext context) {
		return	DescribeNetworkPackagesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
