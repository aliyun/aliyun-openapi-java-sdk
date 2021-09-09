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

import com.aliyuncs.companyreg.model.v20201022.UpdateCustomerInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateCustomerInfoResponseUnmarshaller {

	public static UpdateCustomerInfoResponse unmarshall(UpdateCustomerInfoResponse updateCustomerInfoResponse, UnmarshallerContext _ctx) {
		
		updateCustomerInfoResponse.setRequestId(_ctx.stringValue("UpdateCustomerInfoResponse.RequestId"));
		updateCustomerInfoResponse.setAcctgSystem(_ctx.stringValue("UpdateCustomerInfoResponse.AcctgSystem"));
		updateCustomerInfoResponse.setBizScope(_ctx.stringValue("UpdateCustomerInfoResponse.BizScope"));
		updateCustomerInfoResponse.setCompanyType(_ctx.stringValue("UpdateCustomerInfoResponse.CompanyType"));
		updateCustomerInfoResponse.setCorpAddress(_ctx.stringValue("UpdateCustomerInfoResponse.CorpAddress"));
		updateCustomerInfoResponse.setEstablishmentDate(_ctx.stringValue("UpdateCustomerInfoResponse.EstablishmentDate"));
		updateCustomerInfoResponse.setExternalUniqueId(_ctx.stringValue("UpdateCustomerInfoResponse.ExternalUniqueId"));
		updateCustomerInfoResponse.setIncomeDeclarationPsw(_ctx.stringValue("UpdateCustomerInfoResponse.IncomeDeclarationPsw"));
		updateCustomerInfoResponse.setLegalRepresentative(_ctx.stringValue("UpdateCustomerInfoResponse.LegalRepresentative"));
		updateCustomerInfoResponse.setName(_ctx.stringValue("UpdateCustomerInfoResponse.Name"));
		updateCustomerInfoResponse.setOrgName(_ctx.stringValue("UpdateCustomerInfoResponse.OrgName"));
		updateCustomerInfoResponse.setRegisteredCaptial(_ctx.stringValue("UpdateCustomerInfoResponse.RegisteredCaptial"));
		updateCustomerInfoResponse.setTaxArea(_ctx.stringValue("UpdateCustomerInfoResponse.TaxArea"));
		updateCustomerInfoResponse.setTaxNo(_ctx.stringValue("UpdateCustomerInfoResponse.TaxNo"));
		updateCustomerInfoResponse.setTaxPreparerName(_ctx.stringValue("UpdateCustomerInfoResponse.TaxPreparerName"));
		updateCustomerInfoResponse.setTaxPreparerPsw(_ctx.stringValue("UpdateCustomerInfoResponse.TaxPreparerPsw"));
		updateCustomerInfoResponse.setTaxTypes(_ctx.stringValue("UpdateCustomerInfoResponse.TaxTypes"));
		updateCustomerInfoResponse.setTaxiationAgentSecret(_ctx.stringValue("UpdateCustomerInfoResponse.TaxiationAgentSecret"));
		updateCustomerInfoResponse.setTaxpayerType(_ctx.stringValue("UpdateCustomerInfoResponse.TaxpayerType"));
		updateCustomerInfoResponse.setTenantId(_ctx.longValue("UpdateCustomerInfoResponse.TenantId"));
	 
	 	return updateCustomerInfoResponse;
	}
}