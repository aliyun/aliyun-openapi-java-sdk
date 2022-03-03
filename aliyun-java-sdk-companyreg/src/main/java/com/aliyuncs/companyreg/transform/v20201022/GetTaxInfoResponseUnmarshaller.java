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

import com.aliyuncs.companyreg.model.v20201022.GetTaxInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTaxInfoResponseUnmarshaller {

	public static GetTaxInfoResponse unmarshall(GetTaxInfoResponse getTaxInfoResponse, UnmarshallerContext _ctx) {
		
		getTaxInfoResponse.setRequestId(_ctx.stringValue("GetTaxInfoResponse.RequestId"));
		getTaxInfoResponse.setTaxPreparerName(_ctx.stringValue("GetTaxInfoResponse.TaxPreparerName"));
		getTaxInfoResponse.setTaxiationAgentSecret(_ctx.stringValue("GetTaxInfoResponse.TaxiationAgentSecret"));
		getTaxInfoResponse.setMyTaxInfo(_ctx.stringValue("GetTaxInfoResponse.MyTaxInfo"));
		getTaxInfoResponse.setTaxArea(_ctx.stringValue("GetTaxInfoResponse.TaxArea"));
		getTaxInfoResponse.setAcctgSystem(_ctx.stringValue("GetTaxInfoResponse.AcctgSystem"));
		getTaxInfoResponse.setExternalUniqueId(_ctx.stringValue("GetTaxInfoResponse.ExternalUniqueId"));
		getTaxInfoResponse.setTaxTypes(_ctx.stringValue("GetTaxInfoResponse.TaxTypes"));
		getTaxInfoResponse.setIncomeDeclarationPsw(_ctx.stringValue("GetTaxInfoResponse.IncomeDeclarationPsw"));
		getTaxInfoResponse.setIsNeedSmsCode(_ctx.stringValue("GetTaxInfoResponse.IsNeedSmsCode"));
		getTaxInfoResponse.setTaxNo(_ctx.stringValue("GetTaxInfoResponse.TaxNo"));
		getTaxInfoResponse.setTaxpayerType(_ctx.stringValue("GetTaxInfoResponse.TaxpayerType"));
		getTaxInfoResponse.setName(_ctx.stringValue("GetTaxInfoResponse.Name"));
		getTaxInfoResponse.setTaxPreparerPsw(_ctx.stringValue("GetTaxInfoResponse.TaxPreparerPsw"));
		getTaxInfoResponse.setTaxAreaCode(_ctx.stringValue("GetTaxInfoResponse.TaxAreaCode"));
		getTaxInfoResponse.setTenantId(_ctx.longValue("GetTaxInfoResponse.TenantId"));
	 
	 	return getTaxInfoResponse;
	}
}