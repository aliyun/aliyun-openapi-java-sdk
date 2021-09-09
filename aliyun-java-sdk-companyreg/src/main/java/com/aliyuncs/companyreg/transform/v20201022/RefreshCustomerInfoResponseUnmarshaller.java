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

package com.aliyuncs.companyreg.transform.v20201022;

import com.aliyuncs.companyreg.model.v20201022.RefreshCustomerInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RefreshCustomerInfoResponseUnmarshaller {

	public static RefreshCustomerInfoResponse unmarshall(RefreshCustomerInfoResponse refreshCustomerInfoResponse, UnmarshallerContext _ctx) {
		
		refreshCustomerInfoResponse.setRequestId(_ctx.stringValue("RefreshCustomerInfoResponse.RequestId"));
		refreshCustomerInfoResponse.setAcctgSystem(_ctx.stringValue("RefreshCustomerInfoResponse.AcctgSystem"));
		refreshCustomerInfoResponse.setBizScope(_ctx.stringValue("RefreshCustomerInfoResponse.BizScope"));
		refreshCustomerInfoResponse.setCompanyType(_ctx.stringValue("RefreshCustomerInfoResponse.CompanyType"));
		refreshCustomerInfoResponse.setCorpAddress(_ctx.stringValue("RefreshCustomerInfoResponse.CorpAddress"));
		refreshCustomerInfoResponse.setEstablishmentDate(_ctx.stringValue("RefreshCustomerInfoResponse.EstablishmentDate"));
		refreshCustomerInfoResponse.setExternalUniqueId(_ctx.stringValue("RefreshCustomerInfoResponse.ExternalUniqueId"));
		refreshCustomerInfoResponse.setIncomeDeclarationPsw(_ctx.stringValue("RefreshCustomerInfoResponse.IncomeDeclarationPsw"));
		refreshCustomerInfoResponse.setLegalRepresentative(_ctx.stringValue("RefreshCustomerInfoResponse.LegalRepresentative"));
		refreshCustomerInfoResponse.setOrgName(_ctx.stringValue("RefreshCustomerInfoResponse.OrgName"));
		refreshCustomerInfoResponse.setRegisteredCaptial(_ctx.stringValue("RefreshCustomerInfoResponse.RegisteredCaptial"));
		refreshCustomerInfoResponse.setTaxArea(_ctx.stringValue("RefreshCustomerInfoResponse.TaxArea"));
		refreshCustomerInfoResponse.setTaxNo(_ctx.stringValue("RefreshCustomerInfoResponse.TaxNo"));
		refreshCustomerInfoResponse.setTaxPreparerName(_ctx.stringValue("RefreshCustomerInfoResponse.TaxPreparerName"));
		refreshCustomerInfoResponse.setTaxPreparerPsw(_ctx.stringValue("RefreshCustomerInfoResponse.TaxPreparerPsw"));
		refreshCustomerInfoResponse.setTaxTypes(_ctx.stringValue("RefreshCustomerInfoResponse.TaxTypes"));
		refreshCustomerInfoResponse.setTaxiationAgentSecret(_ctx.stringValue("RefreshCustomerInfoResponse.TaxiationAgentSecret"));
		refreshCustomerInfoResponse.setTaxpayerType(_ctx.stringValue("RefreshCustomerInfoResponse.TaxpayerType"));
		refreshCustomerInfoResponse.setTenantId(_ctx.longValue("RefreshCustomerInfoResponse.TenantId"));
	 
	 	return refreshCustomerInfoResponse;
	}
}