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

package com.aliyuncs.cloudapi.model.v20160714;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudapi.transform.v20160714.DescribeApiGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeApiGroupResponse extends AcsResponse {

	private String status;

	private String compatibleFlags;

	private String basePath;

	private String ipv6Status;

	private String userLogConfig;

	private String customerConfigs;

	private String requestId;

	private String description;

	private String httpsPolicy;

	private String subDomain;

	private String createdTime;

	private String rpcPattern;

	private String defaultDomain;

	private String cmsMonitorGroup;

	private String billingStatus;

	private Integer trafficLimit;

	private String passthroughHeaders;

	private String instanceId;

	private String vpcDomain;

	private String instanceType;

	private String customTraceConfig;

	private String regionId;

	private String modifiedTime;

	private String groupId;

	private String groupName;

	private String classicVpcSubDomain;

	private String illegalStatus;

	private String instanceVipList;

	private String vpcSlbIntranetDomain;

	private Boolean cloudMarketCommodity;

	private List<DomainItem> customDomains;

	private List<StageInfo> stageItems;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCompatibleFlags() {
		return this.compatibleFlags;
	}

	public void setCompatibleFlags(String compatibleFlags) {
		this.compatibleFlags = compatibleFlags;
	}

	public String getBasePath() {
		return this.basePath;
	}

	public void setBasePath(String basePath) {
		this.basePath = basePath;
	}

	public String getIpv6Status() {
		return this.ipv6Status;
	}

	public void setIpv6Status(String ipv6Status) {
		this.ipv6Status = ipv6Status;
	}

	public String getUserLogConfig() {
		return this.userLogConfig;
	}

	public void setUserLogConfig(String userLogConfig) {
		this.userLogConfig = userLogConfig;
	}

	public String getCustomerConfigs() {
		return this.customerConfigs;
	}

	public void setCustomerConfigs(String customerConfigs) {
		this.customerConfigs = customerConfigs;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHttpsPolicy() {
		return this.httpsPolicy;
	}

	public void setHttpsPolicy(String httpsPolicy) {
		this.httpsPolicy = httpsPolicy;
	}

	public String getSubDomain() {
		return this.subDomain;
	}

	public void setSubDomain(String subDomain) {
		this.subDomain = subDomain;
	}

	public String getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	public String getRpcPattern() {
		return this.rpcPattern;
	}

	public void setRpcPattern(String rpcPattern) {
		this.rpcPattern = rpcPattern;
	}

	public String getDefaultDomain() {
		return this.defaultDomain;
	}

	public void setDefaultDomain(String defaultDomain) {
		this.defaultDomain = defaultDomain;
	}

	public String getCmsMonitorGroup() {
		return this.cmsMonitorGroup;
	}

	public void setCmsMonitorGroup(String cmsMonitorGroup) {
		this.cmsMonitorGroup = cmsMonitorGroup;
	}

	public String getBillingStatus() {
		return this.billingStatus;
	}

	public void setBillingStatus(String billingStatus) {
		this.billingStatus = billingStatus;
	}

	public Integer getTrafficLimit() {
		return this.trafficLimit;
	}

	public void setTrafficLimit(Integer trafficLimit) {
		this.trafficLimit = trafficLimit;
	}

	public String getPassthroughHeaders() {
		return this.passthroughHeaders;
	}

	public void setPassthroughHeaders(String passthroughHeaders) {
		this.passthroughHeaders = passthroughHeaders;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getVpcDomain() {
		return this.vpcDomain;
	}

	public void setVpcDomain(String vpcDomain) {
		this.vpcDomain = vpcDomain;
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
	}

	public String getCustomTraceConfig() {
		return this.customTraceConfig;
	}

	public void setCustomTraceConfig(String customTraceConfig) {
		this.customTraceConfig = customTraceConfig;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getModifiedTime() {
		return this.modifiedTime;
	}

	public void setModifiedTime(String modifiedTime) {
		this.modifiedTime = modifiedTime;
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

	public String getClassicVpcSubDomain() {
		return this.classicVpcSubDomain;
	}

	public void setClassicVpcSubDomain(String classicVpcSubDomain) {
		this.classicVpcSubDomain = classicVpcSubDomain;
	}

	public String getIllegalStatus() {
		return this.illegalStatus;
	}

	public void setIllegalStatus(String illegalStatus) {
		this.illegalStatus = illegalStatus;
	}

	public String getInstanceVipList() {
		return this.instanceVipList;
	}

	public void setInstanceVipList(String instanceVipList) {
		this.instanceVipList = instanceVipList;
	}

	public String getVpcSlbIntranetDomain() {
		return this.vpcSlbIntranetDomain;
	}

	public void setVpcSlbIntranetDomain(String vpcSlbIntranetDomain) {
		this.vpcSlbIntranetDomain = vpcSlbIntranetDomain;
	}

	public Boolean getCloudMarketCommodity() {
		return this.cloudMarketCommodity;
	}

	public void setCloudMarketCommodity(Boolean cloudMarketCommodity) {
		this.cloudMarketCommodity = cloudMarketCommodity;
	}

	public List<DomainItem> getCustomDomains() {
		return this.customDomains;
	}

	public void setCustomDomains(List<DomainItem> customDomains) {
		this.customDomains = customDomains;
	}

	public List<StageInfo> getStageItems() {
		return this.stageItems;
	}

	public void setStageItems(List<StageInfo> stageItems) {
		this.stageItems = stageItems;
	}

	public static class DomainItem {

		private String bindStageName;

		private String domainLegalStatus;

		private String certificateName;

		private String customDomainType;

		private String domainCNAMEStatus;

		private String wildcardDomainPatterns;

		private String domainBindingStatus;

		private String domainName;

		private String domainRemark;

		private String domainWebSocketStatus;

		private String certificateId;

		private Boolean isHttpRedirectToHttps;

		private String wssEnable;

		public String getBindStageName() {
			return this.bindStageName;
		}

		public void setBindStageName(String bindStageName) {
			this.bindStageName = bindStageName;
		}

		public String getDomainLegalStatus() {
			return this.domainLegalStatus;
		}

		public void setDomainLegalStatus(String domainLegalStatus) {
			this.domainLegalStatus = domainLegalStatus;
		}

		public String getCertificateName() {
			return this.certificateName;
		}

		public void setCertificateName(String certificateName) {
			this.certificateName = certificateName;
		}

		public String getCustomDomainType() {
			return this.customDomainType;
		}

		public void setCustomDomainType(String customDomainType) {
			this.customDomainType = customDomainType;
		}

		public String getDomainCNAMEStatus() {
			return this.domainCNAMEStatus;
		}

		public void setDomainCNAMEStatus(String domainCNAMEStatus) {
			this.domainCNAMEStatus = domainCNAMEStatus;
		}

		public String getWildcardDomainPatterns() {
			return this.wildcardDomainPatterns;
		}

		public void setWildcardDomainPatterns(String wildcardDomainPatterns) {
			this.wildcardDomainPatterns = wildcardDomainPatterns;
		}

		public String getDomainBindingStatus() {
			return this.domainBindingStatus;
		}

		public void setDomainBindingStatus(String domainBindingStatus) {
			this.domainBindingStatus = domainBindingStatus;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getDomainRemark() {
			return this.domainRemark;
		}

		public void setDomainRemark(String domainRemark) {
			this.domainRemark = domainRemark;
		}

		public String getDomainWebSocketStatus() {
			return this.domainWebSocketStatus;
		}

		public void setDomainWebSocketStatus(String domainWebSocketStatus) {
			this.domainWebSocketStatus = domainWebSocketStatus;
		}

		public String getCertificateId() {
			return this.certificateId;
		}

		public void setCertificateId(String certificateId) {
			this.certificateId = certificateId;
		}

		public Boolean getIsHttpRedirectToHttps() {
			return this.isHttpRedirectToHttps;
		}

		public void setIsHttpRedirectToHttps(Boolean isHttpRedirectToHttps) {
			this.isHttpRedirectToHttps = isHttpRedirectToHttps;
		}

		public String getWssEnable() {
			return this.wssEnable;
		}

		public void setWssEnable(String wssEnable) {
			this.wssEnable = wssEnable;
		}
	}

	public static class StageInfo {

		private String stageId;

		private String stageName;

		private String description;

		public String getStageId() {
			return this.stageId;
		}

		public void setStageId(String stageId) {
			this.stageId = stageId;
		}

		public String getStageName() {
			return this.stageName;
		}

		public void setStageName(String stageName) {
			this.stageName = stageName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	@Override
	public DescribeApiGroupResponse getInstance(UnmarshallerContext context) {
		return	DescribeApiGroupResponseUnmarshaller.unmarshall(this, context);
	}
}
