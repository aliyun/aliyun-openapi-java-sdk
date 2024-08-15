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
import com.aliyuncs.ecd.transform.v20200930.DescribeOfficeSitesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeOfficeSitesResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private Integer totalCount;

	private List<OfficeSite> officeSites;

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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<OfficeSite> getOfficeSites() {
		return this.officeSites;
	}

	public void setOfficeSites(List<OfficeSite> officeSites) {
		this.officeSites = officeSites;
	}

	public static class OfficeSite {

		private String status;

		private String creationTime;

		private String vpcId;

		private String vpcType;

		private Boolean enableAdminAccess;

		private Boolean enableCrossDesktopAccess;

		private String desktopVpcEndpoint;

		private String desktopAccessType;

		private String domainName;

		private Boolean ssoEnabled;

		private String cidrBlock;

		private Integer bandwidth;

		private String trustPassword;

		private String name;

		private Boolean enableInternetAccess;

		private String domainPassword;

		private String customSecurityGroupId;

		private String ouName;

		private String domainUserName;

		private String subDomainName;

		private String officeSiteId;

		private String cenId;

		private String cenAttachStatus;

		private Boolean mfaEnabled;

		private String networkPackageId;

		private String dnsUserName;

		private String officeSiteType;

		private Boolean needVerifyLoginRisk;

		private Long desktopCount;

		private Long totalEdsCount;

		private Long totalEdsCountForGroup;

		private Boolean needVerifyZeroDevice;

		private Boolean cloudBoxOfficeSite;

		private String ssoType;

		private String protocolType;

		private String adHostname;

		private String rdsLicenseStatus;

		private String rdsLicenseAddress;

		private String rdsLicenseDomainName;

		private String backupDns;

		private String backupDCHostname;

		private Boolean enableServiceRoute;

		private String subnetMode;

		private String securityProtection;

		private String customAccessPoint;

		private List<ADConnector> aDConnectors;

		private List<Log> logs;

		private List<String> vSwitchIds;

		private List<String> fileSystemIds;

		private List<String> subDnsAddress;

		private List<String> dnsAddress;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getVpcType() {
			return this.vpcType;
		}

		public void setVpcType(String vpcType) {
			this.vpcType = vpcType;
		}

		public Boolean getEnableAdminAccess() {
			return this.enableAdminAccess;
		}

		public void setEnableAdminAccess(Boolean enableAdminAccess) {
			this.enableAdminAccess = enableAdminAccess;
		}

		public Boolean getEnableCrossDesktopAccess() {
			return this.enableCrossDesktopAccess;
		}

		public void setEnableCrossDesktopAccess(Boolean enableCrossDesktopAccess) {
			this.enableCrossDesktopAccess = enableCrossDesktopAccess;
		}

		public String getDesktopVpcEndpoint() {
			return this.desktopVpcEndpoint;
		}

		public void setDesktopVpcEndpoint(String desktopVpcEndpoint) {
			this.desktopVpcEndpoint = desktopVpcEndpoint;
		}

		public String getDesktopAccessType() {
			return this.desktopAccessType;
		}

		public void setDesktopAccessType(String desktopAccessType) {
			this.desktopAccessType = desktopAccessType;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public Boolean getSsoEnabled() {
			return this.ssoEnabled;
		}

		public void setSsoEnabled(Boolean ssoEnabled) {
			this.ssoEnabled = ssoEnabled;
		}

		public String getCidrBlock() {
			return this.cidrBlock;
		}

		public void setCidrBlock(String cidrBlock) {
			this.cidrBlock = cidrBlock;
		}

		public Integer getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Integer bandwidth) {
			this.bandwidth = bandwidth;
		}

		public String getTrustPassword() {
			return this.trustPassword;
		}

		public void setTrustPassword(String trustPassword) {
			this.trustPassword = trustPassword;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Boolean getEnableInternetAccess() {
			return this.enableInternetAccess;
		}

		public void setEnableInternetAccess(Boolean enableInternetAccess) {
			this.enableInternetAccess = enableInternetAccess;
		}

		public String getDomainPassword() {
			return this.domainPassword;
		}

		public void setDomainPassword(String domainPassword) {
			this.domainPassword = domainPassword;
		}

		public String getCustomSecurityGroupId() {
			return this.customSecurityGroupId;
		}

		public void setCustomSecurityGroupId(String customSecurityGroupId) {
			this.customSecurityGroupId = customSecurityGroupId;
		}

		public String getOuName() {
			return this.ouName;
		}

		public void setOuName(String ouName) {
			this.ouName = ouName;
		}

		public String getDomainUserName() {
			return this.domainUserName;
		}

		public void setDomainUserName(String domainUserName) {
			this.domainUserName = domainUserName;
		}

		public String getSubDomainName() {
			return this.subDomainName;
		}

		public void setSubDomainName(String subDomainName) {
			this.subDomainName = subDomainName;
		}

		public String getOfficeSiteId() {
			return this.officeSiteId;
		}

		public void setOfficeSiteId(String officeSiteId) {
			this.officeSiteId = officeSiteId;
		}

		public String getCenId() {
			return this.cenId;
		}

		public void setCenId(String cenId) {
			this.cenId = cenId;
		}

		public String getCenAttachStatus() {
			return this.cenAttachStatus;
		}

		public void setCenAttachStatus(String cenAttachStatus) {
			this.cenAttachStatus = cenAttachStatus;
		}

		public Boolean getMfaEnabled() {
			return this.mfaEnabled;
		}

		public void setMfaEnabled(Boolean mfaEnabled) {
			this.mfaEnabled = mfaEnabled;
		}

		public String getNetworkPackageId() {
			return this.networkPackageId;
		}

		public void setNetworkPackageId(String networkPackageId) {
			this.networkPackageId = networkPackageId;
		}

		public String getDnsUserName() {
			return this.dnsUserName;
		}

		public void setDnsUserName(String dnsUserName) {
			this.dnsUserName = dnsUserName;
		}

		public String getOfficeSiteType() {
			return this.officeSiteType;
		}

		public void setOfficeSiteType(String officeSiteType) {
			this.officeSiteType = officeSiteType;
		}

		public Boolean getNeedVerifyLoginRisk() {
			return this.needVerifyLoginRisk;
		}

		public void setNeedVerifyLoginRisk(Boolean needVerifyLoginRisk) {
			this.needVerifyLoginRisk = needVerifyLoginRisk;
		}

		public Long getDesktopCount() {
			return this.desktopCount;
		}

		public void setDesktopCount(Long desktopCount) {
			this.desktopCount = desktopCount;
		}

		public Long getTotalEdsCount() {
			return this.totalEdsCount;
		}

		public void setTotalEdsCount(Long totalEdsCount) {
			this.totalEdsCount = totalEdsCount;
		}

		public Long getTotalEdsCountForGroup() {
			return this.totalEdsCountForGroup;
		}

		public void setTotalEdsCountForGroup(Long totalEdsCountForGroup) {
			this.totalEdsCountForGroup = totalEdsCountForGroup;
		}

		public Boolean getNeedVerifyZeroDevice() {
			return this.needVerifyZeroDevice;
		}

		public void setNeedVerifyZeroDevice(Boolean needVerifyZeroDevice) {
			this.needVerifyZeroDevice = needVerifyZeroDevice;
		}

		public Boolean getCloudBoxOfficeSite() {
			return this.cloudBoxOfficeSite;
		}

		public void setCloudBoxOfficeSite(Boolean cloudBoxOfficeSite) {
			this.cloudBoxOfficeSite = cloudBoxOfficeSite;
		}

		public String getSsoType() {
			return this.ssoType;
		}

		public void setSsoType(String ssoType) {
			this.ssoType = ssoType;
		}

		public String getProtocolType() {
			return this.protocolType;
		}

		public void setProtocolType(String protocolType) {
			this.protocolType = protocolType;
		}

		public String getAdHostname() {
			return this.adHostname;
		}

		public void setAdHostname(String adHostname) {
			this.adHostname = adHostname;
		}

		public String getRdsLicenseStatus() {
			return this.rdsLicenseStatus;
		}

		public void setRdsLicenseStatus(String rdsLicenseStatus) {
			this.rdsLicenseStatus = rdsLicenseStatus;
		}

		public String getRdsLicenseAddress() {
			return this.rdsLicenseAddress;
		}

		public void setRdsLicenseAddress(String rdsLicenseAddress) {
			this.rdsLicenseAddress = rdsLicenseAddress;
		}

		public String getRdsLicenseDomainName() {
			return this.rdsLicenseDomainName;
		}

		public void setRdsLicenseDomainName(String rdsLicenseDomainName) {
			this.rdsLicenseDomainName = rdsLicenseDomainName;
		}

		public String getBackupDns() {
			return this.backupDns;
		}

		public void setBackupDns(String backupDns) {
			this.backupDns = backupDns;
		}

		public String getBackupDCHostname() {
			return this.backupDCHostname;
		}

		public void setBackupDCHostname(String backupDCHostname) {
			this.backupDCHostname = backupDCHostname;
		}

		public Boolean getEnableServiceRoute() {
			return this.enableServiceRoute;
		}

		public void setEnableServiceRoute(Boolean enableServiceRoute) {
			this.enableServiceRoute = enableServiceRoute;
		}

		public String getSubnetMode() {
			return this.subnetMode;
		}

		public void setSubnetMode(String subnetMode) {
			this.subnetMode = subnetMode;
		}

		public String getSecurityProtection() {
			return this.securityProtection;
		}

		public void setSecurityProtection(String securityProtection) {
			this.securityProtection = securityProtection;
		}

		public String getCustomAccessPoint() {
			return this.customAccessPoint;
		}

		public void setCustomAccessPoint(String customAccessPoint) {
			this.customAccessPoint = customAccessPoint;
		}

		public List<ADConnector> getADConnectors() {
			return this.aDConnectors;
		}

		public void setADConnectors(List<ADConnector> aDConnectors) {
			this.aDConnectors = aDConnectors;
		}

		public List<Log> getLogs() {
			return this.logs;
		}

		public void setLogs(List<Log> logs) {
			this.logs = logs;
		}

		public List<String> getVSwitchIds() {
			return this.vSwitchIds;
		}

		public void setVSwitchIds(List<String> vSwitchIds) {
			this.vSwitchIds = vSwitchIds;
		}

		public List<String> getFileSystemIds() {
			return this.fileSystemIds;
		}

		public void setFileSystemIds(List<String> fileSystemIds) {
			this.fileSystemIds = fileSystemIds;
		}

		public List<String> getSubDnsAddress() {
			return this.subDnsAddress;
		}

		public void setSubDnsAddress(List<String> subDnsAddress) {
			this.subDnsAddress = subDnsAddress;
		}

		public List<String> getDnsAddress() {
			return this.dnsAddress;
		}

		public void setDnsAddress(List<String> dnsAddress) {
			this.dnsAddress = dnsAddress;
		}

		public static class ADConnector {

			private String connectorStatus;

			private String vSwitchId;

			private String aDConnectorAddress;

			private String trustKey;

			private String networkInterfaceId;

			private String specification;

			public String getConnectorStatus() {
				return this.connectorStatus;
			}

			public void setConnectorStatus(String connectorStatus) {
				this.connectorStatus = connectorStatus;
			}

			public String getVSwitchId() {
				return this.vSwitchId;
			}

			public void setVSwitchId(String vSwitchId) {
				this.vSwitchId = vSwitchId;
			}

			public String getADConnectorAddress() {
				return this.aDConnectorAddress;
			}

			public void setADConnectorAddress(String aDConnectorAddress) {
				this.aDConnectorAddress = aDConnectorAddress;
			}

			public String getTrustKey() {
				return this.trustKey;
			}

			public void setTrustKey(String trustKey) {
				this.trustKey = trustKey;
			}

			public String getNetworkInterfaceId() {
				return this.networkInterfaceId;
			}

			public void setNetworkInterfaceId(String networkInterfaceId) {
				this.networkInterfaceId = networkInterfaceId;
			}

			public String getSpecification() {
				return this.specification;
			}

			public void setSpecification(String specification) {
				this.specification = specification;
			}
		}

		public static class Log {

			private String step;

			private String message;

			private String timeStamp;

			private String level;

			public String getStep() {
				return this.step;
			}

			public void setStep(String step) {
				this.step = step;
			}

			public String getMessage() {
				return this.message;
			}

			public void setMessage(String message) {
				this.message = message;
			}

			public String getTimeStamp() {
				return this.timeStamp;
			}

			public void setTimeStamp(String timeStamp) {
				this.timeStamp = timeStamp;
			}

			public String getLevel() {
				return this.level;
			}

			public void setLevel(String level) {
				this.level = level;
			}
		}
	}

	@Override
	public DescribeOfficeSitesResponse getInstance(UnmarshallerContext context) {
		return	DescribeOfficeSitesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
