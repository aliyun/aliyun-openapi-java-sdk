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

package com.aliyuncs.iotcc.model.v20210513;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iotcc.transform.v20210513.ListIoTCloudConnectorsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListIoTCloudConnectorsResponse extends AcsResponse {

	private Integer totalCount;

	private String nextToken;

	private Integer maxResults;

	private String requestId;

	private List<IoTCloudConnectorModels> ioTCloudConnectors;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<IoTCloudConnectorModels> getIoTCloudConnectors() {
		return this.ioTCloudConnectors;
	}

	public void setIoTCloudConnectors(List<IoTCloudConnectorModels> ioTCloudConnectors) {
		this.ioTCloudConnectors = ioTCloudConnectors;
	}

	public static class IoTCloudConnectorModels {

		private String ioTCloudConnectorId;

		private String ioTCloudConnectorStatus;

		private String iSP;

		private String ioTCloudConnectorBusinessStatus;

		private String aPN;

		private Long rateLimit;

		private String vpcId;

		private String ioTCloudConnectorName;

		private String ioTCloudConnectorDescription;

		private Boolean wildcardDomainEnabled;

		private Long createTime;

		private Long modifyTime;

		private String ioTCloudConnectorGroupId;

		private String mode;

		private String ipFeature;

		private String type;

		private List<String> vSwitchList;

		public String getIoTCloudConnectorId() {
			return this.ioTCloudConnectorId;
		}

		public void setIoTCloudConnectorId(String ioTCloudConnectorId) {
			this.ioTCloudConnectorId = ioTCloudConnectorId;
		}

		public String getIoTCloudConnectorStatus() {
			return this.ioTCloudConnectorStatus;
		}

		public void setIoTCloudConnectorStatus(String ioTCloudConnectorStatus) {
			this.ioTCloudConnectorStatus = ioTCloudConnectorStatus;
		}

		public String getISP() {
			return this.iSP;
		}

		public void setISP(String iSP) {
			this.iSP = iSP;
		}

		public String getIoTCloudConnectorBusinessStatus() {
			return this.ioTCloudConnectorBusinessStatus;
		}

		public void setIoTCloudConnectorBusinessStatus(String ioTCloudConnectorBusinessStatus) {
			this.ioTCloudConnectorBusinessStatus = ioTCloudConnectorBusinessStatus;
		}

		public String getAPN() {
			return this.aPN;
		}

		public void setAPN(String aPN) {
			this.aPN = aPN;
		}

		public Long getRateLimit() {
			return this.rateLimit;
		}

		public void setRateLimit(Long rateLimit) {
			this.rateLimit = rateLimit;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getIoTCloudConnectorName() {
			return this.ioTCloudConnectorName;
		}

		public void setIoTCloudConnectorName(String ioTCloudConnectorName) {
			this.ioTCloudConnectorName = ioTCloudConnectorName;
		}

		public String getIoTCloudConnectorDescription() {
			return this.ioTCloudConnectorDescription;
		}

		public void setIoTCloudConnectorDescription(String ioTCloudConnectorDescription) {
			this.ioTCloudConnectorDescription = ioTCloudConnectorDescription;
		}

		public Boolean getWildcardDomainEnabled() {
			return this.wildcardDomainEnabled;
		}

		public void setWildcardDomainEnabled(Boolean wildcardDomainEnabled) {
			this.wildcardDomainEnabled = wildcardDomainEnabled;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(Long modifyTime) {
			this.modifyTime = modifyTime;
		}

		public String getIoTCloudConnectorGroupId() {
			return this.ioTCloudConnectorGroupId;
		}

		public void setIoTCloudConnectorGroupId(String ioTCloudConnectorGroupId) {
			this.ioTCloudConnectorGroupId = ioTCloudConnectorGroupId;
		}

		public String getMode() {
			return this.mode;
		}

		public void setMode(String mode) {
			this.mode = mode;
		}

		public String getIpFeature() {
			return this.ipFeature;
		}

		public void setIpFeature(String ipFeature) {
			this.ipFeature = ipFeature;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public List<String> getVSwitchList() {
			return this.vSwitchList;
		}

		public void setVSwitchList(List<String> vSwitchList) {
			this.vSwitchList = vSwitchList;
		}
	}

	@Override
	public ListIoTCloudConnectorsResponse getInstance(UnmarshallerContext context) {
		return	ListIoTCloudConnectorsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
