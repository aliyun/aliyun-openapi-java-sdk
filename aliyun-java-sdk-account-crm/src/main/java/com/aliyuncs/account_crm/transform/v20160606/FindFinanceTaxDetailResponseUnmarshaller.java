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

package com.aliyuncs.account_crm.transform.v20160606;

import com.aliyuncs.account_crm.model.v20160606.FindFinanceTaxDetailResponse;
import com.aliyuncs.account_crm.model.v20160606.FindFinanceTaxDetailResponse.Finance;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindFinanceTaxDetailResponseUnmarshaller {

	public static FindFinanceTaxDetailResponse unmarshall(FindFinanceTaxDetailResponse findFinanceTaxDetailResponse, UnmarshallerContext _ctx) {
		
		findFinanceTaxDetailResponse.setRequestId(_ctx.stringValue("FindFinanceTaxDetailResponse.RequestId"));
		findFinanceTaxDetailResponse.setCode(_ctx.stringValue("FindFinanceTaxDetailResponse.Code"));
		findFinanceTaxDetailResponse.setMessage(_ctx.stringValue("FindFinanceTaxDetailResponse.Message"));
		findFinanceTaxDetailResponse.setSuccess(_ctx.booleanValue("FindFinanceTaxDetailResponse.Success"));

		Finance finance = new Finance();
		finance.setSecondFinanceTax(_ctx.stringValue("FindFinanceTaxDetailResponse.Finance.secondFinanceTax"));
		finance.setSecondFinanceTaxCertificateImgName(_ctx.stringValue("FindFinanceTaxDetailResponse.Finance.secondFinanceTaxCertificateImgName"));
		finance.setFinanceTaxCertificateImgName(_ctx.stringValue("FindFinanceTaxDetailResponse.Finance.FinanceTaxCertificateImgName"));
		finance.setFinanceTaxCertificateImgUrl(_ctx.stringValue("FindFinanceTaxDetailResponse.Finance.financeTaxCertificateImgUrl"));
		finance.setSecondFinanceTaxCertificateImgUrl(_ctx.stringValue("FindFinanceTaxDetailResponse.Finance.secondFinanceTaxCertificateImgUrl"));
		finance.setTax(_ctx.stringValue("FindFinanceTaxDetailResponse.Finance.Tax"));
		findFinanceTaxDetailResponse.setFinance(finance);
	 
	 	return findFinanceTaxDetailResponse;
	}
}