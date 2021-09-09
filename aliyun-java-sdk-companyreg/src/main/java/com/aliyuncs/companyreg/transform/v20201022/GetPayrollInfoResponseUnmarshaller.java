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

import com.aliyuncs.companyreg.model.v20201022.GetPayrollInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPayrollInfoResponseUnmarshaller {

	public static GetPayrollInfoResponse unmarshall(GetPayrollInfoResponse getPayrollInfoResponse, UnmarshallerContext _ctx) {
		
		getPayrollInfoResponse.setRequestId(_ctx.stringValue("GetPayrollInfoResponse.RequestId"));
		getPayrollInfoResponse.setCorporateHousingAccumulationFund(_ctx.stringValue("GetPayrollInfoResponse.CorporateHousingAccumulationFund"));
		getPayrollInfoResponse.setCorporateSocialInsurance(_ctx.stringValue("GetPayrollInfoResponse.CorporateSocialInsurance"));
		getPayrollInfoResponse.setEmployeeTime(_ctx.stringValue("GetPayrollInfoResponse.EmployeeTime"));
		getPayrollInfoResponse.setId(_ctx.longValue("GetPayrollInfoResponse.Id"));
		getPayrollInfoResponse.setIdNo(_ctx.stringValue("GetPayrollInfoResponse.IdNo"));
		getPayrollInfoResponse.setIncome(_ctx.stringValue("GetPayrollInfoResponse.Income"));
		getPayrollInfoResponse.setName(_ctx.stringValue("GetPayrollInfoResponse.Name"));
		getPayrollInfoResponse.setPeriod(_ctx.stringValue("GetPayrollInfoResponse.Period"));
		getPayrollInfoResponse.setPersonHousingAccumulationFund(_ctx.stringValue("GetPayrollInfoResponse.PersonHousingAccumulationFund"));
		getPayrollInfoResponse.setPersonSocialInsurance(_ctx.stringValue("GetPayrollInfoResponse.PersonSocialInsurance"));
		getPayrollInfoResponse.setPhone(_ctx.stringValue("GetPayrollInfoResponse.Phone"));
		getPayrollInfoResponse.setCorpPension(_ctx.stringValue("GetPayrollInfoResponse.CorpPension"));
		getPayrollInfoResponse.setCorpMedicalInsurance(_ctx.stringValue("GetPayrollInfoResponse.CorpMedicalInsurance"));
		getPayrollInfoResponse.setCorpUnemploymentInsurance(_ctx.stringValue("GetPayrollInfoResponse.CorpUnemploymentInsurance"));
		getPayrollInfoResponse.setCorpInjuryInsurance(_ctx.stringValue("GetPayrollInfoResponse.CorpInjuryInsurance"));
		getPayrollInfoResponse.setCorpMaternityInsurance(_ctx.stringValue("GetPayrollInfoResponse.CorpMaternityInsurance"));
		getPayrollInfoResponse.setPersPension(_ctx.stringValue("GetPayrollInfoResponse.PersPension"));
		getPayrollInfoResponse.setPersUnemploymentInsurance(_ctx.stringValue("GetPayrollInfoResponse.PersUnemploymentInsurance"));
		getPayrollInfoResponse.setPersMedicalInsurance(_ctx.stringValue("GetPayrollInfoResponse.PersMedicalInsurance"));
	 
	 	return getPayrollInfoResponse;
	}
}