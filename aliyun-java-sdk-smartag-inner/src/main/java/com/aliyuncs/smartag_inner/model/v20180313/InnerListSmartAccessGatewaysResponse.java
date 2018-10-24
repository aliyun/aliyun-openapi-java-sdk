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

package com.aliyuncs.smartag_inner.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag_inner.transform.v20180313.InnerListSmartAccessGatewaysResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerListSmartAccessGatewaysResponse extends AcsResponse {

	private String requestId;

	private Integer total;

	private Integer pageNumber;

	private Integer pageSize;

	private Long aliUid;

	private String bid;

	private List<SmartAccessGateway> smartAccessGateways;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
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

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
	}

	public String getBid() {
		return this.bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public List<SmartAccessGateway> getSmartAccessGateways() {
		return this.smartAccessGateways;
	}

	public void setSmartAccessGateways(List<SmartAccessGateway> smartAccessGateways) {
		this.smartAccessGateways = smartAccessGateways;
	}

	public static class SmartAccessGateway {

		private String instanceId;

		private String name;

		private String city;

		private String maxBandwidth;

		private String status;

		private String cidrBlock;

		private String ccnInstanceId;

		private String ccnName;

		private String description;

		private String createTime;

		private String endTime;

		private String currentVersion;

		private String targetVersion;

		private String softwareVersion;

		private String hardwareVersion;

		private String healthCheckState;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
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

		public String getCcnInstanceId() {
			return this.ccnInstanceId;
		}

		public void setCcnInstanceId(String ccnInstanceId) {
			this.ccnInstanceId = ccnInstanceId;
		}

		public String getCcnName() {
			return this.ccnName;
		}

		public void setCcnName(String ccnName) {
			this.ccnName = ccnName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getCurrentVersion() {
			return this.currentVersion;
		}

		public void setCurrentVersion(String currentVersion) {
			this.currentVersion = currentVersion;
		}

		public String getTargetVersion() {
			return this.targetVersion;
		}

		public void setTargetVersion(String targetVersion) {
			this.targetVersion = targetVersion;
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

		public String getHealthCheckState() {
			return this.healthCheckState;
		}

		public void setHealthCheckState(String healthCheckState) {
			this.healthCheckState = healthCheckState;
		}
	}

	@Override
	public InnerListSmartAccessGatewaysResponse getInstance(UnmarshallerContext context) {
		return	InnerListSmartAccessGatewaysResponseUnmarshaller.unmarshall(this, context);
	}
}
