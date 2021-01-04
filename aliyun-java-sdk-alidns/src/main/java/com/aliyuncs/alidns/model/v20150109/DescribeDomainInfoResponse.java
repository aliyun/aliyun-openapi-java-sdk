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

package com.aliyuncs.alidns.model.v20150109;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alidns.transform.v20150109.DescribeDomainInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainInfoResponse extends AcsResponse {

	private String requestId;

	private String domainId;

	private String domainName;

	private String punyCode;

	private Boolean aliDomain;

	private String remark;

	private String groupId;

	private String groupName;

	private String instanceId;

	private String versionCode;

	private String versionName;

	private Long minTtl;

	private String recordLineTreeJson;

	private String lineType;

	private Boolean regionLines;

	private Boolean inBlackHole;

	private Boolean inClean;

	private Boolean slaveDns;

	private String resourceGroupId;

	private String createTime;

	private List<RecordLine> recordLines;

	private List<String> dnsServers;

	private List<String> availableTtls;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDomainId() {
		return this.domainId;
	}

	public void setDomainId(String domainId) {
		this.domainId = domainId;
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getPunyCode() {
		return this.punyCode;
	}

	public void setPunyCode(String punyCode) {
		this.punyCode = punyCode;
	}

	public Boolean getAliDomain() {
		return this.aliDomain;
	}

	public void setAliDomain(Boolean aliDomain) {
		this.aliDomain = aliDomain;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getVersionCode() {
		return this.versionCode;
	}

	public void setVersionCode(String versionCode) {
		this.versionCode = versionCode;
	}

	public String getVersionName() {
		return this.versionName;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}

	public Long getMinTtl() {
		return this.minTtl;
	}

	public void setMinTtl(Long minTtl) {
		this.minTtl = minTtl;
	}

	public String getRecordLineTreeJson() {
		return this.recordLineTreeJson;
	}

	public void setRecordLineTreeJson(String recordLineTreeJson) {
		this.recordLineTreeJson = recordLineTreeJson;
	}

	public String getLineType() {
		return this.lineType;
	}

	public void setLineType(String lineType) {
		this.lineType = lineType;
	}

	public Boolean getRegionLines() {
		return this.regionLines;
	}

	public void setRegionLines(Boolean regionLines) {
		this.regionLines = regionLines;
	}

	public Boolean getInBlackHole() {
		return this.inBlackHole;
	}

	public void setInBlackHole(Boolean inBlackHole) {
		this.inBlackHole = inBlackHole;
	}

	public Boolean getInClean() {
		return this.inClean;
	}

	public void setInClean(Boolean inClean) {
		this.inClean = inClean;
	}

	public Boolean getSlaveDns() {
		return this.slaveDns;
	}

	public void setSlaveDns(Boolean slaveDns) {
		this.slaveDns = slaveDns;
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public List<RecordLine> getRecordLines() {
		return this.recordLines;
	}

	public void setRecordLines(List<RecordLine> recordLines) {
		this.recordLines = recordLines;
	}

	public List<String> getDnsServers() {
		return this.dnsServers;
	}

	public void setDnsServers(List<String> dnsServers) {
		this.dnsServers = dnsServers;
	}

	public List<String> getAvailableTtls() {
		return this.availableTtls;
	}

	public void setAvailableTtls(List<String> availableTtls) {
		this.availableTtls = availableTtls;
	}

	public static class RecordLine {

		private String lineCode;

		private String fatherCode;

		private String lineName;

		private String lineDisplayName;

		public String getLineCode() {
			return this.lineCode;
		}

		public void setLineCode(String lineCode) {
			this.lineCode = lineCode;
		}

		public String getFatherCode() {
			return this.fatherCode;
		}

		public void setFatherCode(String fatherCode) {
			this.fatherCode = fatherCode;
		}

		public String getLineName() {
			return this.lineName;
		}

		public void setLineName(String lineName) {
			this.lineName = lineName;
		}

		public String getLineDisplayName() {
			return this.lineDisplayName;
		}

		public void setLineDisplayName(String lineDisplayName) {
			this.lineDisplayName = lineDisplayName;
		}
	}

	@Override
	public DescribeDomainInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
