/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.domain.model.v20160511;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.domain.transform.v20160511.GetWhoisInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetWhoisInfoResponse extends AcsResponse {

	private String requestId;

	private String referralURL;

	private String domainName;

	private String registrar;

	private String registrarWhoisServer;

	private String statusList;

	private String formatCreationDate;

	private String formatExpirationDate;

	private String formatUpdatedDate;

	private String nameServerList;

	private String updatedDate;

	private String creationDate;

	private String expirationDate;

	private String registryDomainID;

	private String registrarURL;

	private String registrarIANAID;

	private String registrarAbuseContactEmail;

	private String registrarAbuseContactPhone;

	private String registryRegistrantId;

	private String registrantName;

	private String registrantOrganization;

	private String registrantStreet;

	private String registrantCity;

	private String registrantStateProvince;

	private String registrantPostalCode;

	private String registrantCountry;

	private String registrantPhone;

	private String registrantPhoneExt;

	private String registrantFax;

	private String registrantFaxExt;

	private String registrantEmail;

	private String registryAdminID;

	private String registryTechID;

	private String adminName;

	private String adminOrganization;

	private String adminStreet;

	private String adminCity;

	private String adminStateProvince;

	private String adminPostalCode;

	private String adminCountry;

	private String adminPhone;

	private String adminPhoneExt;

	private String adminFax;

	private String adminFaxExt;

	private String adminEmail;

	private String techName;

	private String techOrganization;

	private String techStreet;

	private String techCity;

	private String techStateProvince;

	private String techPostalCode;

	private String techCountry;

	private String techPhone;

	private String techPhoneExt;

	private String techFax;

	private String techFaxExt;

	private String techEmail;

	private String originalInfo;

	private String cacheUpdatedDate;

	private String whoisProtected;

	private List<DomainStatus> domainStatusList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getReferralURL() {
		return this.referralURL;
	}

	public void setReferralURL(String referralURL) {
		this.referralURL = referralURL;
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getRegistrar() {
		return this.registrar;
	}

	public void setRegistrar(String registrar) {
		this.registrar = registrar;
	}

	public String getRegistrarWhoisServer() {
		return this.registrarWhoisServer;
	}

	public void setRegistrarWhoisServer(String registrarWhoisServer) {
		this.registrarWhoisServer = registrarWhoisServer;
	}

	public String getStatusList() {
		return this.statusList;
	}

	public void setStatusList(String statusList) {
		this.statusList = statusList;
	}

	public String getFormatCreationDate() {
		return this.formatCreationDate;
	}

	public void setFormatCreationDate(String formatCreationDate) {
		this.formatCreationDate = formatCreationDate;
	}

	public String getFormatExpirationDate() {
		return this.formatExpirationDate;
	}

	public void setFormatExpirationDate(String formatExpirationDate) {
		this.formatExpirationDate = formatExpirationDate;
	}

	public String getFormatUpdatedDate() {
		return this.formatUpdatedDate;
	}

	public void setFormatUpdatedDate(String formatUpdatedDate) {
		this.formatUpdatedDate = formatUpdatedDate;
	}

	public String getNameServerList() {
		return this.nameServerList;
	}

	public void setNameServerList(String nameServerList) {
		this.nameServerList = nameServerList;
	}

	public String getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getExpirationDate() {
		return this.expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getRegistryDomainID() {
		return this.registryDomainID;
	}

	public void setRegistryDomainID(String registryDomainID) {
		this.registryDomainID = registryDomainID;
	}

	public String getRegistrarURL() {
		return this.registrarURL;
	}

	public void setRegistrarURL(String registrarURL) {
		this.registrarURL = registrarURL;
	}

	public String getRegistrarIANAID() {
		return this.registrarIANAID;
	}

	public void setRegistrarIANAID(String registrarIANAID) {
		this.registrarIANAID = registrarIANAID;
	}

	public String getRegistrarAbuseContactEmail() {
		return this.registrarAbuseContactEmail;
	}

	public void setRegistrarAbuseContactEmail(String registrarAbuseContactEmail) {
		this.registrarAbuseContactEmail = registrarAbuseContactEmail;
	}

	public String getRegistrarAbuseContactPhone() {
		return this.registrarAbuseContactPhone;
	}

	public void setRegistrarAbuseContactPhone(String registrarAbuseContactPhone) {
		this.registrarAbuseContactPhone = registrarAbuseContactPhone;
	}

	public String getRegistryRegistrantId() {
		return this.registryRegistrantId;
	}

	public void setRegistryRegistrantId(String registryRegistrantId) {
		this.registryRegistrantId = registryRegistrantId;
	}

	public String getRegistrantName() {
		return this.registrantName;
	}

	public void setRegistrantName(String registrantName) {
		this.registrantName = registrantName;
	}

	public String getRegistrantOrganization() {
		return this.registrantOrganization;
	}

	public void setRegistrantOrganization(String registrantOrganization) {
		this.registrantOrganization = registrantOrganization;
	}

	public String getRegistrantStreet() {
		return this.registrantStreet;
	}

	public void setRegistrantStreet(String registrantStreet) {
		this.registrantStreet = registrantStreet;
	}

	public String getRegistrantCity() {
		return this.registrantCity;
	}

	public void setRegistrantCity(String registrantCity) {
		this.registrantCity = registrantCity;
	}

	public String getRegistrantStateProvince() {
		return this.registrantStateProvince;
	}

	public void setRegistrantStateProvince(String registrantStateProvince) {
		this.registrantStateProvince = registrantStateProvince;
	}

	public String getRegistrantPostalCode() {
		return this.registrantPostalCode;
	}

	public void setRegistrantPostalCode(String registrantPostalCode) {
		this.registrantPostalCode = registrantPostalCode;
	}

	public String getRegistrantCountry() {
		return this.registrantCountry;
	}

	public void setRegistrantCountry(String registrantCountry) {
		this.registrantCountry = registrantCountry;
	}

	public String getRegistrantPhone() {
		return this.registrantPhone;
	}

	public void setRegistrantPhone(String registrantPhone) {
		this.registrantPhone = registrantPhone;
	}

	public String getRegistrantPhoneExt() {
		return this.registrantPhoneExt;
	}

	public void setRegistrantPhoneExt(String registrantPhoneExt) {
		this.registrantPhoneExt = registrantPhoneExt;
	}

	public String getRegistrantFax() {
		return this.registrantFax;
	}

	public void setRegistrantFax(String registrantFax) {
		this.registrantFax = registrantFax;
	}

	public String getRegistrantFaxExt() {
		return this.registrantFaxExt;
	}

	public void setRegistrantFaxExt(String registrantFaxExt) {
		this.registrantFaxExt = registrantFaxExt;
	}

	public String getRegistrantEmail() {
		return this.registrantEmail;
	}

	public void setRegistrantEmail(String registrantEmail) {
		this.registrantEmail = registrantEmail;
	}

	public String getRegistryAdminID() {
		return this.registryAdminID;
	}

	public void setRegistryAdminID(String registryAdminID) {
		this.registryAdminID = registryAdminID;
	}

	public String getRegistryTechID() {
		return this.registryTechID;
	}

	public void setRegistryTechID(String registryTechID) {
		this.registryTechID = registryTechID;
	}

	public String getAdminName() {
		return this.adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminOrganization() {
		return this.adminOrganization;
	}

	public void setAdminOrganization(String adminOrganization) {
		this.adminOrganization = adminOrganization;
	}

	public String getAdminStreet() {
		return this.adminStreet;
	}

	public void setAdminStreet(String adminStreet) {
		this.adminStreet = adminStreet;
	}

	public String getAdminCity() {
		return this.adminCity;
	}

	public void setAdminCity(String adminCity) {
		this.adminCity = adminCity;
	}

	public String getAdminStateProvince() {
		return this.adminStateProvince;
	}

	public void setAdminStateProvince(String adminStateProvince) {
		this.adminStateProvince = adminStateProvince;
	}

	public String getAdminPostalCode() {
		return this.adminPostalCode;
	}

	public void setAdminPostalCode(String adminPostalCode) {
		this.adminPostalCode = adminPostalCode;
	}

	public String getAdminCountry() {
		return this.adminCountry;
	}

	public void setAdminCountry(String adminCountry) {
		this.adminCountry = adminCountry;
	}

	public String getAdminPhone() {
		return this.adminPhone;
	}

	public void setAdminPhone(String adminPhone) {
		this.adminPhone = adminPhone;
	}

	public String getAdminPhoneExt() {
		return this.adminPhoneExt;
	}

	public void setAdminPhoneExt(String adminPhoneExt) {
		this.adminPhoneExt = adminPhoneExt;
	}

	public String getAdminFax() {
		return this.adminFax;
	}

	public void setAdminFax(String adminFax) {
		this.adminFax = adminFax;
	}

	public String getAdminFaxExt() {
		return this.adminFaxExt;
	}

	public void setAdminFaxExt(String adminFaxExt) {
		this.adminFaxExt = adminFaxExt;
	}

	public String getAdminEmail() {
		return this.adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public String getTechName() {
		return this.techName;
	}

	public void setTechName(String techName) {
		this.techName = techName;
	}

	public String getTechOrganization() {
		return this.techOrganization;
	}

	public void setTechOrganization(String techOrganization) {
		this.techOrganization = techOrganization;
	}

	public String getTechStreet() {
		return this.techStreet;
	}

	public void setTechStreet(String techStreet) {
		this.techStreet = techStreet;
	}

	public String getTechCity() {
		return this.techCity;
	}

	public void setTechCity(String techCity) {
		this.techCity = techCity;
	}

	public String getTechStateProvince() {
		return this.techStateProvince;
	}

	public void setTechStateProvince(String techStateProvince) {
		this.techStateProvince = techStateProvince;
	}

	public String getTechPostalCode() {
		return this.techPostalCode;
	}

	public void setTechPostalCode(String techPostalCode) {
		this.techPostalCode = techPostalCode;
	}

	public String getTechCountry() {
		return this.techCountry;
	}

	public void setTechCountry(String techCountry) {
		this.techCountry = techCountry;
	}

	public String getTechPhone() {
		return this.techPhone;
	}

	public void setTechPhone(String techPhone) {
		this.techPhone = techPhone;
	}

	public String getTechPhoneExt() {
		return this.techPhoneExt;
	}

	public void setTechPhoneExt(String techPhoneExt) {
		this.techPhoneExt = techPhoneExt;
	}

	public String getTechFax() {
		return this.techFax;
	}

	public void setTechFax(String techFax) {
		this.techFax = techFax;
	}

	public String getTechFaxExt() {
		return this.techFaxExt;
	}

	public void setTechFaxExt(String techFaxExt) {
		this.techFaxExt = techFaxExt;
	}

	public String getTechEmail() {
		return this.techEmail;
	}

	public void setTechEmail(String techEmail) {
		this.techEmail = techEmail;
	}

	public String getOriginalInfo() {
		return this.originalInfo;
	}

	public void setOriginalInfo(String originalInfo) {
		this.originalInfo = originalInfo;
	}

	public String getCacheUpdatedDate() {
		return this.cacheUpdatedDate;
	}

	public void setCacheUpdatedDate(String cacheUpdatedDate) {
		this.cacheUpdatedDate = cacheUpdatedDate;
	}

	public String getWhoisProtected() {
		return this.whoisProtected;
	}

	public void setWhoisProtected(String whoisProtected) {
		this.whoisProtected = whoisProtected;
	}

	public List<DomainStatus> getDomainStatusList() {
		return this.domainStatusList;
	}

	public void setDomainStatusList(List<DomainStatus> domainStatusList) {
		this.domainStatusList = domainStatusList;
	}

	public static class DomainStatus {

		private String status;

		private String desc;

		private String tip;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDesc() {
			return this.desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public String getTip() {
			return this.tip;
		}

		public void setTip(String tip) {
			this.tip = tip;
		}
	}

	@Override
	public GetWhoisInfoResponse getInstance(UnmarshallerContext context) {
		return	GetWhoisInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
