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

import com.aliyuncs.companyreg.model.v20201022.GetIndustryCommerceInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetIndustryCommerceInfoResponseUnmarshaller {

	public static GetIndustryCommerceInfoResponse unmarshall(GetIndustryCommerceInfoResponse getIndustryCommerceInfoResponse, UnmarshallerContext _ctx) {
		
		getIndustryCommerceInfoResponse.setRequestId(_ctx.stringValue("GetIndustryCommerceInfoResponse.RequestId"));
		getIndustryCommerceInfoResponse.setCompanyType(_ctx.stringValue("GetIndustryCommerceInfoResponse.CompanyType"));
		getIndustryCommerceInfoResponse.setEstablishmentDate(_ctx.stringValue("GetIndustryCommerceInfoResponse.EstablishmentDate"));
		getIndustryCommerceInfoResponse.setBusinessStatus(_ctx.stringValue("GetIndustryCommerceInfoResponse.BusinessStatus"));
		getIndustryCommerceInfoResponse.setTaxNo(_ctx.stringValue("GetIndustryCommerceInfoResponse.TaxNo"));
		getIndustryCommerceInfoResponse.setRegisteredCaptial(_ctx.stringValue("GetIndustryCommerceInfoResponse.RegisteredCaptial"));
		getIndustryCommerceInfoResponse.setName(_ctx.stringValue("GetIndustryCommerceInfoResponse.Name"));
		getIndustryCommerceInfoResponse.setLegalRepresentative(_ctx.stringValue("GetIndustryCommerceInfoResponse.LegalRepresentative"));
		getIndustryCommerceInfoResponse.setOperatingPeriod(_ctx.stringValue("GetIndustryCommerceInfoResponse.OperatingPeriod"));
		getIndustryCommerceInfoResponse.setBizScope(_ctx.stringValue("GetIndustryCommerceInfoResponse.BizScope"));
		getIndustryCommerceInfoResponse.setCorpAddress(_ctx.stringValue("GetIndustryCommerceInfoResponse.CorpAddress"));
	 
	 	return getIndustryCommerceInfoResponse;
	}
}