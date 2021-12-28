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
import com.aliyuncs.ecd.transform.v20200930.DescribeCloudDriveServiceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCloudDriveServiceResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private List<CloudDriveService> cloudDriveServices;

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

	public List<CloudDriveService> getCloudDriveServices() {
		return this.cloudDriveServices;
	}

	public void setCloudDriveServices(List<CloudDriveService> cloudDriveServices) {
		this.cloudDriveServices = cloudDriveServices;
	}

	public static class CloudDriveService {

		private String cdsId;

		private String createTime;

		private String pdsProductName;

		private String cdsChargeType;

		private Long aliUid;

		private String regionId;

		private String pdsAdministrator;

		private Long meteredSize;

		private Long maxSize;

		private String pdsSubdomainId;

		private String cdsReleaseDeadline;

		private String cdsStatus;

		private String cdsChargeStatus;

		private String cdsName;

		private String pdsEndpoint;

		private String pdsUrl;

		private String pdsDomainId;

		private String pdsInitToken;

		public String getCdsId() {
			return this.cdsId;
		}

		public void setCdsId(String cdsId) {
			this.cdsId = cdsId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getPdsProductName() {
			return this.pdsProductName;
		}

		public void setPdsProductName(String pdsProductName) {
			this.pdsProductName = pdsProductName;
		}

		public String getCdsChargeType() {
			return this.cdsChargeType;
		}

		public void setCdsChargeType(String cdsChargeType) {
			this.cdsChargeType = cdsChargeType;
		}

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getPdsAdministrator() {
			return this.pdsAdministrator;
		}

		public void setPdsAdministrator(String pdsAdministrator) {
			this.pdsAdministrator = pdsAdministrator;
		}

		public Long getMeteredSize() {
			return this.meteredSize;
		}

		public void setMeteredSize(Long meteredSize) {
			this.meteredSize = meteredSize;
		}

		public Long getMaxSize() {
			return this.maxSize;
		}

		public void setMaxSize(Long maxSize) {
			this.maxSize = maxSize;
		}

		public String getPdsSubdomainId() {
			return this.pdsSubdomainId;
		}

		public void setPdsSubdomainId(String pdsSubdomainId) {
			this.pdsSubdomainId = pdsSubdomainId;
		}

		public String getCdsReleaseDeadline() {
			return this.cdsReleaseDeadline;
		}

		public void setCdsReleaseDeadline(String cdsReleaseDeadline) {
			this.cdsReleaseDeadline = cdsReleaseDeadline;
		}

		public String getCdsStatus() {
			return this.cdsStatus;
		}

		public void setCdsStatus(String cdsStatus) {
			this.cdsStatus = cdsStatus;
		}

		public String getCdsChargeStatus() {
			return this.cdsChargeStatus;
		}

		public void setCdsChargeStatus(String cdsChargeStatus) {
			this.cdsChargeStatus = cdsChargeStatus;
		}

		public String getCdsName() {
			return this.cdsName;
		}

		public void setCdsName(String cdsName) {
			this.cdsName = cdsName;
		}

		public String getPdsEndpoint() {
			return this.pdsEndpoint;
		}

		public void setPdsEndpoint(String pdsEndpoint) {
			this.pdsEndpoint = pdsEndpoint;
		}

		public String getPdsUrl() {
			return this.pdsUrl;
		}

		public void setPdsUrl(String pdsUrl) {
			this.pdsUrl = pdsUrl;
		}

		public String getPdsDomainId() {
			return this.pdsDomainId;
		}

		public void setPdsDomainId(String pdsDomainId) {
			this.pdsDomainId = pdsDomainId;
		}

		public String getPdsInitToken() {
			return this.pdsInitToken;
		}

		public void setPdsInitToken(String pdsInitToken) {
			this.pdsInitToken = pdsInitToken;
		}
	}

	@Override
	public DescribeCloudDriveServiceResponse getInstance(UnmarshallerContext context) {
		return	DescribeCloudDriveServiceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
