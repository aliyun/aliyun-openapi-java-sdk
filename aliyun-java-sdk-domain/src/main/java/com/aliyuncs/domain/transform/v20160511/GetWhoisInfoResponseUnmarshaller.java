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
package com.aliyuncs.domain.transform.v20160511;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.domain.model.v20160511.GetWhoisInfoResponse;
import com.aliyuncs.domain.model.v20160511.GetWhoisInfoResponse.DomainStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetWhoisInfoResponseUnmarshaller {

	public static GetWhoisInfoResponse unmarshall(GetWhoisInfoResponse getWhoisInfoResponse, UnmarshallerContext context) {
		
		getWhoisInfoResponse.setRequestId(context.stringValue("GetWhoisInfoResponse.RequestId"));
		getWhoisInfoResponse.setReferralURL(context.stringValue("GetWhoisInfoResponse.ReferralURL"));
		getWhoisInfoResponse.setDomainName(context.stringValue("GetWhoisInfoResponse.DomainName"));
		getWhoisInfoResponse.setRegistrar(context.stringValue("GetWhoisInfoResponse.Registrar"));
		getWhoisInfoResponse.setRegistrarWhoisServer(context.stringValue("GetWhoisInfoResponse.RegistrarWhoisServer"));
		getWhoisInfoResponse.setStatusList(context.stringValue("GetWhoisInfoResponse.StatusList"));
		getWhoisInfoResponse.setFormatCreationDate(context.stringValue("GetWhoisInfoResponse.FormatCreationDate"));
		getWhoisInfoResponse.setFormatExpirationDate(context.stringValue("GetWhoisInfoResponse.FormatExpirationDate"));
		getWhoisInfoResponse.setFormatUpdatedDate(context.stringValue("GetWhoisInfoResponse.FormatUpdatedDate"));
		getWhoisInfoResponse.setNameServerList(context.stringValue("GetWhoisInfoResponse.NameServerList"));
		getWhoisInfoResponse.setUpdatedDate(context.stringValue("GetWhoisInfoResponse.UpdatedDate"));
		getWhoisInfoResponse.setCreationDate(context.stringValue("GetWhoisInfoResponse.CreationDate"));
		getWhoisInfoResponse.setExpirationDate(context.stringValue("GetWhoisInfoResponse.ExpirationDate"));
		getWhoisInfoResponse.setRegistryDomainID(context.stringValue("GetWhoisInfoResponse.RegistryDomainID"));
		getWhoisInfoResponse.setRegistrarURL(context.stringValue("GetWhoisInfoResponse.RegistrarURL"));
		getWhoisInfoResponse.setRegistrarIANAID(context.stringValue("GetWhoisInfoResponse.RegistrarIANAID"));
		getWhoisInfoResponse.setRegistrarAbuseContactEmail(context.stringValue("GetWhoisInfoResponse.RegistrarAbuseContactEmail"));
		getWhoisInfoResponse.setRegistrarAbuseContactPhone(context.stringValue("GetWhoisInfoResponse.RegistrarAbuseContactPhone"));
		getWhoisInfoResponse.setRegistryRegistrantId(context.stringValue("GetWhoisInfoResponse.RegistryRegistrantId"));
		getWhoisInfoResponse.setRegistrantName(context.stringValue("GetWhoisInfoResponse.RegistrantName"));
		getWhoisInfoResponse.setRegistrantOrganization(context.stringValue("GetWhoisInfoResponse.RegistrantOrganization"));
		getWhoisInfoResponse.setRegistrantStreet(context.stringValue("GetWhoisInfoResponse.RegistrantStreet"));
		getWhoisInfoResponse.setRegistrantCity(context.stringValue("GetWhoisInfoResponse.RegistrantCity"));
		getWhoisInfoResponse.setRegistrantStateProvince(context.stringValue("GetWhoisInfoResponse.RegistrantStateProvince"));
		getWhoisInfoResponse.setRegistrantPostalCode(context.stringValue("GetWhoisInfoResponse.RegistrantPostalCode"));
		getWhoisInfoResponse.setRegistrantCountry(context.stringValue("GetWhoisInfoResponse.RegistrantCountry"));
		getWhoisInfoResponse.setRegistrantPhone(context.stringValue("GetWhoisInfoResponse.RegistrantPhone"));
		getWhoisInfoResponse.setRegistrantPhoneExt(context.stringValue("GetWhoisInfoResponse.RegistrantPhoneExt"));
		getWhoisInfoResponse.setRegistrantFax(context.stringValue("GetWhoisInfoResponse.RegistrantFax"));
		getWhoisInfoResponse.setRegistrantFaxExt(context.stringValue("GetWhoisInfoResponse.RegistrantFaxExt"));
		getWhoisInfoResponse.setRegistrantEmail(context.stringValue("GetWhoisInfoResponse.RegistrantEmail"));
		getWhoisInfoResponse.setRegistryAdminID(context.stringValue("GetWhoisInfoResponse.RegistryAdminID"));
		getWhoisInfoResponse.setRegistryTechID(context.stringValue("GetWhoisInfoResponse.RegistryTechID"));
		getWhoisInfoResponse.setAdminName(context.stringValue("GetWhoisInfoResponse.AdminName"));
		getWhoisInfoResponse.setAdminOrganization(context.stringValue("GetWhoisInfoResponse.AdminOrganization"));
		getWhoisInfoResponse.setAdminStreet(context.stringValue("GetWhoisInfoResponse.AdminStreet"));
		getWhoisInfoResponse.setAdminCity(context.stringValue("GetWhoisInfoResponse.AdminCity"));
		getWhoisInfoResponse.setAdminStateProvince(context.stringValue("GetWhoisInfoResponse.AdminStateProvince"));
		getWhoisInfoResponse.setAdminPostalCode(context.stringValue("GetWhoisInfoResponse.AdminPostalCode"));
		getWhoisInfoResponse.setAdminCountry(context.stringValue("GetWhoisInfoResponse.AdminCountry"));
		getWhoisInfoResponse.setAdminPhone(context.stringValue("GetWhoisInfoResponse.AdminPhone"));
		getWhoisInfoResponse.setAdminPhoneExt(context.stringValue("GetWhoisInfoResponse.AdminPhoneExt"));
		getWhoisInfoResponse.setAdminFax(context.stringValue("GetWhoisInfoResponse.AdminFax"));
		getWhoisInfoResponse.setAdminFaxExt(context.stringValue("GetWhoisInfoResponse.AdminFaxExt"));
		getWhoisInfoResponse.setAdminEmail(context.stringValue("GetWhoisInfoResponse.AdminEmail"));
		getWhoisInfoResponse.setTechName(context.stringValue("GetWhoisInfoResponse.TechName"));
		getWhoisInfoResponse.setTechOrganization(context.stringValue("GetWhoisInfoResponse.TechOrganization"));
		getWhoisInfoResponse.setTechStreet(context.stringValue("GetWhoisInfoResponse.TechStreet"));
		getWhoisInfoResponse.setTechCity(context.stringValue("GetWhoisInfoResponse.TechCity"));
		getWhoisInfoResponse.setTechStateProvince(context.stringValue("GetWhoisInfoResponse.TechStateProvince"));
		getWhoisInfoResponse.setTechPostalCode(context.stringValue("GetWhoisInfoResponse.TechPostalCode"));
		getWhoisInfoResponse.setTechCountry(context.stringValue("GetWhoisInfoResponse.TechCountry"));
		getWhoisInfoResponse.setTechPhone(context.stringValue("GetWhoisInfoResponse.TechPhone"));
		getWhoisInfoResponse.setTechPhoneExt(context.stringValue("GetWhoisInfoResponse.TechPhoneExt"));
		getWhoisInfoResponse.setTechFax(context.stringValue("GetWhoisInfoResponse.TechFax"));
		getWhoisInfoResponse.setTechFaxExt(context.stringValue("GetWhoisInfoResponse.TechFaxExt"));
		getWhoisInfoResponse.setTechEmail(context.stringValue("GetWhoisInfoResponse.TechEmail"));
		getWhoisInfoResponse.setOriginalInfo(context.stringValue("GetWhoisInfoResponse.OriginalInfo"));
		getWhoisInfoResponse.setCacheUpdatedDate(context.stringValue("GetWhoisInfoResponse.CacheUpdatedDate"));
		getWhoisInfoResponse.setWhoisProtected(context.stringValue("GetWhoisInfoResponse.WhoisProtected"));

		List<DomainStatus> domainStatusList = new ArrayList<DomainStatus>();
		for (int i = 0; i < context.lengthValue("GetWhoisInfoResponse.DomainStatusList.Length"); i++) {
			DomainStatus domainStatus = new DomainStatus();
			domainStatus.setStatus(context.stringValue("GetWhoisInfoResponse.DomainStatusList["+ i +"].Status"));
			domainStatus.setDesc(context.stringValue("GetWhoisInfoResponse.DomainStatusList["+ i +"].Desc"));
			domainStatus.setTip(context.stringValue("GetWhoisInfoResponse.DomainStatusList["+ i +"].Tip"));

			domainStatusList.add(domainStatus);
		}
		getWhoisInfoResponse.setDomainStatusList(domainStatusList);
	 
	 	return getWhoisInfoResponse;
	}
}