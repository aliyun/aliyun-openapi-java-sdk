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

package com.aliyuncs.smartag.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag.transform.v20180313.DescribeSmartAccessGatewaysResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSmartAccessGatewaysResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<SmartAccessGateway> smartAccessGateways;

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

	public List<SmartAccessGateway> getSmartAccessGateways() {
		return this.smartAccessGateways;
	}

	public void setSmartAccessGateways(List<SmartAccessGateway> smartAccessGateways) {
		this.smartAccessGateways = smartAccessGateways;
	}

	public static class SmartAccessGateway {

		private String smartAGId;

		private String name;

		private String city;

		private String maxBandwidth;

		private String status;

		private String cidrBlock;

		private String associatedCcnId;

		private String associatedCcnName;

		private String description;

		private Long createTime;

		private Long endTime;

		private String softwareVersion;

		private String hardwareVersion;

		private String serialNumber;

		private Integer securityLockThreshold;

		public String getSmartAGId() {
			return this.smartAGId;
		}

		public void setSmartAGId(String smartAGId) {
			this.smartAGId = smartAGId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCity() {
			return this.city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getMaxBandwidth() {
			return this.maxBandwidth;
		}

		public void setMaxBandwidth(String maxBandwidth) {
			this.maxBandwidth = maxBandwidth;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCidrBlock() {
			return this.cidrBlock;
		}

		public void setCidrBlock(String cidrBlock) {
			this.cidrBlock = cidrBlock;
		}

		public String getAssociatedCcnId() {
			return this.associatedCcnId;
		}

		public void setAssociatedCcnId(String associatedCcnId) {
			this.associatedCcnId = associatedCcnId;
		}

		public String getAssociatedCcnName() {
			return this.associatedCcnName;
		}

		public void setAssociatedCcnName(String associatedCcnName) {
			this.associatedCcnName = associatedCcnName;
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

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public String getSoftwareVersion() {
			return this.softwareVersion;
		}

		public void setSoftwareVersion(String softwareVersion) {
			this.softwareVersion = softwareVersion;
		}

		public String getHardwareVersion() {
			return this.hardwareVersion;
		}

		public void setHardwareVersion(String hardwareVersion) {
			this.hardwareVersion = hardwareVersion;
		}

		public String getSerialNumber() {
			return this.serialNumber;
		}

		public void setSerialNumber(String serialNumber) {
			this.serialNumber = serialNumber;
		}

		public Integer getSecurityLockThreshold() {
			return this.securityLockThreshold;
		}

		public void setSecurityLockThreshold(Integer securityLockThreshold) {
			this.securityLockThreshold = securityLockThreshold;
		}
	}

	@Override
	public DescribeSmartAccessGatewaysResponse getInstance(UnmarshallerContext context) {
		return	DescribeSmartAccessGatewaysResponseUnmarshaller.unmarshall(this, context);
	}
}
